package Operation;

import Database_Filter.DatabaseFilter;
import Model.Admin;
import Model.Assistant;
import Model.ShareHolder;
import Model.User;
import java.util.ArrayList;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class RegistrationOperation {
    public boolean insertRegisterDetail(ShareHolder shareholder){
        SessionFactory sf=DatabaseFilter.getSf();
        Session session = sf.openSession();
        Transaction tx;
        tx=session.beginTransaction();
       try
       {
           shareholder.setAllow(0);
           session.save(shareholder);
           tx.commit();
           //user.setMsg("data is inserted");
       
       }
          catch(HibernateException he){
            //user.setMsg("not inserted"+he.getMessage());
           System.out.println("------1------"+he.getMessage());
           tx.rollback();
           
        }
        return true;
    }
    
    public boolean insertRegisterDetail(Assistant assistant){
        SessionFactory sf=DatabaseFilter.getSf();
        Session session = sf.openSession();
        Transaction tx;
        tx=session.beginTransaction();
       try
       {
           assistant.setAllow(0);
           session.save(assistant);
           tx.commit();
           //user.setMsg("data is inserted");
       
       }
        catch(HibernateException he){
            //user.setMsg("not inserted"+he.getMessage());
           System.out.println("------1------"+he.getMessage());
           tx.rollback();
           
        }
        return true;
    }
    
    public boolean insertRegisterDetail(Admin admin){
        SessionFactory sf=DatabaseFilter.getSf();
        Session session = sf.openSession();
        Transaction tx;
        tx=session.beginTransaction();
       try
       {
           admin.setAllow(0);
           session.save(admin);
           tx.commit();
           //user.setMsg("data is inserted");
       
       }
        catch(HibernateException he){
            //user.setMsg("not inserted"+he.getMessage());
           System.out.println("------1------"+he.getMessage());
           tx.rollback();
           
        }
        return true;
    }
    
    public ArrayList getUserDataValue(){
        ArrayList<User> al =new ArrayList();
        SessionFactory sf=DatabaseFilter.getSf();
        Session session = sf.openSession();
        Transaction tx;
        tx=session.beginTransaction();
       try
       {
           String hql="from User";
           System.out.println("-------a-----"+hql);
           Query q=session.createQuery(hql);
           System.out.println("------b------"+q);
           al=(ArrayList<User>) q.list();
           System.out.println("-------c------"+al);
           
       
       }
        catch(HibernateException he){
           System.out.println("------1------"+he.getMessage());
           tx.rollback();
           
        }
        return al;
    }
    
    public boolean deleteUser(int user_id){
        Session session=Database_Filter.DatabaseFilter.getSf().openSession();
        Transaction transaction=session.beginTransaction();
        
        try{
        User user=(User)session.get(User.class, user_id);
        session.delete(user);
        transaction.commit();
      
        
        }
        catch(HibernateException e)
        {      
            System.out.println("-----"+e.getMessage());
            return false;
        }
        finally
        {
            session.close();
        }
        return true;
    }
    
    public boolean activateUser(int user_id){
        Session session=Database_Filter.DatabaseFilter.getSf().openSession();
        Transaction transaction=session.beginTransaction();
        
        try{
        User user=(User)session.get(User.class, user_id);
        user.setAllow(1);
        session.update(user);
        
        transaction.commit();
      
        
        }
        catch(HibernateException e)
        {      
            System.out.println("-----"+e.getMessage());
            return false;
        }
        finally
        {
            session.close();
        }
        return true;
    }
    
    public boolean deactivateUser(int user_id){
        Session session=Database_Filter.DatabaseFilter.getSf().openSession();
        Transaction transaction=session.beginTransaction();
        
        try{
        User user=(User)session.get(User.class, user_id);
        user.setAllow(0);
        session.update(user);
        
        transaction.commit();
      
        
        }
        catch(HibernateException e)
        {      
            System.out.println("-----"+e.getMessage());
            return false;
        }
        finally
        {
            session.close();
        }
        return true;
    }
    
    
}
