package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Doctor;

public class UIDoctorMenu {


    public static ArrayList<Doctor> doctorsAvailableAppointments= new ArrayList<>();    

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

                //Utilizando la respuesta del objeto sc para agregar la fecha disponible
                String date=sc.nextLine();


                //Una vez que se agrega la fecha se hace una conformación de lo que está agregragdo el usuario

                System.out.println("Your date is: "+date+ "\n1.Correct \n2.Change Date");
                
                int responseDate = Integer.valueOf(sc.nextLine());

                //Con el if validamos si la respuesta a la fecha que se agregó es correcta o se necesita cambiar

                if (responseDate== 2)continue; 

                //Preparando para recibir la hora de cita

                int responseTime=0; //Variable que guarda la hora 

                String time="";//Variable quw recibe la hora

                do {

                    System.out.println("Insert the time available for date: " +date+"[16:00]");

                    //Ingresando la hora

                    time = sc.nextLine();
                    System.out.println("Your time is: " + time + "\n1. Correct \n2. Change Time");
                    responseTime = Integer.valueOf(sc.nextLine());


                    
                } while (response==2);


                //Si todo es correcto en ese momento se asigna a ese doctor la cita disponible

                UIMenu.doctorLogged.addAvailableAppointment(date,time); 
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);

                    
                    
                
                
            }else if(response==0){

                //Regresa al menú

                showDoctorMenu();

            }

            
        } while (response !=0);
    }

    //Método que cumple la función de validar si un doctor ya tiene citas disponibles para poder guardarlo en el array

    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0
            && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }
    
}

/**Ésta clase será usada en caso de que al logiearse con el correo se detecte que se trata de un doctor
 * Los parámetros que le paso al bienvenido son para personalizar según el correo que identifique el nombre
 * del doctor, al ser públicas las variables puedo hacer uso de ellas en el menú.
 * 
 * El for me ayuda en este caso a mostrar en boques de 3 en 3 meses segun el mes que seleccione 
 * 
 * 
 * El if en el agendado de citas valida si la fecha que se agregó es correcta o se desea agregar nuevamente, de igual manera
 * la palabra reservada continue lo que hace es que no sale del ciclo sino evita la siguiente linea e inicia donde se quedó
 * 
 * 
 * Para poder guardar los doctores que ya agendaron fechas disponobles debo de crear un arreglo que me permita poder guardar a los
 * doctores que ya agregaron sus citas, por ello en ésta misma clase agregué una variable (array)estatica que permita que el ciclo de vida
 * de estos datos esten perdurando.
 * 
 * Línea 161: En éste caso es un método de tipo privado porque solo vivirá en la clase, el cual valida si un doctor ya agendo sus citas
 * enotonces ppueda ser agregado al array que se creó, o sino existe previamnete también lo guardará dentro del array
 */
