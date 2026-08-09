/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectanimal;

public class Reptil extends Animal{
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("rastejando ");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void alimrntar() {
        System.out.println("Comendo Vegetal ");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil ");
    }
    
}
