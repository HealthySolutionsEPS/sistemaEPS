package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);
        Short opcionMenu=0;
        String[] nombresEspecialistas=new String[100];
        Integer[] cedulasEspecialistas=new Integer[100];
        String[] especialidades=new String[100];
        Integer[] salariosEspecialistas=new Integer[100];
        String[] fechasDeIngreso=new String[100];


        System.out.println("\u001B[34m ***SOMOS GRUPO SURA***  \u001B[0m");
        System.out.println("\u001B[34m --BIENVENIDO USUARIO--  \u001B[0m");
        System.out.println("¿Eres Admin, especialista o paciente?");


        do {
            System.out.println("Por favor digite una opción.");
            System.out.println("1. Administrador ");
            System.out.println("2. Medico espcialista");
            System.out.println("3. Paciente");
            System.out.println("4. Salir");
            System.out.println("\u001B[34m -->   \u001B[0m");
            opcionMenu= entradaTeclado.nextShort();


        switch (opcionMenu){

            case 1:
                do {


                    System.out.println("\u001B[34m ¡Bienvenido administrador!  \u001B[0m");
                    System.out.println("¿Que desea hacer el dia de hoy?");
                    System.out.println("Por favor, digite una opción: ");
                    System.out.println("1. Registrar un medico especialista");
                    System.out.println("2. Desplegar informacion de los especialistas");
                    System.out.println("3. Ver informacion de 1 especialista");
                    System.out.println("4. Retirar un especialista");
                    System.out.println("5. SALIR");
                    opcionMenu = entradaTeclado.nextShort();
                            System.out.println("\u001B[34m -->   \u001B[0m");


                switch (opcionMenu){

                    case 1:

                            entradaTeclado.nextLine();

                            System.out.println("Digite el nombre del especialista");
                            nombresEspecialistas[0] = entradaTeclado.nextLine();
                            for (int contador=0; contador < 100; contador=contador++)

                                contador++;
                            break;

                    case 2:
                        System.out.println("Esta es la base de datos de todos los especialistas registrados");
                        for (int contador=0; contador < 100; contador=contador++)
                            contador++;
                        System.out.println(nombresEspecialistas[99]);
                        break;

                }

        }while(opcionMenu!=5);

                break;

            case 2:
                do {

                    System.out.println("\u001B[34m ¡Bienvenido Especialista!  \u001B[0m");
                    System.out.println("¿Que desea hacer el dia de hoy?");
                    System.out.println("Por favor, digite una opción: ");
                    System.out.println("1. Consultar mi salario mensual");
                    System.out.println("2. Ver la base de datos de especialistas");
                    System.out.println("3. SALIR");
                    System.out.println("\u001B[34m -->   \u001B[0m");
                    opcionMenu = entradaTeclado.nextShort();

                }while(opcionMenu!=3);

                switch (opcionMenu){

                    case 1:

                        break;

                }
                break;

            case 3:
                do {


                    System.out.println("\u001B[34m ¡Bienvenido Paciente!  \u001B[0m");
                    System.out.println("¿Que desea hacer el dia de hoy?");
                    System.out.println("Por favor, digite una opción: ");
                    System.out.println("1. Ver la base de datos de especialistas");
                    System.out.println("2. SALIR");
                    opcionMenu=entradaTeclado.nextShort();
                    System.out.println("\u001B[34m -->   \u001B[0m");

                }while(opcionMenu!=2);

                switch (opcionMenu){

                    case 1:

                        break;

                }

        }
            }while (opcionMenu!=4);
    }
}