/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resiclaje_2;

public class EjemploProductorConsumidor {

    public static void main(String[] args) {
        Buffer b = new Buffer(10);
        Productor p = new Productor(b);
        Consumidor c = new Consumidor(b);
        
        p.start();
        c.start();
        
    }
}