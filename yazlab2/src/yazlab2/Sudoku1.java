/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package yazlab2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Eliz
 */
public class Sudoku1 extends javax.swing.JFrame {

    private static int[][] matris1 = new int [9][9];
    private static int[][] matris2 = new int [9][9];
    private static int[][] matris3 = new int [9][9];
    private static int[][] matris4 = new int [9][9];
    private static int[][] matris5 = new int [9][9];
    private static String s;
    private static String s1;
    /**
     * Creates new form Sudoku1
     */
    public Sudoku1(int[][] matris1,int[][] matris2,int[][] matris3,int[][] matris4,int[][] matris5,String s,String s1) {
        this.matris1=matris1;
        this.matris2=matris2;
        this.matris3=matris3;
        this.matris4=matris4;
        this.matris5=matris5;
        this.s=s;
        this.s1=s1;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Grafiği Göster");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(587, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jButton1)
                .addContainerGap(320, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          Grafik g= new Grafik(s,s1);
        g.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Sudoku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sudoku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sudoku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sudoku1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sudoku1(matris1,matris2,matris3,matris4,matris5,s,s1).setVisible(false);
            }
        });
    }
public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d =(Graphics2D) g;
        
        g2d.translate(5,10); 
                
                for(int x=0; x<9;x++) {
			for(int y=0;y<9;y++) {
                        g2d.setColor(Color.white);//mat1
			g2d.fillRect(30+(y*30), 30+(x*30), 30,30);                
                        g2d.setColor(Color.BLACK);
                        g2d.drawRect(30+(y*30), 30+(x*30), 30, 30);
                        
                        g2d.setColor(Color.white);//mat2 
			g2d.fillRect(390+(y*30), 30+(x*30), 30,30);               
                        g2d.setColor(Color.BLACK);
                        g2d.drawRect(390+(y*30), 30+(x*30), 30, 30);
                        
                        g2d.setColor(Color.white);//mat3
			g2d.fillRect(210+(y*30), 210+(x*30), 30,30);                
                        g2d.setColor(Color.BLACK);
                        g2d.drawRect(210+(y*30), 210+(x*30), 30, 30); 

                        g2d.setColor(Color.white);//mat4
			g2d.fillRect(30+(y*30), 390+(x*30), 30,30);  
                        g2d.setColor(Color.BLACK);
                        g2d.drawRect(30+(y*30), 390+(x*30), 30, 30);
                        
                        g2d.setColor(Color.white);//mat5 
                        g2d.fillRect(390+(y*30), 390+(x*30), 30,30);
                        g2d.setColor(Color.BLACK);
                        g2d.drawRect(390+(y*30), 390+(x*30), 30, 30);
			}
		}  
             for(int k=0;k<9;k++){
    for(int l=0;l<9;l++){
        if(this.matris1[l][k]!=0){
      g.setColor(Color.BLACK);
         g.drawString(String.valueOf(this.matris1[l][k]), 40+(k*30), 50+(l*30)); 
        }
    if(this.matris2[l][k]!=0){
      g.setColor(Color.BLACK);
         g.drawString(String.valueOf(this.matris2[l][k]), 400+(k*30), 50+(l*30)); 
        }
    
    if(this.matris3[l][k]!=0){
      g.setColor(Color.BLACK);
         g.drawString(String.valueOf(this.matris3[l][k]), 220+(k*30), 230+(l*30)); 
        }
    if(this.matris4[l][k]!=0){
      g.setColor(Color.BLACK);
         g.drawString(String.valueOf(this.matris4[l][k]), 40+(k*30), 410+(l*30)); 
        }
    if(this.matris5[l][k]!=0){
      g.setColor(Color.BLACK);
         g.drawString(String.valueOf(this.matris5[l][k]), 400+(k*30), 410+(l*30)); 
        }
    
    
    }
             
        
   }
        
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
