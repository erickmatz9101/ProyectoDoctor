import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {

    //Atributo que diferencia un Doctor de un paciente

    private String speciality;
    

    //Creando el método constructor de la clase Doctor

    Doctor(String name, String email){

    //LLamando al constructor de la clase padre por medio de super

        super(name, email);

        System.out.println("El nombre del doctor asignado es: "+name);

        this.speciality=speciality;

    }

    //Generando los Gett y Sett de speciality 

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Éste array guarda los abjetos de tipo cita (availableApointment)

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();

    //Método que añade las citas, las cuales se acumulan en el array de arriba

    public void addAvailableAppointment(Date date, String time){

        availableAppointments.add(new Doctor.AvailableAppointment(date,time));

    }
     
    //Para devolver la lista de citas disponibles que están dentro de mi array
    
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }


    //Creando el método que permitirá poder agregar una cita para los pacientes


    
    //Creando la clase anidada privada dentro de doctor y encapsulando sus atributos
    public static class AvailableAppointment{

        //Definiendo los atributos de la clase

        private int id;
        private Date date;
        private String time;

        //Generando el método constructor en el cual se necesita mínimo la fecha y hora para que se cree una cita disponible 

        public AvailableAppointment(Date date,String time){

            this.date=date;
            this.time=time;
    }

            //Generando los get y set de los atributos

         public int getId() {
                return id;
        }
    
        public void setId(int id) {
                this.id = id;
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


    }

    
    
}

/**Los métodos se sobrecargan con las variables para que los valores se asignen en las variables que están reservando el espacio, además
 * de que cuando se inicilice el programa los valores no sean nulos, sino tome los valores que se le estan asignando.
 * 
 * 
 * Como la clase doctor es la que contiene los datos de las citas disponibles, es preferible poder crear una clase independiente
 *  anidada de tipo stactic dentro de  doctor que defina las reglas de negocio para poder asignar las citas  la clase lleva por nombre
 * AvailableAppointment. Como la clase es de tipo private los atributos de la clase también deberán ser encapsulados (Private).
 * 
 * A nivel de la clase Doctor se debe crear un método que permita poder agendar las citas a los paacientes, éste método es:
 * addAvailableAppointment.
 * 
 * para poder acumular o guardar las citas lo hago por medio de un array que cumple con la funcion de gusrdar objetos de tipo
 * availabreApponitment, se encarga de ir guardando las citas cada vez que se necesita.
 * 
 * El método es el que crea las citas, no debo olvidar que para madar a llamar a la clase anidada debe ser primero con el nombre de la 
 * clase padre que en éste caso es Doctor.availableAppointment y asi cada que yo agregue una cita voy a estar creando objetos de tipo
 * availableAppointment con 2 parámetros, fecha y hora.
 */
