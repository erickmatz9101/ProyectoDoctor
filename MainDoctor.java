//import static ui.UIMenu.*; //Debo utilizar de esta forma la palabra reservada e invocar a todo el menú con (nombre de la clase).*

import java.util.Date;

import model.Doctor;
import model.Patient;
import model.User;

public class MainDoctor {
    public static void main(String[] args) {

        //LLamando a los métodos del Menú

         //showMenu();

        //Creando los objetos de tipo Doctor:

        Doctor doctor1=new Doctor("Dulce Blanco López","dulceblanco@gmail.com");
        //Agregando una bueva cita al doctor

        doctor1.addAvailableAppointment(new Date(),"4:00 pm");
        doctor1.addAvailableAppointment(new Date(),"10:00 am");
        doctor1.addAvailableAppointment(new Date(),"13:00 pm");

        System.out.println(doctor1);



        //Generando objetos de tipo User que toman el comportamiento de la clase doctor y el método showDataUser

        User usuario1=new Doctor("Daniel Ortega", "daniel.otega.schz@gmail.com");

        usuario1.showDataUser();

        

        //Generando objetos de tipo Paciente que toman el comportamiento de la clase paciente y el método showDataUser

        User paciente3=new Patient("Karla Morales", "karla_momtz@gmail.com");
        paciente3.showDataUser();

       // System.out.println(doctor1.getAvailableAppointments()); //Solo devuelve la lista de los objetos que se crearon en memoria

       /**
        *  Para saber las citas que están disponibles y mandando a llamar la clase anidada fuera de la clase Doctor 
        */

        /*

        for (Doctor.AvailableAppointment aA :doctor1.getAvailableAppointments()) {

            System.out.println(aA.getDate()+" "+aA.getTime());
            
        }

        */

        


        //Creando los objetos de tipo Patient

        Patient paciente1=new Patient("Alejandra López","alejandra_lopez@gmail.com");
       
        System.out.println(paciente1);



        /**NOTAS:
         * MENÚ:
         * 
         *  Para mandar a llamar el menú se crearon los métodos de forma estática esto para no instanciar un obejeto para llamarlos sino
         * solo mandar a llamar el menú por el nombre de la clase que lo contiene y el nombre del método, asi tambien se comprueba el 
         * scope de static y que no sólo puede ser utilizado en los variables sino tambien en los métodos. Además de que el código se 
         * hace modular mandando a llamar en el main lo que necesito, por ello está en otra carpeta para que en lugar d emandarlo a llamar
         * de ésta manera puedo hacer usos de la palabra reservada public y en éste caso poder invocarlo de forma más resumida sin nombrar
         * a la clase antes de invocarlo.
         * 
         * Objetos de tipo Doctor: 
         * 
         * Cuando el objeto doctor se cree en el main, al menos siempre deberá contener un nombre y una especialidad como está 
         * declarado en los parámetros del método Doctor.
         * 
         * Reglas de negocio:
         * 
         * Realizar la identificación si es un paciente o un doctor por medio del correo electrónico
         * 
         * El doctor puede definir las fechas en las que está disponible
         * 
         * En el print del paciente hace uso del método toString pra que me regerse los valores que le indiqué en el método 
         */





    

        
    }
    
}


