/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave2;

import static Clave2.Clave2.dfdada;
import static Clave2.Clave2.fdada;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class NewtonRaphsonN {
    public void NewtonRaphson(){
        
        Scanner scan = new Scanner(System.in);
        double x1=0, temp, e;
       
                String datos, res;
                         
                try{
                   System.out.println("Ingrese el valor de x:");x1 = scan.nextDouble();
                }catch(Exception ex){System.out.println("Error valor invalido: " + ex);}
                int i = 0;
        
                do{
                    temp = x1;
                    x1 = x1 - fdada(x1)/dfdada(x1);
                    e = Math.abs((x1-temp)/x1);
                    
                    datos = "x " +i+" = "+x1+"  Error "+"= "+e+"\n";
                    System.out.println(datos);
                    i=i+1;
            
                }while(x1 != temp && i < 100);
        
                    if(i==100){
                        res = "\nNo converge";
                        System.out.println(res);
                    }else{
                        res = "\nSolucion x: "+x1;
                        System.out.println(res);
                        
                    }
    }
}
