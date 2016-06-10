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
public class ShareHolderTransaction implements java.io.Serializable
{
    ShareHolderTransactionId id;
    CompanyModel company;
    ShareHolder share;
    String transactionmode,date;
    Integer numberofissue,currentvalue,netvalue,companyname,dmataccountnumber;

    public ShareHolderTransaction() {
    }

    public ShareHolderTransaction(ShareHolderTransactionId id, CompanyModel company, ShareHolder share) {
        this.id = id;
        this.company = company;
        this.share = share;
    }

    public ShareHolderTransaction(ShareHolderTransactionId id, CompanyModel company, ShareHolder share, Integer dmataccountnumber, Integer companyname, String transactionmode, String date, Integer numberofissue, Integer currentvalue, Integer netvalue) {
        this.id = id;
        this.company = company;
        this.share = share;
        this.dmataccountnumber = dmataccountnumber;
        this.companyname = companyname;
        this.transactionmode = transactionmode;
        this.date = date;
        this.numberofissue = numberofissue;
        this.currentvalue = currentvalue;
        this.netvalue = netvalue;
    }

    
    public ShareHolderTransactionId getId() {
        return id;
    }

    public void setId(ShareHolderTransactionId id) {
        this.id = id;
    }

    public ShareHolder getShare() {
        return share;
    }

    public void setShare(ShareHolder share) {
        this.share = share;
    }


    public CompanyModel getCompany() {
        return company;
    }

    public void setCompany(CompanyModel company) {
        this.company = company;
    }

   
    
    public Integer getDmataccountnumber() {
        return dmataccountnumber;
    }

    public void setDmataccountnumber(Integer dmataccountnumber) {
        this.dmataccountnumber = dmataccountnumber;
    }

    public Integer getCompanyname() {
        return companyname;
    }

    public void setCompanyname(Integer companyname) {
        this.companyname = companyname;
    }

    public String getTransactionmode() {
        return transactionmode;
    }

    public void setTransactionmode(String transactionmode) {
        this.transactionmode = transactionmode;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getNumberofissue() {
        return numberofissue;
    }

    public void setNumberofissue(Integer numberofissue) {
        this.numberofissue = numberofissue;
    }

    public Integer getCurrentvalue() {
        return currentvalue;
    }

    public void setCurrentvalue(Integer currentvalue) {
        this.currentvalue = currentvalue;
    }

    public Integer getNetvalue() {
        return netvalue;
    }

    public void setNetvalue(Integer netvalue) {
        this.netvalue = netvalue;
    }

    
}
