package Model;

public class Assistant extends User{
    String joining_date,assistant_id;

    public Assistant() {
    }

    public Assistant(String joining_date) {
        this.joining_date = joining_date;
    }

    public String getJoining_date() {
        return joining_date;
    }

    public void setJoining_date(String joining_date) {
        this.joining_date = joining_date;
    }

    public String getAssistant_id() {
        return assistant_id;
    }

    public void setAssistant_id(String assistant_id) {
        this.assistant_id = assistant_id;
    }
    
    
}
