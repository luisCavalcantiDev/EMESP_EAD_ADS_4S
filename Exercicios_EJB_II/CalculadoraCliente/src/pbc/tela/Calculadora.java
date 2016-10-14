/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pbc.tela;

import java.math.BigDecimal;
import java.math.RoundingMode;
import javax.naming.InitialContext;
import pbc.ejb.CalculadoraRemote;

/**
 *
 * @author sakurai
 */
public class Calculadora extends javax.swing.JFrame {
  
  private double valor1 = 0;
  private char operacao = ' ';
  
  /**
   * Creates new form Calculadora
   */
  public Calculadora() {
    initComponents();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    resultado = new javax.swing.JLabel();
    botao7 = new javax.swing.JButton();
    botao8 = new javax.swing.JButton();
    botao9 = new javax.swing.JButton();
    botaoSomar = new javax.swing.JButton();
    botao4 = new javax.swing.JButton();
    botao5 = new javax.swing.JButton();
    botao6 = new javax.swing.JButton();
    botaoSubtrair = new javax.swing.JButton();
    botao1 = new javax.swing.JButton();
    botao2 = new javax.swing.JButton();
    botao3 = new javax.swing.JButton();
    botaoMultiplicar = new javax.swing.JButton();
    botaoLimpar = new javax.swing.JButton();
    botao0 = new javax.swing.JButton();
    botaoCalcular = new javax.swing.JButton();
    botaoDividir = new javax.swing.JButton();
    botaoSeparador = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Calculadora");

    resultado.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

    botao7.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botao7.setText("7");
    botao7.setMaximumSize(new java.awt.Dimension(100, 100));
    botao7.setMinimumSize(new java.awt.Dimension(100, 100));
    botao7.setPreferredSize(new java.awt.Dimension(100, 100));
    botao7.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botao7ActionPerformed(evt);
      }
    });

    botao8.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botao8.setText("8");
    botao8.setMaximumSize(new java.awt.Dimension(100, 100));
    botao8.setMinimumSize(new java.awt.Dimension(100, 100));
    botao8.setPreferredSize(new java.awt.Dimension(100, 100));
    botao8.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botao8ActionPerformed(evt);
      }
    });

    botao9.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botao9.setText("9");
    botao9.setMaximumSize(new java.awt.Dimension(100, 100));
    botao9.setMinimumSize(new java.awt.Dimension(100, 100));
    botao9.setPreferredSize(new java.awt.Dimension(100, 100));
    botao9.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botao9ActionPerformed(evt);
      }
    });

    botaoSomar.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botaoSomar.setText("+");
    botaoSomar.setMaximumSize(new java.awt.Dimension(100, 100));
    botaoSomar.setMinimumSize(new java.awt.Dimension(100, 100));
    botaoSomar.setPreferredSize(new java.awt.Dimension(100, 100));
    botaoSomar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botaoSomarActionPerformed(evt);
      }
    });

    botao4.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botao4.setText("4");
    botao4.setMaximumSize(new java.awt.Dimension(100, 100));
    botao4.setMinimumSize(new java.awt.Dimension(100, 100));
    botao4.setPreferredSize(new java.awt.Dimension(100, 100));
    botao4.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botao4ActionPerformed(evt);
      }
    });

    botao5.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botao5.setText("5");
    botao5.setMaximumSize(new java.awt.Dimension(100, 100));
    botao5.setMinimumSize(new java.awt.Dimension(100, 100));
    botao5.setPreferredSize(new java.awt.Dimension(100, 100));
    botao5.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botao5ActionPerformed(evt);
      }
    });

    botao6.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botao6.setText("6");
    botao6.setMaximumSize(new java.awt.Dimension(100, 100));
    botao6.setMinimumSize(new java.awt.Dimension(100, 100));
    botao6.setPreferredSize(new java.awt.Dimension(100, 100));
    botao6.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botao6ActionPerformed(evt);
      }
    });

    botaoSubtrair.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botaoSubtrair.setText("-");
    botaoSubtrair.setMaximumSize(new java.awt.Dimension(100, 100));
    botaoSubtrair.setMinimumSize(new java.awt.Dimension(100, 100));
    botaoSubtrair.setPreferredSize(new java.awt.Dimension(100, 100));
    botaoSubtrair.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botaoSubtrairActionPerformed(evt);
      }
    });

    botao1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botao1.setText("1");
    botao1.setMaximumSize(new java.awt.Dimension(100, 100));
    botao1.setMinimumSize(new java.awt.Dimension(100, 100));
    botao1.setPreferredSize(new java.awt.Dimension(100, 100));
    botao1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botao1ActionPerformed(evt);
      }
    });

    botao2.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botao2.setText("2");
    botao2.setMaximumSize(new java.awt.Dimension(100, 100));
    botao2.setMinimumSize(new java.awt.Dimension(100, 100));
    botao2.setPreferredSize(new java.awt.Dimension(100, 100));
    botao2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botao2ActionPerformed(evt);
      }
    });

    botao3.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botao3.setText("3");
    botao3.setMaximumSize(new java.awt.Dimension(100, 100));
    botao3.setMinimumSize(new java.awt.Dimension(100, 100));
    botao3.setPreferredSize(new java.awt.Dimension(100, 100));
    botao3.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botao3ActionPerformed(evt);
      }
    });

    botaoMultiplicar.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botaoMultiplicar.setText("*");
    botaoMultiplicar.setMaximumSize(new java.awt.Dimension(100, 100));
    botaoMultiplicar.setMinimumSize(new java.awt.Dimension(100, 100));
    botaoMultiplicar.setPreferredSize(new java.awt.Dimension(100, 100));
    botaoMultiplicar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botaoMultiplicarActionPerformed(evt);
      }
    });

    botaoLimpar.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botaoLimpar.setText("C");
    botaoLimpar.setMaximumSize(new java.awt.Dimension(100, 100));
    botaoLimpar.setMinimumSize(new java.awt.Dimension(100, 100));
    botaoLimpar.setPreferredSize(new java.awt.Dimension(100, 100));
    botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botaoLimparActionPerformed(evt);
      }
    });

    botao0.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botao0.setText("0");
    botao0.setMaximumSize(new java.awt.Dimension(100, 100));
    botao0.setMinimumSize(new java.awt.Dimension(100, 100));
    botao0.setPreferredSize(new java.awt.Dimension(100, 100));
    botao0.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botao0ActionPerformed(evt);
      }
    });

    botaoCalcular.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botaoCalcular.setText("=");
    botaoCalcular.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botaoCalcularActionPerformed(evt);
      }
    });

    botaoDividir.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botaoDividir.setText("/");
    botaoDividir.setMaximumSize(new java.awt.Dimension(100, 100));
    botaoDividir.setMinimumSize(new java.awt.Dimension(100, 100));
    botaoDividir.setPreferredSize(new java.awt.Dimension(100, 100));
    botaoDividir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botaoDividirActionPerformed(evt);
      }
    });

    botaoSeparador.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
    botaoSeparador.setText(",");
    botaoSeparador.setMaximumSize(new java.awt.Dimension(100, 100));
    botaoSeparador.setMinimumSize(new java.awt.Dimension(100, 100));
    botaoSeparador.setPreferredSize(new java.awt.Dimension(100, 100));
    botaoSeparador.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botaoSeparadorActionPerformed(evt);
      }
    });

    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(resultado, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
        .add(layout.createSequentialGroup()
          .add(botao7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
          .add(botao8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
          .add(botao9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
          .add(botaoSomar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(layout.createSequentialGroup()
          .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
              .add(botao4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
              .add(botao5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
            .add(layout.createSequentialGroup()
              .add(botao1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
              .add(botao2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
          .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
          .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(botao6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(botao3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
          .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(botaoMultiplicar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
            .add(botaoSubtrair, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        .add(layout.createSequentialGroup()
          .add(botaoLimpar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
          .add(botao0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
          .add(botaoSeparador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
          .add(botaoDividir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .add(botaoCalcular, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
      .add(layout.createSequentialGroup()
        .add(resultado, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(botao7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botao8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botao9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botaoSomar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(botao4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botao5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botao6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botaoSubtrair, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(botao1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botao2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botao3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botaoMultiplicar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
          .add(botaoLimpar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botao0, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botaoDividir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
          .add(botaoSeparador, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .add(botaoCalcular))
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void botao7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao7ActionPerformed
    resultado.setText(resultado.getText() + "7");
  }//GEN-LAST:event_botao7ActionPerformed

  private void botao8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao8ActionPerformed
    resultado.setText(resultado.getText() + "8");
  }//GEN-LAST:event_botao8ActionPerformed

  private void botao9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao9ActionPerformed
    resultado.setText(resultado.getText() + "9");
  }//GEN-LAST:event_botao9ActionPerformed

  private void botao4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao4ActionPerformed
    resultado.setText(resultado.getText() + "4");
  }//GEN-LAST:event_botao4ActionPerformed

  private void botao5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao5ActionPerformed
    resultado.setText(resultado.getText() + "5");
  }//GEN-LAST:event_botao5ActionPerformed

  private void botao6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao6ActionPerformed
    resultado.setText(resultado.getText() + "6");
  }//GEN-LAST:event_botao6ActionPerformed

  private void botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao1ActionPerformed
    resultado.setText(resultado.getText() + "1");
  }//GEN-LAST:event_botao1ActionPerformed

  private void botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao2ActionPerformed
    resultado.setText(resultado.getText() + "2");
  }//GEN-LAST:event_botao2ActionPerformed

  private void botao3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao3ActionPerformed
    resultado.setText(resultado.getText() + "3");
  }//GEN-LAST:event_botao3ActionPerformed

  private void botao0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao0ActionPerformed
    resultado.setText(resultado.getText() + "0");
  }//GEN-LAST:event_botao0ActionPerformed

  private void botaoSeparadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSeparadorActionPerformed
    //Adiciona virgula caso ainda não tenha
    if(!resultado.getText().contains(",")) {
      resultado.setText(resultado.getText() + ",");
    }
  }//GEN-LAST:event_botaoSeparadorActionPerformed

  private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
    limparDisplay();
    valor1 = 0;
    operacao = ' ';
  }//GEN-LAST:event_botaoLimparActionPerformed

  private void botaoSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSomarActionPerformed
    valor1 = pegarValorDisplay();
    limparDisplay();
    operacao = '+';
  }//GEN-LAST:event_botaoSomarActionPerformed

  private void botaoSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSubtrairActionPerformed
    valor1 = pegarValorDisplay();
    limparDisplay();
    operacao = '-';
  }//GEN-LAST:event_botaoSubtrairActionPerformed

  private void botaoMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoMultiplicarActionPerformed
    valor1 = pegarValorDisplay();
    limparDisplay();
    operacao = '*';
  }//GEN-LAST:event_botaoMultiplicarActionPerformed

  private void botaoDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDividirActionPerformed
    valor1 = pegarValorDisplay();
    limparDisplay();
    operacao = '/';
  }//GEN-LAST:event_botaoDividirActionPerformed

  private void botaoCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCalcularActionPerformed
    double valor2 = pegarValorDisplay();
    double calculo = 0.0;
    CalculadoraRemote ejb = buscarEJB();
    if(operacao == '+') {
      calculo = ejb.somar(valor1, valor2);
    } else if(operacao == '-') {
      calculo = ejb.subtrair(valor1, valor2);
    } else if(operacao == '*') {
      calculo = ejb.multiplicar(valor1, valor2);
    } else if(operacao == '/') {
      calculo = ejb.dividir(valor1, valor2);
    }
    
    //Arredonda para duas casas.
    BigDecimal total = new BigDecimal(calculo).setScale(2, RoundingMode.HALF_UP);
    //Apresenta o total no resultado.
    resultado.setText(total.toString().replaceAll("\\.", ","));
  }//GEN-LAST:event_botaoCalcularActionPerformed

  private double pegarValorDisplay() {
    //Troca a virgula por ponto antes de converter o valor.
    return Double.parseDouble(resultado.getText().replaceAll(",", "."));
  }
  
  private void limparDisplay() {
    resultado.setText("");
  }
  
  private CalculadoraRemote buscarEJB() {
    try {
      InitialContext ctx = new InitialContext();
      return (CalculadoraRemote) ctx.lookup("pbc.ejb.CalculadoraRemote");
    } catch (Exception e) {
      e.printStackTrace();
      return null;
    }
  }
  
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
      java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new Calculadora().setVisible(true);
      }
    });
  }
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton botao0;
  private javax.swing.JButton botao1;
  private javax.swing.JButton botao2;
  private javax.swing.JButton botao3;
  private javax.swing.JButton botao4;
  private javax.swing.JButton botao5;
  private javax.swing.JButton botao6;
  private javax.swing.JButton botao7;
  private javax.swing.JButton botao8;
  private javax.swing.JButton botao9;
  private javax.swing.JButton botaoCalcular;
  private javax.swing.JButton botaoDividir;
  private javax.swing.JButton botaoLimpar;
  private javax.swing.JButton botaoMultiplicar;
  private javax.swing.JButton botaoSeparador;
  private javax.swing.JButton botaoSomar;
  private javax.swing.JButton botaoSubtrair;
  private javax.swing.JLabel resultado;
  // End of variables declaration//GEN-END:variables
}
