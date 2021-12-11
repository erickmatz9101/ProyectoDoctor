import static ui.UIMenu.*; //Debo utilizar de esta forma la palabra reservada e invocar a todo el menú con (nombre de la clase).*

public class MainDoctor {
    public static void main(String[] args) {

        //Creando el objeto de tipo Doctor

        Doctor doctor1=new Doctor();

        doctor1.name="Erick Martínez";
        doctor1.showName();
        doctor1.showId();

        //Creando el segúndo objeto de tipo Doctor

        Doctor doctor2=new Doctor();

        doctor2.name="Daniel Ortega";
        doctor2.showName();
        doctor2.showId();

        //Creando el tercer objeto de tipo Doctor

        Doctor doctor3=new Doctor();

        doctor3.name="Jimena Sánchez";
        doctor3.showName();
        doctor3.showId();


        //LLamando a los métodos del Menú

        showMenu();



        /**Para mandar a llamar el menú se crearon los métodos de forma estática esto para no instanciar un obejeto para llamarlos sino
         * solo mandar a llamar el menú por el nombre de la clase que lo contiene y el nombre del método, asi tambien se comprueba el 
         * scope de static y que no sólo puede ser utilizado en los variables sino tambien en los métodos. Además de que el código se 
         * hace modular mandando a llamar en el main lo que necesito, por ello está en otra carpeta para que en lugar d emandarlo a llamar
         * de ésta manera puedo hacer usos de la palabra reservada public y en éste caso poder invocarlo de forma más resumida sin nombrar
         * a la clase antes de invocarlo.
         */





    

        
    }
    
}
