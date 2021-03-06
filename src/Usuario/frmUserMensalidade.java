/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;


import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Robert
 */
public class frmUserMensalidade extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmUserMensalidade
     */
    public frmUserMensalidade() {
        initComponents();
    }
    Conexao_bd bd = new Conexao_bd();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMensalidades = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btnConsultar.setText("Consultar");
        btnConsultar.setToolTipText("");
        btnConsultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tblMensalidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblMensalidades.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMensalidadesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMensalidades);

        jLabel2.setText("Nome");
        jLabel2.setToolTipText("");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtNome.setEditable(false);
        txtNome.setBackground(new java.awt.Color(255, 255, 255));

        lblCPF.setText("CPF");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(lblCPF)
                    .addGap(37, 37, 37)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(54, 54, 54)
                    .addComponent(jLabel2)
                    .addGap(43, 43, 43)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                    .addComponent(btnConsultar)
                    .addGap(72, 72, 72))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCPF)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(btnConsultar))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        // buscarnome();
        String sql;
        sql = "select a.janeiro,a.fevereiro,a.marco,a.abril,"
        + "a.maio,a.junho,a.julho,a.agosto,a.setembro,"
        + "a.outubro,a.novembro,a.dezembro,c.valor,c.descricao,b.nome as nome"
        + " from mensalidades as a inner join cliente b inner join planos c "
        + " on a.cpf= b.cpf and b.cod_plano = c.cod_plano and b.cpf='" +  txtCpf.getText() + "';";
        //buscarnome();

        try{
            ResultSet rs = bd.executarconsulta(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int num_coluna = rsmd.getColumnCount();
            DefaultTableModel pesq_pag = new DefaultTableModel();
            this.tblMensalidades.setModel(pesq_pag);

            for(int x=1; x <= num_coluna-3 ; x++){
                pesq_pag.addColumn(rsmd.getColumnLabel(x));
            }

            while(rs.next()){

              
                txtNome.setText(rs.getString("nome"));
                

                Object [] file = new Object[num_coluna];

                for(int y=0 ; y < num_coluna ; y++)
                {
                    file[y] = rs.getObject(y+1);
                }
                pesq_pag.addRow(file);
            }

        }
        catch(SQLException ex) {
            System.out.println("Erro na consulta");
            System.out.println(sql);

        }

    }//GEN-LAST:event_btnConsultarActionPerformed

    private void tblMensalidadesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMensalidadesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblMensalidadesMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConsultar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JTable tblMensalidades;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
