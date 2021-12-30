package model;


import java.util.Date;

public class AppointmentDoctor implements ISchedulable {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    //Generando los getters y setters 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public void schedule(Date date, String time) {

    }
    
}


/**Nota:
 * 
 * Los métodos de las interfaces son obligatorios implementarlos, en éste caso tanto para AppintmentDoctor y Nurse debo implementar
 * el método scheduble con los parámetos mínimos que yo generé en la interfaz
 */
