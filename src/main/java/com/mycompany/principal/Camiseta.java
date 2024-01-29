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
public class Camiseta extends Roupa {
    private static int qtdCamisetasDisponivel = 1;

    public static int getQtdCamisetasDisponivel() {
        return qtdCamisetasDisponivel;
    }

    public static void setQtdCamisetasDisponivel(int qtdCamisetasDisponivel) {
        Camiseta.qtdCamisetasDisponivel = qtdCamisetasDisponivel;
    }
    
    
    public Camiseta(String nome, String cor, String tamanho, String marca, int valor){
        super(nome, cor, tamanho, marca, valor);
    }
    
    public final void diminuirCamisetaDisponivel(){
        this.qtdCamisetasDisponivel--;
    }
    
    public final void aumentarCamisetaDisponivel(){
        this.qtdCamisetasDisponivel++;
        JOptionPane.showMessageDialog(null, "CAMISETA DE VOLTA AO ESTOQUE! \n AINDA RESTAM: " + this.getQtdCamisetasDisponivel() + " EM ESTOQUE!");
    }
    
    public final boolean verificarQTDcamisetas(){
        if(this.qtdCamisetasDisponivel == 0){
            
            return false;
        }
        else{
            
            return true;
        }
    }
    
    
}
