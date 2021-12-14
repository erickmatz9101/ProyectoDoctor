public class Doctor {

    static int id=0; //el id debe ser autoincremental por ello se cambia a static la variable para que sea mayor su scope y la pueda utilizar
    String name;
    String speciality;
    String email;

    //Creando el método constructor de la clase Doctor
    
     public Doctor(){

        
    }

    Doctor(String name, String speciality){
        id++; //Comienza en 0 el valor del id y cada que cree un objeto nuevo de tipo dictor se irá autoincrementando
        System.out.println("El nombre del doctor asignado es: "+name);
        this.name=name;
        this.speciality=speciality;

    }

    //Método que imprime el nombre del doctor asignado

    public void showName(){

        System.out.println("El nombre del doctor asignado  es : "+name);
    }

    //Método que imprime el id del doctor asignado
    
    public void showId(){

        System.out.println("El id del doctor asignado es :"+id); //al ser static la variable solo basta con llamarla en lugar de usar Doctor.id
    }

    
    
}

/**Los métodos se sobrecargan con las variables para que los valores se asignen en las variables que están reservando el espacio, además
 * de que cuando se inicilice el programa los valores no sean nulos, sino tome los valores que se le estan asignando.
 */
