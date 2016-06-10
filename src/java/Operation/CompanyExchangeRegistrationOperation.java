package Operation;

import Model.CompanyExchangeRegistration;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CompanyExchangeRegistrationOperation {
    SessionFactory sf=Database_Filter.DatabaseFilter.getSf();
    Session session;
    Transaction transaction;
    
    public boolean saveCompanyRegister(CompanyExchangeRegistration comexreg){
        try{
        
            session=sf.openSession();
            transaction=session.beginTransaction();
            session.save(comexreg);
            transaction.commit();
        
        }catch(HibernateException he){
            System.out.println("--23----"+he.getMessage());
            transaction.rollback();
        }finally{
            session.close();
        }
        return true;
        
    }
}
