import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int accion,entrada,i,j,n,iu,pass,passadmin,iuadmin,x;

        String res,usadmin;
        entrada = 0;
        i = 0;
        j = 0;
        n = 0;
        String[] nombredoctor = new String[20];
        String[] especialidaddoctor = new String[20];
        String[] nombrepaciente = new String[20];
        String[] paciente = new String[20];
        String[] hora = new String[20];
        String[] fecha = new String[20];
        String[] motivocita = new String[20];
        int[] iddoctor = new int[20];
        int[] idcita = new int[20];
        int[] idpaciente = new int[20];

        usadmin = "o";
        iuadmin = 1;
        passadmin = 2;

        Scanner sc=new Scanner(System.in);

        System.out.println("Ingrese su usuario");
        String us = sc.nextLine();
        System.out.println("Identificador único");
        iu = Integer.parseInt(sc.nextLine());
        System.out.println("Ingrese su contraseña");
        pass = Integer.parseInt(sc.nextLine());
        if (us.equals(usadmin) && iu==iuadmin && pass==passadmin) {
            while (entrada==0) {
                System.out.println("Qué desea realizar?");
                System.out.println("(1) Dar de alta paciente");
                System.out.println("(2) Dar de alta Doctor");
                System.out.println("(3) Agendar cita");
                System.out.println("(4) Salir");
                accion = Integer.parseInt(sc.nextLine());
                switch (accion) {
                    case 1:
                        idpaciente[i] = i;
                        System.out.println("Inserte nombre del paciente");
                        nombrepaciente[i] =sc.nextLine();
                        i = i+1;
                        break;
                    case 2:
                        iddoctor[j] = j;
                        System.out.println("Inserte nombre del Doctor");
                        nombredoctor[j] = sc.nextLine();
                        System.out.println("Inserte especialidad del Doctor");
                        especialidaddoctor[j] = sc.nextLine();
                        j = j+1;
                        break;
                    case 3:
                        idcita[n] = n;
                        System.out.println("Inserte nombre del Paciente");
                        paciente[n] = sc.nextLine();
                        System.out.println("Inserte fecha de la consulta");
                        fecha[n] = sc.nextLine();
                        System.out.println("Inserte hora de la consulta");
                        hora[n] = sc.nextLine();
                        System.out.println("Inserte el motivo de la cita");
                        motivocita[n] = sc.nextLine();
                        Random rr= new Random();
                        x=rr.nextInt(j);
                        System.out.println("El doctor asignado es: "+nombredoctor[x]);
                        n = n+1;
                        break;
                    case 4:
                        entrada = 1;
                        break;
                    default:
                        System.out.println("Acción no existente");
                }
            }
        } else {
            System.out.println("Se requiere ser administrador");
        }
    }
}