package gabrielmedeiros;

public class PhoneNumber {

    private int ddd;

    private String number;

    private String type;


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
