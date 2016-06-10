package Action;

import Model.Admin;
import Model.Assistant;
import Model.ShareHolder;
import Operation.RegistrationOperation;
import Model.User;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;


public class RegistrationAction extends ActionSupport implements ModelDriven,Preparable{
    private User user;
    private ShareHolder shareholder;
    private Assistant assistant;
    private Admin admin;
    int user_id;
   ArrayList uservalue=new ArrayList();
    @Override
    public User getModel(){
       return user;
    }
    @Override
    public void prepare(){
        user=new User();
        shareholder=new ShareHolder();
    }

    public ShareHolder getShareholder() {
        return shareholder;
    }

    public void setShareholder(ShareHolder shareholder) {
        this.shareholder = shareholder;
    }

    public Assistant getAssistant() {
        return assistant;
    }

    public void setAssistant(Assistant assistant) {
        this.assistant = assistant;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getUser_id() {
        System.out.println("----get id--"+user_id);
        return user_id;
    }

    public void setUser_id(int user_id) {
        System.out.println("----set id--"+user_id);
        this.user_id = user_id;
    }
    
    public ArrayList getUservalue() {
        return uservalue;
    }

    public void setUservalue(ArrayList uservalue) {
        this.uservalue = uservalue;
    }
    
    
    RegistrationOperation registrationoperation=new RegistrationOperation();
   
    @Override
    public String execute(){
        uservalue=registrationoperation.getUserDataValue();
        return SUCCESS;
    }
        
    

    
    public String run(){
        System.out.println("--------1---------------");
        System.out.println(user.getUser_id()+"----"+user.getFname()+"----"+user.getPassword());
        System.out.println("-----------2-------------");
        
        uservalue=registrationoperation.getUserDataValue();
        if(user.getType().equals("Shareholder")){
            shareholder.setUser_id(user.getUser_id());
            shareholder.setUsername(user.getUsername());
            shareholder.setFname(user.getFname());
            shareholder.setMname(user.getMname());
            shareholder.setLname(user.getLname());
            shareholder.setPassword(user.getPassword());
            shareholder.setPhno(user.getPhno());
            shareholder.setCountry(user.getCountry());
            shareholder.setState(user.getState());
            shareholder.setDist(user.getDist());
            shareholder.setStreet(user.getStreet());
            shareholder.setCity(user.getCity());
            shareholder.setGen(user.getGen());
            shareholder.setPin_no(user.getPin_no());
            shareholder.setDate_of_birth(user.getDate_of_birth());
            shareholder.setType(user.getType());
            boolean save=registrationoperation.insertRegisterDetail(shareholder);
            if(save){
                return SUCCESS;
            }else{
                return ERROR;
            }
        }
        if(user.getType().equals("Admin")){
            admin.setUser_id(user.getUser_id());
            admin.setUsername(user.getUsername());
            admin.setFname(user.getFname());
            admin.setMname(user.getMname());
            admin.setLname(user.getLname());
            admin.setPassword(user.getPassword());
            admin.setPhno(user.getPhno());
            admin.setCountry(user.getCountry());
            admin.setState(user.getState());
            admin.setDist(user.getDist());
            admin.setStreet(user.getStreet());
            admin.setCity(user.getCity());
            admin.setGen(user.getGen());
            admin.setPin_no(user.getPin_no());
            admin.setDate_of_birth(user.getDate_of_birth());
            admin.setType(user.getType());
            boolean save=registrationoperation.insertRegisterDetail(admin);
            if(save){
                return SUCCESS;
            }else{
                return ERROR;
            }
        }
        if(user.getType().equals("Assistant")){
            assistant.setUser_id(user.getUser_id());
            assistant.setUsername(user.getUsername());
            assistant.setFname(user.getFname());
            assistant.setMname(user.getMname());
            assistant.setLname(user.getLname());
            assistant.setPassword(user.getPassword());
            assistant.setPhno(user.getPhno());
            assistant.setCountry(user.getCountry());
            assistant.setState(user.getState());
            assistant.setDist(user.getDist());
            assistant.setStreet(user.getStreet());
            assistant.setCity(user.getCity());
            assistant.setGen(user.getGen());
            assistant.setPin_no(user.getPin_no());
            assistant.setDate_of_birth(user.getDate_of_birth());
            assistant.setType(user.getType());
            boolean save=registrationoperation.insertRegisterDetail(assistant);
            if(save){
                return SUCCESS;
            }else{
                return ERROR;
            }
        }
        return SUCCESS;
    }
    
    public String deleteRecord(){
        System.out.println("------action class----user id---"+user.getUser_id());
        boolean del=registrationoperation.deleteUser(user.getUser_id());
        uservalue=registrationoperation.getUserDataValue();
        if(del){
            return SUCCESS;
        }
        else{
            return ERROR;
        }
        
    }
    
    public String activateupdateRecord(){
        System.out.println("------action class----user id---"+user.getUser_id());
        //String response = SMSSender("mykarsoltechnologies", "704815", "919687606227", "hello,you are activated", "WebSMS", "0");        
        //System.out.println(response);
        boolean del=registrationoperation.activateUser(user.getUser_id());
        uservalue=registrationoperation.getUserDataValue();
        if(del){
            return SUCCESS;
        }
        else{
            return ERROR;
        }
        
    }
    
    public String deactivateupdateRecord(){
        System.out.println("------action class----user id---"+user.getUser_id());
        boolean del=registrationoperation.deactivateUser(user.getUser_id());
        uservalue=registrationoperation.getUserDataValue();
        if(del){
            return SUCCESS;
        }
        else{
            return ERROR;
        }
        
    }
    public static String retval="";
    public static String SMSSender(String user,String password,String msisdn,String msg,String sid,String fl)    
    {
        String rsp="";
        
        try {
            // Construct The Post Data
            String data = URLEncoder.encode("user", "UTF-8") + "=" + URLEncoder.encode(user, "UTF-8");
            data += "&" + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(password, "UTF-8");
            data += "&" + URLEncoder.encode("msisdn", "UTF-8") + "=" + URLEncoder.encode(msisdn, "UTF-8");
            data += "&" + URLEncoder.encode("msg", "UTF-8") + "=" + URLEncoder.encode(msg, "UTF-8");
            data += "&" + URLEncoder.encode("sid", "UTF-8") + "=" + URLEncoder.encode(sid, "UTF-8");
            data += "&" + URLEncoder.encode("fl", "UTF-8") + "=" + URLEncoder.encode(fl, "UTF-8");
            
            //Push the HTTP Request
            URL url = new URL("http://smslane.com/vendorsms/pushsms.aspx");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
        
            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();
           
            //Read The Response
            BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                // Process line...
                retval += line;
            }
            wr.close();
            rd.close();
            
            System.out.println(retval);
            rsp = retval;
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  rsp;
    }
    
    
    
}
