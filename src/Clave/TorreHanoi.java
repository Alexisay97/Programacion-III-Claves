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
public class TorreHanoi {
    public void TorreHanoi(){
        Scanner sc = new Scanner(System.in);
        Atributtos stdin = new Atributtos();
        System.out.println("Ingrese el numero de discos: ");
        stdin.setN(sc.nextInt());
        Hanoi(stdin.getN(),1,2,3);  
    }
   
    public static void Hanoi(int discos, int origen,  int auxiliar, int destino){
        if(discos==1)
            System.out.println("Mover disco de " +"| "+ origen + " |"+ " a " +"| "+ destino+" |");
        else{
            Hanoi(discos-1, origen, destino, auxiliar);
            System.out.println("Mover disco de "+"| "+ origen +" |"+ " a " +"| "+ destino+" |");
            Hanoi(discos-1, auxiliar, origen, destino);
        }
    }
}
