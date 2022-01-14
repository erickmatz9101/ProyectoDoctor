package ui;

import java.util.Scanner;

public class UIDoctorMenu {

    public static void showDoctorMenu(){

        int response=0;

        do {

            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Bienvenido "+UIMenu.doctorLogged.getName());

            //Define las fechas en las que el doctor está disponible
            System.out.println("1. Add Avaliable Apointment");

            System.out.println("2. My Scheduled appointments");

            System.out.println("0.Logout ");

            //Solicitando la respuesta del menú 

            Scanner sc=new Scanner(System.in);
            response=Integer.valueOf(sc.nextLine());

            //Evaluando 

            switch (response) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;    
                case 0:

                //En caso de que la respuesta sea cero, regresa al menú

                UIMenu.showMenu();
                    
                    break;    
            
                default:
                    break;
            }
            
        } while (response !=0);


    }

    //Craeando el nuevo método para poder mostrar las fechas disponibles

    private static void showAddAvailableAppoinmentsMenu(){

        int response=0;

        do {

            System.out.println();
            System.out.println("::Add Available Appointment");
            System.out.println("::Select a month");

            //Geberando la lógica para seleccionar un mes mostrando en bloques de 3 meses siempre

            for (int i = 0; i < 3; i++) {

                //Variable que muestra la numeración de los mesess

                int j= i+ 1;

                System.out.println(j + "." +UIMenu.MONTHS[i]);
                
            }

            System.out.println("0. Return");

            Scanner sc=new Scanner(System.in);
            response=Integer.valueOf(sc.nextLine());

            if (response>0 && response<4) {

                //Recibiendo el mes seleccionado

                int monthSelected=response;

                //Indica en que mes está ubicado

                System.out.println(monthSelected + "." + UIMenu.MONTHS[monthSelected]);

                System.out.println("Insert te date avilable [dd/mm/yyyy]");

                //Utilizando la respuesta del objeto sc
                String date=sc.nextLine();

                //Una vez que se agrega la fecha se hace una conformación de lo que está agregragdo el usuario

                System.out.println("Your date is: "+date+ "\n1.Correct \n2.Change Date");
                
                
            }else if(response==0){

                //Regresa al menú

                showDoctorMenu();

            }

            
        } while (response !=0);
    }
    
}

/**Ésta clase será usada en caso de que al logiearse con el correo se detecte que se trata de un doctor
 * Los parámetros que le paso al bienvenido son para personalizar según el correo que identifique el nombre
 * del doctor, al ser públicas las variables puedo hacer uso de ellas en el menú.
 * 
 * El for me ayuda en este caso a mostrar en boques de 3 en 3 meses segun el mes que seleccione 
 */
