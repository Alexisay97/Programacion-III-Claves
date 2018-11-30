/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave2;

/**
 *
 * @author Alex
 */
public abstract class RungeKutta {
    
    public double resolver(double tf, double t0, double x, double h){
    double k1, k2, k3,k4;
    for(double t=t0;t<tf;t++){
        k1=h*f(x, t);
        System.out.println(k1);
        k2=h*f(x+k1/2, t+h/2);
        System.out.println(k2);
        k3=h*f(x+k2/2, t+h/2);
        System.out.println(k3);
        k4=h*f(x+k3, t+h);
        System.out.println(k4);
        x+=(k1+2*k2+2*k3+k4)/6; 
    }
        return x;
    }
    abstract public double f(double x, double t);
}
