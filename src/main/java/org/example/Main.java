package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        Short opcionMenu=0;
        Integer tamanoArreglo=100;
        Integer index=0;
        String[] nombresEspecialistas=new String[tamanoArreglo];
        Integer[] cedulasEspecialistas=new Integer[tamanoArreglo];
        String[] especialidades=new String[tamanoArreglo];
        Integer[] salariosEspecialistas=new Integer[tamanoArreglo];
        String[] fechasDeIngreso=new String[tamanoArreglo];
        String continuar;

        System.out.println("\u001B[34m ***SOMOS HEALTHY SOLUTIONS SAS***  \u001B[0m");
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



                         do {
                             entradaTeclado.nextLine();

                                   System.out.println("Digite el nombre del especialista");
                                   nombresEspecialistas[index] = entradaTeclado.nextLine();


                             System.out.println("Digite la cedula del especialista");
                             cedulasEspecialistas[index] = entradaTeclado.nextInt();


                             System.out.println("Digite la especialidad del especialista");
                             especialidades[index] = entradaTeclado.nextLine();
                             entradaTeclado.nextLine();

                             System.out.println("Digite el salario del especialista");
                             salariosEspecialistas[index] = entradaTeclado.nextInt();


                             System.out.println("Digite la fecha de ingreso del especialista");
                             fechasDeIngreso[index] = entradaTeclado.nextLine();




                                   if (index < tamanoArreglo -1) {
                                       System.out.println("\u001B[34m ¿Desea añadir otro especialista?  \u001B[0m");
                                       System.out.println("1. Si (true)");
                                       System.out.println("2. No (false)");
                                       System.out.println("\u001B[34m -->   \u001B[0m");

                                       continuar = entradaTeclado.next();
                                       entradaTeclado.nextLine();

                                   }else {
                                       continuar="false";
                                   }

                               }while(continuar.equalsIgnoreCase("true"));
                        index++;
                            break;

                    case 2:
                        System.out.println("Esta es la base de datos de todos los especialistas registrados");
                        for (int contador = 0; contador < index; contador++) {

                            System.out.println("Nombre: " + nombresEspecialistas[contador]+
                                    ", con numero de cedula: "+cedulasEspecialistas[contador]+" y especialidad "
                                    +especialidades[contador]+", un salario de "+"$"+salariosEspecialistas[contador]
                            +" y una fecha de ingreso del "+fechasDeIngreso[contador]);
                        }

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