/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author User
 */

/////////////////// NETBEANS IDE 17
////////////////// GUSTAVO HENRIQUE SEVERIANO

public abstract class Roupa {
    private String nome;
    private String cor;
    private String tamanho;	   
    private String marca;
    private int valor;
    
    
    
    public Roupa(String nome, String cor, String tamanho, String marca, int valor){
	this.nome = nome;
	this.cor = cor;
	this.tamanho = tamanho;
	this.valor = valor;
       this.marca = marca;
        
               
    }
      
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
 @Override ///////////// estou usando esse metodo para retornar os OBJETOS do carrinho em forma de String.
 public String toString(){
      return "Nome: " + nome + "\n Cor: " + cor + "\n Tamanho: " +tamanho+ "\n Valor: " +valor+ "";
 }
   
       
    
//public abstract void descrissaoDaPeca(); 

//public abstract void disponibilidadeEstoque();

    
}
