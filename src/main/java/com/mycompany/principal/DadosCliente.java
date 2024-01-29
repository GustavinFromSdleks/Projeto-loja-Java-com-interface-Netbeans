/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * /////////////////// NETBEANS IDE 17
////////////////// GUSTAVO HENRIQUE SEVERIANO
 */
public class DadosCliente {
    private String NomeCliente;
    private String EmailCliente;
    private String CpfCliente;
    private int dataNascDia;
    private int dataNascMes;
    private int dataNascAno;
    
    private String Rua;
    private int CEP;   
    private int NumeroCasa;

    
    private static DadosCliente ClienteUnic;
    
    private DadosCliente(){
        
    }
    
    public static DadosCliente getDadosCliente(){
        if(ClienteUnic == null){
            ClienteUnic = new DadosCliente();
        }
        
        return ClienteUnic;
        
    }
    
    
    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente)throws ExceptionTratamentos {
        if(NomeCliente.matches(("[a-zA-Z\\s]+"))){    ////////ESSE TRATAMENTO VIA MATCHES FOI INSPIRADO EM OUTRO CODIGO MEU, NAO TINHA NO MATERIAL!            
            this.NomeCliente = NomeCliente;           ///// o maximo que eu puder evitar criar tratamentos desnecessarios tento evitar
        }else{
            throw new ExceptionTratamentos();
        }    
    }

    public String getEmailCliente() {
        return EmailCliente;
    }

    public void setEmailCliente(String EmailCliente)throws ExceptionTratamentos{
        //String auxString = this.EmailCliente; 
        int auxInt = EmailCliente.length();
        
        if(EmailCliente.matches(".*@.*" ) && auxInt > 6){       
            this.EmailCliente = EmailCliente;
        }else{
            throw new ExceptionTratamentos();
        }    
    }

    public String getCpfCliente() {
        return CpfCliente;
    }

    public void setCpfCliente(String CpfCliente)throws ExceptionTratamentos{
        int auxContador;
        auxContador = CpfCliente.length();
        
        /////matches("\\d+")  VERIFICA SE TEM APENAS DIGITOS NUMEROS, tira a necessidade de usar NumberFormatException.
        //////// auxContador Verifica a quantidade de Numeros do meu CPF
        if(CpfCliente.matches("\\d+") && auxContador == 11){
            
            this.CpfCliente = CpfCliente;
        }else{
            throw new ExceptionTratamentos();
        }
            
    }

    public int getDataNascDia(){
        return dataNascDia;
    }

    public void setDataNascDia(int dataNascDia) throws ExceptionTratamentos {
        if(dataNascDia >= 1 && dataNascDia <= 31){
            this.dataNascDia = dataNascDia;
        }else{
            throw new ExceptionTratamentos();
        }   
    }

    public int getDataNascMes() {
        return dataNascMes;
    }

    public void setDataNascMes(int dataNascMes)throws ExceptionTratamentos {
        if(dataNascMes >= 1 && dataNascMes <= 12){
            this.dataNascMes = dataNascMes;
        }else{
            throw new ExceptionTratamentos();
        }    
    }

    public int getDataNascAno() {
        return dataNascAno;
    }

    public void setDataNascAno(int dataNascAno)throws ExceptionTratamentos {
        if(dataNascAno >= 1900 && dataNascAno <= 2023){
            this.dataNascAno = dataNascAno;
        }else{
            throw new ExceptionTratamentos();
        }    
    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua)throws ExceptionTratamentos {
        if(Rua.matches(("[a-zA-Z\\s]+"))){          //////////verificando se tem apenas Letras!
            this.Rua = Rua;
        }else{
            throw new ExceptionTratamentos();
        }    
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) throws ExceptionTratamentos {          
        
            if(CEP >= 10000000 && CEP <= 99999999){
            
                this.CEP = CEP;
            }else{
                throw new ExceptionTratamentos();
            }    
            
    }

    public int getNumeroCasa() {
        return NumeroCasa;
    }

    public void setNumeroCasa(int NumeroCasa) {       
        this.NumeroCasa = NumeroCasa;
    }
    
    
    
    
}
