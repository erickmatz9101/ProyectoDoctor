package model;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Pattern;

public class Doctor extends User {

    //Atributo que diferencia un Doctor de un paciente

    private String speciality;

    //Éste array guarda los abjetos de tipo cita (availableApointment)

     private ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    

    //Creando el método constructor de la clase Doctor

     public Doctor(String name, String email){

    //LLamando al constructor de la clase padre por medio de super

        super(name, email);

        
    }

    //Generando los Gett y Sett de speciality 

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    

    //Método que añade las citas, las cuales se acumulan en el array de arriba

    public void addAvailableAppointment(String date, String time){

        availableAppointments.add(new Doctor.AvailableAppointment(date,time));

    }
     
    //Para devolver la lista de citas disponibles que están dentro de mi array
    
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    //Sobreescribiendo el método toString para la calse Doctor y modificar el comportamiento 

    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }


  

    
    //Creando la clase anidada privada dentro de doctor y encapsulando sus atributos
    public static class AvailableAppointment{ 

        //Definiendo los atributos de la clase

        private int id;
        private Date date;
        private String time;

        //Haciendo uso de la clase SimpleDateFormat para darle formato a las fechas de las citas (recuerda que son objetos)

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        //Generando el método constructor en el cual se necesita mínimo la fecha y hora para que se cree una cita disponible 

        public AvailableAppointment(String date,String time){

            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
    }

            //Generando los get y set de los atributos

         public int getId() {
                return id;
        }
    
        public void setId(int id) {
                this.id = id;
        }
    
        public Date getDate(String DATE) {
                return date;
        }

        public String getDate() {
            return format.format(date);
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

        //Sobreescribiendo el método toString en la clase vailableAppointment para cambiar su comportamineto
        //En éste caso imprimir las fechas disponibles que tiene el doctor en ese momento.

        public String toString (){

            return "Available Appointments \nDate: " +date+ "\nTime: " + time;

        }


    }

    //Implementando el método abstracto de forma obligatoria en la clase Doctor

         public void showDataUser() {

            System.out.println("Empleado del Hospital: Cruz Roja");
            System.out.println("Departamento: Oncología");
        
        
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
 * 
 * Se hizo uso del método toString para sobreescribir el comportamiento de la clase availableAppointment y a través de éste método poder imprimir
 * las citas que estuvieran dispobibles para cada doctor.
 * 
 * En la clase doctor se uso el método toString de igual manera para sobreescribir el método y que cuando imprima el nombre de un doctor 
 * agregue la información de especialidad, citas disponibles, usa el método toString para que muestre los datos de la cita, esto es porque
 * sino como ya lo había echo antes muestra el espacio en la meoria de cada cita dentro de array
 * 
 * Al hacer uso de las interfaces debo haceer público el constructor de la clase Doctor, User, Nurse y Patient para que su scope sea mayor y 
 * pueda usarlo en las nuevas clases que generé
 * 
 * 
 * 
 * Línea 84-88: La finalidad es hacer un "casteo en este caso el dato de entrada es un string y lo que se espera es que devuelva un date"
 * por ello hacemos uso de esa clase SimpleDateFormat, para ello hacemos uso de igual manera del try, catch el cual es una excepcio, y una
 * prevencion, ésto es para definir de una forma mas amigable en caso de teber algún error que queremos que haga nuesto sistema(catch).
 *      
 * Línea 106: esto es en caso de que quisiera devolver el dato como un String que no trasnsforme el objeto date a un afecha con el for
 * mato anterior por ello me conviene configurarlo de esa manera
 */
