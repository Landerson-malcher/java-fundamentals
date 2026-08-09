/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectanimal;


public class Peixe extends Animal{
    private String corEscama;
  
    @Override
    public void locomover() {
        System.out.println("Nadando ");
    }

    @Override
    public void alimrntar() {
        System.out.println("Comendo Substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz Som");
        
    }
    public void souta5rBolha() {
        System.out.println("Soutando Bolhas ");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
   
}
