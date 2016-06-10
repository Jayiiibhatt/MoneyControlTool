/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

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
public class ExchangeRecordAction extends ActionSupport implements ModelDriven,Preparable
{
    ArrayList exchange;
    Integer exid;
    ExchangeRecordModel exchangerecordmodel;
    ExchangeModel exchangemodel=new ExchangeModel();
   ArrayList exchangerecordview;
    
    public ExchangeRecordModel getModel()
    {
        return exchangerecordmodel;
    }
    public void prepare()
    {
        exchangerecordmodel=new ExchangeRecordModel();
    }

    public ArrayList getExchange() {
        return exchange;
    }

    public void setExchange(ArrayList exchange) {
        this.exchange = exchange;
    }

    //for delete exchangerecord
    public Integer getExid() {
        return exid;
    }

    public void setExid(Integer exid) {
        this.exid = exid;
    }

    public ArrayList getExchangerecordview() {
        return exchangerecordview;
    }

    public void setExchangerecordview(ArrayList exchangerecordview) {
        this.exchangerecordview = exchangerecordview;
    }
    
    
    
    
   ExchangeRecordOperation exchnagerecordoperation=new ExchangeRecordOperation();
     public String addExchangeRecord()
             
    {
        exchangemodel.setExchangerecordmodel(exchangerecordmodel);
        exchange=exchnagerecordoperation.getExchange();
     
         boolean b=exchnagerecordoperation.insertExchangerecord(exchangerecordmodel);
        if(b)
        {
         return SUCCESS;
        }
        else
        {
        return ERROR;
        }
       
    }
      public String getexchangename()
    {
       
      
        exchnagerecordoperation=new ExchangeRecordOperation();
        exchange=exchnagerecordoperation.getExchange();
        System.out.println("54&&&&&&&&&&&&&&&&&&"+exchange);  
        return SUCCESS;
    }
  ExchangeRecordOperation exrecop=new ExchangeRecordOperation();
      public String deleteRecord()
      {
          
          boolean check=exchnagerecordoperation.deleteExchangeRecord(exid);
          if(check)
         {
         getexchangename();
         exchangerecordview=exrecop.getExchangeRecord();
        return SUCCESS;
         }
         else
         {
        return ERROR;
         }
      }

}
