package com.cavalli;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Corsa corsa = new Corsa();
        Cavallo.durataCorsa = 1000;
        ArrayList<Cavallo> cavalli = new ArrayList<>();
        
        //popolo l'array
        for(int i = 0; i < 20 ; i++){
            cavalli.add(new Cavallo(corsa, "Cavallo" + (i + 1)));
        }
        for(Cavallo c : cavalli){
            c.start();
        }
        for(Cavallo c : cavalli){
            c.join();
        }

        System.out.println(corsa.classificaFinale());

    }
}