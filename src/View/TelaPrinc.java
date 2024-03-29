/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno02
 */
public class TelaPrinc extends javax.swing.JFrame {

boolean J1ativo = true;
boolean J2ativo = false;

int Nv1 = 0;
int Nv2 = 0;
int Ne = 0 ;

    public TelaPrinc() {
        initComponents();
    }
    public void JogadorAtivo(){
        if(J1ativo == true){
            J1ativo = false;
            J2ativo = true;
        }else{
            J1ativo = true;
            J2ativo = false;
        }
        JogadorVencedor("X");
        JogadorVencedor("0");
           
    }
    public void JogadorVencedor(String Jogador){
        
        /* linha */
        if (B1.getText().equals(Jogador) &&
             B2.getText().equals(Jogador) && 
                B3.getText().equals(Jogador)){
            
            if(B1.getText().equals("X")){
                Vencedor("Jogador 1");
                
            }else{
                Vencedor("Jogador 2");
            }
        }
            
              if (B4.getText().equals(Jogador) &&
             B5.getText().equals(Jogador) && 
                B6.getText().equals(Jogador)){
            
            if(B4.getText().equals("X")){
                Vencedor("Jogador 1");
                
            }else{
                Vencedor("Jogador 2");
            }
              }
                if (B7.getText().equals(Jogador) &&
             B8.getText().equals(Jogador) && 
                B9.getText().equals(Jogador)){
            
            if(B7.getText().equals("X")){
                Vencedor("Jogador 1");
                
            }else{
                Vencedor("Jogador 2");
            }
                }
                /*-------------------Coluna---------------*/
                if (B1.getText().equals(Jogador) &&
             B4.getText().equals(Jogador) && 
                B7.getText().equals(Jogador)){
            
            if(B1.getText().equals("X")){
                Vencedor("Jogador 1");
                
            }else{
                Vencedor("Jogador 2");
            }
                }
                
                if (B2.getText().equals(Jogador) &&
             B5.getText().equals(Jogador) && 
                B8.getText().equals(Jogador)){
            
            if(B2.getText().equals("X")){
                Vencedor("Jogador 1");
                
            }else{
                Vencedor("Jogador 2");
            }
                }
                
                if (B3.getText().equals(Jogador) &&
             B6.getText().equals(Jogador) && 
                B9.getText().equals(Jogador)){
            
            if(B3.getText().equals("X")){
                Vencedor("Jogador 1");
                
            }else{
                Vencedor("Jogador 2");
            }
                }
                /*---------------Diagonal---------------*/
            
                 if (B1.getText().equals(Jogador) &&
             B5.getText().equals(Jogador) && 
                B9.getText().equals(Jogador)){
            
            if(B1.getText().equals("X")){
                Vencedor("Jogador 1");
                
            }else{
                Vencedor("Jogador 2");
            }
                }
                 
                    if (B3.getText().equals(Jogador) &&
             B5.getText().equals(Jogador) && 
                B7.getText().equals(Jogador)){
            
            if(B3.getText().equals("X")){
                Vencedor("Jogador 1");
                
            }else{
                Vencedor("Jogador 2");
            }
                }
                    
                    /*---------------Empate---------------*/
                
                    
                    if (!B1.getText().equals("")&&
                          !B2.getText().equals("")&&
                            !B3.getText().equals("")&&
                            !B4.getText().equals("")&&
                            !B5.getText().equals("")&&
                            !B6.getText().equals("")&&
                            !B7.getText().equals("")&&
                            !B8.getText().equals("")&&
                            !B9.getText().equals("")){
                     Vencedor("Empate");
                    }
                  
                    
            
        
        
        
        
    }
     public void Vencedor(String JogadorVencedor){
         if (JogadorVencedor.equals("Jogador 1")){
             JOptionPane.showMessageDialog(null,"Jogador 1, Venceu!");
             Nv1 ++;
             VitoriasJ1.setText("Número de vitorias: "+ Nv1);
             Limpar();
         }if (JogadorVencedor.equals("Jogador 2")){
              JOptionPane.showMessageDialog(null,"Jogador 2, Venceu!");
             Nv2++;
               VitoriasJ2.setText("Número de vitorias: "+ Nv2);
             Limpar();
         }
         if (JogadorVencedor.equals("Empate")){
             JOptionPane.showMessageDialog(null,"Empate");
             Ne++;
               Empates.setText("Número de empates: "+ Ne);
             Limpar();
         
     }
     }
     
         
     
     
     public void Limpar(){
         B1.setText("");
         B2.setText("");
         B3.setText("");
         B4.setText("");
         B5.setText("");
         B6.setText("");
         B7.setText("");
         B8.setText("");
         B9.setText("");
        
      
         J1ativo = true;
         J2ativo = false;
         
         
     }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VitoriasJ1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        VitoriasJ2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Empates = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        NJ = new javax.swing.JButton();
        Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo Da Velha");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        B1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B1.setMaximumSize(new java.awt.Dimension(500, 500));
        B1.setPreferredSize(new java.awt.Dimension(500, 500));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        jPanel1.add(B1);
        B1.setBounds(20, 20, 120, 100);

        B2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        jPanel1.add(B2);
        B2.setBounds(150, 20, 120, 100);

        B4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        jPanel1.add(B4);
        B4.setBounds(20, 130, 120, 100);

        B3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        jPanel1.add(B3);
        B3.setBounds(280, 20, 120, 100);

        B5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        jPanel1.add(B5);
        B5.setBounds(150, 130, 120, 100);

        B6.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        jPanel1.add(B6);
        B6.setBounds(280, 130, 120, 100);

        B7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        jPanel1.add(B7);
        B7.setBounds(20, 240, 120, 100);

        B8.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        jPanel1.add(B8);
        B8.setBounds(150, 240, 120, 100);

        B9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        jPanel1.add(B9);
        B9.setBounds(280, 240, 120, 100);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", 0, 0, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Jodador:1");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(16, 30, 90, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Simbolo: X");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(130, 30, 110, 30);

        VitoriasJ1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VitoriasJ1.setText("Número de vitorias: 0");
        jPanel2.add(VitoriasJ1);
        VitoriasJ1.setBounds(10, 70, 140, 30);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 100, 350, 2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Jogador:2");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 120, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Simbolo: 0");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(140, 120, 80, 40);

        VitoriasJ2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        VitoriasJ2.setText("Números de vitorias: 0");
        jPanel2.add(VitoriasJ2);
        VitoriasJ2.setBounds(10, 160, 140, 40);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(0, 202, 350, 10);

        Empates.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Empates.setText("Número de empates: 0");
        jPanel2.add(Empates);
        Empates.setBounds(10, 220, 210, 40);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comandos", 0, 0, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel3.setLayout(null);

        NJ.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NJ.setText("Novo Jogo");
        NJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NJActionPerformed(evt);
            }
        });
        jPanel3.add(NJ);
        NJ.setBounds(10, 40, 110, 60);

        Sair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        jPanel3.add(Sair);
        Sair.setBounds(160, 40, 110, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(835, 473));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NJActionPerformed
Limpar();
  VitoriasJ1.setText("Número de vitorias: 0");
           VitoriasJ2.setText("Número de vitorias: 0");
           Empates.setText("Número de empates: 0");
 Nv1 = 0;
 Nv2 = 0;
 Ne = 0 ;
      

    }//GEN-LAST:event_NJActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
    
        if (J1ativo == true){
          if (B1.getText().equals("")){
              B1.setText("X");
              JogadorAtivo();
          }
              }else{
              if(B1.getText().equals("")){
                   B1.setText("0");
              JogadorAtivo();
          }
      }
        
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed

          if (J1ativo == true){
          if (B2.getText().equals("")){
              B2.setText("X");
              JogadorAtivo();
          }
              }else{
              if(B2.getText().equals("")){
                   B2.setText("0");
              JogadorAtivo();
          }
      }
        
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
  
          if (J1ativo == true){
          if (B3.getText().equals("")){
              B3.setText("X");
              JogadorAtivo();
          }
              }else{
              if(B3.getText().equals("")){
                   B3.setText("0");
              JogadorAtivo();
          }
      }
        
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
 
          if (J1ativo == true){
          if (B4.getText().equals("")){
              B4.setText("X");
              JogadorAtivo();
          }
              }else{
              if(B4.getText().equals("")){
                   B4.setText("0");
              JogadorAtivo();
          }
      }
        
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
     
          if (J1ativo == true){
          if (B5.getText().equals("")){
              B5.setText("X");
              JogadorAtivo();
          }
              }else{
              if(B5.getText().equals("")){
                   B5.setText("0");
              JogadorAtivo();
          }
      }
        
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
 
          if (J1ativo == true){
          if (B6.getText().equals("")){
              B6.setText("X");
              JogadorAtivo();
          }
          }else{
              if(B6.getText().equals("")){
                   B6.setText("0");
              JogadorAtivo();
              }
      }
        
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
      
          if (J1ativo == true){
          if (B7.getText().equals("")){
              B7.setText("X");
              JogadorAtivo();
          }
          }else{
              if(B7.getText().equals("")){
                   B7.setText("0");
              JogadorAtivo();
              }
      }
        
    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        
          if (J1ativo == true){
          if (B8.getText().equals("")){
              B8.setText("X");
              JogadorAtivo();
          }
          }else{
              if(B8.getText().equals("")){
                   B8.setText("0");
              JogadorAtivo();
              }
      }
        
    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
      
          if (J1ativo == true){
          if (B9.getText().equals("")){
              B9.setText("X");
              JogadorAtivo();
          }
          }else{
              if(B9.getText().equals("")){
                   B9.setText("0");
              JogadorAtivo();
              }
      }
        
    }//GEN-LAST:event_B9ActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
      System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

   
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
            java.util.logging.Logger.getLogger(TelaPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrinc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrinc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JLabel Empates;
    private javax.swing.JButton NJ;
    private javax.swing.JButton Sair;
    private javax.swing.JLabel VitoriasJ1;
    private javax.swing.JLabel VitoriasJ2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
