/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisr
 */
public class NJPesquisaOrdenacao extends javax.swing.JFrame {

    /**
     * Creates new form NJPesquisaOrdenacao
     */
    public NJPesquisaOrdenacao() {
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

        jTFQuantidade = new javax.swing.JTextField();
        jLabelQuantidade = new javax.swing.JLabel();
        jButtonGerarNumeros = new javax.swing.JButton();
        jButtonSelecionarArquivo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelSelecao = new javax.swing.JLabel();
        jLabelBolha = new javax.swing.JLabel();
        jLabelInsercao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTASelecao = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTANumerosSelecionados = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTABolha = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTAInsercao = new javax.swing.JTextArea();
        jLabelTempo = new javax.swing.JLabel();
        jTFTempoSelecao = new javax.swing.JTextField();
        jTFTempoBolha = new javax.swing.JTextField();
        jTFTempoInsercao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelQuantidade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelQuantidade.setText("Quantidade :");

        jButtonGerarNumeros.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonGerarNumeros.setText("Gerar Números");
        jButtonGerarNumeros.setBorder(null);

        jButtonSelecionarArquivo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSelecionarArquivo.setText("Selecionar de Arquivo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Números Selecionados");

        jLabelSelecao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSelecao.setText("Seleção");

        jLabelBolha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelBolha.setText("Bolha");

        jLabelInsercao.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelInsercao.setText("Inserção");

        jTASelecao.setColumns(20);
        jTASelecao.setRows(5);
        jTASelecao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setViewportView(jTASelecao);

        jTANumerosSelecionados.setColumns(20);
        jTANumerosSelecionados.setRows(5);
        jScrollPane2.setViewportView(jTANumerosSelecionados);

        jTABolha.setColumns(20);
        jTABolha.setRows(5);
        jTABolha.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane3.setViewportView(jTABolha);

        jTAInsercao.setColumns(20);
        jTAInsercao.setRows(5);
        jTAInsercao.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane4.setViewportView(jTAInsercao);

        jLabelTempo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTempo.setText("Tempo :");

        jTFTempoSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTempoSelecaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelQuantidade)
                                .addGap(18, 18, 18)
                                .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 387, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(64, 64, 64)
                                        .addComponent(jTFTempoSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jTFTempoBolha, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jTFTempoInsercao, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTempo)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonGerarNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonSelecionarArquivo, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                        .addGap(48, 48, 48)
                        .addComponent(jLabelSelecao)
                        .addGap(103, 103, 103)
                        .addComponent(jLabelBolha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelInsercao)
                        .addGap(76, 76, 76))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSelecao)
                    .addComponent(jLabelBolha)
                    .addComponent(jLabelInsercao)
                    .addComponent(jButtonGerarNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSelecionarArquivo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTempo)
                                    .addComponent(jTFTempoSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFTempoBolha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFTempoInsercao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTFTempoSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTempoSelecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTempoSelecaoActionPerformed

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
            java.util.logging.Logger.getLogger(NJPesquisaOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NJPesquisaOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NJPesquisaOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NJPesquisaOrdenacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NJPesquisaOrdenacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGerarNumeros;
    private javax.swing.JButton jButtonSelecionarArquivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelBolha;
    private javax.swing.JLabel jLabelInsercao;
    private javax.swing.JLabel jLabelQuantidade;
    private javax.swing.JLabel jLabelSelecao;
    private javax.swing.JLabel jLabelTempo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTABolha;
    private javax.swing.JTextArea jTAInsercao;
    private javax.swing.JTextArea jTANumerosSelecionados;
    private javax.swing.JTextArea jTASelecao;
    private javax.swing.JTextField jTFQuantidade;
    private javax.swing.JTextField jTFTempoBolha;
    private javax.swing.JTextField jTFTempoInsercao;
    private javax.swing.JTextField jTFTempoSelecao;
    // End of variables declaration//GEN-END:variables
}
