
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


public class FormRegisto extends javax.swing.JFrame {

    /**
     * Creates new form FormRegisto
     */
    public FormRegisto() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctxTelefone = new javax.swing.JTextField();
        ctxMorada = new javax.swing.JTextField();
        ctxNome = new javax.swing.JTextField();
        ctxEmail = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ctxNif = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        ctxRePass = new javax.swing.JPasswordField();
        ctxPass = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        ctxLoginR = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formul??rio de registo de utilizadors");

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("SAIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Email");

        jLabel3.setText("Morada");

        jLabel4.setText("Telefone");

        jLabel5.setText("Password");

        jLabel6.setText("Reescreva Password");

        ctxTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxTelefoneActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("VALIDAR DADOS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("NIF");

        ctxRePass.setText("jPasswordField1");

        ctxPass.setText("jPasswordField2");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/minifaces.png"))); // NOI18N

        ctxLoginR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxLoginRActionPerformed(evt);
            }
        });

        jLabel9.setText("Login");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ctxPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctxRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ctxLoginR)
                            .addComponent(ctxNome, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(ctxEmail)
                            .addComponent(ctxMorada)
                            .addComponent(ctxTelefone)
                            .addComponent(ctxNif))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ctxNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ctxEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ctxMorada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ctxTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(ctxNif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctxLoginR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ctxPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(ctxRePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1)))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login log = new Login();
        this.dispose();             //fecha a janela
        log.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    private void mensagemErro(String erro){
        JOptionPane.showMessageDialog(null, erro, "Erro valida????o", JOptionPane.ERROR_MESSAGE);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String nome = ctxNome.getText();
        String email = ctxEmail.getText();
        String morada = ctxMorada.getText();
        String telefone = ctxTelefone.getText();
        String nif = ctxNif.getText();
        String pass = ctxPass.getText();
        String rePass = ctxRePass.getText();
        String loginR = ctxLoginR.getText();
        
        if (nome.equals("") || email.equals("") || 
            morada.equals("") || telefone.equals("") ||
            nif.equals("") || pass.equals("") ||
            rePass.equals("")){
            mensagemErro("Prenncha todos os campos!");
            
        }else if (!validaNome(nome)){
                mensagemErro("O campo Nome n??o pode ter Numeros, tem de ter 2 ou+ char");
        }else if (!validaEmail(email)){
                mensagemErro("O campo Email inv??lido");
        }else if (morada.length()<6){
                mensagemErro("O campo Morada tem de ter 5 ou+ char");
        }else if(!validaCampoNumerico(telefone)){
                mensagemErro("O campo Telefone tem de ser num??rico e ter 9 digitos");
        }else if(!validaCampoNumerico(nif)){
                mensagemErro("O campo NIF tem de ser num??rico e ter 9 digitos");
        }else if(!validaPassword(pass)){
                mensagemErro("O campo Password: 8char, 1 ou+ Maiusculas, 1 ou+ Minusculas, 1 ou+ Numeros, 1 ou+ char/especiais");
        }else if(!rePass.equals(pass)){
                mensagemErro("O campo Reescreva Password deve se rigual ao campo Password");
        }else if (!validaLoginR(loginR)){
                mensagemErro("O campo Login n??o pode ter Numeros, tem de ter 2 ou+ char");
        }else{
                
            try {
                LigaBD.registaUtilizador(nome, email, morada, Integer.parseInt(telefone), Integer.parseInt(nif), loginR, pass);
            } catch (SQLException ex) {
                Logger.getLogger(FormRegisto.class.getName()).log(Level.SEVERE, null, ex);
            }
                registar(nome,email,morada,telefone,nif,pass,loginR);
                this.dispose();
                Login L = new Login();
                L.setVisible(true);
        }
        
        //nome >= 2 caracteres 
        //email tem de ter 1. ap??s o @
        //morada tem de ter>5 caracteres
        //telefone 9 caracteres que sejam digitos   ***
        //nif 9 caracteres que sejam digitos        ***
        //pass e repass tem de ser iguais
        //pass 8 ou + caracteres, 1 ou + minusculas
        //1 ou + algarismos, 1 ou + maiusculas,
        //1 ou + caracteres especiais
        //login >= 2 caracteres 
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ctxLoginRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxLoginRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxLoginRActionPerformed

    private void ctxTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxTelefoneActionPerformed

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
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormRegisto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormRegisto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ctxEmail;
    private javax.swing.JTextField ctxLoginR;
    private javax.swing.JTextField ctxMorada;
    private javax.swing.JTextField ctxNif;
    private javax.swing.JTextField ctxNome;
    private javax.swing.JPasswordField ctxPass;
    private javax.swing.JPasswordField ctxRePass;
    private javax.swing.JTextField ctxTelefone;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    private boolean validaCampoNumerico(String v) {
        int x, contador=0, t = v.length();
        char c;
        
        if (t!=9)
            return false;
        else{
            for(x=0;x<t;x++){
                c = v.charAt(x);
                if (isDigit(c))
                    contador++;
            }
            
            if (t!=contador)
                return false;         
        }
        return true;
    }

    private boolean validaNome(String v) {
        int x, contador=0, t = v.length();
        char c;
        
        if (v.length()<2)
            return false;
        else{
            for(x=0;x<t;x++){
                c = v.charAt(x);
                if (c==' ' && x!=0){
                    contador++;
                    continue;
                }
                if (isLetter(c))
                    contador++;
            }
            if (t!=contador)
                return false;
        }
        return true;
    }

    private boolean validaEmail(String m) {
        int x,i;
        
        int k = m.indexOf('@');

        int p = m.indexOf('.',k);

        int kk = m.indexOf('@',(k+1));

        
        
        i = m.indexOf(' ');
        if(i!=-1)
            return false;
        
        
        if (k<0 || p<0){
            return false;
        }else if (kk>k)
            return false;
        else if(k<p)
            return true;
        else
            return false;     
    }

    private boolean validaPassword(String pss) {

        int x,contadorL=0,contadorU=0,contadorE=0,contadorD=0;
        char c;
        
        if (pss.length()<8)
            return false;
            
        for (x=0;x<pss.length();x++){
            c = pss.charAt(x);
            
            if (c==' ')
                return false;
            if (isLowerCase(c))
                contadorL++;
            if (isUpperCase(c))
                contadorU++;
            if (isDigit(c))
                contadorD++;
            if (!isLetter(c) && !isDigit(c))
                contadorE++;   
        }
        
        if ((contadorL>0) && (contadorU>0) && (contadorD>0) && (contadorE>0))
            return true;
        else
            return false;
    }

    private void registar(String nome, String email, String morada, String telefone, String nif, String pass, String loginR) {
        String nomef;
        
        nomef = loginR+".txt";

        File ficheiro = new File (nomef);
        if(!ficheiro.exists()){
            try {
                ficheiro.createNewFile();
                
                FileWriter fw = new FileWriter(ficheiro,true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(pass);
                bw.newLine();
                bw.write(loginR);
                bw.newLine();
                bw.write(nome);
                bw.newLine();
                bw.write(email);
                bw.newLine();
                bw.write(morada);
                bw.newLine();
                bw.write(telefone);
                bw.newLine();
                bw.write(nif);
                bw.newLine();
                
                bw.close();
                fw.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private boolean validaLoginR(String v) {
        int x, contador=0, t = v.length();
        char c;
        
        if (v.length()<2)
            return false;
        else{
            for(x=0;x<t;x++){
                c = v.charAt(x);
                if (c==' ' && x!=0){
                    contador++;
                    continue;
                }
                if (isLetter(c))
                    contador++;
            }
            if (t!=contador)
                return false;
        }
        return true;
    }

   

}
