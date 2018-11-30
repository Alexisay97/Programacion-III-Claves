/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inicio;

import Clave.Clave1;
import Clave2.Clave2;
import Clave2.Directorios;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public void main() {
        
        Consola console = new Consola();
        Scanner scan = new Scanner(System.in);
        int op;
        do{
            console.menu0();
            op = scan.nextInt();
            switch(op){
                case 1:
                    Clave1 c1 = new Clave1();
                    c1.main();
                    break;
                case 2:
                    Clave2 c2 = new Clave2();
                    c2.main();
                    break;
                case 3:
                    console.continuar();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    
            }
        
        }while(op<=0 || op >3);
    }
    
}
