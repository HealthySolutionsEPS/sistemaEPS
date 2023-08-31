package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado=new Scanner(System.in);

        Short opcionMenu=0;
        Integer tamanoArreglo=700;
        Integer index=0;
        String[] nombresEspecialistas=new String[tamanoArreglo];
        Integer[] cedulasEspecialistas=new Integer[tamanoArreglo];
        String[] especialidades=new String[tamanoArreglo];
        Double[] salariosEspecialistas=new Double[tamanoArreglo];
        String[] fechasDeIngreso=new String[tamanoArreglo];
        String continuar;
        int[] horasTrabajadas = new int[tamanoArreglo];

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
                    System.out.println("\u001B[34m -->   \u001B[0m");

                    opcionMenu = entradaTeclado.nextShort();

                switch (opcionMenu){

                    case 1:


                         do {

                             entradaTeclado.nextLine();

                             System.out.println("Digite el nombre del especialista");
                             nombresEspecialistas[index] = entradaTeclado.nextLine();

                             System.out.println("Digite la especialidad del medico");
                             especialidades[index] = entradaTeclado.nextLine();

                             entradaTeclado.nextLine();

                             System.out.println("Digite la fecha de ingreso del especialista");
                             fechasDeIngreso[index] = entradaTeclado.nextLine();

                             System.out.println("Digite la cedula del especialista");
                             cedulasEspecialistas[index] = entradaTeclado.nextInt();


                             System.out.println("Digite el salario del especialista --> $150000");
                             salariosEspecialistas[index] = entradaTeclado.nextDouble();

                             index++;

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

                            break;

                    case 2:
                        System.out.println("\u001B[34m Estos son los especialistas registrados en nuestro sistema:  \u001B[0m");
                        for (int contador = 0; contador < index; contador++) {

                            System.out.println("Nombre: " + nombresEspecialistas[contador]+
                                    ", con numero de cedula: "+cedulasEspecialistas[contador]+" y especialidad: "
                                    +especialidades[contador]+", un salario de "+"$"+salariosEspecialistas[contador]
                            +" y una fecha de ingreso del "+fechasDeIngreso[contador]);
                        }

                        break;

                    case 3:
                        Integer busquedaCedula;
                        System.out.println("\u001B[34m Por favor digite el numero de cedula del especialista que desea visualizar  \u001B[0m");
                        System.out.println("\u001B[34m -->  \u001B[0m");
                        busquedaCedula=entradaTeclado.nextInt();

                    boolean cedulaEncontrada = false;

                    for (int contador = 0; contador < index; contador++) {
                        if (busquedaCedula.equals(cedulasEspecialistas[contador])) {
                            cedulaEncontrada = true;

                            String nombreMedico = nombresEspecialistas[contador];
                            String especialidadMedico = especialidades[contador];
                            int cedula = cedulasEspecialistas[contador];
                            String ingreso = fechasDeIngreso[contador];
                            double salario = salariosEspecialistas[contador];

                            System.out.println("Datos del especialista solicitado:");
                            System.out.println("Nombre: " + nombreMedico);
                            System.out.println("Especialidad: " + especialidadMedico);
                            System.out.println("Cedula: " + cedula);
                            System.out.println("Fecha de ingreso: " + ingreso);
                            System.out.println("Salario: $" + salario);

                            break;
                        }
                    }

                    if (!cedulaEncontrada) {
                        System.out.println("Cedula de médico inválida.");
                    }


                    break;

                    case 4:
                        System.out.println("\u001B[34m Ingrese la cedula del especialista que desea eliminar  \u001B[0m");
                        System.out.println("\u001B[34m -->  \u001B[0m");
                        int cedulaAEliminar = entradaTeclado.nextInt();

                        int deleteIndex = -1;
                        for (int contador = 0; contador < index; contador++) {
                            if (cedulaAEliminar == cedulasEspecialistas[contador]) {
                                deleteIndex = contador;
                                break;
                            }
                        }

                        if (deleteIndex != -1) {

                            for (int i = deleteIndex; i < index - 1; i++) {
                                nombresEspecialistas[i] = nombresEspecialistas[i + 1];
                                especialidades[i] = especialidades[i + 1];
                                fechasDeIngreso[i] = fechasDeIngreso[i + 1];
                                cedulasEspecialistas[i] = cedulasEspecialistas[i + 1];
                                salariosEspecialistas[i] = salariosEspecialistas[i + 1];
                            }

                            index--;

                            System.out.println("Especialista eliminado exitosamente.");
                        } else {
                            System.out.println("No se encontró un especialista con esa cedula.");
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
                    System.out.println("3. Declarar mis horas trabajadas");
                    System.out.println("4. SALIR");

                    System.out.println("\u001B[34m -->   \u001B[0m");
                    opcionMenu = entradaTeclado.nextShort();



                switch (opcionMenu){

                    case 1:
                        Integer busquedaCedula;
                        System.out.println("\u001B[34m Por favor digite su numero de cedula para consultar su salario mensual   \u001B[0m");
                        System.out.println("\u001B[34m -->  \u001B[0m");
                        busquedaCedula=entradaTeclado.nextInt();

                        boolean cedulaEncontrada = false;

                        for (int contador = 0; contador < index; contador++) {
                            if (busquedaCedula.equals(cedulasEspecialistas[contador])) {
                                cedulaEncontrada = true;

                                double salario = salariosEspecialistas[contador];

                                System.out.println("Su salario es de: $" + salario);

                                break;
                            }
                        }

                        if (!cedulaEncontrada) {
                            System.out.println("Numero de cedula no encontrado.");
                        }
                        break;

                    case 2:
                        System.out.println("\u001B[34m Estos son los especialistas registrados en nuestro sistema:  \u001B[0m");
                        for (int contador = 0; contador < index; contador++) {

                            System.out.println("Nombre: " + nombresEspecialistas[contador]+
                                    ", con numero de cedula: "+cedulasEspecialistas[contador]+" y especialidad: "
                                    +especialidades[contador]+" y una fecha de ingreso del "+fechasDeIngreso[contador]);
                        }
                        break;

                    case 3:

                        System.out.println("Ingrese la cedula del especialista para registrar las horas:");
                        int cedulaRegistroHoras = entradaTeclado.nextInt();

                        int especialistaIndex = -1;
                        for (int contador = 0; contador < index; contador++) {
                            if (cedulaRegistroHoras == cedulasEspecialistas[contador]) {
                                especialistaIndex = contador;
                                break;
                            }
                        }

                        if (especialistaIndex != -1) {
                            System.out.println("Ingrese las horas trabajadas para " + nombresEspecialistas[especialistaIndex] + ":");
                            horasTrabajadas[especialistaIndex] = entradaTeclado.nextInt();

                            double salarioSinDescuento = horasTrabajadas[especialistaIndex] * 150000;
                            double retencion = salarioSinDescuento * 0.04;
                            double salarioTotal = salarioSinDescuento - retencion;

                            System.out.println("Horas registradas exitosamente para " + nombresEspecialistas[especialistaIndex]);
                            System.out.println("Salario total antes del descuento: $" + salarioSinDescuento);
                            System.out.println("Salario total con una retención del 4%: $" + salarioTotal);
                        } else {
                            System.out.println("No se encontró un especialista con esa cédula.");
                        }
                        break;

                }

                   }while(opcionMenu!=4);

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



                if (opcionMenu == 1){

                    System.out.println("\u001B[34m Estos son los especialistas registrados en nuestro sistema:  \u001B[0m");
                    for (int contador = 0; contador < index; contador++) {

                        System.out.println("Nombre: " + nombresEspecialistas[contador]+
                                ", con numero de cedula: "+cedulasEspecialistas[contador]+" y especialidad: "+especialidades[contador]);
                    }

                }
             }while(opcionMenu!=2);
        }
            }while (opcionMenu!=4);
    }
}