/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Alex
 */



public class Directorios{
    
    private static String User;
    public static String RutaNewton;
    public static String RutaRunge;
    public static boolean ok = false;
    
    public static Directorios Directorios(){
    
        User = System.getProperty("user.name"); /* Toma el nombre de usuario del ordenador donde se ejecute solo windows */
        
        File folder1 = new File("C:\\Users\\"+User+"\\AppData\\Roaming\\Bitacora"); /* Se crea un folder la primera vez que se ejecuta */
       
        if(!folder1.exists()){
            folder1.mkdir();
            System.out.println("Se creo el directorio "+User);
        }else{
            try {
                
                File user  = new File("C:\\Users\\"+User+"\\AppData\\Roaming\\Bitacora\\Newton.json");
                File saldo = new File("C:\\Users\\"+User+"\\AppData\\Roaming\\Bitacora\\Runge.json");
               
                if(user.exists() && saldo.exists()){
                    RutaNewton  = "C:\\Users\\"+User+"\\AppData\\Roaming\\Bitacora\\Newton.json";
                    RutaRunge = "C:\\Users\\"+User+"\\AppData\\Roaming\\Bitacora\\Runge.json";
                    
                    System.out.println("Los archivos ya existen");
                }else{
                    user.createNewFile();
                    System.out.println("Se creo Newton.json");
                    saldo.createNewFile();
                    System.out.println("Se creo Runge.json");
                    
                    
                    ok = true;
                }
            } catch (IOException ex) {
                System.out.println("Error 1 " +ex.getMessage());
                //Logger.getLogger(Cuentas.class.getName()).log(Level.SEVERE, null, ex);
            }    
        }
        return null;
    }
    
}
