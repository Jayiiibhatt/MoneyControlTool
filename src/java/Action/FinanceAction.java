/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Model.Bank;
import Model.CompanyModel;
import Model.FinanceModel;
import Model.FinancialInstitution;
import Operation.CompanyRecordOperation;
import Operation.FinanceOperation;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
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
public class FinanceAction extends ActionSupport implements ModelDriven,Preparable,ServletRequestAware
{
    Bank b1=new Bank();
    String sname;
    FinancialInstitution financeialinstitute=new FinancialInstitution();
    FinanceModel financemod;
    ArrayList <String>Company;
    ArrayList sourceoffinance;
    FinanceOperation financeoperation=new FinanceOperation();
    HttpServletRequest request;
    private JFreeChart chart,chart1;
    String graphurl2,graphurl3;

    public FinanceModel getModel()
    {
        return  financemod;
    }
    public void prepare()
    {
     financemod=new FinanceModel();
    }

    public ArrayList getSourceoffinance() {
        return sourceoffinance;
    }

    public void setSourceoffinance(ArrayList sourceoffinance) {
        this.sourceoffinance = sourceoffinance;
    }
    
    public void setServletRequest(HttpServletRequest request)
    {
        this.request=request;
    }
    

    public ArrayList<String> getCompany() {
        return Company;
    }

    public void setCompany(ArrayList<String> Company) {
        this.Company = Company;
    }

    //for delete source of finance
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    
    /*----------------------------------------------------*/
    public Bank getB1()
    {
       return b1;

        
    }

    public void setB1(Bank b1) {
        this.b1 = b1;
    }

    //for draw graph
   
    public FinancialInstitution getFinanceialinstitute() {
        return financeialinstitute;
    }

    public JFreeChart getChart() {
        return chart;
    }

    public void setChart(JFreeChart chart) {
        this.chart = chart;
    }

    public String getGraphurl2() {
        return graphurl2;
    }

    public void setGraphurl2(String graphurl2) {
        this.graphurl2 = graphurl2;
    }

    public String getGraphurl3() {
        return graphurl3;
    }

    public void setGraphurl3(String graphurl3) {
        this.graphurl3 = graphurl3;
    }

    
    public void setFinanceialinstitute(FinancialInstitution financeialinstitute) {
        this.financeialinstitute = financeialinstitute;
    }

    
   /*----------------------------------------------------*/
    public String companyname()
    {
        System.out.println("=========line 44-----------------");
        Company=financeoperation.getname();
       System.out.println("line 48----");
       return SUCCESS;
       /* for(int i=0;i<Company.size();i++)
        {
             System.out.println("line 51----");
            String cm=Company.get(i);
            System.out.println("line 47----"+cm);
        }
        
       System.out.println("line 52----");*/
        
    }
    public String insertfinance()
    {
       Company=financeoperation.getname();
       if(financemod.getType().equals("Bank")) 
       {
       Company=financeoperation.getname();
       b1.setSfname(financemod.getSfname());
       b1.setCompname(financemod.getCompname());
       b1.setCountry(financemod.getCountry());
       b1.setState(financemod.getState());
       b1.setCity(financemod.getCity());
       b1.setDistrict(financemod.getDistrict());
       b1.setStreet(financemod.getStreet());
       b1.setPinnumber(financemod.getPinnumber());
       b1.setDate(financemod.getDate());
       b1.setDuration(financemod.getDuration());
       b1.setBorrowamount(financemod.getBorrowamount());
       b1.setInterestrate(financemod.getInterestrate());
       b1.setType(financemod.getType());
       
       boolean b=financeoperation.finance(b1);
       if(b)
       {
           return SUCCESS;
       }
       else
       {
           return ERROR;
       }
       
       }
       if(financemod.getType().equals("FinancialInstitute"))
       {
          Company=financeoperation.getname();
          
          financeialinstitute.setSfname(financemod.getSfname());
          financeialinstitute.setCompname(financemod.getCompname());
          financeialinstitute.setCountry(financemod.getCountry());
          financeialinstitute.setState(financemod.getState());
          financeialinstitute.setCity(financemod.getCity());
          financeialinstitute.setDistrict(financemod.getDistrict());
          financeialinstitute.setStreet(financemod.getStreet());
          financeialinstitute.setPinnumber(financemod.getPinnumber());
          financeialinstitute.setDate(financemod.getDate());
          financeialinstitute.setDuration(financemod.getDuration());
          financeialinstitute.setBorrowamount(financemod.getBorrowamount());
          financeialinstitute.setInterestrate(financemod.getInterestrate());
          financeialinstitute.setType(financemod.getType());
         boolean b=financeoperation.finance(financeialinstitute);
          if(b)
          {
            return SUCCESS;
          }
         else
          {
            return ERROR;
          }
       
       
        }
       return SUCCESS;
    }
    
    public String getSourceofFinance(){
        sourceoffinance=financeoperation.fetchSourcefin();
        return SUCCESS;
    }
    
    public String deleteRecord()
    {
         //System.out.println("168======="+financemod.getSfname());
    boolean check=financeoperation.deleteSourceofFinance(sname);
       
    if(check)
    {
    getSourceofFinance();
    return SUCCESS;
    }
    else
    {
    return ERROR;
    
    }
    
    }
    public String drawFinanceInterestGraph()
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
             FinanceOperation finop=new FinanceOperation();
             al=finop.fetchSourcefin();
             for(int i=0;i<al.size();i++)
             {
                 FinanceModel fmod= (FinanceModel) al.get(i);
                 int intrate=fmod.getInterestrate();
                 System.out.println("line 195================"+intrate);
                 String name=fmod.getSfname();
                 System.out.println("line 196=================="+name);
                 String c=fmod.getCompname();
                 System.out.println("line 196==================");
                 dataset.setValue(intrate, name, name);
                 System.out.println("line 201=================="+dataset);
                 
             }
            
            
             chart=ChartFactory.createBarChart("FinaanceVsInterest","FinanceName","InterestRate", dataset, PlotOrientation.VERTICAL,false, true,false);
             System.out.println("line 207==================");
             chart.setBackgroundPaint(Color.ORANGE);
             
             chart.getTitle().setPaint(Color.getHSBColor(111, 111, 111));
              String    src="g3.jpg";
                System.out.println("line 212=================="+src);
           
                String filePath = request.getSession().getServletContext().getRealPath("/");// get file path
                 System.out.println("Server path:===+214" + filePath);
                 java.io.File file1 = new java.io.File(filePath, "/MyshareDesign/images/"+src);
                 ChartUtilities.saveChartAsJPEG(file1, chart, 400, 400);
         // graphurl="http://localhost:8080/jfreechart14/images/"+src;
          
          graphurl2=request.getContextPath()+"/MyshareDesign/images/"+src;
            System.out.println("----98---"+graphurl2);
            tx.commit();

        }
        
        catch(Exception e)
        {
            System.out.println("line 282======="+e.getMessage());
        }

       return SUCCESS;
   
    }
    public String drawBorrowCompany()
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
             FinanceOperation finop=new FinanceOperation();
             al=finop.fetchSourcefin();
             for(int i=0;i<al.size();i++)
             {
                 FinanceModel fmod= (FinanceModel) al.get(i);
                 int bamt=fmod.getBorrowamount();
                 System.out.println("line 195================"+bamt);
                 String name=fmod.getSfname();
                 System.out.println("line 196=================="+name);
                 String c=fmod.getCompname();
                 System.out.println("line 196==================");
                 dataset.setValue(bamt, name,c);
                 System.out.println("line 201=================="+dataset);
                 
             }
            
            
             chart=ChartFactory.createBarChart("CompanyBorrow","CompanyName","BorrowAmount", dataset, PlotOrientation.VERTICAL,false, true,false);
             System.out.println("line 207==================");
             chart.setBackgroundPaint(Color.ORANGE);
             
             chart.getTitle().setPaint(Color.getHSBColor(111, 111, 111));
              String    src="g4.jpg";
                System.out.println("line 212=================="+src);
           
                String filePath = request.getSession().getServletContext().getRealPath("/");// get file path
                 System.out.println("Server path:===+214" + filePath);
                 java.io.File file1 = new java.io.File(filePath, "/MyshareDesign/images/"+src);
                 ChartUtilities.saveChartAsJPEG(file1, chart, 400, 400);
         // graphurl="http://localhost:8080/jfreechart14/images/"+src;
          
          graphurl3=request.getContextPath()+"/MyshareDesign/images/"+src;
            System.out.println("----98---"+graphurl3);
            tx.commit();

        }
        
        catch(Exception e)
        {
            System.out.println("line 282======="+e.getMessage());
        }

       return SUCCESS;
   

        
    }
    
}
