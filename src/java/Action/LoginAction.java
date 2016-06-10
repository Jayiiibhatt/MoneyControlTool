/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;
import Model.Login;
import Model.ShareHolder;
import Model.User;
import Operation.LoginOperation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.ServletContext;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.util.ServletContextAware;

/**
 *
 * @author USER
 */
public class LoginAction extends ActionSupport implements ModelDriven,Preparable,ServletContextAware{
    private Login login;
    ArrayList uservalue=new ArrayList();
    User user;
    ShareHolder sh;
    Integer user_id;
   
       
    @Override
    public Object getModel() {
        return login;
    }

    @Override
    public void prepare() throws Exception {
        login=new Login();
    }

    @Override
    public void setServletContext(ServletContext sc)
    {
        
    }

    public ArrayList getUservalue() 
    {
        return uservalue;
    }

    public void setUservalue(ArrayList uservalue) {
        this.uservalue = uservalue;
    }
    
    //change
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ShareHolder getSh() {
        return sh;
    }

    public void setSh(ShareHolder sh) 
    {
        this.sh = sh;
    }
//for delete shareholder
    public Integer getUser_id() 
    {
        return user_id;
    }

    public void setUser_id(Integer user_id) 
    {
        this.user_id = user_id;
    }
    
    
    //above
    LoginOperation loginoperation=new LoginOperation();
    public String execute()
    {
       // uservalue=loginoperation.getLoginDataValue();
       // System.out.println("------"+uservalue);
        return SUCCESS;
    }
   public String run(){
       ServletContext ctx=ServletActionContext.getServletContext();
       
        System.out.println("--------"+ctx);
        String n=(String) ctx.getInitParameter("userid");
        String p=(String) ctx.getInitParameter("password");
        
        if(n.equals(login.getUname()))
        {
            if(p.equals(login.getPass()))
            {
                return SUCCESS;
            }
        } 
        String s=loginoperation.allowUser(login);
        if(s.equals("Admin")){
            return "admin";
        }
        if(s.equals("Shareholder")){
            return "shareholder";
        }
        if(s.equals("Assistant")){
            return "assistant";
        }
        if(s.equals("none")){
            return ERROR;
        }
        
        return ERROR;
    }
 /*  public String loginValidation()
    {
        User u=new User();
        uservalue=loginoperation.getLoginDataValue();
        Iterator it=uservalue.iterator();
        while(it.hasNext())
        {
           u=(User) it.next();
           int id=u.getUser_id();
           String pass=u.getPassword();
        if(login.getUname().equals(id))
        {
            return SUCCESS;
            
           
        }
         else
        {
            return ERROR; 
            
        }
       
        }
         
    }*/
    
    //**********************share holder***********
     public String viewShareHolder()
    {
        
        uservalue=loginoperation.getShareHolder();
        // System.out.println("id is============================111"+id);
        //uservalue=loginoperation.getLoginDataValue();
        return SUCCESS;
    }
     
     
    public String deleteshareHolderRecord()
    {
        
                
        //System.out.println("line ===135"+user.getUser_id());
        boolean check=loginoperation.deleteshareholder(user_id);
        System.out.println("line ====================135"+check);
        if(check)
        {
            viewShareHolder();
           
        return SUCCESS;
        
        }
        else
       {
      return ERROR;
       }
        
    
    }
     
     
}
