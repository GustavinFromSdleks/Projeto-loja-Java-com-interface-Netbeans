/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author User
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author User
 */

/////////////////// NETBEANS IDE 17
////////////////// GUSTAVO HENRIQUE SEVERIANO

public class Carrinho implements Calcular, Iterable<Roupa>{
   
    private List<Roupa> carrinho;   
    private static Carrinho CarrinhoUnico;
    
    
       
    private Carrinho(){
        carrinho = new ArrayList<>();
      
    }
    
    ///////////////// SINGLETON
    public static Carrinho getCarrinho(){
        if(CarrinhoUnico == null){
            CarrinhoUnico = new Carrinho();
        }
        
        return CarrinhoUnico;
    }
    
    public List<Roupa> getItensCarrinho(){
        return carrinho;
    }
    
    public void adicionarRoupa(Roupa roupa){       
        carrinho.add(roupa);
    }
    
    public void removerRoupa(Roupa roupa){
      
        carrinho.remove(roupa);
    }
    
    public void limparCarrinho(){
        carrinho.clear();
    }
    
    
    
    public void listarRoupas(){
        System.out.println("ITENS NO SEU CARRINHO: \n ");
        for(Roupa roupa:carrinho){
            System.out.println("\n item: " +roupa.toString());
        }
    }
    
    public Roupa consultRoupas(Roupa roupa){
        for(int i = 0; i < carrinho.size();i++){
            if(roupa.getNome().equals(carrinho.get(i).getNome()) && roupa.getCor().equals(carrinho.get(i).getCor()) && roupa.getTamanho().equals(carrinho.get(i).getTamanho())){
                return carrinho.get(i);
            }
        }
        return roupa;
    }
    

    @Override
    public int calcularValor() {
     int valorTotal = 0;
    
    // Criar um iterador para percorrer a lista
    Iterator<Roupa> iterator = carrinho.iterator();

    // Percorrer a lista usando o iterador
    while (iterator.hasNext()) {
        Roupa roupa = iterator.next();
        valorTotal += roupa.getValor();
    }

    return valorTotal;
    }

    
    /*public int calcularValor() {
        int valorTotal = 0; 
        
        for(Roupa roupa:carrinho){
            valorTotal += roupa.getValor();
        }       
        return valorTotal;
    } */

    
       
   /////////////////////// metodo iterator  
    @Override
    public Iterator<Roupa> iterator() {
       return carrinho.iterator();
    }
    
    
}