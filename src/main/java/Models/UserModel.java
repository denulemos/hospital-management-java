package models;

public class UserModel {
    private String name;
    private String lastname;
    private String id;
    private String specialty;
    private String password;
    private int price;

    public UserModel(String name, String lastname, String id, String specialty, int price, String password) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.specialty = specialty;
        this.price = price;
        this.password = password;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    
    
}
