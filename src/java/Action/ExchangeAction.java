/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Model.CompanyModel;
import Model.ExchangeModel;
import Model.ExchangeRecordModel;
import Operation.ExchangeOperation;
import Operation.ExchangeRecordOperation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.*;

/**
 *
 * @author gautam
 */
public class ExchangeAction extends ActionSupport implements ModelDriven,Preparable
{
    String ename;
   public ExchangeModel exchangemodel;
    ArrayList exchangeview;
    ArrayList exchangerecordview;
   // String exchangename;
  // ExchangeRecordModel exchangerecordmodel;
  // CompanyModel companymode=new CompanyModel();
   public ExchangeModel getModel()
   {
       return exchangemodel;
   }
   public void prepare()
   {
       exchangemodel=new ExchangeModel();
   }

    public ArrayList getExchangerecordview() {
        return exchangerecordview;
    }

    public void setExchangerecordview(ArrayList exchangerecordview) {
        this.exchangerecordview = exchangerecordview;
    }

//for delete exchange
    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
   

    

   
    //for view exchange
    public ArrayList getExchangeview() {
        return exchangeview;
    }

    public void setExchangeview(ArrayList exchangeview) {
        this.exchangeview = exchangeview;
    }
   
   public String execute()
    {
        return SUCCESS;
   
    }
    ExchangeOperation exchangeoperation=new ExchangeOperation();
    public String insertRecord()
    {
       // exchangemodel.setCompanymodel(companymode);
        //companymode.setExchangemodel(exchangemodel);
       
        
        boolean b=exchangeoperation.insertExchange(exchangemodel);
        if(b)
        {
            
            return SUCCESS;
        }
        else
        {
        
            return ERROR;
        }
        
    }
    ExchangeRecordOperation exrecop=new ExchangeRecordOperation();
     public String viewExchange()
    {
        System.out.println("line 71======");
        
        exchangeview=exrecop.getExchange();
        
        return SUCCESS;
    }
     
     public String viewExchangeRecord()
    {
        System.out.println("line 71======");
        
        exchangerecordview=exrecop.getExchangeRecord();
        
        return SUCCESS;
    }
       
     public String deleteexch()
     {
        System.out.println("line 108======"+ename);
         boolean check=exchangeoperation.deleteExchange(ename);
        
         if(check)
         {
         exchangeview=exrecop.getExchange();
        return SUCCESS;
         }
         else
         {
        return ERROR;
         }
     }
}
