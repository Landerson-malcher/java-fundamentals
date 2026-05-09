/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ufcjava;

public class UFCjava {

    public static void main(String[] args) {
        Lutador L[] = new Lutador[6];
        
        L[0] = new Lutador ("DAVI", "BRASIL", 31, 1.75f, 68.8f, 11, 2, 1);
      
        L[1] = new Lutador ("putscrypt", "Brasil", 29, 1.68f, 57.8f, 14, 12,3);
        
        L[2] = new Lutador ("snapshadow", "EUA", 35, 1.65f, 80.9f, 12, 2, 1);
        
        L[3] = new Lutador ("Dead code", "austria", 28, 1.93f, 81.3f, 3, 0,2 );
        
        L[4] = new Lutador ("UfCobol", "Brasil", 37, 1.70f, 119.3f, 5, 4 ,3 );
        
        L[5] = new Lutador ("NERDART", "EUA", 30, 1.81f, 105.7f, 12, 2, 4);
        
     
      Luta UFC01 = new Luta(); 
      UFC01.Marcarluta(L[0], L[1]);
      UFC01.lutar();
    }
}
