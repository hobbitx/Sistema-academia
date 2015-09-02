/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Inicio.frmLogar;

/**
 *
 * @author Robert
 */
public class frmUser extends javax.swing.JFrame {

    /**
     * Creates new form frmUser
     */
    public frmUser() {
        initComponents();
        this.setSize(1180,580);
    }
    frmUserConsultar consulta;
    frmUserTreino treino;
    frmUserMensalidade mensalidade;
    frmUserHorario horario;
    frmTrocarSenha senha;
    frmTrocarUser user;
    frmUserExercicios exercico;
    frmPlano plano;
    
     public void exercicio(){
    if (exercico == null){
    exercico = new frmUserExercicios();
    }
    dsk01.add(exercico);
    exercico.setVisible(true);
    exercico.setSize(800,400);
    }
    public void plano(){
    if (plano == null){
    plano = new frmPlano();
    }
    dsk01.add(plano);
    plano.setVisible(true);
    }
    public void user(){
    if (user == null){
    user = new frmTrocarUser();
    }
    dsk01.add(user);
        user.setVisible(true);
    }
    public void senha(){
    if (senha == null){
    senha = new frmTrocarSenha();
    }
    dsk01.add(senha);
    senha.setVisible(true);
    }
     private void treino() {
   if (treino == null){
    treino = new frmUserTreino();
    }
    dsk01.add(treino);
    treino.setVisible(true);
    }
    public void dados(){
    if (consulta == null){
    consulta = new frmUserConsultar();
    }
    dsk01.add(consulta);
    consulta.setVisible(true);
    }
    public void horario(){
    if (horario == null){
    horario = new frmUserHorario();
    }
    dsk01.add(horario);
    horario.setVisible(true);
    }
    public void mensalidade(){
    if (mensalidade == null){
    mensalidade = new frmUserMensalidade();
    }
    dsk01.add(mensalidade);
    mensalidade.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jDialog2 = new javax.swing.JDialog();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jDialog3 = new javax.swing.JDialog();
        dsk01 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mntDados = new javax.swing.JMenuItem();
        mntMensalidade = new javax.swing.JMenuItem();
        mntTreino = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mntHorario = new javax.swing.JMenuItem();
        mntPlano = new javax.swing.JMenuItem();
        mntExercicio = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mntTrocar = new javax.swing.JMenuItem();
        mntSenha = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mntSair = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog3Layout = new javax.swing.GroupLayout(jDialog3.getContentPane());
        jDialog3.getContentPane().setLayout(jDialog3Layout);
        jDialog3Layout.setHorizontalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog3Layout.setVerticalGroup(
            jDialog3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dsk01.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icones/logoBematech.jpg"))); // NOI18N
        jLabel1.setOpaque(true);

        javax.swing.GroupLayout dsk01Layout = new javax.swing.GroupLayout(dsk01);
        dsk01.setLayout(dsk01Layout);
        dsk01Layout.setHorizontalGroup(
            dsk01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 554, Short.MAX_VALUE)
        );
        dsk01Layout.setVerticalGroup(
            dsk01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 442, Short.MAX_VALUE)
        );
        dsk01.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenu1.setText("Pessoal");

        mntDados.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        mntDados.setText("Meus dados");
        mntDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntDadosActionPerformed(evt);
            }
        });
        jMenu1.add(mntDados);

        mntMensalidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        mntMensalidade.setText("Mensalidades");
        mntMensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntMensalidadeActionPerformed(evt);
            }
        });
        jMenu1.add(mntMensalidade);

        mntTreino.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        mntTreino.setText("Treino");
        mntTreino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntTreinoActionPerformed(evt);
            }
        });
        jMenu1.add(mntTreino);
        jMenu1.add(jSeparator1);

        jMenuItem1.setText("Medidas");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Academia");

        mntHorario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        mntHorario.setText("Horarios");
        mntHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntHorarioActionPerformed(evt);
            }
        });
        jMenu2.add(mntHorario);

        mntPlano.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        mntPlano.setText("Planos");
        mntPlano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntPlanoActionPerformed(evt);
            }
        });
        jMenu2.add(mntPlano);

        mntExercicio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        mntExercicio.setText("Exercicios");
        mntExercicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntExercicioActionPerformed(evt);
            }
        });
        jMenu2.add(mntExercicio);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Opções");

        mntTrocar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.CTRL_MASK));
        mntTrocar.setText("Trocar Usuario");
        mntTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntTrocarActionPerformed(evt);
            }
        });
        jMenu3.add(mntTrocar);

        mntSenha.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.CTRL_MASK));
        mntSenha.setText("Trocar Senha");
        mntSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntSenhaActionPerformed(evt);
            }
        });
        jMenu3.add(mntSenha);
        jMenu3.add(jSeparator2);

        mntSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_MASK));
        mntSair.setText("Sair");
        mntSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntSairActionPerformed(evt);
            }
        });
        jMenu3.add(mntSair);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dsk01)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dsk01)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mntMensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntMensalidadeActionPerformed
        // TODO add your handling code here:
        mensalidade();
    }//GEN-LAST:event_mntMensalidadeActionPerformed

    private void mntSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntSenhaActionPerformed
        // TODO add your handling code here:
        senha();
    }//GEN-LAST:event_mntSenhaActionPerformed

    private void mntTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntTrocarActionPerformed
        // TODO add your handling code here:
        user();
    }//GEN-LAST:event_mntTrocarActionPerformed

    private void mntDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntDadosActionPerformed
        // TODO add your handling code here:
        dados();
        
    }//GEN-LAST:event_mntDadosActionPerformed

    private void mntPlanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntPlanoActionPerformed
        // TODO add your handling code here:
        plano();
    }//GEN-LAST:event_mntPlanoActionPerformed

    private void mntHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntHorarioActionPerformed
        // TODO add your handling code here:
       horario();
    }//GEN-LAST:event_mntHorarioActionPerformed

    private void mntTreinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntTreinoActionPerformed
        // TODO add your handling code here:
       treino();
    }//GEN-LAST:event_mntTreinoActionPerformed

    private void mntExercicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntExercicioActionPerformed
        // TODO add your handling code here:
        exercicio();
    }//GEN-LAST:event_mntExercicioActionPerformed

    private void mntSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntSairActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new frmLogar().setVisible(true);
    }//GEN-LAST:event_mntSairActionPerformed

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
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dsk01;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JDialog jDialog3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenuItem mntDados;
    private javax.swing.JMenuItem mntExercicio;
    private javax.swing.JMenuItem mntHorario;
    private javax.swing.JMenuItem mntMensalidade;
    private javax.swing.JMenuItem mntPlano;
    private javax.swing.JMenuItem mntSair;
    private javax.swing.JMenuItem mntSenha;
    private javax.swing.JMenuItem mntTreino;
    private javax.swing.JMenuItem mntTrocar;
    // End of variables declaration//GEN-END:variables

   
}
