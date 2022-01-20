package ui;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import model.Doctor;

public class UIPatientMenu {

    public static void showPatientMenu(){
        int response=0;

        do {

            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("Welcome: " + UIMenu.patientLogged);
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Logout");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:

                showBookAppointmentMenu();


                    break;
                case 2:





                    break;
                case 0:

                //Regresa al menú en caso de ser cero
                    UIMenu.showMenu();
                    break;
            }
            
        } while (response!=0);
    }

    //Si la respuesta es 1 entra al metodo para que el paciente pueda agendar las citas

    private static void showBookAppointmentMenu(){
        int response = 0;
        do {
            System.out.println("::Book an appointment");
            System.out.println(":: Select date: ");

            //El map muestra las fechas dsponibles de cada uno de los doctores hacia los pacientes  

            Map<Integer,Map<Integer,Doctor>> doctors=new TreeMap<>();

            int k=0;

            //Cumple con la función de recorrer el doctorAvailableAppointments para saber cuales doctores tienen cita disponible

            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size(); i++) {

                ArrayList<Doctor.AvailableAppointment> availableAppointments =

                UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                //El segundo map cumple con la función de poder mostrar las citas disponibles

                Map<Integer, Doctor>  doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(i));

                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }

            //Para que el usuario ingrese la respuesta, una vez mostrando las opciones (fechas disponibles)

            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());


            //Map que muestra los datos de el doctor y la cita que quedó agendada   


            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("","");

            for (Map.Entry<Integer, Doctor> doc :doctorAvailableSelected.entrySet()) {
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }


            //Confirmando la cita con el paciente

            System.out.println(doctorSelected.getName() +
                    ". Date: " +
                    doctorSelected.getAvailableAppointments().get(indexDate).getDate() +
                    ". Time: " +
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm your appointment: \n1. Yes \n2. Change Data");

            response = Integer.valueOf(sc.nextLine());


            if (response == 1){
                UIMenu.patientLogged.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());

                        //Una vez que ya se ejecutó la cita regresa al menú

                showPatientMenu();
            }   


        }while (response!= 0);

    
}

private static void showPatientMyAppointments(){
    int response = 0;
    do {
        System.out.println("::My Appointments");

        //Validando si el paciente tiene citas disponibles
        if (UIMenu.patientLogged.getAppointmentDoctors().size() == 0){
            System.out.println("Don't have appointments");
            break;
        }


        //En caso de que si tuviera las citas agendadas el for i funciona para mostrar esa información

        for (int i = 0; i < UIMenu.patientLogged.getAppointmentDoctors().size(); i++) {
            int j = i + 1;
            System.out.println(j + ". " +
                    "Date: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDate() +
                    " Time: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getTime() +
                    "\n Doctor: " + UIMenu.patientLogged.getAppointmentDoctors().get(i).getDoctor().getName()
                    );
        }

        System.out.println("0. Return");
    }while (response!=0);
}

}

/**Los maps son un tipo de colección de objetos a partir de su clave- valor, en éste caso los utilicé pára que pudiera mostrar las citas
 *  que tiene disponibles cada doctor hacia los pacientes.
 * 
 * El for i cumple con la funcion de recorrer el array de doctorAvailabreApponitments para msotrar las citas disponibles de los doctores
 * por otro lado .size() me ayuda a recorrer el array según el tamaño que tenga
 * 
 * Él segúndo map lo que hace es recorrer, mostrar y enumerar al doctor y sus citas disponibles al usuario
 * 
 * 
 * por último el Scanner es insertado para que una vez viendo las citas disponibles de cada doctor el usuario pueda seleccionar alguna
 * 
 * 
 * .put()  toma los valores pasados para pasarlos como parámetros, en éste caso lo que quiero que me muestre.
 * 
 * Línea 112 el get date que es de tipo null es porque es el que me devuelve un objeto de tipo date para hacer el schedulable de la cita
 */