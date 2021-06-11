package gabrielmedeiros;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PhoneNumber {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int phone_id;
    
    @Column(nullable = false)
    private int ddd;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String type;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    public PhoneNumber(){}

    public PhoneNumber(int ddd, String number, String type, User user) {
        this.ddd = ddd;
        this.number = number;
        this.type = type;
        this.user = user;
    }

    public PhoneNumber(int ddd, String number, String type) {
        this.ddd = ddd;
        this.number = number;
        this.type = type;
    }


    public int getDdd() {
        return this.ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getNumber() {
        return this.number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
