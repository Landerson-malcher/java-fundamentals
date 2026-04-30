/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aula02;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("modelo? " + this.modelo);
        System.out.println("uma caneta " + this.cor);
        System.out.println("ponta? " + this.ponta);
        System.out.println("carga? " + this.carga);
        System.out.println("está tampada? " + this.tampada);
    }
    void rabiscar (){
        if(this.tampada == true)
            System.out.println("ERRO! nao posso rabiscar");
        else{
            System.out.println("rabiscando");
        }
      
    }
    
    void tampar(){
        this.tampada = true;
        
    }
    
    void destampar() {
        this.tampada = false;
        
    }
}
