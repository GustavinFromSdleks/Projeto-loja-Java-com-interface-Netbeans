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
public class Calca extends Roupa {
    private static int qtdCalcaDisponivel = 1;

    public static int getQtdCalcaDisponivel() {
        return qtdCalcaDisponivel;
    }

    ////////////////////////////////////////SOBRECARGA DE METODO
    public static void setQtdCalcaDisponivel(int qtdCalcaDisponivel) {
        Calca.qtdCalcaDisponivel = qtdCalcaDisponivel;
    }
    
  
    // Método sobrecarregado para definir a quantidade disponível usando um valor padrão
    public static void setQtdCalcaDisponivel() {
        Calca.qtdCalcaDisponivel = 1;  // ou qualquer valor padrão desejado
    }
    
    
    
    public Calca(String nome, String cor, String tamanho, String marca, int valor) {
        super(nome, cor, tamanho, marca, valor);
    }
    
    
    public final void diminuirCalcaDisponivel(){
        this.qtdCalcaDisponivel--;
    }
    
    public final void aumentarCalcaDisponivel(){
        this.qtdCalcaDisponivel++;
        JOptionPane.showMessageDialog(null, "CAMISETA DE VOLTA AO ESTOQUE! \n AINDA RESTAM: " + this.getQtdCalcaDisponivel() + " EM ESTOQUE!");
    }
    
    public final boolean verificarQTDcalca(){
        if(this.qtdCalcaDisponivel == 0){
            
            return false;
        }
        else{
            
            return true;
        }
    }
    
    
}
