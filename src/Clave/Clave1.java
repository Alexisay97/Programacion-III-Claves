/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave;

import Inicio.Consola;
import Inicio.Inicio;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Clave1 {

    /**
     * @param args the command line arguments
     */
    public void main() {
        
        Scanner scan = new Scanner(System.in);
        Consola console = new Consola();
        int op = 0;
        
        do{
            console.limpiarPantalla();
            console.menu2();
            try{
                System.out.println("Ingrese su opcion:");op = scan.nextInt();
                }catch(Exception ex){System.out.println("Error valor invalido: " + ex);}
            switch(op){
                case 1:
                    console.limpiarPantalla();
                    TorreHanoi tower = new TorreHanoi();
                    tower.TorreHanoi();
                    break;
                case 2:
                    console.limpiarPantalla();
                    MontecarloSimulator mts = new MontecarloSimulator();
                    mts.MontecarloSimulator1();
                    break;
                case 3:
                    console.limpiarPantalla();
                    TorreGrafica tg = new TorreGrafica();
                    tg.GTorre();
                    break;
                case 4:
                    Inicio init = new Inicio();
                    init.main();
               
                    break;    
                case 5:
                    console.continuar();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese un opcion valida");
                    
            }
            System.out.println("Ingrese 1 para continuar...");
            op = scan.nextInt();
            
        }while(op==1);
        
    }
    
}
