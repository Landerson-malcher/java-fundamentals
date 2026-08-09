/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectanimal;

public class Ave extends Animal{
    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando ");
    }

    @Override
    public void alimrntar() {
        System.out.println("Eating  ");
    }

    @Override
    public void emitirSom() {
        System.out.println("song of Ave  ");
    } 
    
    public void construirNinho(){
        System.out.println("Biulding a Nest ");
        
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
