package com.cavalli;

import java.util.ArrayList;

public class Corsa {
    private ArrayList<String> classifica;

    public Corsa() {
        this.classifica = new ArrayList<>();
    }

    synchronized public void addArrivato(String nomeCavallo){
        classifica.add(nomeCavallo);
    }

    public String classificaFinale(){
        String ans = "# # # Classifica Finale # # #";
        for(int i = 0; i < classifica.size(); i++){
            ans += "\n" + (i + 1) + ". " + classifica.get(i);
        }
        return ans;
    }
    
}
