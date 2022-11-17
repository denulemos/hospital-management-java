package models;

public class PatientModel {
    private String id;
    private String lastname;
    private String name;
    private String history;
    private String gender;

    public PatientModel(String id, String lastname, String name, String history, String gender) {
        this.id = id;
        this.lastname = lastname;
        this.name = name;
        this.history = history;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
