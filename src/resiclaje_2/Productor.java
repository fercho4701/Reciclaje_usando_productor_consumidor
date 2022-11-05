/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resiclaje_2;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Productor extends Thread {
    
    private Buffer buffer;
    private final String letras = "0123456789";

    public Productor(Buffer b){
        this.buffer = b;
    }
    
    public void run(){
        while(true){
            try {
                char c = letras.charAt((int) (Math.random() * letras.length()));
                buffer.producir(c);
                System.out.println("Depositado el Kilo de plastico número " + c + " del buffer");
                
                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}