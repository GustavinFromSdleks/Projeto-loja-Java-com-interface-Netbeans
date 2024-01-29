/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.principal;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
/////////////////// NETBEANS IDE 17
////////////////// GUSTAVO HENRIQUE SEVERIANO


public class Principal extends javax.swing.JFrame {

   
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLBtitulo = new javax.swing.JLabel();
        JBTMenuCompras = new javax.swing.JButton();
        JBTcarrinho = new javax.swing.JButton();
        JBTencerrar = new javax.swing.JButton();
        JLBmoduloPrincipal = new javax.swing.JLabel();
        JMENUbarraPrincipal = new javax.swing.JMenuBar();
        JmenuOpcoes = new javax.swing.JMenu();
        JmenuMeuCarrinho = new javax.swing.JMenu();
        JmenuAcessarCarrinho = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLBtitulo.setText("SDLEKS STORE");

        JBTMenuCompras.setText("MENU COMPRAS");
        JBTMenuCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTMenuComprasActionPerformed(evt);
            }
        });

        JBTcarrinho.setText("MEU CARRINHO");
        JBTcarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTcarrinhoActionPerformed(evt);
            }
        });

        JBTencerrar.setText("SAIR");
        JBTencerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBTencerrarMouseClicked(evt);
            }
        });
        JBTencerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTencerrarActionPerformed(evt);
            }
        });

        JLBmoduloPrincipal.setText("Escolha sua opcao de acesso:");

        JmenuOpcoes.setText("Opcoes");

        JmenuMeuCarrinho.setText("Meu Carrinho");

        JmenuAcessarCarrinho.setText("Ver itens");
        JmenuAcessarCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JmenuAcessarCarrinhoMouseClicked(evt);
            }
        });
        JmenuAcessarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmenuAcessarCarrinhoActionPerformed(evt);
            }
        });
        JmenuMeuCarrinho.add(JmenuAcessarCarrinho);

        JmenuOpcoes.add(JmenuMeuCarrinho);

        JMENUbarraPrincipal.add(JmenuOpcoes);

        setJMenuBar(JMENUbarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(JLBtitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBTcarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBTencerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JLBmoduloPrincipal))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JBTMenuCompras)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBtitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLBmoduloPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBTMenuCompras)
                .addGap(12, 12, 12)
                .addComponent(JBTcarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBTencerrar)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTMenuComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTMenuComprasActionPerformed
               
            MenuCompras.getMenuCompras().setVisible(true);
               
    }//GEN-LAST:event_JBTMenuComprasActionPerformed

    private void JBTcarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTcarrinhoActionPerformed
      ItensCarrinho.getItensCarrinhoTabela().abreItensCarrinho();
    }//GEN-LAST:event_JBTcarrinhoActionPerformed

    private void JBTencerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBTencerrarMouseClicked
        
        int aux = JOptionPane.showConfirmDialog(null, "Deseja Realmente sair?", "Saida", JOptionPane.YES_NO_OPTION);
            if(aux == 0){
                dispose();
            }
    }//GEN-LAST:event_JBTencerrarMouseClicked

    private void JmenuAcessarCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JmenuAcessarCarrinhoMouseClicked
       ItensCarrinho.getItensCarrinhoTabela().abreItensCarrinho();      
    }//GEN-LAST:event_JmenuAcessarCarrinhoMouseClicked

    private void JmenuAcessarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmenuAcessarCarrinhoActionPerformed
        ItensCarrinho.getItensCarrinhoTabela().abreItensCarrinho();
    }//GEN-LAST:event_JmenuAcessarCarrinhoActionPerformed

    private void JBTencerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTencerrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTencerrarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTMenuCompras;
    private javax.swing.JButton JBTcarrinho;
    private javax.swing.JButton JBTencerrar;
    private javax.swing.JLabel JLBmoduloPrincipal;
    private javax.swing.JLabel JLBtitulo;
    private javax.swing.JMenuBar JMENUbarraPrincipal;
    private javax.swing.JMenuItem JmenuAcessarCarrinho;
    private javax.swing.JMenu JmenuMeuCarrinho;
    private javax.swing.JMenu JmenuOpcoes;
    // End of variables declaration//GEN-END:variables
}
