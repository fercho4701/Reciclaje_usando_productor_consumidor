/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resiclaje_2;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumidor extends Thread {

    private Buffer buffer;

    public Consumidor(Buffer b) {
        this.buffer = b;
    }

    public void run() {
        while (true) {
            try {
                char c = this.buffer.consumir();
                System.out.println("Recogido el kilo de plastico número " + c + " del buffer");

                sleep((int) (Math.random() * 4000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumidor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}

