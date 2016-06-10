/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operation;

import Database_Filter.DatabaseFilter;
import Model.CompanyModel;
import Model.CompanyRecord;
import Model.ExchangeModel;
import org.hibernate.SessionFactory;
import org.hibernate.*;
import org.hibernate.cfg.*;
import java.sql.*;
import java.util.*;

/**
 *
 * @author gautam
 */
public class CompanyOperation
{
    SessionFactory sf=DatabaseFilter.getSf();
    Session session;
    Transaction tx;
    ArrayList<CompanyModel> al=new ArrayList<CompanyModel>();
    public boolean insertCompany(CompanyModel companymodel)
   
    {
         
       
        session=sf.openSession();
        tx=session.beginTransaction();
        try
        {  /*ExchangeModel em=(ExchangeModel)session.get(ExchangeModel.class,exchangename);
           companymodel.setExchangemodel(em);*/
           session.save(companymodel);
            tx.commit();
            return true;
            
       }
        catch(HibernateException e)
        {
            System.out.println("Line@@@@@@@ 44 ####"+e.getMessage());
            tx.rollback();
            return false;
        }
    
    }
  public ArrayList getCompany()
    {
       ArrayList<CompanyModel> al=new ArrayList<CompanyModel>();
        session=sf.openSession();
        tx=session.beginTransaction();
        String hql="from CompanyModel";
        Query q=session.createQuery(hql);
        al=(ArrayList<CompanyModel>) q.list();
        tx.commit();
        return al;
    }
  public ArrayList getCompanyRecord()
    {
       ArrayList<CompanyRecord> al=new ArrayList<CompanyRecord>();
        session=sf.openSession();
        tx=session.beginTransaction();
        String hql="from CompanyRecord";
        Query q=session.createQuery(hql);
        al=(ArrayList<CompanyRecord>) q.list();
        System.out.println("----------71---m test----"+al);
        tx.commit();
        return al;
    }
  public boolean deleteCompany(int tinnumber)
  {
      
       Session session=DatabaseFilter.getSf().openSession();
        Transaction transaction=session.beginTransaction();
        
        try{
        CompanyModel comp=(CompanyModel) session.get(CompanyModel.class,tinnumber);
            System.out.println("line=========81"+comp);
        session.delete(comp);
        transaction.commit();
      
        return true;
        }
        catch(Exception e)
        {        
            System.out.println("line=========90");
            
            return false;
        }
        finally
        {
            session.close();
        }
  }
  public boolean editCompany(CompanyModel cmod)
  {
       Session session=DatabaseFilter.getSf().openSession();
        Transaction transaction=session.beginTransaction();
        
        try{
        CompanyModel comp=(CompanyModel) session.get(CompanyModel.class,cmod.getTinnumber());
        System.out.println("line=========81"+comp);
            comp.setCompanyname(cmod.getCompanyname());
            comp.setNominalvalue(cmod.getNominalvalue());
             comp.setNetasset(cmod.getNetasset());
             comp.setNetsale(cmod.getNetsale());
             comp.setNetprofit(cmod.getNetprofit());
             comp.setCompanyissuename(cmod.getCompanyissuename());
        session.update(comp);
        transaction.commit();
        comp.setMsg("data Updated");
      
        return true;
        }
        catch(Exception e)
        {        
            System.out.println("line=========90");
            
            return false;
        }
        finally
        {
            session.close();
        }
        
  }
}
