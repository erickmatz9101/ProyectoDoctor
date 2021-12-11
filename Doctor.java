public class Doctor {

    static int id=0; //el id debe ser autoincremental por ello se cambia a static la variable para que sea mayor su scope y la pueda utilizar
    String name;
    String speciality;

    //Creando el método constructor d ela clase Doctor
    
     public Doctor(){

        id++; //Comienza en 0 el valor del id y cada que cree un objeto nuevo de tipo dictor se irá autoincrementando

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
