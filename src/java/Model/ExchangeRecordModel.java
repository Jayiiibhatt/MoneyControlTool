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
public class ExchangeRecordModel
{
   String date,exchangename;
   Integer  openingindex,closingindex,exchangerecid;
   Double mychange;
   //SExchangeModel exchangemod;
    public ExchangeRecordModel() 
    {
        
    }

    /*public ExchangeModel getExchangemod() {
        return exchangemod;
    }

    public void setExchangemod(ExchangeModel exchangemod) {
        this.exchangemod = exchangemod;
    }*/

   

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

   

    public Integer getOpeningindex() {
        return openingindex;
    }

    public void setOpeningindex(Integer openingindex) {
        this.openingindex = openingindex;
    }

    public Integer getClosingindex() {
        return closingindex;
    }

    public void setClosingindex(Integer closingindex) {
        this.closingindex = closingindex;
    }

    

    public String getExchangename() {
        return exchangename;
    }

    public void setExchangename(String exchangename) {
        this.exchangename = exchangename;
    }

    public Integer getExchangerecid() {
        return exchangerecid;
    }

    public void setExchangerecid(Integer exchangerecid) {
        this.exchangerecid = exchangerecid;
    }

    

    public Double getMychange() {
        return mychange;
    }

    public void setMychange(Double mychange) {
        this.mychange = mychange;
    }

    

    
    
    
   
}
