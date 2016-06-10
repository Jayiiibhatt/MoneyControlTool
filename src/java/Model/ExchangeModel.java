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
public class ExchangeModel implements java.io.Serializable
{
    String exname,country,city,state,street,district,msg;
    Integer pinno;
    CompanyModel companymodel;
    ExchangeRecordModel exchangerecordmodel;
    Set<ExchangeRecordModel> exrecmodel;
   Set<CompanyExchangeRegistration> companyexchangeregistration;

    public ExchangeModel()  
    {
    }

   public CompanyModel getCompanymodel() {
        return companymodel;
    }

    public void setCompanymodel(CompanyModel companymodel) {
        this.companymodel = companymodel;
    }

    public ExchangeRecordModel getExchangerecordmodel() {
        return exchangerecordmodel;
    }

    public void setExchangerecordmodel(ExchangeRecordModel exchangerecordmodel) {
        this.exchangerecordmodel = exchangerecordmodel;
    }

    

   

    

    public String getExname() {
        return exname;
    }

    public void setExname(String exname) {
        this.exname = exname;
    }

  

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getPinno() {
        return pinno;
    }

    public void setPinno(Integer pinno) {
        this.pinno = pinno;
    }

    
    
    public Set<CompanyExchangeRegistration> getCompanyexchangeregistration() {
        return companyexchangeregistration;
    }

    public void setCompanyexchangeregistration(Set<CompanyExchangeRegistration> companyexchangeregistration) {
        this.companyexchangeregistration = companyexchangeregistration;
    }

    public Set<ExchangeRecordModel> getExrecmodel() {
        return exrecmodel;
    }

    public void setExrecmodel(Set<ExchangeRecordModel> exrecmodel) {
        this.exrecmodel = exrecmodel;
    }
   

}