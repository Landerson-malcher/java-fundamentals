/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectanimal;

public class ProjectAnimal {

    public static void main(String[] args) {
        
      // Animal n = new Animal(); (não pode ser instanciado porque é abstrato)
      
      Mamifero m = new Mamifero();
      Reptil r = new Reptil();
      Peixe p = new Peixe();
      Ave a = new Ave ();
      Canguru c = new Canguru();
      Cachorro k = new Cachorro();
      Cobra j = new Cobra();
      Tartaruga t = new Tartaruga();
      Goldfish g = new Goldfish();
      Arara b = new Arara();        
     
      c.locomover();
      k.locomover();
      k.emitirSom();
      m.setCordoPelo("Marrom");
        System.out.println(m.getCordoPelo());
        
      t.alimrntar();
      
    }
}
