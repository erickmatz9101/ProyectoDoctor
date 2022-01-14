import static ui.UIMenu.*; //Debo utilizar de esta forma la palabra reservada e invocar a todo el menú con (nombre de la clase).*

import java.util.Date;

import model.Doctor;
import model.Patient;
import model.User;

public class MainDoctor {
    public static void main(String[] args) {

        //LLamando a los métodos del Menú

         showMenu();

        



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


