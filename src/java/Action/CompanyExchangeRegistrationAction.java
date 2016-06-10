package Action;

import Model.CompanyExchange;
import Model.CompanyExchangeRegistration;
import Operation.CompanyExchangeRegistrationOperation;
import Operation.CompanyRecordOperation;
import Operation.ExchangeRecordOperation;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CompanyExchangeRegistrationAction extends ActionSupport implements ModelDriven,Preparable{
    private CompanyExchangeRegistration comexreg;
    private CompanyExchange companyexechange;
    ArrayList companytablerec;
    ArrayList exchange;
    
    @Override
    public Object getModel() {
        return comexreg;
    }

    @Override
    public void prepare() throws Exception {
        comexreg=new CompanyExchangeRegistration();
    }

    public ArrayList getCompanytablerec() {
        return companytablerec;
    }

    public void setCompanytablerec(ArrayList companytablerec) {
        this.companytablerec = companytablerec;
    }

    public ArrayList getExchange() {
        return exchange;
    }

    public void setExchange(ArrayList exchange) {
        this.exchange = exchange;
    }

    public CompanyExchange getCompanyexechange() {
        return companyexechange;
    }

    public void setCompanyexechange(CompanyExchange companyexechange) {
        this.companyexechange = companyexechange;
    }
    
    
    
    CompanyExchangeRegistrationOperation companyexchangeregistrationoperation=new  CompanyExchangeRegistrationOperation();
    public String insertCompanyRegistration(){
        System.out.println("------insert into loope--------");
        System.out.println("---exchange name----"+comexreg.getMyexchangename());
        exchange=exchnagerecordoperation.getExchange();
        companytablerec=companyrecop.getCompanyProfile();
        String exchangename;
        try{
            StringTokenizer st=new StringTokenizer(comexreg.getMyexchangename(), ", ");
            while(st.hasMoreTokens()){
                exchangename=st.nextToken();
                System.out.println("----token---exchange name----"+exchangename+"-tinnumber---------"+comexreg.getMycompanyname()+"-------");
                
                int x=comexreg.getMycompanyname();
                System.out.println("--------"+x);
               
                
                companyexechange=new CompanyExchange(x, exchangename);
                comexreg.setId(companyexechange);
                
                boolean save=companyexchangeregistrationoperation.saveCompanyRegister(comexreg);
                if(save){
                    System.out.println("----data inserted-----succeed---");
                }else{
                    return ERROR;
                }
            }
        }
        catch(NumberFormatException e){
             System.out.println("------catch block------"+e.getMessage()+"------");
        }
        return SUCCESS;
        
    }
    CompanyRecordOperation companyrecop=new CompanyRecordOperation();
    ExchangeRecordOperation exchnagerecordoperation=new ExchangeRecordOperation();
    
    public String fetchCompanyProfile()
    {
        System.out.println("line 37------------");
        
        exchange=exchnagerecordoperation.getExchange();
        companytablerec=companyrecop.getCompanyProfile();
        System.out.println("---full object of companymodel"+companytablerec);
        System.out.println("line 39------------");
        return SUCCESS;
    }
}
