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
public class CompanyRecord
{
    String date,btndateprice,companyissuename;
    Integer openingprice,closingprice,crchange,growth,recordid;

    public String getCompanyissuename() {
        return companyissuename;
    }

    public void setCompanyissuename(String companyissuename) {
        this.companyissuename = companyissuename;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getOpeningprice() {
        return openingprice;
    }

    public void setOpeningprice(Integer openingprice) {
        this.openingprice = openingprice;
    }

    public Integer getClosingprice() {
        return closingprice;
    }

    public void setClosingprice(Integer closingprice) {
        this.closingprice = closingprice;
    }

    public Integer getCrchange() {
        return crchange;
    }

    public void setCrchange(Integer crchange) {
        this.crchange = crchange;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getRecordid() {
        return recordid;
    }

    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
    }

   
    
}
