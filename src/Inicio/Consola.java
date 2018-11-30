package Inicio;

import Clave2.*;
import java.awt.Robot;


/**
 *
 * @author Alex
 */
public class Consola {


    public Consola() {
      
    }
    
    public void menu0(){
        System.out.println("|-------------*--------------|");
        System.out.println("|------ BIENVENIDO/A --------|");
        System.out.println("|-------------*--------------|");
        System.out.println("|-------------*--------------|");
        System.out.println("|---------- MENU ------------|");
        System.out.println("|-------------*--------------|");
        System.out.println("|-------------*--------------|");
        
        System.out.println("");
        System.out.println("|** OPCIONES: ***************|");
        System.out.println("|* Opcion 1 : Clave 1        |");
        System.out.println("|* Montecarlo -Torres d Hanoi|");
        System.out.println("|* Opcion 2 : Clave 2        |");
        System.out.println("|* NewtonRaphson - RungeKutta|");
        System.out.println("|* Opcion 3 : Salir          |");
        System.out.println("|-------------*--------------|");
        System.out.println("");
        System.out.println("|-------------*--------------|");
        System.out.println("|Ingrese su opcion :         |");
        System.out.println("|-------------*--------------|");
    }
    
    /**
     * Menu de bienvenida
     * 
     */
     
    public void menu1(){
        System.out.println("|-------------*--------------|");
        System.out.println("|------ BIENVENIDO/A --------|");
        System.out.println("|-------------*--------------|");
        System.out.println("|-------------*--------------|");
        System.out.println("|---------- MENU ------------|");
        System.out.println("|-------------*--------------|");
        System.out.println("|-------------*--------------|");
        
        System.out.println("");
        System.out.println("|** OPCIONES: ***************|");
        System.out.println("|* Opcion 1 : E. RUNGER-KUTTA|");
        System.out.println("|* Opcion 2 : NewtonRaphson  |");
        System.out.println("|* Opcion 3 : Bitacora       |");
        System.out.println("|* Opcion 4 : Menu Pricipal  |");
        System.out.println("|* Opcion 5 : Salir          |");
        System.out.println("|-------------*--------------|");
        System.out.println("");
        System.out.println("|-------------*--------------|");
        System.out.println("|Ingrese su opcion :         |");
        System.out.println("|-------------*--------------|");
    }
    
    public void menu2(){
        System.out.println("|-------------*--------------|");
        System.out.println("|------ BIENVENIDO/A --------|");
        System.out.println("|-------------*--------------|");
        System.out.println("|-------------*--------------|");
        System.out.println("|---------- MENU ------------|");
        System.out.println("|-------------*--------------|");
        System.out.println("|-------------*--------------|");
        
        System.out.println("");
        System.out.println("|** OPCIONES: ***************|");
        System.out.println("|* Opcion 1 : Torres de Hanoi|");
        System.out.println("|* Opcion 2 : Montecarlo     |");
        System.out.println("|* Opcion 3 : Simular Torre  |");
        System.out.println("|* Opcion 4 : Menu Pricipal  |");
        System.out.println("|* Opcion 5 : Salir          |");
        System.out.println("|-------------*--------------|");
        System.out.println("");
        System.out.println("|-------------*--------------|");
        System.out.println("|Ingrese su opcion :         |");
        System.out.println("|-------------*--------------|");
    }
    
    public void continuar(){
    try  {
        //espera la pulsación de una tecla
            System.out.println("Presione una tecla para continuar...");
            System.in.read();
        }catch (Exception e) {  }
}
    public void submenu(){
    
        System.out.println("|** OPCIONES: ***************|");
        System.out.println("|* Opcion 1 : E. RUNGER-KUTTA|");
        System.out.println("|* Opcion 2 : NewtonRaphson  |");
        System.out.println("|* Opcion 3 : Volver         |");
        System.out.println("|-------------*--------------|");
        System.out.println("");
        System.out.println("|-------------*--------------|");
        System.out.println("|Ingrese su opcion :         |");
        System.out.println("|-------------*--------------|");
    }

    /**
     * limpia la pantalla en netbeans y jCreator en windows
     * 
     */
    public void limpiarPantalla() {
        try {
            Robot robbie = new Robot();
            robbie.keyPress(17);
            robbie.keyPress(76);
            robbie.keyRelease(17);
            robbie.keyRelease(76);

            Thread.sleep(100);

            // esto es para jcreator
            robbie.keyPress(17);
            robbie.keyPress(16);
            robbie.keyPress(82);
            robbie.keyRelease(17);
            robbie.keyRelease(16);
            robbie.keyRelease(82);



            Thread.sleep(100);

        } catch (Exception ex) {
        }

    }
}
