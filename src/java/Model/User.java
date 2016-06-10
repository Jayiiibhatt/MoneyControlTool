package Model;

public class User 
{
    String fname,mname,lname,phno,country,state,city,dist,gen,date_of_birth,type,btnlog,msg,c_password,password,street,pin_no,username;
    Integer user_id,allow;
    public User() {
    }

    public User(String fname, String mname, String lname, String phno, String country, String state, String city, String dist, String gen, String date_of_birth, String type, Integer user_id, String c_password, String password, String street, String pin_no) {
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.phno = phno;
        this.country = country;
        this.state = state;
        this.city = city;
        this.dist = dist;
        this.gen = gen;
        this.date_of_birth = date_of_birth;
        this.type = type;
        this.user_id = user_id;
        this.c_password = c_password;
        this.password = password;
        this.street = street;
        this.pin_no = pin_no;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBtnlog() {
        return btnlog;
    }

    public void setBtnlog(String btnlog) {
        this.btnlog = btnlog;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getC_password() {
        return c_password;
    }

    public void setC_password(String c_password) {
        this.c_password = c_password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPin_no() {
        return pin_no;
    }

    public void setPin_no(String pin_no) {
        this.pin_no = pin_no;
    }

    public Integer getAllow() {
        return allow;
    }

    public void setAllow(Integer allow) {
        this.allow = allow;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
}
