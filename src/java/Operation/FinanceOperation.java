/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operation;

import Database_Filter.DatabaseFilter;
import Model.Bank;
import Model.CompanyModel;
import Model.FinanceModel;
import Model.FinancialInstitution;
import java.util.ArrayList;
import org.hibernate.*;
import org.hibernate.cfg.*;

/**
 *
 * @author gautam
 */
public class FinanceOperation
{
    SessionFactory sf=DatabaseFilter.getSf();
    Session session;
    Transaction tx;
    ArrayList<String> al=new ArrayList<String>();
    public ArrayList getname()
    {
        System.out.println("=========line 27-----------------");
        session=sf.openSession();
        tx=session.beginTransaction();
        String hql="select companyname from CompanyModel";
        
        Query q=session.createQuery(hql);
        al=( ArrayList<String>)q.list();
        tx.commit();
        System.out.println("=========line 35-----------------");
        return al;
    }
    public boolean finance(Bank bank)
    {
        session=sf.openSession();
        tx=session.beginTransaction();
        try
        {
           //session.save(finacemodel);
            System.out.println("-----bank----48---");
           session.save(bank);
           System.out.println("-----finacial institute----50---");
          // session.save(financial);
            tx.commit();
        }
        catch(HibernateException e)
        {
            System.out.println(e.getMessage()+"line-----------54");
            tx.rollback();
        }
        return true;
    }
    public boolean finance(FinancialInstitution financialinstitute)
    {
        session=sf.openSession();
        tx=session.beginTransaction();
        try
        {
           //session.save(finacemodel);
            System.out.println("-----bank----48---");
           session.save(financialinstitute);
           System.out.println("-----finacial institute----50---");
          // session.save(financial);
            tx.commit();
        }
        catch(HibernateException e)
        {
            System.out.println(e.getMessage()+"line-----------54");
            tx.rollback();
        }
        return true;
    }
    public ArrayList fetchSourcefin(){
        ArrayList<FinanceModel> al1=new ArrayList<FinanceModel>();
        session=sf.openSession();
        tx=session.beginTransaction();
        String hql="from FinanceModel";
        Query q=session.createQuery(hql);
        al1=(ArrayList<FinanceModel>) q.list();
        tx.commit();
        return al1;
    }
    
    public boolean deleteSourceofFinance(String name)
    {
        session=DatabaseFilter.getSf().openSession();
        tx=session.beginTransaction();
        try
        {
            FinanceModel finmod=(FinanceModel) session.get(FinanceModel.class,name);
            session.delete(finmod);
        tx.commit();
        return true;
        }
        catch(HibernateException he)
        {
            System.out.println("line 103======"+he.getMessage());
            return false;
        }
    }
}
 