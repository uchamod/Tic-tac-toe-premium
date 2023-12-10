/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xoxprimum;

import java.awt.Color;
import java.util.Random;
import javax.swing.JButton;

/**
 *
 * @author Youth
 */
public final class xoxframe extends javax.swing.JFrame {

    Random ran = new Random();
    boolean check;

    public void turn() {
        if (ran.nextInt(2) == 1) {
            check = true;
            lbl1.setText("X-Turn");
        } else {
            check = false;
            lbl1.setText("O-Turn");
        }
    }

    public void select() {
        //horizontal side
        if (but1.getText() == "X" && but2.getText() == "O" && but3.getText() == "X") {
            win(but1, but2, but3);
        }
        if (but2.getText() == "X" && but3.getText() == "O" && but4.getText() == "X") {
            win(but2, but3, but4);
        }
        if (but5.getText() == "X" && but6.getText() == "O" && but7.getText() == "X") {
            win(but5, but6, but7);
        }
        if (but6.getText() == "X" && but7.getText() == "O" && but8.getText() == "X") {
            win(but6, but7, but8);
        }
        if (but9.getText() == "X" && but10.getText() == "O" && but11.getText() == "X") {
            win(but9, but10, but11);
        }
        if (but10.getText() == "X" && but11.getText() == "O" && but12.getText() == "X") {
            win(but10, but11, but12);
        }
        if (but13.getText() == "X" && but14.getText() == "O" && but15.getText() == "X") {
            win(but13, but14, but15);
        }
        if (but14.getText() == "X" && but15.getText() == "O" && but16.getText() == "X") {
            win(but14, but15, but16);
        }

        //vertical side
        if (but1.getText() == "X" && but5.getText() == "O" && but9.getText() == "X") {
            win(but1, but5, but9);
        }
        if (but5.getText() == "X" && but9.getText() == "O" && but13.getText() == "X") {
            win(but5, but9, but13);
        }
        if (but2.getText() == "X" && but6.getText() == "O" && but10.getText() == "X") {
            win(but2, but6, but10);
        }
        if (but6.getText() == "X" && but10.getText() == "O" && but14.getText() == "X") {
            win(but6, but10, but14);
        }
        if (but3.getText() == "X" && but7.getText() == "O" && but11.getText() == "X") {
            win(but3, but7, but11);
        }
        if (but7.getText() == "X" && but11.getText() == "O" && but15.getText() == "X") {
            win(but7, but11, but15);
        }
        if (but4.getText() == "X" && but8.getText() == "O" && but12.getText() == "X") {
            win(but4, but8, but12);
        }
        if (but8.getText() == "X" && but12.getText() == "O" && but16.getText() == "X") {
            win(but8, but12, but16);
        }

        //diaganol lines
        if (but1.getText() == "X" && but6.getText() == "O" && but11.getText() == "X") {
            win(but1, but6, but11);
        }
        if (but3.getText() == "X" && but6.getText() == "O" && but9.getText() == "X") {
            win(but3, but6, but9);
        }
        if (but2.getText() == "X" && but7.getText() == "O" && but12.getText() == "X") {
            win(but2, but7, but12);
        }
        if (but4.getText() == "X" && but7.getText() == "O" && but10.getText() == "X") {
            win(but4, but7, but10);
        }
        if (but5.getText() == "X" && but10.getText() == "O" && but15.getText() == "X") {
            win(but5, but10, but15);
        }
        if (but7.getText() == "X" && but10.getText() == "O" && but13.getText() == "X") {
            win(but7, but10, but13);
        }
        if (but6.getText() == "X" && but11.getText() == "O" && but16.getText() == "X") {
            win(but6, but11, but16);
        }
        if (but8.getText() == "X" && but11.getText() == "O" && but14.getText() == "X") {
            win(but8, but11, but14);
        }
    }

    public void win(JButton a, JButton b, JButton c) {
        a.setBackground(Color.GREEN);
        b.setBackground(Color.GREEN);
        c.setBackground(Color.GREEN);

        if (lbl1.getText() == "X-Turn") {
            lbl1.setText("X-Won");

        } else {
            lbl1.setText("O-won");
        }
        but1.setEnabled(false);
        but2.setEnabled(false);
        but3.setEnabled(false);
        but4.setEnabled(false);
        but5.setEnabled(false);
        but6.setEnabled(false);
        but7.setEnabled(false);
        but8.setEnabled(false);
        but9.setEnabled(false);
        but10.setEnabled(false);
        but11.setEnabled(false);
        but12.setEnabled(false);
        but13.setEnabled(false);
        but14.setEnabled(false);
        but15.setEnabled(false);
        but16.setEnabled(false);
    }

    public xoxframe() {
        initComponents();
        turn();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        but1 = new javax.swing.JButton();
        but2 = new javax.swing.JButton();
        but3 = new javax.swing.JButton();
        but4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        but5 = new javax.swing.JButton();
        but6 = new javax.swing.JButton();
        but7 = new javax.swing.JButton();
        but8 = new javax.swing.JButton();
        but9 = new javax.swing.JButton();
        but10 = new javax.swing.JButton();
        but11 = new javax.swing.JButton();
        but12 = new javax.swing.JButton();
        but13 = new javax.swing.JButton();
        but14 = new javax.swing.JButton();
        but15 = new javax.swing.JButton();
        but16 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);

        but1.setBackground(new java.awt.Color(255, 255, 255));
        but1.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but1.setPreferredSize(new java.awt.Dimension(115, 115));
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });

        but2.setBackground(new java.awt.Color(255, 255, 255));
        but2.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but2.setPreferredSize(new java.awt.Dimension(115, 115));
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });

        but3.setBackground(new java.awt.Color(255, 255, 255));
        but3.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but3.setPreferredSize(new java.awt.Dimension(115, 115));
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });

        but4.setBackground(new java.awt.Color(255, 255, 255));
        but4.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but4.setPreferredSize(new java.awt.Dimension(115, 115));
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/xoxprimum/tic-tAc-toe.png"))); // NOI18N

        lbl1.setBackground(new java.awt.Color(51, 51, 51));
        lbl1.setFont(new java.awt.Font("Times New Roman", 0, 45)); // NOI18N
        lbl1.setForeground(new java.awt.Color(0, 255, 0));
        lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl1.setOpaque(true);
        lbl1.setPreferredSize(new java.awt.Dimension(475, 70));

        but5.setBackground(new java.awt.Color(255, 255, 255));
        but5.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but5.setPreferredSize(new java.awt.Dimension(115, 115));
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });

        but6.setBackground(new java.awt.Color(255, 255, 255));
        but6.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but6.setPreferredSize(new java.awt.Dimension(115, 115));
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });

        but7.setBackground(new java.awt.Color(255, 255, 255));
        but7.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but7.setPreferredSize(new java.awt.Dimension(115, 115));
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });

        but8.setBackground(new java.awt.Color(255, 255, 255));
        but8.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but8.setPreferredSize(new java.awt.Dimension(115, 115));
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });

        but9.setBackground(new java.awt.Color(255, 255, 255));
        but9.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but9.setPreferredSize(new java.awt.Dimension(115, 115));
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });

        but10.setBackground(new java.awt.Color(255, 255, 255));
        but10.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but10.setPreferredSize(new java.awt.Dimension(115, 115));
        but10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but10ActionPerformed(evt);
            }
        });

        but11.setBackground(new java.awt.Color(255, 255, 255));
        but11.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but11.setPreferredSize(new java.awt.Dimension(115, 115));
        but11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but11ActionPerformed(evt);
            }
        });

        but12.setBackground(new java.awt.Color(255, 255, 255));
        but12.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but12.setPreferredSize(new java.awt.Dimension(115, 115));
        but12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but12ActionPerformed(evt);
            }
        });

        but13.setBackground(new java.awt.Color(255, 255, 255));
        but13.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but13.setPreferredSize(new java.awt.Dimension(115, 115));
        but13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but13ActionPerformed(evt);
            }
        });

        but14.setBackground(new java.awt.Color(255, 255, 255));
        but14.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but14.setPreferredSize(new java.awt.Dimension(115, 115));
        but14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but14ActionPerformed(evt);
            }
        });

        but15.setBackground(new java.awt.Color(255, 255, 255));
        but15.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but15.setPreferredSize(new java.awt.Dimension(115, 115));
        but15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but15ActionPerformed(evt);
            }
        });

        but16.setBackground(new java.awt.Color(255, 255, 255));
        but16.setFont(new java.awt.Font("Kristen ITC", 1, 60)); // NOI18N
        but16.setPreferredSize(new java.awt.Dimension(115, 115));
        but16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but16ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1.setFont(new java.awt.Font("Jokerman", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Refresh");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(51, 51, 51));
        jLabel4.setFont(new java.awt.Font("Jokerman", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 204, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Exit");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.setOpaque(true);
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(but10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(but11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(but12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(but13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(but15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(but14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(but16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(lbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(but4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(but16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel4MouseClicked

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
        if (check == true) {
            but1.setForeground(Color.red);
            but1.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but1.setForeground(Color.BLUE);
            but1.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
        if (check == true) {
            but2.setForeground(Color.red);
            but2.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but2.setForeground(Color.BLUE);
            but2.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
        if (check == true) {
            but3.setForeground(Color.red);
            but3.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but3.setForeground(Color.BLUE);
            but3.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
        if (check == true) {
            but4.setForeground(Color.red);
            but4.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but4.setForeground(Color.BLUE);
            but4.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
        if (check == true) {
            but5.setForeground(Color.red);
            but5.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but5.setForeground(Color.BLUE);
            but5.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
        if (check == true) {
            but6.setForeground(Color.red);
            but6.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but6.setForeground(Color.BLUE);
            but6.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
        if (check == true) {
            but7.setForeground(Color.red);
            but7.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but7.setForeground(Color.BLUE);
            but7.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
        if (check == true) {
            but8.setForeground(Color.red);
            but8.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but8.setForeground(Color.BLUE);
            but8.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
        if (check == true) {
            but9.setForeground(Color.red);
            but9.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but9.setForeground(Color.BLUE);
            but9.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but9ActionPerformed

    private void but10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but10ActionPerformed
        if (check == true) {
            but10.setForeground(Color.red);
            but10.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but10.setForeground(Color.BLUE);
            but10.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but10ActionPerformed

    private void but11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but11ActionPerformed
        if (check == true) {
            but11.setForeground(Color.red);
            but11.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but11.setForeground(Color.BLUE);
            but11.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but11ActionPerformed

    private void but12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but12ActionPerformed
        if (check == true) {
            but12.setForeground(Color.red);
            but12.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but12.setForeground(Color.BLUE);
            but12.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but12ActionPerformed

    private void but13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but13ActionPerformed
        if (check == true) {
            but13.setForeground(Color.red);
            but13.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but13.setForeground(Color.BLUE);
            but13.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but13ActionPerformed

    private void but14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but14ActionPerformed
        if (check == true) {
            but14.setForeground(Color.red);
            but14.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but14.setForeground(Color.BLUE);
            but14.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but14ActionPerformed

    private void but15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but15ActionPerformed
        if (check == true) {
            but15.setForeground(Color.red);
            but15.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but15.setForeground(Color.BLUE);
            but15.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but15ActionPerformed

    private void but16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but16ActionPerformed
        if (check == true) {
            but16.setForeground(Color.red);
            but16.setText("X");
            check = false;
            select();
            if (lbl1.getText() == "X-Turn") {
                lbl1.setText("O-Turn");
            }
        } else {
            but16.setForeground(Color.BLUE);
            but16.setText("O");
            check = true;
            select();
            if (lbl1.getText() == "O-Turn") {
                lbl1.setText("X-Turn");
            }
        }
    }//GEN-LAST:event_but16ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked

        //clear buttons
        but1.setText("");
        but2.setText("");
        but3.setText("");
        but4.setText("");
        but5.setText("");
        but6.setText("");
        but7.setText("");
        but8.setText("");
        but9.setText("");
        but10.setText("");
        but11.setText("");
        but12.setText("");
        but13.setText("");
        but14.setText("");
        but15.setText("");
        but16.setText("");

        turn();
        //if disabled change enable
        but1.setEnabled(true);
        but2.setEnabled(true);
        but3.setEnabled(true);
        but4.setEnabled(true);
        but5.setEnabled(true);
        but6.setEnabled(true);
        but7.setEnabled(true);
        but8.setEnabled(true);
        but9.setEnabled(true);
        but10.setEnabled(true);
        but11.setEnabled(true);
        but12.setEnabled(true);
        but13.setEnabled(true);
        but14.setEnabled(true);
        but15.setEnabled(true);
        but16.setEnabled(true);

        //set background color as white
        but1.setBackground(Color.WHITE);
        but2.setBackground(Color.WHITE);
        but3.setBackground(Color.WHITE);
        but4.setBackground(Color.WHITE);
        but5.setBackground(Color.WHITE);
        but6.setBackground(Color.WHITE);
        but7.setBackground(Color.WHITE);
        but8.setBackground(Color.WHITE);
        but9.setBackground(Color.WHITE);
        but10.setBackground(Color.WHITE);
        but11.setBackground(Color.WHITE);
        but12.setBackground(Color.WHITE);
        but13.setBackground(Color.WHITE);
        but14.setBackground(Color.WHITE);
        but15.setBackground(Color.WHITE);
        but16.setBackground(Color.WHITE);

    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(xoxframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(xoxframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(xoxframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(xoxframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new xoxframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton but1;
    private javax.swing.JButton but10;
    private javax.swing.JButton but11;
    private javax.swing.JButton but12;
    private javax.swing.JButton but13;
    private javax.swing.JButton but14;
    private javax.swing.JButton but15;
    private javax.swing.JButton but16;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl1;
    // End of variables declaration//GEN-END:variables
}
