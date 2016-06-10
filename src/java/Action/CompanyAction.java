/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;
import Model.CompanyModel;
import Model.ExchangeModel;
import Operation.CompanyOperation;
import Operation.CompanyRecordOperation;
import Operation.ExchangeRecordOperation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.awt.Color;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author gautam
 */
public class CompanyAction extends ActionSupport implements ModelDriven,Preparable,ServletRequestAware
{
     CompanyModel companymodel;
     CompanyOperation companyoperation=new CompanyOperation();
     ExchangeModel exchangemodel=new ExchangeModel();
     ArrayList companyprofile;
     ArrayList companyrecord1;
     HttpServletRequest request;
     private JFreeChart chart;
     String graphurl1;
     //Integer tinnumber;
     
   //  String exchangename;
     @Override
    public CompanyModel getModel()
    {
        return companymodel;
    }
     @Override
    public void prepare()
    {
        companymodel=new CompanyModel();
    }

    public ArrayList getCompanyprofile() {
        return companyprofile;
    }

    public void setCompanyprofile(ArrayList companyprofile) {
        this.companyprofile = companyprofile;
    }

   

    //for draw graph
    public JFreeChart getChart() {
        return chart;
    }

    public void setChart(JFreeChart chart) {
        this.chart = chart;
    }

    public String getGraphurl1() {
        return graphurl1;
    }

    public void setGraphurl1(String graphurl1) {
        this.graphurl1 = graphurl1;
    }
    
     public void setServletRequest(HttpServletRequest request)
    {
        this.request=request;
        
    }

    public ArrayList getCompanyrecord1() {
        return companyrecord1;
    }

    public void setCompanyrecord1(ArrayList companyrecord1) {
        this.companyrecord1 = companyrecord1;
    }

   
  
    public String getexchangerecord()
    {
        return SUCCESS;
    
    }

   /* public ExchangeModel getExchangemodel() {
        return exchangemodel;
    }

    public void setExchangemodel(ExchangeModel exchangemodel) {
        this.exchangemodel = exchangemodel;
    }
    */

   /* public String getExchangename() {
        return exchangename;
    }
 
    public void setExchangename(String exchangename) {
        this.exchangename = exchangename;
    }
    */
    
    
    
   public String insertCompany()
    {  
        exchangemodel.setCompanymodel(companymodel);
       // companymodel.setExchangemodel(exchangemodel);
       // System.out.println("75-----------"+companymodel.getExchangename());
       
        
        companyprofile=companyoperation.getCompany();
        boolean b=companyoperation.insertCompany(companymodel);
        //System.out.println("80--------------"+companymodel.getExchangename()+"-------"+companymodel.getExchangemodel().getEname());
        
        if(b)
        {
        return SUCCESS;
        }
        else
        {
        return ERROR;
        }
              
         
       
    }
              
    public String fetchCompanyName()
    {
        
       companyprofile=companyoperation.getCompany();
       companyrecord1=companyoperation.getCompanyRecord();
       return SUCCESS;
    }
    public String fetchCompanyRecord()
    {
        
       
       companyrecord1=companyoperation.getCompanyRecord();
       return SUCCESS;
    }
    
    public String deleteRecord()
    {
        boolean check=companyoperation.deleteCompany(companymodel.getTinnumber());
        companyprofile=companyoperation.getCompany();
        System.out.println("line ====================135"+check);
        if(check)
        {
            fetchCompanyName();
        return SUCCESS;
        
        } 
        else
       {
      return ERROR;
       }
        
    
    }
     public String drawCompanyProfitGraph()
   {
       ArrayList al=new ArrayList();
       DefaultCategoryDataset dataset=new DefaultCategoryDataset();
        Configuration cfg=new Configuration();
        Configuration cf=cfg.configure("/hibernate.cfg.xml");
        SessionFactory sf=cf.buildSessionFactory();
        Session session=sf.openSession();
        Transaction tx=null;
        try
        {
             CompanyRecordOperation comrecop=new CompanyRecordOperation();
             al=comrecop.getCompanyProfile();
             for(int i=0;i<al.size();i++)
             {
                 CompanyModel cmod= (CompanyModel) al.get(i);
                 int profit=cmod.getNetprofit();
                 System.out.println("line 195================"+profit);
                 String name=cmod.getCompanyname();
                 System.out.println("line 196=================="+name);
                 String n=cmod.getCompanyissuename();
                  System.out.println("line 196=================="+n);
                 dataset.setValue(profit, name, name);
                 System.out.println("line 201==================");
                 
             }
            
            
             chart=ChartFactory.createBarChart("Comparison Chart","CompanyName","NetProfit", dataset, PlotOrientation.HORIZONTAL,false, true,false);
             System.out.println("line 207==================");
             chart.setBackgroundPaint(Color.ORANGE);
             
             chart.getTitle().setPaint(Color.getHSBColor(111, 111, 111));
              String    src="g2.jpg";
                System.out.println("line 212=================="+src);
           
                 String filePath = request.getSession().getServletContext().getRealPath("/");// get file path
                 System.out.println("Server path:===+214" + filePath);
                 java.io.File file1 = new java.io.File(filePath, "/MyshareDesign/images/"+src);
                 ChartUtilities.saveChartAsJPEG(file1, chart, 400, 400);
         // graphurl="http://localhost:8080/jfreechart14/images/"+src;
          
          graphurl1=request.getContextPath()+"/MyshareDesign/images/"+src;
            System.out.println("----98---"+graphurl1);
            tx.commit();

        }
        
        catch(Exception e)
        {
            System.out.println("line 217======="+e.getMessage());
        }
 
       return SUCCESS;
   
   }
    public String EditCompany() 
    {
        companymodel.setTinnumber(companymodel.getTinnumber());
        return SUCCESS;
    }
    public String EditCompanyForm()
    {
        boolean check=companyoperation.editCompany(companymodel);
        if(check)
        {
            companyprofile=companyoperation.getCompany();
           return SUCCESS; 
        }
        else
        {
            fetchCompanyName();
           return ERROR;
        }
        
        
    }
}
