/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ufcjava;

public class Lutador {
    // ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    // MÉTODOS
    public void apresentar() {
        System.out.println("CHGOU A HORA DE APRESENTAR " + this.getNome());
        System.out.println("ORIGEM " + this.getNacionalidade());
        System.out.println(this.getIdade() + "idade ") ;
        System.out.println(this.getAltura() + "M de altura ");
        System.out.println("pesando " + this.getPeso() + "Kg ");
        System.out.println("GANHOU " + this.getVitorias());
        System.out.println("PERDEU " + this.derrotas);
        System.out.println("EMPATOU " + this.empates);  
    }
   
    public void status() {
        System.out.println(this.getNome() + "é um pesa " + this.getCategoria());
        System.out.println("vitorias" + this.getVitorias() + "vezes"); 
        System.out.println("perdeu" + this.getDerrotas() + "vezes");
        System.out.println("empatou" + this.getEmpates() + "vezes");
    }

    public void ganharLuta() {
       this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() +1);      
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    //Metodos Especiais (construtor)

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
       if(this.peso <52.2){
           this.categoria = "invalido";
        }else if (this.peso <= 73){
            this.categoria = "leve";
        }else if (this.peso <= 80.9){
            this.categoria = "medio";     
        }else if (this.peso <= 120.2){
            this.categoria = "pesado";
        }else {
            this.categoria = "invalida";
        }       
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    }
    

