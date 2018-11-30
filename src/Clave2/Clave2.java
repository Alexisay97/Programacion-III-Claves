/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave2;

import Inicio.Consola;
import Inicio.Inicio;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Clave2{
    
    //Gson parser;
    //List<NewtonRaphson>newton;
    //ArrayList<Runge>runge = new ArrayList();
    
    public static double fdada(double x1){
     return Math.cos(x1)-Math.pow(x1, 3);
    }
    
    public static double dfdada(double x1){
        return Math.sin(x1)-(3.0*x1*x1);
    }
    /**
     * @param args the command line arguments
     */
    public void main() {
       
        
        Scanner scan = new Scanner(System.in); 
        Consola console = new Consola();
        Bitacora bit = new Bitacora();
        
       double h= 0;
       double x0=0;
       double t=0;
       int op1 = 0;
       String ini,vaprox,vexac;
       
       
    do{
       console.limpiarPantalla();
       console.menu1();
       
       int op = scan.nextInt();
       
       switch(op){
           case 1:
                console.limpiarPantalla();
                
                RungeKuttaf rk = new RungeKuttaf();
                rk.RungeKutta();
            break;
            
           case 2:
                
                console.limpiarPantalla();
                NewtonRaphsonN nr = new NewtonRaphsonN();
                nr.NewtonRaphson();
                    
                break;
                
           case 3: 
               System.out.println("*--------------------*--------------------*");
               System.out.println("* Opcion no disponible, buscando solucion *");
               System.out.println("*--------------------*--------------------*");
               
               break;
            
           case 4:
               Inicio init = new Inicio();
               init.main();
               
               break;
               
           case 5:
               console.continuar();
               System.exit(0);
               break;
              
        }
       
        System.out.println("Ingrese 1 para continuar...");
        op1 = scan.nextInt();
       
    }while(op1==1);   
        
    }

    

}

