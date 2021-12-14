package ui;
import java.util.Scanner;

public class UIMenu {

    public static String [] MONTHS={"Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noveimbre","Diciembre" }; //Declarando el array de los meses para las citas, es de tipo stactic para que se accedido en cualquier parte del código

 public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();

                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    //El for se crea para que sólo muestre los bloques de 3 en 3 meses 1. enero etc
                    for (int i = 1; i <4; i++) {
                        System.out.println(i+"."+MONTHS[i]);
                        
                    }


                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}


/**Notas:
 * 
 * La variable (array) months en éste caso también se considera una cosntante debido a que los valores que están dentro de ella nunca 
 * van a cammbiar y para ello hacemos uso de la palabra reservada final, la cual convierte a las variables en contstantes ya que su valor
 * NUNCA CAMBIA. Por lo regular siempre se usa d ela mano con stactic ya que suelen ser de tipo global porque nunca va a cambiar su valor
 * NUNCA va a ser REASIGNADO debo poner el nombre de la variable en mayusculas
 * 
 * 
 * 
 */