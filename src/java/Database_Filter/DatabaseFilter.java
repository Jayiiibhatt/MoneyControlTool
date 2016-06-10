/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Database_Filter;


import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author gautam
 */
public class DatabaseFilter extends StrutsPrepareAndExecuteFilter {
    private static SessionFactory sf;
    static{
        sf=new Configuration().configure().buildSessionFactory();
    }
    public static SessionFactory getSf() {
        return sf;
    }
    
}
