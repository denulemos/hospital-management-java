/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Denu
 */
public class UserModel {
    private String fullname;
    private String id;
    private String specialty;

    public UserModel(String fullname, String id, String specialty) {
        this.fullname = fullname;
        this.id = id;
        this.specialty = specialty;
    }

    
    public String getFullname() {
        return fullname;
    }

    public String getId() {
        return id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
    
}
