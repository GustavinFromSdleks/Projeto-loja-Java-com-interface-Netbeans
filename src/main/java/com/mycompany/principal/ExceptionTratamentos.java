/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

import javax.swing.JOptionPane;

/**
 *
 * /////////////////// NETBEANS IDE 17
////////////////// GUSTAVO HENRIQUE SEVERIANO
 */

/////// classe excessao tipo verificado
public class ExceptionTratamentos extends Exception {
  
    //////////TRATAMENTO NOME
    public void NomeIncorreto(){
        JOptionPane.showMessageDialog(null,"Atenção: Seu nome NAO pode conter numeros ou outros caracteres especiais.","NOME INVALIDO",JOptionPane.ERROR_MESSAGE);
    }    

    /////////TRATAMENTO EMAIL
    public void EmailSemDominio(){
        JOptionPane.showMessageDialog(null,"Atenção: Seu email NAO contem nenhum dominio ou o numero minimo de caracteres(6), utilize o caractere -> @ para declarar seu dominio. ","Email INVALIDO",JOptionPane.ERROR_MESSAGE);
    }
    
    
    ////////// TRATAMENTO CPF
    public void CpfDigitosIncorretos(){
        JOptionPane.showMessageDialog(null,"Atenção: O CPF DEVE CONTER APENAS NUMEROS, NO TOTAL DE 11 DIGITOS!.","CPF NAO REGISTRADO",JOptionPane.ERROR_MESSAGE);
    }
    
    ////////////// TRATAMENTO DIA NASC
    public void DiaNascInvalido(){
        JOptionPane.showMessageDialog(null,"Atenção: O DIA de nascimento deve estar entre os dias 1 E 31 !.","DIA DE NASCIMENTO INVALIDO",JOptionPane.ERROR_MESSAGE);
    }
    
    ////////////// TRATAMENTO MES NASC
    public void MesNascInvalido(){
        JOptionPane.showMessageDialog(null,"Atenção: O MES de nascimento deve estar entre os meses 1 E 12 !.","MES DE NASCIMENTO INVALIDO",JOptionPane.ERROR_MESSAGE);
    }
    
    ////////////// TRATAMENTO ANO NASC
    public void AnoNascInvalido(){
        JOptionPane.showMessageDialog(null,"Atenção: O ANO de nascimento deve estar entre os anos 1900 E 2023 !.","ANO DE NASCIMENTO INVALIDO",JOptionPane.ERROR_MESSAGE);
    }
    
    ///TRATAMENTO CEP 
    public void cepPoucoDigito(){
        JOptionPane.showMessageDialog(null,"Atenção: O CEP deve conter no minimo 8 digitos !","CEP INVALIDO",JOptionPane.ERROR_MESSAGE);
    }
    
    ///Tratamento Rua
    public void ruaSemNumeros(){
        JOptionPane.showMessageDialog(null,"Atenção: Informe apenas o nome da rua (SEM O NUMERO DO RESPECTIVO ENDERECO)","RUA INVALIDA",JOptionPane.ERROR_MESSAGE);
    }
    
    /////Tratamento metodo de Pagamento
    
}
