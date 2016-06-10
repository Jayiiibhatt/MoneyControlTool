/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Model.CompanyModel;
import Model.CompanyRecord;
import Operation.CompanyOperation;
import Operation.CompanyRecordOperation;
import Operation.ExchangeRecordOperation;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.awt.Color;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
/**
 *
 * @author gautam
 */
public class CompanyRecordAction extends ActionSupport implements Preparable,ModelDriven,ServletRequestAware
{
    CompanyRecord companyrecord;
    ArrayList companytablerec;
    ArrayList exchange;
    ArrayList companyrecord1;
    HttpServletRequest request;
    private JFreeChart chart;
    String graphurl;
    CompanyRecordOperation companyrecop=new CompanyRecordOperation();
     CompanyModel companymod=new CompanyModel();

    public ArrayList getCompanyrecord1() {
        return companyrecord1;
    }

    public void setCompanyrecord1(ArrayList companyrecord1) {
        this.companyrecord1 = companyrecord1;
    }
     
     
     
     
    public CompanyRecord getModel()
    {
        return companyrecord;
    }
    public void prepare()
    {
        companyrecord=new CompanyRecord();
    }

    public void setServletRequest(HttpServletRequest request)
    {
        this.request=request;
        
    }

    public JFreeChart getChart() {
        return chart;
    }

    public void setChart(JFreeChart chart) {
        this.chart = chart;
    }

    public String getGraphurl() {
        return graphurl;
    }

    public void setGraphurl(String graphurl) {
        this.graphurl = graphurl;
    }
    
    
    public ArrayList getCompanytablerec() {
        return companytablerec;
    }

    public void setCompanytablerec(ArrayList companytablerec) {
        this.companytablerec = companytablerec;
    }

    public ArrayList getExchange() {
        return exchange;
    }

    public void setExchange(ArrayList exchange) {
        this.exchange = exchange;
    }
    
    
   
    public String fetchCompanyProfile()
    {
        System.out.println("line 37------------");
       ExchangeRecordOperation exchnagerecordoperation=new ExchangeRecordOperation();
       exchange=exchnagerecordoperation.getExchange();
       companytablerec=companyrecop.getCompanyProfile();
       // System.out.println("---full object of companymodel"+companytablerec);
        System.out.println("line 39------------");
        return SUCCESS;
    }

    public String InsertCompanyRecord()
    {
      //int a=companyrecord.getCompanyissuename();
      //System.out.println("line 57------"+a);
      companytablerec=companyrecop.getCompanyProfile();
      System.out.println("-----127-----m test---"+companyrecop);
     // companyrecord.setCompanyissuename(companymod.getTinnumber());
      boolean b=companyrecop.companyRecord(companyrecord);
      if(b)
      {
          return SUCCESS;
      }
      else
      {
          return ERROR;
      }
    
    }
   CompanyOperation companyoperation=new CompanyOperation();
   //CompanyAction companyaction=new CompanyAction();
    public String deleteRecord()
    { 
        
        
    boolean check=companyrecop.deleteCompanyRecord(companyrecord.getRecordid());
    if(check)
    {
     companyrecord1=companyoperation.getCompanyRecord();
     return SUCCESS;
    }
    else
    {
    return ERROR;
    }
    }
    //for draw graph
    
     public String drawDatePriceGraph()
    {  
        XYSeriesCollection dataset = new XYSeriesCollection();
        Configuration cfg=new Configuration();
        Configuration cf=cfg.configure("/hibernate.cfg.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=null;
        
        try
        {
            ArrayList al=new ArrayList();
           // ArrayList al1=new ArrayList();
            tx=session.beginTransaction();
            XYSeries series = new XYSeries("XYGraph");
          
             
                 String hql="from CompanyRecord";
                 Query q=session.createQuery(hql);
                 System.out.println("line 160==================="+q);
                 al=(ArrayList) q.list();
                 System.out.println("line 162==================="+al);
                 for(int i=0;i<al.size();i++)
                 {
                    CompanyRecord crec= (CompanyRecord) al.get(i);
                    double cprice=crec.getClosingprice();
                    
                    System.out.println("line 168==================="+cprice);
                    double oprice =crec.getOpeningprice();
                    System.out.println("line 170==================="+oprice);
                    series.add(oprice,cprice);
                    dataset = new XYSeriesCollection();
                    dataset.addSeries(series);
                    
                 }
                
                
               /*  for(int i=0;i<al.size();i++)
                 {
                    CompanyRecord crec= (CompanyRecord) al.get(i);
                    String date=crec.getDate();
                    int d=Integer.parseInt(date);
                    System.out.println("line 168==================="+d);
                    int cprice =crec.getClosingprice();
                    System.out.println("line 170==================="+cprice);
                    series1.add(d, cprice);
                    dataset = new XYSeriesCollection();
                    dataset.addSeries(series1);
                 }
                */
               

           

            chart = ChartFactory.createXYLineChart(
            "Opening-Closing Graph", // Title
            "Date", // x-axis Label
            "y-axis", // y-axis Label
            dataset, // Dataset
            PlotOrientation.VERTICAL, // Plot Orientation
            true, // Show Legend
            true, // Use tooltips
            false // Configure chart to generate URLs?
        );

        chart.setBackgroundPaint(Color.gray);
        chart.getTitle().setPaint(Color.getHSBColor(999999,999999,999999));

        final XYPlot plot = chart.getXYPlot();

        plot.setBackgroundPaint(Color.getHSBColor(333,333,333));
        plot.setDomainGridlinePaint(Color.white);
        plot.setRangeGridlinePaint(Color.white);

        plot.setDomainCrosshairVisible(true);
        plot.setRangeCrosshairVisible(true);

        final XYItemRenderer renderer = plot.getRenderer();

        if (renderer instanceof XYLineAndShapeRenderer)
        {
        XYLineAndShapeRenderer rr=(XYLineAndShapeRenderer) renderer;
        rr.setBaseShapesVisible(true);
        rr.setBaseShapesFilled(true);
        rr.setSeriesPaint(0,Color.blue);      
        }
          String    src="g1.jpg";
          String filePath = request.getSession().getServletContext().getRealPath("/");// get file path
          System.out.println("Server path:" + filePath);
          java.io.File file1 = new java.io.File(filePath, "/MyshareDesign/images/"+src);
          ChartUtilities.saveChartAsJPEG(file1, chart, 400, 400);
         // graphurl="http://localhost:8080/jfreechart14/images/"+src;
          
          graphurl=request.getContextPath()+"/MyshareDesign/images/"+src;
            System.out.println("----98---"+graphurl);
            tx.commit();
          }
        catch (Exception e)
        {
        System.out.println("line 157==================="+e.getMessage());       
        }
             return SUCCESS;
    }
  
    public String EditCompanyRecord()
    {
        ExchangeRecordOperation exchnagerecordoperation=new ExchangeRecordOperation();
        exchange=exchnagerecordoperation.getExchange();
        companytablerec=companyrecop.getCompanyProfile();
        companyrecord.setRecordid(companyrecord.getRecordid());
        return SUCCESS;
       
    }
     public String EditCompanyRecordForm()
    {
        CompanyAction companyaction=new CompanyAction();
        boolean check=companyrecop.editCompanyRecord(companyrecord);
        if(check)
        {
         companyaction.fetchCompanyRecord();
        return SUCCESS;
        }
        else
        {
          companyaction.fetchCompanyRecord();
        return ERROR;
        }
    }
          
}
