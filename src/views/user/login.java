package views.user;

import java.awt.Color;
import java.awt.Cursor;
/**
 *
 * @author joseolinda
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel PainelRoot = new javax.swing.JPanel();
        btnClose = new javax.swing.JLabel();
        psSenha = new javax.swing.JPasswordField();
        txUserMail = new javax.swing.JTextField();
        lbLinkCriarConta = new javax.swing.JLabel();
        lbEntrar = new javax.swing.JLabel();
        lbUserPass = new javax.swing.JLabel();
        lbUserMail = new javax.swing.JLabel();
        lbTituloLogin = new javax.swing.JLabel();
        BtnFazerLogin = new javax.swing.JLabel();
        lbBGLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Login");
        setMaximumSize(new java.awt.Dimension(470, 980));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PainelRoot.setBackground(new Color(0,0,0,0));
        PainelRoot.setName("PainelRoot"); // NOI18N
        PainelRoot.setOpaque(false);
        PainelRoot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnClose.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        btnClose.setForeground(new java.awt.Color(255, 255, 255));
        btnClose.setText("x");
        btnClose.setAlignmentY(0.0F);
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        PainelRoot.add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 20, 30));

        psSenha.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        psSenha.setForeground(new java.awt.Color(130, 70, 117));
        psSenha.setText("jPasswordField1");
        psSenha.setBorder(null);
        psSenha.setOpaque(false);
        PainelRoot.add(psSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, 230, -1));

        txUserMail.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        txUserMail.setForeground(new java.awt.Color(130, 70, 117));
        txUserMail.setText("email@exemplo.com");
        txUserMail.setBorder(null);
        txUserMail.setOpaque(false);
        txUserMail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txUserMailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txUserMailFocusLost(evt);
            }
        });
        PainelRoot.add(txUserMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 220, 40));

        lbLinkCriarConta.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        lbLinkCriarConta.setForeground(new java.awt.Color(102, 102, 102));
        lbLinkCriarConta.setText("Criar nova conta");
        lbLinkCriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbLinkCriarContaMouseClicked(evt);
            }
        });
        PainelRoot.add(lbLinkCriarConta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 600, -1, -1));

        lbEntrar.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        lbEntrar.setForeground(new java.awt.Color(130, 70, 117));
        lbEntrar.setText("Entrar");
        PainelRoot.add(lbEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        lbUserPass.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbUserPass.setForeground(new java.awt.Color(102, 102, 102));
        lbUserPass.setText("Senha");
        PainelRoot.add(lbUserPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, -1, -1));

        lbUserMail.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbUserMail.setForeground(new java.awt.Color(102, 102, 102));
        lbUserMail.setText("E-mail");
        PainelRoot.add(lbUserMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        lbTituloLogin.setFont(new java.awt.Font("Leelawadee UI", 1, 48)); // NOI18N
        lbTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin.setText("<html>\nMyWorld<br>\n<font size=\"5\">Entre. Sinta-se em casa.</font>\n</html>");
        PainelRoot.add(lbTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        BtnFazerLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/btn_login.png"))); // NOI18N
        BtnFazerLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnFazerLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnFazerLoginMouseExited(evt);
            }
        });
        PainelRoot.add(BtnFazerLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, -1, -1));

        lbBGLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/login_screen.png"))); // NOI18N
        lbBGLogin.setToolTipText("");
        PainelRoot.add(lbBGLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(PainelRoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnFazerLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFazerLoginMouseEntered
        // Mudar cor do botão para verde
        BtnFazerLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/btn_login_hover.png")));
        BtnFazerLogin.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_BtnFazerLoginMouseEntered

    private void BtnFazerLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnFazerLoginMouseExited
        // Mudar cor do botão
        BtnFazerLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/images/btn_login.png")));
    }//GEN-LAST:event_BtnFazerLoginMouseExited

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        // TODO add your handling code here:
        this.btnClose.setForeground(new java.awt.Color(229,215,116));
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        // TODO add your handling code here:
         this.btnClose.setForeground(new java.awt.Color(255,255,255));
    }//GEN-LAST:event_btnCloseMouseExited

    private void txUserMailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txUserMailFocusGained
        // TODO add your handling code here:
        this.txUserMail.setText("");
    }//GEN-LAST:event_txUserMailFocusGained

    private void txUserMailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txUserMailFocusLost
        // TODO add your handling code here:
        if(this.txUserMail.getText().equals(""));
        this.txUserMail.setText("Preencha seu email.");
    }//GEN-LAST:event_txUserMailFocusLost

    private void lbLinkCriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbLinkCriarContaMouseClicked
        // TODO add your handling code here:
        this.dispose();
        new CriarConta().setVisible(true);
    }//GEN-LAST:event_lbLinkCriarContaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BtnFazerLogin;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel lbBGLogin;
    private javax.swing.JLabel lbEntrar;
    private javax.swing.JLabel lbLinkCriarConta;
    private javax.swing.JLabel lbTituloLogin;
    private javax.swing.JLabel lbUserMail;
    private javax.swing.JLabel lbUserPass;
    private javax.swing.JPasswordField psSenha;
    private javax.swing.JTextField txUserMail;
    // End of variables declaration//GEN-END:variables
}
