package team6.client.gui;

import java.io.IOException;
import java.net.Socket;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HomeGUI extends javax.swing.JFrame {

    private ControlGUI[] controlGUI;
    private int currentSelection;

    public HomeGUI() {
        initComponents();
        controlGUI = new ControlGUI[]{null, null, null, null, null, null};
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginGUI = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        tfHost = new javax.swing.JTextField();
        tfPort = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnConnect = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnGroupCOM = new javax.swing.ButtonGroup();
        pnlMain = new javax.swing.JPanel();
        lblAppName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnlCenter = new javax.swing.JPanel();
        btnCOM0 = new javax.swing.JToggleButton();
        btnCOM1 = new javax.swing.JToggleButton();
        btnCOM2 = new javax.swing.JToggleButton();
        btnCOM3 = new javax.swing.JToggleButton();
        btnCOM4 = new javax.swing.JToggleButton();
        btnCOM5 = new javax.swing.JToggleButton();
        btnAdd = new javax.swing.JButton();
        btnDisconnect = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        btnControl = new javax.swing.JButton();
        btnDestroy = new javax.swing.JButton();

        LoginGUI.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        LoginGUI.setTitle("Add Connection");
        LoginGUI.setAlwaysOnTop(true);
        LoginGUI.setBounds(new java.awt.Rectangle(0, 0, 333, 200));
        LoginGUI.setFocusable(false);
        LoginGUI.setResizable(false);
        LoginGUI.setSize(333, 200);
        LoginGUI.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                LoginGUIWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Add new connection");

        tfHost.setText("127.0.0.1");

        tfPort.setText("9888");

        jLabel3.setText("Port:");

        jLabel2.setText("IP Host:");

        btnConnect.setText("Connect");
        btnConnect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConnectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginGUILayout = new javax.swing.GroupLayout(LoginGUI.getContentPane());
        LoginGUI.getContentPane().setLayout(LoginGUILayout);
        LoginGUILayout.setHorizontalGroup(
            LoginGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginGUILayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
            .addGroup(LoginGUILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(LoginGUILayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(LoginGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginGUILayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(LoginGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfHost, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LoginGUILayout.createSequentialGroup()
                                .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(btnConnect)))))
                .addGap(44, 44, 44))
        );
        LoginGUILayout.setVerticalGroup(
            LoginGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginGUILayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(LoginGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginGUILayout.createSequentialGroup()
                        .addGroup(LoginGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(LoginGUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginGUILayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnConnect, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlMain.setPreferredSize(new java.awt.Dimension(682, 454));

        lblAppName.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblAppName.setText("Remote Control Application");

        pnlCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGroupCOM.add(btnCOM0);
        btnCOM0.setText("COM0");
        btnCOM0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCOM0.setFocusPainted(false);
        btnCOM0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOM0ActionPerformed(evt);
            }
        });
        pnlCenter.add(btnCOM0, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 120));

        btnGroupCOM.add(btnCOM1);
        btnCOM1.setText("COM1");
        btnCOM1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCOM1.setFocusPainted(false);
        btnCOM1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOM1ActionPerformed(evt);
            }
        });
        pnlCenter.add(btnCOM1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 120, 120));

        btnGroupCOM.add(btnCOM2);
        btnCOM2.setText("COM2");
        btnCOM2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCOM2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOM2ActionPerformed(evt);
            }
        });
        pnlCenter.add(btnCOM2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 120, 120));

        btnGroupCOM.add(btnCOM3);
        btnCOM3.setText("COM3");
        btnCOM3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCOM3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOM3ActionPerformed(evt);
            }
        });
        pnlCenter.add(btnCOM3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 120, 120));

        btnGroupCOM.add(btnCOM4);
        btnCOM4.setText("COM4");
        btnCOM4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCOM4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOM4ActionPerformed(evt);
            }
        });
        pnlCenter.add(btnCOM4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 120, 120));

        btnGroupCOM.add(btnCOM5);
        btnCOM5.setText("COM5");
        btnCOM5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCOM5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOM5ActionPerformed(evt);
            }
        });
        pnlCenter.add(btnCOM5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 120, 120));

        btnAdd.setText("Add New");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDisconnect.setText("Disconnect");
        btnDisconnect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisconnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisconnectActionPerformed(evt);
            }
        });

        btnControl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnControl.setText("Control");
        btnControl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnControlActionPerformed(evt);
            }
        });

        btnDestroy.setText("Destroy");
        btnDestroy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDestroy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDestroyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCenter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(lblAppName)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(btnAdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnControl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDestroy, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addComponent(btnDisconnect)
                .addGap(66, 66, 66))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblAppName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(btnControl, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDestroy))
                    .addComponent(btnDisconnect, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btnAdd.setEnabled(false);
        btnDisconnect.setEnabled(false);
        btnControl.setEnabled(false);
        btnDestroy.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 663, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, 503, Short.MAX_VALUE)
        );

        setVisible(true);
        System.out.println("HomeGUI is running ...");
        currentSelection = 0;

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Event handling when closing LoginGUI
    private void LoginGUIWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_LoginGUIWindowClosing
//        System.out.println("Login window is hiding ... ");
        this.setEnabled(true);
        tfHost.setText("127.0.0.1");
        tfPort.setText("9888");
    }//GEN-LAST:event_LoginGUIWindowClosing

    // Event handling when closing HomeGUI
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Disconnect all
        for (int i = 0; i < 6; i++) {
            if (controlGUI[i] == null) {
                continue;
            }
            controlGUI[i].disconnect();
//            System.out.println("COM" + i + " disconnected");
            controlGUI[i].dispose();
            controlGUI[i] = null;
        }
//        System.out.println("HomeGUI is closing ....");        
    }//GEN-LAST:event_formWindowClosing

    // Event handling when clicking btnConnect on LoginGUI
    private void btnConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConnectActionPerformed
        Socket socket = null;
        String host;
        int port;
        try {
            host = tfHost.getText();
            port = Integer.parseInt(tfPort.getText());

            for (int i = 0; i < 6; i++) {
                ControlGUI cGUI = controlGUI[i];

                if (cGUI != null && cGUI.socket.getInetAddress().toString().equals("/" + host) && cGUI.socket.getPort() == port) {
                    LoginGUI.setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(rootPane, "IP/port is existed at COM" + i + "!");
                    LoginGUI.setAlwaysOnTop(true);
                    return;
                }
            }

            socket = new Socket(host, port);
        } catch (NumberFormatException | IOException e) {
            LoginGUI.setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(rootPane, "IP/port is uncorrect!");
            LoginGUI.setAlwaysOnTop(true);
            return;
        }
        try {
            // if connected successfully
            controlGUI[currentSelection] = new ControlGUI(this, socket);
        } catch (IOException ex) {
            Logger.getLogger(HomeGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        controlGUI[currentSelection].setTitle("COM" + currentSelection + " - " + host + ":" + Integer.toString(port));

        LoginGUI.dispose();
        this.setEnabled(true);
        this.setVisible(true);
        btnAdd.setEnabled(false);
        btnDisconnect.setEnabled(true);
        btnDestroy.setEnabled(true);
        btnControl.setEnabled(true);
    }//GEN-LAST:event_btnConnectActionPerformed

    private void btnControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnControlActionPerformed
        if (controlGUI[currentSelection].socket.isClosed()) {
            btnDisconnect.doClick();
            return;
        }
        if (controlGUI[currentSelection].isVisible()) {
            return;
        }
        controlGUI[currentSelection].setSelectedTab(0);
        controlGUI[currentSelection].setLocationRelativeTo(this);
        controlGUI[currentSelection].setVisible(true);
        btnDisconnect.setEnabled(false);
        btnDestroy.setEnabled(false);
        btnControl.setEnabled(false);
    }//GEN-LAST:event_btnControlActionPerformed

    // Event handling when clicking btnDisconnect
    private void btnDisconnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisconnectActionPerformed
        controlGUI[currentSelection].disconnect();
        controlGUI[currentSelection].dispose();
        controlGUI[currentSelection] = null;
        btnDisconnect.setEnabled(false);
        btnDestroy.setEnabled(false);
        btnAdd.setEnabled(true);
        btnControl.setEnabled(false);
    }//GEN-LAST:event_btnDisconnectActionPerformed

    // Event handlings when click btnAdd
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        LoginGUI.setLocationRelativeTo(this);
        LoginGUI.setVisible(true);
        this.setEnabled(false);
        //        System.out.println("Login window is opening ...");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCOM5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOM5ActionPerformed
        //        System.out.println("COM5 selected");
        currentSelection = 5;
        if (controlGUI[5] == null) {
            btnAdd.setEnabled(true);
            btnControl.setEnabled(false);
            btnDisconnect.setEnabled(false);
            btnDestroy.setEnabled(false);
        } else {
            btnAdd.setEnabled(false);
            if (controlGUI[currentSelection].isVisible()) {
                btnControl.setEnabled(false);
                btnDisconnect.setEnabled(false);
                btnDestroy.setEnabled(false);
            } else {
                btnControl.setEnabled(true);
                btnDisconnect.setEnabled(true);
                btnDestroy.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnCOM5ActionPerformed

    private void btnCOM4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOM4ActionPerformed
        //        System.out.println("COM4 selected");
        currentSelection = 4;
        if (controlGUI[4] == null) {
            btnAdd.setEnabled(true);
            btnControl.setEnabled(false);
            btnDisconnect.setEnabled(false);
            btnDestroy.setEnabled(false);
        } else {
            btnAdd.setEnabled(false);
            if (controlGUI[currentSelection].isVisible()) {
                btnControl.setEnabled(false);
                btnDisconnect.setEnabled(false);
                btnDestroy.setEnabled(false);
            } else {
                btnControl.setEnabled(true);
                btnDisconnect.setEnabled(true);
                btnDestroy.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnCOM4ActionPerformed

    private void btnCOM3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOM3ActionPerformed
        currentSelection = 3;
        //        System.out.println("COM" + currentSelection + " selected");
        if (controlGUI[currentSelection] == null) {
            btnAdd.setEnabled(true);
            btnControl.setEnabled(false);
            btnDisconnect.setEnabled(false);
            btnDestroy.setEnabled(false);
        } else {
            btnAdd.setEnabled(false);
            if (controlGUI[currentSelection].isVisible()) {
                btnControl.setEnabled(false);
                btnDisconnect.setEnabled(false);
                btnDestroy.setEnabled(false);
            } else {
                btnControl.setEnabled(true);
                btnDisconnect.setEnabled(true);
                btnDestroy.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnCOM3ActionPerformed

    private void btnCOM2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOM2ActionPerformed
        currentSelection = 2;
        //        System.out.println("COM" + currentSelection + " selected");
        if (controlGUI[currentSelection] == null) {
            btnAdd.setEnabled(true);
            btnControl.setEnabled(false);
            btnDisconnect.setEnabled(false);
            btnDestroy.setEnabled(false);
        } else {
            btnAdd.setEnabled(false);
            if (controlGUI[currentSelection].isVisible()) {
                btnControl.setEnabled(false);
                btnDisconnect.setEnabled(false);
                btnDestroy.setEnabled(false);
            } else {
                btnControl.setEnabled(true);
                btnDisconnect.setEnabled(true);
                btnDestroy.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnCOM2ActionPerformed

    private void btnCOM1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOM1ActionPerformed
        currentSelection = 1;
        //        System.out.println("COM" + currentSelection + " selected");
        if (controlGUI[currentSelection] == null) {
            btnAdd.setEnabled(true);
            btnControl.setEnabled(false);
            btnDisconnect.setEnabled(false);
            btnDestroy.setEnabled(false);
        } else {
            btnAdd.setEnabled(false);
            if (controlGUI[currentSelection].isVisible()) {
                btnControl.setEnabled(false);
                btnDisconnect.setEnabled(false);
                btnDestroy.setEnabled(false);
            } else {
                btnControl.setEnabled(true);
                btnDisconnect.setEnabled(true);
                btnDestroy.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnCOM1ActionPerformed

    // Event handlings when choosing one COM
    private void btnCOM0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOM0ActionPerformed
        currentSelection = 0;
        //        System.out.println("COM" + currentSelection + " selected");
        if (controlGUI[currentSelection] == null) {
            btnAdd.setEnabled(true);
            btnControl.setEnabled(false);
            btnDisconnect.setEnabled(false);
            btnDestroy.setEnabled(false);
        } else {
            btnAdd.setEnabled(false);
            if (controlGUI[currentSelection].isVisible()) {
                btnControl.setEnabled(false);
                btnDisconnect.setEnabled(false);
                btnDestroy.setEnabled(false);
            } else {
                btnControl.setEnabled(true);
                btnDisconnect.setEnabled(true);
                btnDestroy.setEnabled(true);
            }
        }
    }//GEN-LAST:event_btnCOM0ActionPerformed

    private void btnDestroyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDestroyActionPerformed
        controlGUI[currentSelection].destroy();
        controlGUI[currentSelection].dispose();
        controlGUI[currentSelection] = null;
        btnDisconnect.setEnabled(false);
        btnDestroy.setEnabled(false);
        btnAdd.setEnabled(true);
        btnControl.setEnabled(false);
    }//GEN-LAST:event_btnDestroyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame LoginGUI;
    private javax.swing.JButton btnAdd;
    private javax.swing.JToggleButton btnCOM0;
    private javax.swing.JToggleButton btnCOM1;
    private javax.swing.JToggleButton btnCOM2;
    private javax.swing.JToggleButton btnCOM3;
    private javax.swing.JToggleButton btnCOM4;
    private javax.swing.JToggleButton btnCOM5;
    private javax.swing.JButton btnConnect;
    public javax.swing.JButton btnControl;
    public javax.swing.JButton btnDestroy;
    public javax.swing.JButton btnDisconnect;
    private javax.swing.ButtonGroup btnGroupCOM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAppName;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTextField tfHost;
    private javax.swing.JTextField tfPort;
    // End of variables declaration//GEN-END:variables
}
