/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.principal;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * /////////////////// NETBEANS IDE 17
////////////////// GUSTAVO HENRIQUE SEVERIANO
 */
public class MenuDadosCliente extends javax.swing.JFrame {

    private static MenuDadosCliente unicMenuDadosCliente;
    private DadosCliente ClienteUnic = DadosCliente.getDadosCliente();
    private Carrinho unicCar = Carrinho.getCarrinho();
    private ItensCarrinho unicTable = ItensCarrinho.getItensCarrinhoTabela();
    private String metodoPagamento;
    
    public static MenuDadosCliente getMenuDadosCliente(){
        if(unicMenuDadosCliente == null){
            unicMenuDadosCliente = new MenuDadosCliente();
        }       
        return unicMenuDadosCliente;
    }
    
    
    public MenuDadosCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JLBtitulo = new javax.swing.JLabel();
        JLBinstrucao = new javax.swing.JLabel();
        JLBinserirEmail = new javax.swing.JLabel();
        JTFnomeCliente = new javax.swing.JTextField();
        JLBinserirNome = new javax.swing.JLabel();
        JTFemailCliente = new javax.swing.JTextField();
        JLBdataDeNascimento = new javax.swing.JLabel();
        JTFcpfCliente = new javax.swing.JTextField();
        JLBinserirCpf = new javax.swing.JLabel();
        JTFmes = new javax.swing.JTextField();
        JTFano = new javax.swing.JTextField();
        JTFdia = new javax.swing.JTextField();
        JLBdia = new javax.swing.JLabel();
        JLBmes = new javax.swing.JLabel();
        JLBano = new javax.swing.JLabel();
        JLBdadosEndereco = new javax.swing.JLabel();
        JLBcep = new javax.swing.JLabel();
        JTFcep = new javax.swing.JTextField();
        JLBrua = new javax.swing.JLabel();
        JTFrua = new javax.swing.JTextField();
        JLBnumeroCasa = new javax.swing.JLabel();
        JTFnumeroResidencia = new javax.swing.JTextField();
        JBTfinalizarCompra = new javax.swing.JButton();
        JBTvoltar = new javax.swing.JButton();
        JLBmetodoPagamento = new javax.swing.JLabel();
        JRBpix = new javax.swing.JRadioButton();
        JRBpontoSemestre = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLBtitulo.setText("SDLEKS");

        JLBinstrucao.setText("Insira seus dados para finalizar sua compra:");

        JLBinserirEmail.setText("Insira seu email:");

        JTFnomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFnomeClienteActionPerformed(evt);
            }
        });

        JLBinserirNome.setText("Insira seu nome completo:");

        JLBdataDeNascimento.setText("Insira sua data de nascimento:");

        JLBinserirCpf.setText("Insira seu cpf:");

        JTFdia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFdiaActionPerformed(evt);
            }
        });

        JLBdia.setText("Dia:");

        JLBmes.setText("Mes:");

        JLBano.setText("Ano:");

        JLBdadosEndereco.setText("Informe o Endereco:");

        JLBcep.setText("Cep:");

        JLBrua.setText("Rua:");

        JLBnumeroCasa.setText("Numero residencial:");

        JBTfinalizarCompra.setText("Finalizar  compra");
        JBTfinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTfinalizarCompraActionPerformed(evt);
            }
        });

        JBTvoltar.setText("Voltar");
        JBTvoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTvoltarActionPerformed(evt);
            }
        });

        JLBmetodoPagamento.setText("Metodo de pagamento:");

        buttonGroup1.add(JRBpix);
        JRBpix.setText("Pix");
        JRBpix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBpixActionPerformed(evt);
            }
        });

        buttonGroup1.add(JRBpontoSemestre);
        JRBpontoSemestre.setText("1 ponto na media");
        JRBpontoSemestre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBpontoSemestreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLBinstrucao))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(JLBtitulo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JLBinserirCpf)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTFcpfCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(JLBinserirNome, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBinserirEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFnomeCliente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFemailCliente, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JLBdadosEndereco)
                                .addGap(144, 144, 144))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLBrua, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JLBcep, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(92, 92, 92)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(JTFrua, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(JTFcep)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(JBTvoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JBTfinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JLBmetodoPagamento)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JLBnumeroCasa)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(JTFnumeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JRBpontoSemestre)
                                                .addComponent(JRBpix)))))
                                .addGap(16, 16, 16))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLBdataDeNascimento)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLBano)
                                    .addComponent(JLBmes)
                                    .addComponent(JLBdia, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFano, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(JTFmes)
                                    .addComponent(JTFdia))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLBinstrucao)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBinserirNome)
                    .addComponent(JLBdadosEndereco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JTFnomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JLBinserirEmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTFemailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLBcep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFrua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLBrua))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLBnumeroCasa)
                            .addComponent(JTFnumeroResidencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(JLBinserirCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFcpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBmetodoPagamento))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBdataDeNascimento)
                    .addComponent(JRBpix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFdia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLBdia)
                    .addComponent(JRBpontoSemestre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBmes)
                    .addComponent(JTFmes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBano)
                    .addComponent(JTFano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTfinalizarCompra)
                    .addComponent(JBTvoltar))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTfinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTfinalizarCompraActionPerformed
        int aux = JOptionPane.showConfirmDialog(null, "Deseja finalizar sua compra?", "Concluir compra", JOptionPane.YES_NO_OPTION);

        if (aux == 0) {
            boolean camposValidos = true;

        // Verificando nome cliente
            try {
                ClienteUnic.setNomeCliente(JTFnomeCliente.getText());
            }catch (ExceptionTratamentos ECPT) {
                ECPT.NomeIncorreto();
                JTFnomeCliente.setText("");
                camposValidos = false;
            }

        // Verificando Email cliente
            if (camposValidos) {
                try {
                    ClienteUnic.setEmailCliente(JTFemailCliente.getText());
                } catch (ExceptionTratamentos ECPT) {
                    ECPT.EmailSemDominio();
                    JTFemailCliente.setText("");
                    camposValidos = false;
                }
            }

        // Verificando CPF cliente
            if (camposValidos) {
                try {
                    ClienteUnic.setCpfCliente(JTFcpfCliente.getText());
                } catch (ExceptionTratamentos ECPT) {
                    ECPT.CpfDigitosIncorretos();
                    JTFcpfCliente.setText("");
                    camposValidos = false;
                }
            }

            this.verificarJRBpressionado();
     
        if (camposValidos) {           
            //this.verificarJRBpressionado();
            JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso!", "COMPRA CONCLUIDA", JOptionPane.INFORMATION_MESSAGE);
            unicCar.limparCarrinho();
            unicTable.limparTabela();
            dispose();
        }
    }
                 
        
    }//GEN-LAST:event_JBTfinalizarCompraActionPerformed

    //////////////////////////////////////////////
    private void verificarJRBpressionado(){
        if(buttonGroup1.getSelection() == null){
            
            JOptionPane.showMessageDialog(null,"Selecione uma opcao de pagamento !","ERRO AO DECLARAR OPCAO DE PAGAMENTO",JOptionPane.ERROR_MESSAGE);
        }else if(JRBpix.isSelected()){
            this.metodoPagamento = "Pix";
            
            JOptionPane.showMessageDialog(null,"Voce escolheu o metodo de pagamento via Pix","PAGAMENTO CONCLUIDO",JOptionPane.DEFAULT_OPTION);
        }else{
            this.metodoPagamento = "1 ponto";
            
            JOptionPane.showMessageDialog(null,"Voce escolheu o metodo de pagamento via Nota Semestral! Obrigado por ajudar um pobre aluno !","PAGAMENTO CONCLUIDO",JOptionPane.DEFAULT_OPTION);
        }
                
                    
    }
    
    
    private void JBTvoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTvoltarActionPerformed
        int aux = JOptionPane.showConfirmDialog(null, "Deseja voltar ao Carrinho?", "Voltar ao Carrinho de compras", JOptionPane.YES_NO_OPTION);
            if(aux == 0){
                dispose();
        }
    }//GEN-LAST:event_JBTvoltarActionPerformed

    private void JTFnomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFnomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFnomeClienteActionPerformed

    private void JTFdiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFdiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFdiaActionPerformed

    private void JRBpixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBpixActionPerformed
        if(JRBpix.isSelected()){
            this.metodoPagamento = "Pix";
        }
    }//GEN-LAST:event_JRBpixActionPerformed

    private void JRBpontoSemestreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBpontoSemestreActionPerformed
        if(JRBpontoSemestre.isSelected()){
            this.metodoPagamento = "1 ponto";
        }
    }//GEN-LAST:event_JRBpontoSemestreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuDadosCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTfinalizarCompra;
    private javax.swing.JButton JBTvoltar;
    private javax.swing.JLabel JLBano;
    private javax.swing.JLabel JLBcep;
    private javax.swing.JLabel JLBdadosEndereco;
    private javax.swing.JLabel JLBdataDeNascimento;
    private javax.swing.JLabel JLBdia;
    private javax.swing.JLabel JLBinserirCpf;
    private javax.swing.JLabel JLBinserirEmail;
    private javax.swing.JLabel JLBinserirNome;
    private javax.swing.JLabel JLBinstrucao;
    private javax.swing.JLabel JLBmes;
    private javax.swing.JLabel JLBmetodoPagamento;
    private javax.swing.JLabel JLBnumeroCasa;
    private javax.swing.JLabel JLBrua;
    private javax.swing.JLabel JLBtitulo;
    private javax.swing.JRadioButton JRBpix;
    private javax.swing.JRadioButton JRBpontoSemestre;
    private javax.swing.JTextField JTFano;
    private javax.swing.JTextField JTFcep;
    private javax.swing.JTextField JTFcpfCliente;
    private javax.swing.JTextField JTFdia;
    private javax.swing.JTextField JTFemailCliente;
    private javax.swing.JTextField JTFmes;
    private javax.swing.JTextField JTFnomeCliente;
    private javax.swing.JTextField JTFnumeroResidencia;
    private javax.swing.JTextField JTFrua;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
