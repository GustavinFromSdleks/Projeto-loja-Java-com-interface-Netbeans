/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Meia extends Roupa {
    private static int qtdMeiaDisponivel = 1;

    public static int getQtdMeiaDisponivel() {
        return qtdMeiaDisponivel;
    }

    public static void setQtdMeiaDisponivel(int qtdMeiaDisponivel) {
        Meia.qtdMeiaDisponivel = qtdMeiaDisponivel;
    }
    
        
    public Meia(String nome, String cor, String tamanho, String marca, int valor) {
        super(nome, cor, tamanho, marca, valor);
    }
    
    
    public final void diminuirMeiaDisponivel(){
        this.qtdMeiaDisponivel--;
    }
    
    public final void aumentarMeiaDisponivel(){
        this.qtdMeiaDisponivel++;
        JOptionPane.showMessageDialog(null, "CAMISETA DE VOLTA AO ESTOQUE! \n AINDA RESTAM: " + this.getQtdMeiaDisponivel() + " EM ESTOQUE!");
    }
    
    public final boolean verificarQTDmeia(){
        if(this.qtdMeiaDisponivel == 0){            
            return false;
        }
        else{           
            return true;
        }
    }
    
    
    
}
