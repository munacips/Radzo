package accounts;

import executable.Main;

public class User {
    private final int id;
    private String firstname;
    private String lastname;
    private String address;
    private int phone;

    public User(String firstname, String lastname, String address, int phone){
        this.address = address;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.id = Main.currentID;
        Main.currentID+=1;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getId() {
        return id;
    }
}
