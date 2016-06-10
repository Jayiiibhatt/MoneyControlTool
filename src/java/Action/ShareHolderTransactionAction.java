/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Action;

import Model.ShareHolderTransaction;
import Model.ShareHolderTransactionId;
import Operation.CompanyOperation;
import Operation.ShareHolderTransactionOperation;
import static com.opensymphony.xwork2.Action.ERROR;
import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import java.util.ArrayList;

/**
 *
 * @author gautam
 */
public class ShareHolderTransactionAction extends ActionSupport implements Preparable,ModelDriven
{
    ArrayList dmataccount;
    ArrayList compname;
    ShareHolderTransaction shareholdertrans = new ShareHolderTransaction();
    ShareHolderTransactionId shareid;
    ArrayList shareholdertransactionrecord;
    public ShareHolderTransaction getModel()
    {
        return shareholdertrans;
    }
    public void prepare()
    {
        shareholdertrans=new ShareHolderTransaction();
    }
    
    public ArrayList getDmataccount() {
        return dmataccount;
    }

    public void setDmataccount(ArrayList dmataccount) {
        this.dmataccount = dmataccount;
    }

    public ArrayList getCompname() {
        return compname;
    }

    public void setCompname(ArrayList compname) {
        this.compname = compname;
    }

    public ShareHolderTransaction getShareholdertrans() {
        return shareholdertrans;
    }

    public void setShareholdertrans(ShareHolderTransaction shareholdertrans) {
        this.shareholdertrans = shareholdertrans;
    }

    public ShareHolderTransactionId getShareid() {
        return shareid;
    }

    public void setShareid(ShareHolderTransactionId shareid) {
        this.shareid = shareid;
    }

    public ArrayList getShareholdertransactionrecord() {
        return shareholdertransactionrecord;
    }

    public void setShareholdertransactionrecord(ArrayList shareholdertransactionrecord) {
        this.shareholdertransactionrecord = shareholdertransactionrecord;
    }
    
    
    
    ShareHolderTransactionOperation shareholderop=new ShareHolderTransactionOperation();
     CompanyOperation comop=new CompanyOperation();
    public String fetchDmatAndCompanyName()
    {
        System.out.println("line 52=======");
       
        compname=comop.getCompany();
       
        dmataccount=shareholderop.getShareHolder();
       // System.out.println("line 54======="+dmataccount);
        return SUCCESS;
    }
    
    public String insertShareTransaction()
    {
        
         compname=comop.getCompany();   
         dmataccount=shareholderop.getShareHolder();
        System.out.println("-----67---"+shareholdertrans.getCompanyname()+"-------"+shareholdertrans.getDmataccountnumber());
        shareid=new ShareHolderTransactionId(shareholdertrans.getDmataccountnumber(),shareholdertrans.getCompanyname() );
        System.out.println("-----68---"+shareid.getShareholder_id()+"-------"+shareid.getTinnumber());
        shareholdertrans.setId(shareid);
            boolean save=shareholderop.insertShareTransaction(shareholdertrans);
            if(save)
            {
                return SUCCESS;
            }
            else
            {
                return ERROR;
            }
    }
    
    public String ViewShareHolderTransaction(){
        System.out.println("----enter----");
        shareholdertransactionrecord=shareholderop.getShareholderTransaction();
        System.out.println("----exit----"+shareholdertransactionrecord);
        return SUCCESS;
        
    }

    
}
