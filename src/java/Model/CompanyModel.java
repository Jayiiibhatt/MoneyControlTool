/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Set;

/**
 *
 * @author gautam
 */
public class CompanyModel implements java.io.Serializable
{
 public String companyname,companyissuename,msg;
 Integer tinnumber,nominalvalue,netsale,netasset,netprofit;
 Set<CompanyExchangeRegistration> companyexchangeregistration;
 Set<CompanyRecord> cmpnyrec;
    public CompanyModel() 
    {
    }

    
    


    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCompanyissuename() {
        return companyissuename;
    }

    public void setCompanyissuename(String companyissuename) {
        this.companyissuename = companyissuename;
    }

   

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getTinnumber() {
        return tinnumber;
    }

    public void setTinnumber(Integer tinnumber) {
        this.tinnumber = tinnumber;
    }

    public Integer getNominalvalue() {
        return nominalvalue;
    }

    public void setNominalvalue(Integer nominalvalue) {
        this.nominalvalue = nominalvalue;
    }

    public Integer getNetsale() {
        return netsale;
    }

    public void setNetsale(Integer netsale) {
        this.netsale = netsale;
    }

  

    public Integer getNetasset() {
        return netasset;
    }

    public void setNetasset(Integer netasset) {
        this.netasset = netasset;
    }

    public Integer getNetprofit() {
        return netprofit;
    }

    public void setNetprofit(Integer netprofit) {
        this.netprofit = netprofit;
    }

    

    public Set<CompanyRecord> getCmpnyrec() {
        return cmpnyrec;
    }

    public void setCmpnyrec(Set<CompanyRecord> cmpnyrec) {
        this.cmpnyrec = cmpnyrec;
    }

    public Set<CompanyExchangeRegistration> getCompanyexchangeregistration() {
        return companyexchangeregistration;
    }

    public void setCompanyexchangeregistration(Set<CompanyExchangeRegistration> companyexchangeregistration) {
        this.companyexchangeregistration = companyexchangeregistration;
    }
    
 
}
