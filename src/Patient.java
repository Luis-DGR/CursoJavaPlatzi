import javax.swing.*;

public class Patient {
    private String name;
    private String email;
    private String addres;
     Patient(){



    }
    Patient(String name,String email,String addres){
    this.addres=addres;
    this.name=name;
    this.email=email;


    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }
}
