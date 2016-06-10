package Operation;

import Database_Filter.DatabaseFilter;
import Model.Admin;
import Model.Assistant;
import Model.Login;
import Model.ShareHolder;
import Model.User;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class LoginOperation {
    
    boolean flag1=false,flag2=false;
    String utype;
    int uallow;
    
    public String allowUser(Login login){
        Session session=Database_Filter.DatabaseFilter.getSf().openSession();
        Transaction transaction=session.beginTransaction();
        
        try{
            String hql="from User";
            Query q=session.createQuery(hql);
            List al=q.list();
            for(int i=0;i<al.size();i++){
                System.out.println("----inserrt into for loop-----");
                User user=(User) al.get(i);
                System.out.println("-----table value---"+user.getUsername()+"---"+user.getPassword());
                utype=user.getType();
                System.out.println("-----------type----"+utype);
                //uallow=user.getAllow();
                //System.out.println("------uallow-----"+uallow);
                System.out.println("login name-----"+login.getUname()+"--username----"+user.getUsername());
                System.out.println("login password----"+login.getPass()+"---userpassword"+user.getPassword());
                    if((login.getUname()).equals(user.getUsername())){
                        System.out.println("---name match-----");
                        flag1=true;
                        if((login.getPass()).equals(user.getPassword())){
                            System.out.println("-----password match----");
                            if(user.getAllow()==1){
                                System.out.println("----allow=1--------if part");
                                flag2=true;
                            }
                            else{
                                System.out.println("----allow=0--------else part");
                                login.setMsg("you are not allowed to login");
                                return "none";
                            }
                            break;
                        }
                    }
                }
            if(flag1&&flag2){
                System.out.println("-------enter----"+utype);
                return utype;
            }
            if(flag1&&!flag2){
                System.out.println("-------wrong password----"+utype);
                login.setMsg("You Inserted Wrong Password");
                return "none";
            }
            if(!flag1){
                System.out.println("-------mismatch----"+utype);
                login.setMsg("Wrong Username");
                return "none";
            }
        }catch(HibernateException he){
            System.out.println("-----"+he.getMessage());
            transaction.rollback();
        }finally{
            session.close();
        }
        return "none";
    }
    
    
    //**************share holder************
    
    public ArrayList getShareHolder(){
        ArrayList<ShareHolder> al1 =new ArrayList();
        SessionFactory sf=DatabaseFilter.getSf();
        Session session = sf.openSession();
        Transaction tx;
        tx=session.beginTransaction();
       try
       {
           String hql="from ShareHolder";
           System.out.println("-------a-----"+hql);
           Query q=session.createQuery(hql);
           System.out.println("------b------"+q);
           al1=(ArrayList<ShareHolder>) q.list();
           System.out.println("-------c------"+al1);
           
       
       }
        catch(HibernateException he){
           System.out.println("------1------"+he.getMessage());
           tx.rollback();
           
        }
        return al1;
    }
     
     
      public boolean deleteshareholder(int userid)
  {
      
       Session session=DatabaseFilter.getSf().openSession();
        Transaction transaction=session.beginTransaction();
        
        try{
       // User share=(User) session.get(User.class,userid);
        ShareHolder share=(ShareHolder) session.get(ShareHolder.class,userid);
           // System.out.println("line=========81"+);
        session.delete(share);
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
}
