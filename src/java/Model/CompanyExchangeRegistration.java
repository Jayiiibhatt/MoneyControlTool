package Model;

public class CompanyExchangeRegistration implements java.io.Serializable{
    String myexchangename,registerdate;
    Integer mycompanyname;
    Double ipoprice;
    private ExchangeModel exchangemodel;
    private CompanyModel companymodel;
    private CompanyExchange id;

    public CompanyExchangeRegistration() {
    }

    public CompanyExchangeRegistration(ExchangeModel exchangemodel, CompanyModel companymodel, CompanyExchange id) {
        this.exchangemodel = exchangemodel;
        this.companymodel = companymodel;
        this.id = id;
    }

    public CompanyExchangeRegistration(String myexchangename, String registerdate, String exname, Integer tinnumber, Integer registerid, Double ipoprice, ExchangeModel exchangemodel, CompanyModel companymodel, CompanyExchange id) {
        this.myexchangename = myexchangename;
        this.registerdate = registerdate;
        this.ipoprice = ipoprice;
        this.exchangemodel = exchangemodel;
        this.companymodel = companymodel;
        this.id = id;
    }

    public CompanyExchange getId() {
        return id;
    }

    public void setId(CompanyExchange id) {
        this.id = id;
    }
    
    

    public String getMyexchangename() {
        return myexchangename;
    }

    public void setMyexchangename(String myexchangename) {
        this.myexchangename = myexchangename;
    }

    

    public String getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(String registerdate) {
        this.registerdate = registerdate;
    }

    

    

    public Double getIpoprice() {
        return ipoprice;
    }

    public void setIpoprice(Double ipoprice) {
        this.ipoprice = ipoprice;
    }

    public ExchangeModel getExchangemodel() {
        return exchangemodel;
    }

    public void setExchangemodel(ExchangeModel exchangemodel) {
        this.exchangemodel = exchangemodel;
    }

    public CompanyModel getCompanymodel() {
        return companymodel;
    }

    public void setCompanymodel(CompanyModel companymodel) {
        this.companymodel = companymodel;
    }

    

    public Integer getMycompanyname() {
        return mycompanyname;
    }

    public void setMycompanyname(Integer mycompanyname) {
        this.mycompanyname = mycompanyname;
    }
    
    
}
