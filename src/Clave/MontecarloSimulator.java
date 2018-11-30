/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class MontecarloSimulator {
    public void MontecarloSimulator1(){
        Scanner entrada = new Scanner(System.in); 
        Atributtos stdin = new Atributtos();  
 
        System.out.print("Escriba una semilla: ");
        stdin.setSemilla(entrada.nextInt());
        System.out.print("Escriba una constante multiplicativa: ");
        stdin.setCmultiplicativa(entrada.nextInt());
        System.out.print("Escriba el módulo: ");
        stdin.setModulo(entrada.nextInt());

        for (stdin.i=1; stdin.i<=20; stdin.i++){
            stdin.numero = (stdin.getCmultiplicativa()*stdin.getSemilla()) % stdin.getModulo();   
            stdin.numero2 = (int) ((double)stdin.numero / (double)(stdin.getModulo()-1));
            System.out.printf("%d. %d (%.4f)\n", stdin.i ,stdin.numero ,stdin.numero2 ); 
            stdin.semilla = stdin.numero; 
        }
        
    }
}
