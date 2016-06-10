/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operation;
import Database_Filter.DatabaseFilter;
import Model.CompanyModel;
import Model.CompanyRecord;
import java.util.ArrayList;
import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 *
 * @author gautam
 */
public class CompanyRecordOperation 
{
    SessionFactory sf=DatabaseFilter.getSf();
    Transaction tx=null;
    Session session;
    
    public ArrayList getCompanyProfile()
    {
        ArrayList<CompanyModel> al=new ArrayList<CompanyModel>();
        try
        {
         System.out.println("line 28------------");
        
        session=sf.openSession();
        tx=session.beginTransaction();
        String hql="from CompanyModel";
        Query q=session.createQuery(hql);
        al=(ArrayList<CompanyModel>) q.list();
        tx.commit();
            System.out.println("---operation class--"+al);
        
        }
        catch(HibernateException e)
        {
            System.out.println("line 40"+e.getMessage());
            tx.rollback();
        }
        return al;
    }
    
    public boolean companyRecord(CompanyRecord companyrec)
    {
        try
        {
            System.out.println("-----insert in loop -----53"); 
            session=sf.openSession();   
            tx=session.beginTransaction();
            session.save(companyrec);
            tx.commit();
        }
        catch(HibernateException e)
        {
            System.out.println("line 55"+e.getMessage());
            tx.rollback();
        }
        return true;
    }
   public boolean deleteCompanyRecord(int record)
   {
    Session session=DatabaseFilter.getSf().openSession();
    Transaction tx=session.beginTransaction();
    try
    {
     CompanyRecord comprec=(CompanyRecord) session.get(CompanyRecord.class,record);
     session.delete(comprec);
        tx.commit();
    return true;
    }
    catch(HibernateException he)
    {
        System.out.println("line 76======="+he.getMessage());
        return false;
    }
   }
   
   public boolean editCompanyRecord(CompanyRecord comrec)
   {
       Session session=DatabaseFilter.getSf().openSession();
    Transaction tx=session.beginTransaction();
    try
    {
     CompanyRecord comprec=(CompanyRecord) session.get(CompanyRecord.class,comrec.getRecordid());
     session.delete(comprec);
     comprec.setDate(comrec.getDate());
     comprec.setOpeningprice(comrec.getOpeningprice());
     comprec.setClosingprice(comrec.getClosingprice());
     comprec.setCrchange(comrec.getCrchange());
     comprec.setGrowth(comrec.getGrowth());
     session.update(comprec);
        tx.commit();
       
    return true;
    }
    catch(HibernateException he)
    {
        System.out.println("line 76======="+he.getMessage());
        return false;
    }
   
   }
   
}
