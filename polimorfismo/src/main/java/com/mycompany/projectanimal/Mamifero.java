/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectanimal;

public class Mamifero extends Animal{
    
    private String CordoPelo;
        
    
    @Override
    public void locomover() {
        System.out.println("Correndo ");
     
    }

    @Override
    public void alimrntar() {
        System.out.println("Mamando ");
       
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero ");
   
    }

    public String getCordoPelo() {
        return CordoPelo;
    }

    public void setCordoPelo(String CordoPelo) {
        this.CordoPelo = CordoPelo;
    }  
}
