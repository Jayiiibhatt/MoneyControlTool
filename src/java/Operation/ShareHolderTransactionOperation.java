/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operation;

import Database_Filter.DatabaseFilter;
import Model.ShareHolder;
import Model.ShareHolderTransaction;
import Model.ShareHolderTransactionId;
import java.util.ArrayList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author gautam
 */
public class ShareHolderTransactionOperation 
{
     SessionFactory sf=DatabaseFilter.getSf();
     Session session;
     Transaction tx=null;
     
     
     
    public ArrayList getShareHolder()
    {
        ArrayList<ShareHolder> record=new ArrayList<ShareHolder>();
        try
        {
            System.out.println("line 32==============");
            session=sf.openSession();
            tx=session.beginTransaction();
            String hql="from ShareHolder";
            Query q=session.createQuery(hql);
            System.out.println("line 38=============="+q);
            record=(ArrayList<ShareHolder>) q.list();
            System.out.println("line 38=============="+record);
            tx.commit();
        }
        catch(HibernateException he)
        {
            System.out.println("line 31"+he.getMessage());
            tx.rollback();
        }
        return record;
    }
    
    
    
    public ArrayList getShareholderTransaction(){
         ArrayList shareholdertrans=new ArrayList();
        // ShareHolderTransactionId shtid=new ShareHolderTransactionId(Integer.MIN_VALUE, Integer.MIN_VALUE);
         try{
             System.out.println("--55---");
             session=sf.openSession();
             System.out.println("--56---");
             tx=session.beginTransaction();
             System.out.println("--57---");
             String hql="from ShareHolderTransaction";
             System.out.println("--58---");
             Query q=session.createQuery(hql);
             System.out.println("--59---");
             shareholdertrans=(ArrayList) q.list();
             System.out.println("--60---"+shareholdertrans);
             tx.commit();
         }catch(HibernateException he){
                System.out.println("-----line 31-----"+he.getMessage());
                tx.rollback();
         }catch(ClassCastException cc){
             System.out.println("---"+cc.getMessage());
         }
         System.out.println("--61---"+shareholdertrans);
         return shareholdertrans;
     }
    
    
    
    
     public boolean insertShareTransaction(ShareHolderTransaction shareholdertran){
         session=sf.openSession();
         try{
              System.out.println("line-----operation class----63 ");
              tx=session.beginTransaction();
              System.out.println("line-----operation class----64--- "+tx);
              session.save(shareholdertran);
              System.out.println("line-----operation class----65 ---- "+session);
              tx.commit();return true;
         }
        catch(HibernateException he){
            System.out.println("line "+he.getMessage());
            tx.rollback();
            return false;
        }
     }
}
