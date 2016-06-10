package Model;

public class ShareHolder extends User{
    String dmat,shareholder_id;

    public ShareHolder() {
    }

    public ShareHolder(String dmat) {
        this.dmat = dmat;
    }

    public String getDmat() {
        return dmat;
    }

    public void setDmat(String dmat) {
        this.dmat = dmat;
    }

    public String getShareholder_id() {
        return shareholder_id;
    }

    public void setShareholder_id(String shareholder_id) {
        this.shareholder_id = shareholder_id;
    }
    
    
}
