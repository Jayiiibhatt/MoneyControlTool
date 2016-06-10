/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author USER
 */
public class Admin extends User{
    Integer admin_id;
    String accessright;

    public Admin() {
    }

    public Admin(Integer admin_id, String accessright) {
        this.admin_id = admin_id;
        this.accessright = accessright;
    }
    
    

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAccessright() {
        return accessright;
    }

    public void setAccessright(String accessright) {
        this.accessright = accessright;
    }
    
}
