/* 
 * Material didático destinado ao curso
 * de Programação Orientada a Objetos do 
 * Bacharelado em Ciência da Computação 
 * do IFNMG - Câmpus Montes Claros
 */
package br.edu.ifnmg.poo.controletarefasalpha.gui;

import br.edu.ifnmg.poo.controletarefasalpha.entity.Tarefa;
import br.edu.ifnmg.poo.controletarefasalpha.dao.TarefaDao;

/**
 * Diálogo modal para edição de tarefa.
 * 
 * @author Luis Guisso <luis dot guisso at ifnmg dot edu dot br>
 * @version 0.0.1, 29/11/2020
 */
public class EdicaoTarefa extends javax.swing.JDialog {
    
    /**
     * Referência à janela de cadastro que invocou esta janela de edição.
     */
    private final CadastroTarefa cadastroTarefa;
    
    /**
     * Tarefa recebida para edicao.
     */
    private Tarefa tarefaEmEdicao;

    /**
     * Creates new form EdicaoTarefa
     */
    public EdicaoTarefa(Tarefa tarefa, CadastroTarefa cadastroTarefa, boolean modal) {
        super(cadastroTarefa, modal);
        initComponents();

        // Mantém referência à janela recebida
        this.cadastroTarefa = cadastroTarefa;
        
        // Mantém referência à tarefa recebida
        this.tarefaEmEdicao = tarefa;
        
        // Preenche campos do formulário com dados da tarefa recebida para edição
        preencherTarefa(tarefa);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPainel = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        chkConcluida = new javax.swing.JCheckBox();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblDescricao.setText("Descrição");

        txtDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescricaoActionPerformed(evt);
            }
        });

        chkConcluida.setText("Concluída");

        btnSalvar.setText("Salvar");
        btnSalvar.setPreferredSize(new java.awt.Dimension(96, 31));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPainelLayout = new javax.swing.GroupLayout(pnlPainel);
        pnlPainel.setLayout(pnlPainelLayout);
        pnlPainelLayout.setHorizontalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescricao)
                .addGap(8, 8, 8)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPainelLayout.createSequentialGroup()
                        .addComponent(chkConcluida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDescricao))
                .addContainerGap())
        );

        pnlPainelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnCancelar, btnSalvar});

        pnlPainelLayout.setVerticalGroup(
            pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescricao))
                .addGap(18, 18, 18)
                .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkConcluida)
                    .addGroup(pnlPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnCancelar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescricaoActionPerformed
        // Pressionar o <ENTER> no campo "Descrição" atualiza a tarefa
        // no banco de dados e atualiza a listagem da janela "CadastroTarefa"
        btnSalvarActionPerformed(evt);
    }//GEN-LAST:event_txtDescricaoActionPerformed

    /**
     * Resposta ao clique no botão "Salvar".
     * 
     * @param evt Evento capturado
     */
    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // Recupera descrição fornecida e atualiza o objeto recebido
        tarefaEmEdicao.setDescricao(txtDescricao.getText());
        
        // Recupera conclusão fornecida e atualiza o objeto recebido
        tarefaEmEdicao.setConcluida(chkConcluida.isSelected());
        
        // Salva o objeto atualizado no banco de dados.
        // A "id" possui valor (o original)  e isso acarreta 
        // a invocação da operação de atualização do método "salvar"
        new TarefaDao().salvar(tarefaEmEdicao);

        // Atualiza a tarefa que foi editada na janela "CadastroTarefa"
        cadastroTarefa.atualizarModelo(tarefaEmEdicao);
        
        // Fecha a janela corrente
        dispose();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // Fecha a janela corrente sem efetivar nenhuma operação
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Método "main" gerado quando da criação deste JDialog.
    // Não tem função dado que esta janela não é aberta isoladamente.
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(EdicaoTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(EdicaoTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(EdicaoTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(EdicaoTarefa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                EdicaoTarefa dialog = new EdicaoTarefa(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
//    }

    /**
     * Extrai dados da tarefa recebida e popula os componentes da janela
     * com seus respectivos valores.
     * 
     * @param tarefa Objeto "Tarefa" recebido
     */
    private void preencherTarefa(Tarefa tarefa) {
        // Recupera a descrição da tarefa e ajusta o campo "Descrição" com seu valor
        txtDescricao.setText(tarefa.getDescricao());
        
        // Recupera o estado de conclusão da tarefa e ajusta o campo 
        // "Concluída" com seu valor
        chkConcluida.setSelected(tarefa.getConcluida());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkConcluida;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JPanel pnlPainel;
    private javax.swing.JTextField txtDescricao;
    // End of variables declaration//GEN-END:variables
}
