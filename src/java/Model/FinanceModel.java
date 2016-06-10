/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author gautam
 */
public class FinanceModel implements java.io.Serializable
{
    String sfname,country,city,state,street,district,date,compname,type;
    Integer pinnumber,interestrate,borrowamount,duration;

   
  
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


    public String getSfname() {
        return sfname;
    }

    public void setSfname(String sfname) {
        this.sfname = sfname;
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

   

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   

    public Integer getPinnumber() {
        return pinnumber;
    }

    public void setPinnumber(Integer pinnumber) {
        this.pinnumber = pinnumber;
    }

    public Integer getInterestrate() {
        return interestrate;
    }

    public void setInterestrate(Integer interestrate) {
        this.interestrate = interestrate;
    }

    public Integer getBorrowamount() {
        return borrowamount;
    }

    public void setBorrowamount(Integer borrowamount) {
        this.borrowamount = borrowamount;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getCompname() {
        return compname;
    }

    public void setCompname(String compname) {
        this.compname = compname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
