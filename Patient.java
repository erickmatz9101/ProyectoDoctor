public class Patient extends User {
    
    //Atributos que son únicos de la clase paciente

    private String birthday;
    private double weight;
    private double height;
    String blood;


    //Metodo constructor de la clase Patient

    

     Patient(String name, String email){

     //LLamando al constructor de la clase padre por medio de super
        
        super(name, email);
    
    }





    
}



/**Notas:
 * 
 * Encapsulamiento: Nos permite definir las reglas de negocio de nuestro sistema, definimos el nivel de acceso en el sistema
 * pudiendo hacer estos cambios dentro de la clase que los contiene en éste caso lo utilicé para que el peso siempre me lo
 * de en kilogramos y la estatura siempre me la de en metros, al encapsular las variables lo tengo que hacer por medio de la palabra
 * reservada PRIVATE. Todas la variables de la clase las use de tipo private. Para ello huice uso de los modificadores de acceso get y set
 * 
 * 
 * Getters y Setters: Resuelve las validaciones de los datos así como dar acceso a los atributos de la clase por medio de sus métodos.
 * Get: Obtiene y accesa al dato de la variable, debo poner el tipo de dato que deseo devolver en éste caso es String porque quiero que 
 * siempre me lo devuelva en kilogramos. No olvidar que siempre que en mi método pongo una variable debo regresar un valor por ello el 
 * return
 * Set: Pone el dato a la variable, recibe el dato y como parámetro de pone el tipo de dato y el nombre de la variable, además debo 
 * sobrecargar el método con la variable que deseo settear. 
 * 
 */
