package gabrielmedeiros;

import java.io.Serializable;
import java.util.ArrayList;


public class User implements Serializable{
    
    private int id;

    private String name;

    private String email;

    private String password;

    private ArrayList<PhoneNumber> contacts = new ArrayList<>();

    public User(int id, String name, String email, String password, ArrayList<PhoneNumber> contacts) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.contacts = contacts;
    }

    public User(int id, String name, String email, String password) {

        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, String password) {

        this.name = name;
        this.email = email;
        this.password = password;
    }



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<PhoneNumber> getContacts() {
        return this.contacts;
    }

    public void setContacts(ArrayList<PhoneNumber> contacts) {
        this.contacts = contacts;
    }
    

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", password='" + getPassword() + "'" +
            ", contacts='" + getContacts() + "'" +
            "}";
    }

}
