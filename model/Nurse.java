package model;
public class Nurse extends User {

    private String speciality;

    //gernerando el constructor

    public Nurse(String name, String email){

        super(name, email);

    }

    //Generando los getters y setters 

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    
}
