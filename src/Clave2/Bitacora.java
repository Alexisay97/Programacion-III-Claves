/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clave2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Alex
 */
public class Bitacora {
    Gson parser;
    static String RutaNewton = Directorios.RutaNewton;
    
    List<NewtonRaphson>newton;
    
    public Bitacora(){
            
    this.parser = new GsonBuilder().setPrettyPrinting().create();
    }
    
    public void recibir(String x1,String y,String res){
        
        NewtonRaphson nwr = new NewtonRaphson();
        
        nwr.x = x1;
        nwr.dato = y;
        nwr.res = res;
        
        System.out.println("Probando: " + nwr.x +" | "+ nwr.dato +" | "+ nwr.res +" "+RutaNewton);
        
        this.newton.add(nwr);
        
    }
    public void agregarNewton(){
        FileWriter write;
        try {
            write = new FileWriter(RutaNewton);
            write.write(this.parser.toJson(newton));
        write.close();
        } catch (IOException ex) {
            Logger.getLogger(Bitacora.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void retornarNewton(){
    
    }
    
    public void agregarRunge(String runge){
    
    }
    
    public void retornarRunge(){
    
    }
    
}
