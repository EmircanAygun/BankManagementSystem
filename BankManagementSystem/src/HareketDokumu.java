import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class HareketDokumu extends javax.swing.JFrame {

    
    public HareketDokumu() {
        initComponents();
        //Yukle();
    }
    
    public String Tc;
    public String MNO;

    public HareketDokumu(String m1, String m2) {
        jLabel1.setText(m1);
        jLabel2.setText(m2);
        this.MNO=jLabel1.getText();
        this.Tc=jLabel2.getText();
        Yukle();
    }
    
    private void Yukle(  )
    {
    Baglanti baglanti=new Baglanti(  );
    Connection conn=baglanti.baglan(  );
        
        try{
            Statement st=conn.createStatement(  );
            ResultSet rs=st.executeQuery( "SELECT * FROM banka Where M_No='" + this.MNO + "'" );
            DefaultTableModel DTM = new DefaultTableModel(  );

            jTable1.setModel( DTM );
            
            DTM.addColumn( "Müşteri No" );
            DTM.addColumn( "Ad Soyad" );
            DTM.addColumn( "Şube" );
            DTM.addColumn( "İşlem" );
            DTM.addColumn( "Tarih" );

            while( rs.next(  ) ){
                Statement st1=conn.createStatement(  );
                ResultSet rs1=st1.executeQuery( "SELECT * FROM musteriler Where M_No='" + Integer.parseInt( rs.getString( "M_No" ) ) + "'" );
                rs1.next(  );
                
                Statement st2=conn.createStatement(  );
                ResultSet rs2=st2.executeQuery( "SELECT * FROM subeler Where SubeKodu='" + Integer.parseInt( rs.getString( "SubeKodu" ) )+ "'"  );
                rs2.next(  );
                
                Statement st3=conn.createStatement(  );
                ResultSet rs3=st3.executeQuery( "SELECT * FROM islemler Where IslemNo='" + Integer.parseInt( rs.getString( "IslemNo" ) )+ "'"  );
                rs3.next(  );
                
            DTM.addRow( new String[]{rs.getString( "M_NO" ), rs1.getString( "AdSoyad" ), rs2.getString( "SubeAdi" ), rs3.getString( "IslemAdi" ), rs.getString( "Tarih" )} );
            
            rs3.close(  );
            st3.close(  );
            rs2.close(  );
            st2.close(  );
            rs1.close(  );
            st1.close(  );
            }
            rs.close(  );
            st.close(  );
            conn.close(  );
            
        }catch( Exception exp ){
            JOptionPane.showMessageDialog( rootPane, exp.getMessage(  ) );
        }
    }
    private void formWindowOpened( java.awt.event.WindowEvent evt ) {
        // TODO add your handling code here:
        Yukle(  );
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Müşteri No", "Ad Soyad", "Şube", "İşlem", "Tarih"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HareketDokumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HareketDokumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HareketDokumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HareketDokumu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HareketDokumu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
