package ui;
import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;
import model.Patient;

public class UIMenu {

    public static final String [] MONTHS={"Enero", "Febrero", "Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noveimbre","Diciembre" }; //Declarando el array de los meses para las citas, es de tipo stactic para que se accedido en cualquier parte del código
    
    //Estas variables sirven para la validación de los correos de los usuarios.

    public static Doctor doctorLogged;
    public static Patient patientLogged;
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
                    //Invocando el método si es doctor o susuario
                    response=0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);

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

    //Método que va a simular la autenticación de los usuarios

    private static void authUser(int userType){

        //userType=1 Doctor
        //userType=2 Patient

        //Array para los objetos de tipo Doctor

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martínez", "alejandro@mail.com"));
        doctors.add(new Doctor("Karen Sosa", "kare@mail.com"));
        doctors.add(new Doctor("Rocío Gómez", "rocio@mail.com"));

        //Array para los objetos de tipo Paciente

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Anahí Salgado", "anahi@mail.com"));
        patients.add(new Patient("Roberto Rodríguez", "roberto@mail.com"));
        patients.add(new Patient("Carlos Sánchez", "carlos@mail.com"));


        //Validando si el correo es correcto

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();

            if (userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        
                        //Mostrando el menú de Doctor

                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if (userType == 2){
                for (Patient p: patients){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                        //showPatientMenu
                    }
                }   
            }   

    }while (!emailCorrect);

     
    }
}


/**Notas:
 * 
 * La variable (array) months en éste caso también se considera una cosntante debido a que los valores que están dentro de ella nunca 
 * van a cammbiar y para ello hacemos uso de la palabra reservada final, la cual convierte a las variables en contstantes ya que su valor
 * NUNCA CAMBIA. Por lo regular siempre se usa d ela mano con stactic ya que suelen ser de tipo global porque nunca va a cambiar su valor
 * NUNCA va a ser REASIGNADO debo poner el nombre de la variable en mayusculas
 * 
 * El método authUser es el que verifica la autenticación del usuario, en este caso tiene que recibir como parámetro que define de que 
 * tipo es el usuario
 * 
 * Arraylist<Doctors> es el que contiene la lista de los dosctores (objetos) que eh ido agregando con la finalidad de saber si es 
 * un uaurio de tipo doctor o paciente.
 * 
 * Cuando valido si el correo es correcto o no, la variable se inicializa en false porque hasta que lo verifique entra al  true, con el 
 * do while se verifica eéste paso.
 * 
 * If: el if es para validar que tipo de autenticación fué y viene del menú donde se indica si es un usuario de tipo doctor o paciente
 * de igaulm manera muestra el correo del usuario de el cual se esta ingresando el correo. 
 * 
 */