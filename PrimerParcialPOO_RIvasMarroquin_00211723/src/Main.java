import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthUI;
import java.util.ArrayList;
import java.util.Date;

import Electronico.ELectronico;
import  Tiposelectronicos.*;



public class Main {

    static ArrayList<Tiposelectronicos> listaelectronicos = new ArrayList<Tiposelectronicos>();

    public static void main(String[] args) {
        menuPrincipal();
    }

    static void menuPrincipal(){

        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true){
            mostrarMenuPrincipal();
            try{
                opcion = sn.nextInt();
                sn.nextLine();

                if(opcion == 0) {
                    System.out.println("Bye bye ...");
                    break;
                }

                switch (opcion){
                    case 1:
                        agregarelectronicos();
                        break;
                    case 2:
                        /*modificarelectronicos();*/
                        break;
                    case 3:
                        /*eliminarelectronico();*/
                        break;
                    case 4:
                        /*mostrarelectronico();*/
                        break;

                    default:
                        System.out.println("\nIngresar una opcion valida porfavor.\n");
                        break;
                }
            }catch (InputMismatchException e){
                sn.nextLine();
                System.out.println("\nIngrese una opcion valida.\n");
            }
        }

    }
    private static void agregarelectronicos(){
        int tipoelectronico = obtenertiopoElectonico();
        Tiposelectronicos electronico = null;

        Scanner sn = new Scanner(System.in);


        System.out.println("Ingrese el codigo del electronico:");
        String codigo = sn.nextLine();
        System.out.println("Ingrese el nombre del electronico:");
        String nombre = sn.nextLine();
        System.out.println("Ingrese la fecha de ingreso del producto:");
        Date fechaingreso = new Date(sn.nextLine());

        ELectronico ELectronico = new ELectronico(codigo,nombre,fechaingreso);


        sn.nextLine();


        switch (tipoelectronico){
            case 1:
                electronico = new Tv(ELectronico, codigo);
                break;
            case 2:

                System.out.println("Ingrese las horas de trabajo del empleado:");
                int horas = sn.nextInt();

                electronico = new Laptop(ELectronico, codigo);
                break;
            case 3:
                electronico = new Telefono(ELectronico,codigo);
                break;
        }


        listaelectronicos.add(electronico);
    }

    private static int obtenertiopoElectonico() {
        Scanner sn = new Scanner(System.in);
        int opcion;
        while(true) {
            try {
                System.out.println("Seleccione el tipo de empleado:\n"
                        + "\t1. Empleado a tiempo completo\n"
                        + "\t2. Empleado a tiempo parcial\n"
                        + "\t3. Empleado temporal"
                );
                System.out.print("Opcion > ");
                opcion = sn.nextInt();
                if(opcion >= 1 && opcion <= 3) return opcion;
                System.out.println("Ingrese una opcion valida");
            } catch (Exception e) {
                System.out.println("Ingrese una opcion valida");
            }
            sn.nextLine();
        }

    }

    static void mostrarMenuPrincipal(){
        System.out.println("Seleccione una opcion:\n"
                + "\t1. Agregar electronico\n"
                + "\t2. Modificar electronico\n"
                + "\t3. Eliminar eliminar electronico\n"
                + "\t4. Mostrar electronico\n"
                + "\t5. Mostrar reporte de todos los Empleado\n"
                + "\t0. Salir\n"
        );
        System.out.print("Opcion > ");
    }






}


