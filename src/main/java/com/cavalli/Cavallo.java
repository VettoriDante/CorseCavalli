package com.cavalli;

public class Cavallo extends Thread{
    static int durataCorsa;
    private Corsa corsa;
    private String nome;

    public Cavallo(Corsa corsa, String nome) {
        this.corsa = corsa;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }



    @Override
    public void run() {
        try {
            Thread.sleep((int) (Math.random() * 100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        corsa.addArrivato(this.getNome());
    }
}
