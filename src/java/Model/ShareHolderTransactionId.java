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
public class ShareHolderTransactionId implements java.io.Serializable
{
     
    private Integer shareholder_id,tinnumber;

    public ShareHolderTransactionId(Integer shareholder_id, Integer tinnumber) {
        this.shareholder_id = shareholder_id;
        this.tinnumber = tinnumber;
    }

    public ShareHolderTransactionId() {
    }
    
    

    public Integer getShareholder_id() {
        return shareholder_id;
    }

    public void setShareholder_id(Integer shareholder_id) {
        this.shareholder_id = shareholder_id;
    }

    public Integer getTinnumber() {
        return tinnumber;
    }

    public void setTinnumber(Integer tinnumber) {
        this.tinnumber = tinnumber;
    }

    
    
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.shareholder_id);
        hash = 41 * hash + Objects.hashCode(this.tinnumber);
        return hash;
    }
/*
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ShareHolderTransactionId other = (ShareHolderTransactionId) obj;
        if (!Objects.equals(this.getShareholder_id(), other.getShareholder_id())) {
            return false;
        }
        if (!Objects.equals(this.getTinnumber(), other.getTinnumber())) {
            return false;
        }
        return true;
    }
    
    */
    
    @Override
    public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ShareHolderTransactionId) ) return false;
		 ShareHolderTransactionId castOther = ( ShareHolderTransactionId ) other; 
         
		 return (this.shareholder_id==castOther.shareholder_id)
 && (this.tinnumber==castOther.tinnumber);
   }
    
   
}
