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
import java.util.ArrayList;
import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 *
 * @author gautam
 */
public class ExchangeRecordOperation
{
    Session session;
    Transaction tx;
     

      public boolean insertExchangerecord(ExchangeRecordModel exchangerecordmod)
        {
            SessionFactory sf=DatabaseFilter.getSf();
            session=sf.openSession();
            tx=session.beginTransaction();
            try
            {
           
            System.out.println("@@@@@ line 37 @@@@");
            
            session.save(exchangerecordmod);
            tx.commit();
            
            return true;
            
            }
            catch(HibernateException e)
            {
                
            System.out.println("@@@@@ line 45 @@@@@@@@@@"+e.getMessage());
            tx.rollback();
            return false;
            
            }
        }
      public ArrayList getExchange()
        {
            ArrayList<ExchangeModel> rec=new ArrayList<ExchangeModel>();
            try
            {
                
          SessionFactory sf=DatabaseFilter.getSf();
          session=sf.openSession();
          tx=session.beginTransaction();
          String hql="from ExchangeModel";
        
          Query q=session.createQuery(hql);
          
          rec= (ArrayList<ExchangeModel>) q.list();
          
          
         
          tx.commit();
        
            }
       catch(HibernateException e)
       {
         
            System.out.println("@@@@@ line 74 @@@@@@@@@@"+e.getMessage());
            tx.rollback();
           
       }
              return rec;
        
        }
      
      
       public ArrayList getExchangeRecord()
        {
            ArrayList<ExchangeRecordModel> exrec=new ArrayList<ExchangeRecordModel>();
            try
            {
                System.out.println("----insert-----89");
                SessionFactory sf=DatabaseFilter.getSf();
                System.out.println("----insert-----91"+sf);
                session=sf.openSession();
                System.out.println("----insert-----93"+session);
                tx=session.beginTransaction();
                System.out.println("----insert-----95"+tx);
                String hql="from ExchangeRecordModel";
                System.out.println("----insert-----97"+hql);
                Query q=session.createQuery(hql); 
                System.out.println("----insert-----99"+q);
                exrec=(ArrayList<ExchangeRecordModel>) q.list();
                System.out.println("----insert-----101"+exrec.toString());
                tx.commit();
                System.out.println("----insert-----103");
            }
            catch(HibernateException e)
            {
         
                    System.out.println("@@@@@ line 74 @@@@@@@@@@"+e.getMessage());
                    tx.rollback();
           
            }
              return exrec;
        
        }
       
       public boolean deleteExchangeRecord(int record)
       {
          session=DatabaseFilter.getSf().openSession();
          tx=session.beginTransaction();
          try
          {
           ExchangeRecordModel exrecmod=(ExchangeRecordModel) session.get(ExchangeRecordModel.class, record);
           session.delete(exrecmod);
           tx.commit();
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
