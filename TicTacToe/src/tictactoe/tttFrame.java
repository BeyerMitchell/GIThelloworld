package tictactoe;

import java.util.Random;

public class tttFrame extends javax.swing.JFrame {

    static Random r = new Random();
    int i = 1;
    int a = 0;
    int b = 0;
    int c = 0;
    int d = 0;
    int e = 0;
    int f = 0;
    int z = 0;
    int y = 0;
    int p = 0;
    int toot = 0;
    int player1 = 0;
    int player2 = 0;
    int tie = 0;
    int pop = 0;
    String turn;

    public int reset() {
        ttt1BUT.setText("");
        ttt2BUT.setText("");
        ttt3BUT.setText("");
        ttt4BUT.setText("");
        ttt5BUT.setText("");
        ttt6BUT.setText("");
        ttt7BUT.setText("");
        ttt8BUT.setText("");
        ttt9BUT.setText("");
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        z = 0;
        y = 0;
        p = 0;
        pop = 0;
        return 0;
    }

    public int Hal9000() {//AI that you can play against     also the AI can play against itself
        String t1 = ttt1BUT.getText();
        String t2 = ttt2BUT.getText();
        String t3 = ttt3BUT.getText();
        String t4 = ttt4BUT.getText();
        String t5 = ttt5BUT.getText();
        String t6 = ttt6BUT.getText();
        String t7 = ttt7BUT.getText();
        String t8 = ttt8BUT.getText();
        String t9 = ttt9BUT.getText();
        while (toot == 0) {//picks random square to play in
            int was = r.nextInt(9) + 1;
            if (was == 1 && t1 == "") {
                if (i == 1) {
                    ttt1BUT.setText("X");
                } else if (i == 2) {
                    ttt1BUT.setText("O");
                }
                i++;
                toot++;
                pop++;
            } else if (was == 2 && t2 == "") {
                if (i == 1) {
                    ttt2BUT.setText("X");
                } else if (i == 2) {
                    ttt2BUT.setText("O");
                }
                i++;
                toot++;
                pop++;
            } else if (was == 3 && t3 == "") {
                if (i == 1) {
                    ttt3BUT.setText("X");
                } else if (i == 2) {
                    ttt3BUT.setText("O");
                }
                i++;
                toot++;
                pop++;
            } else if (was == 4 && t4 == "") {
                if (i == 1) {
                    ttt4BUT.setText("X");
                } else if (i == 2) {
                    ttt4BUT.setText("O");
                }
                i++;
                toot++;
                pop++;
            } else if (was == 5 && t5 == "") {
                if (i == 1) {
                    ttt5BUT.setText("X");
                } else if (i == 2) {
                    ttt5BUT.setText("O");
                }
                i++;
                toot++;
                pop++;
            } else if (was == 6 && t6 == "") {
                if (i == 1) {
                    ttt6BUT.setText("X");
                } else if (i == 2) {
                    ttt6BUT.setText("O");
                }
                i++;
                toot++;
                pop++;
            } else if (was == 7 && t7 == "") {
                if (i == 1) {
                    ttt7BUT.setText("X");
                } else if (i == 2) {
                    ttt7BUT.setText("O");
                }
                i++;
                toot++;
                pop++;
            } else if (was == 8 && t8 == "") {
                if (i == 1) {
                    ttt8BUT.setText("X");
                } else if (i == 2) {
                    ttt8BUT.setText("O");
                }
                i++;
                toot++;
                pop++;
            } else if (was == 9 && t9 == "") {
                if (i == 1) {
                    ttt9BUT.setText("X");
                } else if (i == 2) {
                    ttt9BUT.setText("O");
                }
                i++;
                toot++;
                pop++;
            }
        }
        toot = 0;
        if (i > 2) {
            i = 1;
        }

        detectwin();
        return 0;
    }

    public int detectwin() {//detects a win from x or o


        String t1 = ttt1BUT.getText();
        String t2 = ttt2BUT.getText();
        String t3 = ttt3BUT.getText();
        String t4 = ttt4BUT.getText();
        String t5 = ttt5BUT.getText();
        String t6 = ttt6BUT.getText();
        String t7 = ttt7BUT.getText();
        String t8 = ttt8BUT.getText();
        String t9 = ttt9BUT.getText();

        if (t1 == "X" && t2 == "X" && t3 == "X") {//tests all possbilities for a win
            player1++;
            reset();
        } else if (t1 == "X" && t4 == "X" && t7 == "X") {
            player1++;
            reset();;
        } else if (t3 == "X" && t6 == "X" && t9 == "X") {
            player1++;
            reset();
        } else if (t7 == "X" && t8 == "X" && t9 == "X") {
            player1++;
            reset();
        } else if (t1 == "X" && t5 == "X" && t9 == "X") {
            player1++;
            reset();
        } else if (t3 == "X" && t5 == "X" && t7 == "X") {
            player1++;
            reset();
        } else if (t2 == "X" && t5 == "X" && t8 == "X") {
            player1++;
            reset();
        } else if (t4 == "X" && t5 == "X" && t6 == "X") {
            player1++;
            reset();
        } else if (t1 == "O" && t2 == "O" && t3 == "O") {
            player2++;
            reset();
        } else if (t1 == "O" && t4 == "O" && t7 == "O") {
            player2++;
            reset();
        } else if (t3 == "O" && t6 == "O" && t9 == "O") {
            player2++;
            reset();
        } else if (t7 == "O" && t8 == "O" && t9 == "O") {
            player2++;
            reset();
        } else if (t1 == "O" && t5 == "O" && t9 == "O") {
            player2++;
            reset();
        } else if (t3 == "O" && t5 == "O" && t7 == "O") {
            player2++;
            reset();
        } else if (t2 == "O" && t5 == "O" && t8 == "O") {
            player2++;
            reset();
        } else if (t4 == "O" && t5 == "O" && t6 == "O") {
            player2++;
            reset();
        } else if (pop == 9) {//checks for tie
            tie++;
            reset();
        }

        if (i == 1) {
            turn = "X";
        } else if (i == 2) {
            turn = "O";
        }
        String ppp = pop + "";//add everything up and sets text in the score area
        String pp1 = player1 + "";
        String pp2 = player2 + "";
        String t = tie + "";
        p1TF.setText(pp1);
        p2TF.setText(pp2);
        tieTF.setText(t);
        turnTF.setText(turn);

        return 0;
    }

    public tttFrame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        butPAN = new javax.swing.JPanel();
        ttt1BUT = new javax.swing.JButton();
        ttt2BUT = new javax.swing.JButton();
        ttt3BUT = new javax.swing.JButton();
        ttt4BUT = new javax.swing.JButton();
        ttt5BUT = new javax.swing.JButton();
        ttt6BUT = new javax.swing.JButton();
        ttt7BUT = new javax.swing.JButton();
        ttt8BUT = new javax.swing.JButton();
        ttt9BUT = new javax.swing.JButton();
        clrBUT = new javax.swing.JButton();
        p1LBL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        p1TF = new javax.swing.JTextField();
        p2TF = new javax.swing.JTextField();
        tieTF = new javax.swing.JTextField();
        p11LBL = new javax.swing.JLabel();
        p22LBL = new javax.swing.JLabel();
        tieLBL = new javax.swing.JLabel();
        aiBUT = new javax.swing.JButton();
        turnTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        butPAN.setBackground(new java.awt.Color(0, 51, 51));
        butPAN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        butPAN.setLayout(new java.awt.GridLayout(3, 3, 5, 5));

        ttt1BUT.setBackground(new java.awt.Color(102, 102, 102));
        ttt1BUT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ttt1BUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttt1BUTActionPerformed(evt);
            }
        });
        butPAN.add(ttt1BUT);

        ttt2BUT.setBackground(new java.awt.Color(102, 102, 102));
        ttt2BUT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ttt2BUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttt2BUTActionPerformed(evt);
            }
        });
        butPAN.add(ttt2BUT);

        ttt3BUT.setBackground(new java.awt.Color(102, 102, 102));
        ttt3BUT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ttt3BUT.setForeground(new java.awt.Color(51, 51, 51));
        ttt3BUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttt3BUTActionPerformed(evt);
            }
        });
        butPAN.add(ttt3BUT);

        ttt4BUT.setBackground(new java.awt.Color(102, 102, 102));
        ttt4BUT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ttt4BUT.setForeground(new java.awt.Color(51, 51, 51));
        ttt4BUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttt4BUTActionPerformed(evt);
            }
        });
        butPAN.add(ttt4BUT);

        ttt5BUT.setBackground(new java.awt.Color(102, 102, 102));
        ttt5BUT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ttt5BUT.setForeground(new java.awt.Color(51, 51, 51));
        ttt5BUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttt5BUTActionPerformed(evt);
            }
        });
        butPAN.add(ttt5BUT);

        ttt6BUT.setBackground(new java.awt.Color(102, 102, 102));
        ttt6BUT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ttt6BUT.setForeground(new java.awt.Color(51, 51, 51));
        ttt6BUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttt6BUTActionPerformed(evt);
            }
        });
        butPAN.add(ttt6BUT);

        ttt7BUT.setBackground(new java.awt.Color(102, 102, 102));
        ttt7BUT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ttt7BUT.setForeground(new java.awt.Color(51, 51, 51));
        ttt7BUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttt7BUTActionPerformed(evt);
            }
        });
        butPAN.add(ttt7BUT);

        ttt8BUT.setBackground(new java.awt.Color(102, 102, 102));
        ttt8BUT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ttt8BUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttt8BUTActionPerformed(evt);
            }
        });
        butPAN.add(ttt8BUT);

        ttt9BUT.setBackground(new java.awt.Color(102, 102, 102));
        ttt9BUT.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        ttt9BUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ttt9BUTActionPerformed(evt);
            }
        });
        butPAN.add(ttt9BUT);

        clrBUT.setText("Reset");
        clrBUT.setToolTipText("");
        clrBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBUTActionPerformed(evt);
            }
        });

        p1LBL.setBackground(new java.awt.Color(255, 255, 255));
        p1LBL.setForeground(new java.awt.Color(255, 255, 255));
        p1LBL.setText("Player 1 - X");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player 2 - O");

        p1TF.setBackground(new java.awt.Color(51, 51, 51));
        p1TF.setForeground(new java.awt.Color(255, 255, 255));
        p1TF.setText("0");

        p2TF.setBackground(new java.awt.Color(51, 51, 51));
        p2TF.setForeground(new java.awt.Color(255, 255, 255));
        p2TF.setText("0");

        tieTF.setBackground(new java.awt.Color(51, 51, 51));
        tieTF.setForeground(new java.awt.Color(255, 255, 255));
        tieTF.setText("0");

        p11LBL.setForeground(new java.awt.Color(255, 255, 255));
        p11LBL.setText("Player1");

        p22LBL.setForeground(new java.awt.Color(255, 255, 255));
        p22LBL.setText("Player2");

        tieLBL.setForeground(new java.awt.Color(255, 255, 255));
        tieLBL.setText("Tie");

        aiBUT.setText("HAL9000");
        aiBUT.setToolTipText("");
        aiBUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aiBUTActionPerformed(evt);
            }
        });

        turnTF.setBackground(new java.awt.Color(51, 51, 51));
        turnTF.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Turn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(aiBUT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                    .addComponent(clrBUT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(p1LBL, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(p11LBL)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tieLBL, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(p22LBL, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tieTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(turnTF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clrBUT)
                        .addGap(2, 2, 2)
                        .addComponent(aiBUT, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p1LBL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p11LBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(p2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p22LBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tieTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tieLBL))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turnTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(butPAN, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ttt5BUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttt5BUTActionPerformed
        //buttons set the x's and o's
        if (a == 0) {
            if (i == 1) {
                ttt5BUT.setText("X");
            } else if (i == 2) {
                ttt5BUT.setText("O");
            }
            i++;
            if (i > 2) {
                i = 1;
            }
            a++;
            pop++;
        }

        detectwin();


    }//GEN-LAST:event_ttt5BUTActionPerformed

    private void ttt1BUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttt1BUTActionPerformed

        if (b == 0) {
            if (i == 1) {
                ttt1BUT.setText("X");
            } else if (i == 2) {
                ttt1BUT.setText("O");
            }
            i++;
            if (i > 2) {
                i = 1;
            }
            b++;
            pop++;
        }

        detectwin();
    }//GEN-LAST:event_ttt1BUTActionPerformed

    private void ttt2BUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttt2BUTActionPerformed

        if (c == 0) {
            if (i == 1) {
                ttt2BUT.setText("X");

            } else if (i == 2) {
                ttt2BUT.setText("O");

            }
            i++;
            if (i > 2) {
                i = 1;
            }
            c++;
            pop++;
        }

        detectwin();
    }//GEN-LAST:event_ttt2BUTActionPerformed

    private void ttt3BUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttt3BUTActionPerformed

        if (d == 0) {
            if (i == 1) {
                ttt3BUT.setText("X");

            } else if (i == 2) {
                ttt3BUT.setText("O");

            }
            i++;
            if (i > 2) {
                i = 1;
            }
            d++;
            pop++;
        }

        detectwin();
    }//GEN-LAST:event_ttt3BUTActionPerformed

    private void ttt4BUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttt4BUTActionPerformed

        if (e == 0) {
            if (i == 1) {
                ttt4BUT.setText("X");

            } else if (i == 2) {
                ttt4BUT.setText("O");

            }
            i++;
            if (i > 2) {
                i = 1;
            }
            e++;
            pop++;
        }

        detectwin();
    }//GEN-LAST:event_ttt4BUTActionPerformed

    private void ttt6BUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttt6BUTActionPerformed

        if (f == 0) {
            if (i == 1) {
                ttt6BUT.setText("X");

            } else if (i == 2) {
                ttt6BUT.setText("O");

            }
            i++;
            if (i > 2) {
                i = 1;
            }
            f++;
            pop++;
        }

        detectwin();
    }//GEN-LAST:event_ttt6BUTActionPerformed

    private void ttt7BUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttt7BUTActionPerformed

        if (z == 0) {
            if (i == 1) {
                ttt7BUT.setText("X");

            } else if (i == 2) {
                ttt7BUT.setText("O");
            }

            i++;
            if (i > 2) {
                i = 1;
            }
            z++;
            pop++;
        }


        detectwin();
    }//GEN-LAST:event_ttt7BUTActionPerformed

    private void ttt8BUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttt8BUTActionPerformed

        if (y == 0) {
            if (i == 1) {
                ttt8BUT.setText("X");

            } else if (i == 2) {
                ttt8BUT.setText("O");

            }
            i++;
            if (i > 2) {
                i = 1;
            }
            y++;
            pop++;
        }

        detectwin();
    }//GEN-LAST:event_ttt8BUTActionPerformed

    private void ttt9BUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ttt9BUTActionPerformed

        if (p == 0) {
            if (i == 1) {
                ttt9BUT.setText("X");

            } else if (i == 2) {
                ttt9BUT.setText("O");

            }
            i++;
            if (i > 2) {
                i = 1;
            }
            p++;
            pop++;
        }

        detectwin();
    }//GEN-LAST:event_ttt9BUTActionPerformed

    private void clrBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrBUTActionPerformed
        ttt1BUT.setText("");//clears and resets everything
        ttt2BUT.setText("");
        ttt3BUT.setText("");
        ttt4BUT.setText("");
        ttt5BUT.setText("");
        ttt6BUT.setText("");
        ttt7BUT.setText("");
        ttt8BUT.setText("");
        ttt9BUT.setText("");
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        z = 0;
        y = 0;
        p = 0;
        i = 1;
        pop = 0;
        tie = 0;
        player1 = 0;
        player2 = 0;

    }//GEN-LAST:event_clrBUTActionPerformed

    private void aiBUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aiBUTActionPerformed
        Hal9000();//run's AI
    }//GEN-LAST:event_aiBUTActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aiBUT;
    private javax.swing.JPanel butPAN;
    private javax.swing.JButton clrBUT;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel p11LBL;
    private javax.swing.JLabel p1LBL;
    private javax.swing.JTextField p1TF;
    private javax.swing.JLabel p22LBL;
    private javax.swing.JTextField p2TF;
    private javax.swing.JLabel tieLBL;
    private javax.swing.JTextField tieTF;
    private javax.swing.JButton ttt1BUT;
    private javax.swing.JButton ttt2BUT;
    private javax.swing.JButton ttt3BUT;
    private javax.swing.JButton ttt4BUT;
    private javax.swing.JButton ttt5BUT;
    private javax.swing.JButton ttt6BUT;
    private javax.swing.JButton ttt7BUT;
    private javax.swing.JButton ttt8BUT;
    private javax.swing.JButton ttt9BUT;
    private javax.swing.JTextField turnTF;
    // End of variables declaration//GEN-END:variables
}
