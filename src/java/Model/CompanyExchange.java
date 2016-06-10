/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Objects;

/**
 *
 * @author gautam
 */
public class CompanyExchange implements java.io.Serializable
{
     private Integer tinnumber;
    private String exname;

    public CompanyExchange() {
    }

    public CompanyExchange(Integer tinnumber, String exname) {
        this.tinnumber = tinnumber;
        this.exname = exname;
    }

    public Integer getTinnumber() {
        return tinnumber;
    }

    public void setTinnumber(Integer tinnumber) {
        this.tinnumber = tinnumber;
    }

    public String getExname() {
        return exname;
    }

    public void setExname(String exname) {
        this.exname = exname;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.tinnumber);
        hash = 89 * hash + Objects.hashCode(this.exname);
        return hash;
    }

    @Override
    public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof CompanyExchange) ) return false;
		 CompanyExchange castOther = ( CompanyExchange ) other; 
         
		 return (this.getTinnumber()==castOther.getTinnumber())
 && (this.getExname()==castOther.getExname());
   }
    
}
