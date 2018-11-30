/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave2;

import static Clave2.Bitacora.RutaNewton;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class RungeKuttaf {
    List<NewtonRaphson>newton;
    double h, x0,t;
    String ini,vaprox,vexac;
    
    public void RungeKutta(){
        
        Scanner scan = new Scanner(System.in);
        Bitacora b = new Bitacora();
        NewtonRaphson nwr = new NewtonRaphson();
        
        try{
           
            System.out.println("Ingrese el valor de h (paso) :" );h = scan.nextDouble();
            System.out.println("Ingrese el valor de x0 (inicial) : ");x0 = scan.nextDouble();
            System.out.println("Ingrese el valor de t (instante a evaluar) :");t = scan.nextDouble();
                
        }catch(Exception ex){
                
        }
       
            double x=new Funcion().resolver(t, 0, x0, h); 
            vaprox = "valor aproximado de x es : "+(double)x;
            System.out.println(vaprox);
            x=(int)(x0*Math.exp(-0.1*t));
            vexac = "valor exacto de x es :"+(double)x;
            System.out.println(vexac);
            ini = ("Paso (h): "+h);
            // b.recibir(ini,vaprox,vexac);
           /* nwr.x = this.ini;
            nwr.dato = this.vexac;
            nwr.res = this.vaprox;
        
            System.out.println("Probando: " + nwr.x +" | "+ nwr.dato +" | "+ nwr.res +" "+RutaNewton);
        
            this.newton.add(nwr);*/
            
    }
}
