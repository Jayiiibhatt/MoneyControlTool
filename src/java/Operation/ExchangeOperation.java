/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operation;

import Database_Filter.DatabaseFilter;
import Model.ExchangeModel;
import Model.ExchangeRecordModel;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.util.*;

/**
 *
 * @author gautam
 */
public class ExchangeOperation extends ActionSupport
{
    Session session;
    Transaction tx;
     SessionFactory sf;
     
    public boolean insertExchange(ExchangeModel exchangemodel)
    {
         sf=DatabaseFilter.getSf();
         session=sf.openSession();
         tx=session.beginTransaction();
        try
        {
           
            System.out.println("@@@@@ line 35 @@@@");
            session.save(exchangemodel);
            tx.commit();
            return true;
            
        
        }
        catch(Exception e)
        {
        
            System.out.println("@@@@@ line 45 @@@@@@@@@@"+e.getMessage());
            tx.rollback();
            return false;
        }
        
}
     public boolean deleteExchange(String ename){
        Session session=DatabaseFilter.getSf().openSession();
        Transaction transaction=session.beginTransaction();
        
        try{
        ExchangeModel exchange1=(ExchangeModel) session.get(ExchangeModel.class,ename);
        session.delete(exchange1);
        transaction.commit();
      
        return true;
        }
        catch(Exception e)
        {            
            return false;
        }
        finally
        {
            session.close();
        }
    } 
    
    
        
}
        
        
