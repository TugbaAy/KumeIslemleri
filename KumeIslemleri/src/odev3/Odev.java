package odev3;

public class Odev extends javax.swing.JFrame {

    double fak(double sayi){
	double sonuc=1,i;
	for (i = 1; i <=sayi; i++) {
		sonuc=sonuc*i;
	}
	return sonuc;
}
       
    double artiEksi;
    double ilkDeger;
    double ikinciDeger;
    double sonDeger;
    int tiklaArti;
    int tiklaEksi;
    int tiklaCarp;
    int tiklaBol;
    int tiklaNokta;

    double artiEksi1;
    double ilkDeger1;
    double ikinciDeger1;
    double sonDeger1;
    int tiklaArti1;
    int tiklaEksi1;
    int tiklaCarp1;
    int tiklaBol1;
    int tiklaNokta1;
    int tiklaUsAl;
    int tiklaKareAl;
    int tiklaKareKokAl;
    int tiklaModAl;
    int tiklaYuzdeAl;
            
    int ilkDeger2;
    final String PI = "3.1415926535";

    public Odev() {
        initComponents();
        setTitle("Hesap Makinesi");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        sil = new javax.swing.JButton();
        bol = new javax.swing.JButton();
        esittir = new javax.swing.JButton();
        btnnokta = new javax.swing.JButton();
        carp = new javax.swing.JButton();
        topla = new javax.swing.JButton();
        cikar = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnpztfngtf = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        sonuc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn71 = new javax.swing.JButton();
        btn81 = new javax.swing.JButton();
        btn91 = new javax.swing.JButton();
        btn41 = new javax.swing.JButton();
        btn51 = new javax.swing.JButton();
        btn61 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn21 = new javax.swing.JButton();
        btn31 = new javax.swing.JButton();
        btn01 = new javax.swing.JButton();
        btnNokta1 = new javax.swing.JButton();
        btnCarp1 = new javax.swing.JButton();
        btnBol1 = new javax.swing.JButton();
        btnCikar1 = new javax.swing.JButton();
        btnTopla1 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        btnKarekok = new javax.swing.JButton();
        btnYuzde = new javax.swing.JButton();
        btnPI = new javax.swing.JButton();
        btnSil1 = new javax.swing.JButton();
        btnKareAl = new javax.swing.JButton();
        btnXuzeriY = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnFaktoriyel = new javax.swing.JButton();
        btnbirBoluX = new javax.swing.JButton();
        btnArtiEksi1 = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnEsittir1 = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnLn = new javax.swing.JButton();
        sonuc1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        sonuc2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        sil.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sil.setText("C");
        sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                silActionPerformed(evt);
            }
        });

        bol.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        bol.setText("/");
        bol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolActionPerformed(evt);
            }
        });

        esittir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        esittir.setText("=");
        esittir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                esittirActionPerformed(evt);
            }
        });

        btnnokta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnokta.setText(".");
        btnnokta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnoktaActionPerformed(evt);
            }
        });

        carp.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        carp.setText("*");
        carp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carpActionPerformed(evt);
            }
        });

        topla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        topla.setText("+");
        topla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toplaActionPerformed(evt);
            }
        });

        cikar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cikar.setText("-");
        cikar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cikarActionPerformed(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btnpztfngtf.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnpztfngtf.setText("+/-");
        btnpztfngtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpztfngtfActionPerformed(evt);
            }
        });

        btn0.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton18.setText("<--");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        sonuc.setEditable(false);
        sonuc.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sonuc, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sil))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(carp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn0)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnnokta, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn2)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btn3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(cikar))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnpztfngtf)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(topla, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(esittir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bol, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnnokta, btnpztfngtf, carp, cikar, jButton18, sil, topla});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sonuc, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                        .addComponent(btn9)
                        .addComponent(jButton18)
                        .addComponent(sil, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn6)
                    .addComponent(carp)
                    .addComponent(bol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn1)
                            .addComponent(btn2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnnokta)
                            .addComponent(btn0)
                            .addComponent(btnpztfngtf)
                            .addComponent(topla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn3)
                        .addComponent(cikar))
                    .addComponent(esittir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bol, btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnnokta, btnpztfngtf, carp, cikar, jButton18, sil, topla});

        jTabbedPane1.addTab("Standart", jPanel1);

        btn71.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn71.setText("7");
        btn71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn71ActionPerformed(evt);
            }
        });

        btn81.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn81.setText("8");
        btn81.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn81ActionPerformed(evt);
            }
        });

        btn91.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn91.setText("9");
        btn91.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn91ActionPerformed(evt);
            }
        });

        btn41.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn41.setText("4");
        btn41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn41ActionPerformed(evt);
            }
        });

        btn51.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn51.setText("5");
        btn51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn51ActionPerformed(evt);
            }
        });

        btn61.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn61.setText("6");
        btn61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn61ActionPerformed(evt);
            }
        });

        btn11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn11.setText("1");
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn21.setText("2");
        btn21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn21ActionPerformed(evt);
            }
        });

        btn31.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn31.setText("3");
        btn31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn31ActionPerformed(evt);
            }
        });

        btn01.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btn01.setText("0");
        btn01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn01ActionPerformed(evt);
            }
        });

        btnNokta1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnNokta1.setText(".");
        btnNokta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNokta1ActionPerformed(evt);
            }
        });

        btnCarp1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCarp1.setText("*");
        btnCarp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarp1ActionPerformed(evt);
            }
        });

        btnBol1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBol1.setText("/");
        btnBol1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBol1ActionPerformed(evt);
            }
        });

        btnCikar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCikar1.setText("-");
        btnCikar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCikar1ActionPerformed(evt);
            }
        });

        btnTopla1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTopla1.setText("+");
        btnTopla1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTopla1ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton16.setText("<--");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        btnKarekok.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKarekok.setText("√");
        btnKarekok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKarekokActionPerformed(evt);
            }
        });

        btnYuzde.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnYuzde.setText("%");
        btnYuzde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYuzdeActionPerformed(evt);
            }
        });

        btnPI.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnPI.setText("PI");
        btnPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIActionPerformed(evt);
            }
        });

        btnSil1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSil1.setText("C");
        btnSil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSil1ActionPerformed(evt);
            }
        });

        btnKareAl.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnKareAl.setText("x^2");
        btnKareAl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKareAlActionPerformed(evt);
            }
        });

        btnXuzeriY.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnXuzeriY.setText("x^y");
        btnXuzeriY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuzeriYActionPerformed(evt);
            }
        });

        btnMod.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnMod.setText("mod");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnFaktoriyel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnFaktoriyel.setText("n!");
        btnFaktoriyel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFaktoriyelActionPerformed(evt);
            }
        });

        btnbirBoluX.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnbirBoluX.setText("1/x");
        btnbirBoluX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbirBoluXActionPerformed(evt);
            }
        });

        btnArtiEksi1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnArtiEksi1.setText("+/-");
        btnArtiEksi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArtiEksi1ActionPerformed(evt);
            }
        });

        btnExp.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnExp.setText("exp");
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnE.setText("e");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnEsittir1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEsittir1.setText("=");
        btnEsittir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsittir1ActionPerformed(evt);
            }
        });

        btnSin.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnCos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnTan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btnLog.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLog.setText("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnLn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnLn.setText("ln");
        btnLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLnActionPerformed(evt);
            }
        });

        sonuc1.setEditable(false);
        sonuc1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sonuc1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn81, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNokta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnCarp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBol1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCikar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnKarekok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnYuzde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnTopla1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSil1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXuzeriY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnKareAl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnFaktoriyel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnbirBoluX)
                            .addComponent(btnCos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnArtiEksi1)
                            .addComponent(btnTan))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnExp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnLog)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEsittir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn11, btn21, btn31, btn41, btn51, btn61, btn71, btn81, btn91, btnArtiEksi1, btnBol1, btnCarp1, btnCikar1, btnCos, btnE, btnExp, btnFaktoriyel, btnKareAl, btnKarekok, btnLn, btnLog, btnMod, btnNokta1, btnPI, btnSil1, btnSin, btnTan, btnTopla1, btnXuzeriY, btnYuzde, btnbirBoluX, jButton16});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sonuc1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSil1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn71, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn81, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn91, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCarp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnKarekok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnKareAl, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBol1, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(btn41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnYuzde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXuzeriY, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCikar1, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNokta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTopla1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnPI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnMod)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFaktoriyel)
                            .addComponent(btnbirBoluX)
                            .addComponent(btnArtiEksi1)
                            .addComponent(btnExp)
                            .addComponent(btnE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSin)
                            .addComponent(btnCos)
                            .addComponent(btnTan)
                            .addComponent(btnLog)
                            .addComponent(btnLn)))
                    .addComponent(btnEsittir1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btn01, btn11, btn21, btn31, btn41, btn51, btn61, btn71, btn81, btn91, btnArtiEksi1, btnBol1, btnCarp1, btnCikar1, btnCos, btnE, btnExp, btnFaktoriyel, btnKareAl, btnKarekok, btnLn, btnLog, btnMod, btnNokta1, btnPI, btnSil1, btnSin, btnTan, btnTopla1, btnXuzeriY, btnYuzde, btnbirBoluX, jButton16});

        jTabbedPane1.addTab("Bilimsel", jPanel2);

        sonuc2.setEditable(false);
        sonuc2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jButton1.setText("1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("0");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("<--");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("C");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("&");

        jButton6.setText("|");

        jButton7.setText("^");

        jButton8.setText("~");

        jButton9.setText("<<");

        jButton10.setText(">>");

        jButton11.setText("=");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sonuc2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sonuc2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Binary", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void esittirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_esittirActionPerformed
        ikinciDeger = (Double.parseDouble(String.valueOf(sonuc.getText())));
        if (tiklaArti > 0) {
            sonDeger = ilkDeger + ikinciDeger;
            sonuc.setText(String.valueOf(sonDeger));
            ilkDeger = 0;
            ikinciDeger = 0;
            tiklaArti = 0;
        }
        if (tiklaEksi > 0) {
            sonDeger = ilkDeger - ikinciDeger;
            sonuc.setText(String.valueOf(sonDeger));
            ilkDeger = 0;
            ikinciDeger = 0;
            tiklaEksi = 0;
        }
        if (tiklaBol > 0) {
            sonDeger = ilkDeger / ikinciDeger;
            sonuc.setText(String.valueOf(sonDeger));
            ilkDeger = 0;
            ikinciDeger = 0;
            tiklaBol = 0;
        }
        if (tiklaCarp > 0) {
            sonDeger = ilkDeger * ikinciDeger;
            sonuc.setText(String.valueOf(sonDeger));
            ilkDeger = 0;
            ikinciDeger = 0;
            tiklaCarp = 0;
        }

    }//GEN-LAST:event_esittirActionPerformed

    private void btnnoktaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnoktaActionPerformed
        if (tiklaNokta == 0) {
            sonuc.setText(sonuc.getText() + btnnokta.getText());
            tiklaNokta = 1;
        }
    }//GEN-LAST:event_btnnoktaActionPerformed

    private void toplaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toplaActionPerformed
        ilkDeger = (Double.parseDouble(String.valueOf(sonuc.getText())));
        sonuc.setText("");
        tiklaArti = 1;
        tiklaNokta = 0;
    }//GEN-LAST:event_toplaActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        sonuc.setText(sonuc.getText() + btn8.getText());
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        sonuc.setText(sonuc.getText() + btn9.getText());
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        sonuc.setText(sonuc.getText() + btn0.getText());
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        sonuc.setText(sonuc.getText() + btn7.getText());
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        sonuc.setText(sonuc.getText() + btn4.getText());
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        sonuc.setText(sonuc.getText() + btn3.getText());
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        sonuc.setText(sonuc.getText() + btn2.getText());
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        sonuc.setText(sonuc.getText() + btn1.getText());
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        sonuc.setText(sonuc.getText() + btn6.getText());
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        sonuc.setText(sonuc.getText() + btn5.getText());
    }//GEN-LAST:event_btn5ActionPerformed

    private void silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_silActionPerformed
        sonuc.setText("");
        tiklaNokta = 0;
    }//GEN-LAST:event_silActionPerformed

    private void btnpztfngtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpztfngtfActionPerformed
        artiEksi = (Double.parseDouble(String.valueOf(sonuc.getText())));
        artiEksi = artiEksi * (-1);
        sonuc.setText(String.valueOf(artiEksi));
    }//GEN-LAST:event_btnpztfngtfActionPerformed

    private void cikarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cikarActionPerformed
        ilkDeger = (Double.parseDouble(String.valueOf(sonuc.getText())));
        sonuc.setText("");
        tiklaEksi = 1;
        tiklaNokta = 0;
    }//GEN-LAST:event_cikarActionPerformed

    private void carpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carpActionPerformed
        ilkDeger = (Double.parseDouble(String.valueOf(sonuc.getText())));
        sonuc.setText("");
        tiklaCarp = 1;
        tiklaNokta = 0;
    }//GEN-LAST:event_carpActionPerformed

    private void bolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolActionPerformed
        ilkDeger = (Double.parseDouble(String.valueOf(sonuc.getText())));
        sonuc.setText("");
        tiklaBol = 1;
        tiklaNokta = 0;
    }//GEN-LAST:event_bolActionPerformed

    private void btn71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn71ActionPerformed
        sonuc1.setText(sonuc1.getText() + btn71.getText());
    }//GEN-LAST:event_btn71ActionPerformed

    private void btn81ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn81ActionPerformed
        sonuc1.setText(sonuc1.getText() + btn81.getText());
    }//GEN-LAST:event_btn81ActionPerformed

    private void btn91ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn91ActionPerformed
        sonuc1.setText(sonuc1.getText() + btn91.getText());
    }//GEN-LAST:event_btn91ActionPerformed

    private void btn41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn41ActionPerformed
        sonuc1.setText(sonuc1.getText() + btn41.getText());
    }//GEN-LAST:event_btn41ActionPerformed

    private void btn51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn51ActionPerformed
        sonuc1.setText(sonuc1.getText() + btn51.getText());
    }//GEN-LAST:event_btn51ActionPerformed

    private void btn61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn61ActionPerformed
        sonuc1.setText(sonuc1.getText() + btn61.getText());
    }//GEN-LAST:event_btn61ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        sonuc1.setText(sonuc1.getText() + btn11.getText());
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn21ActionPerformed
        sonuc1.setText(sonuc1.getText() + btn21.getText());
    }//GEN-LAST:event_btn21ActionPerformed

    private void btn31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn31ActionPerformed
        sonuc1.setText(sonuc1.getText() + btn31.getText());
    }//GEN-LAST:event_btn31ActionPerformed

    private void btn01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn01ActionPerformed
        sonuc1.setText(sonuc1.getText() + btn01.getText());
    }//GEN-LAST:event_btn01ActionPerformed

    private void btnSil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSil1ActionPerformed
        sonuc1.setText("");
        tiklaNokta1 = 0;
    }//GEN-LAST:event_btnSil1ActionPerformed

    private void btnCarp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarp1ActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonuc1.setText("");
        tiklaCarp1 = 1;
        tiklaNokta1 = 0;
    }//GEN-LAST:event_btnCarp1ActionPerformed

    private void btnBol1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBol1ActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonuc1.setText("");
        tiklaBol1 = 1;
        tiklaNokta1 = 0;
    }//GEN-LAST:event_btnBol1ActionPerformed

    private void btnCikar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCikar1ActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonuc1.setText("");
        tiklaEksi1 = 1;
        tiklaNokta1 = 0;
    }//GEN-LAST:event_btnCikar1ActionPerformed

    private void btnTopla1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTopla1ActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonuc1.setText("");
        tiklaArti1 = 1;
        tiklaNokta1 = 0;
    }//GEN-LAST:event_btnTopla1ActionPerformed

    private void btnNokta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNokta1ActionPerformed
        if (tiklaNokta1 == 0) {
            sonuc1.setText(sonuc1.getText() + btnNokta1.getText());
            tiklaNokta1 = 1;
        }
    }//GEN-LAST:event_btnNokta1ActionPerformed

    private void btnArtiEksi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArtiEksi1ActionPerformed
        artiEksi1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        artiEksi1 = artiEksi1 * (-1);
        sonuc1.setText(String.valueOf(artiEksi1));
    }//GEN-LAST:event_btnArtiEksi1ActionPerformed

    private void btnEsittir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsittir1ActionPerformed
        ikinciDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        if (tiklaArti1 > 0) {
            sonDeger1 = ilkDeger1 + ikinciDeger1;
            sonuc1.setText(String.valueOf(sonDeger1));
            ilkDeger1 = 0;
            ikinciDeger1 = 0;
            tiklaArti1 = 0;
        }
        if (tiklaEksi1 > 0) {
            sonDeger1 = ilkDeger1 - ikinciDeger1;
            sonuc1.setText(String.valueOf(sonDeger1));
            ilkDeger1 = 0;
            ikinciDeger1 = 0;
            tiklaEksi1 = 0;
        }
        if (tiklaBol1 > 0) {
            sonDeger1 = ilkDeger1 / ikinciDeger1;
            sonuc1.setText(String.valueOf(sonDeger1));
            ilkDeger1 = 0;
            ikinciDeger1 = 0;
            tiklaBol1 = 0;
        }
        if (tiklaCarp1 > 0) {
            sonDeger1 = ilkDeger1 * ikinciDeger1;
            sonuc1.setText(String.valueOf(sonDeger1));
            ilkDeger1 = 0;
            ikinciDeger1 = 0;
            tiklaCarp1 = 0;
        }
        if (tiklaUsAl > 0) {
            sonDeger1 = Math.pow(ilkDeger1, ikinciDeger1);
            sonuc1.setText(String.valueOf(sonDeger1));
            ilkDeger1 = 0;
            ikinciDeger1 = 0;
            tiklaUsAl = 0;
        }
        if(tiklaModAl>0){
            sonDeger1=ilkDeger1%ikinciDeger1;
            sonuc1.setText(String.valueOf(sonDeger1));
            ilkDeger1=0;
            ikinciDeger1=0;
            tiklaModAl=0;
        }
        if(tiklaYuzdeAl>0){
            sonDeger1=(ilkDeger1*(double)(ikinciDeger1/100.0));
            sonuc1.setText(String.valueOf(sonDeger1));
            ilkDeger1=0;
            ikinciDeger1=0;
            tiklaYuzdeAl=0;
            
        }
    }//GEN-LAST:event_btnEsittir1ActionPerformed

    private void btnPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIActionPerformed
        sonuc1.setText(PI);
        tiklaNokta1 = 0;
    }//GEN-LAST:event_btnPIActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        int a = Integer.parseInt(sonuc.getText());
        int yeni = (a / 10);
        sonuc.setText(String.valueOf(yeni));
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int a = Integer.parseInt(sonuc1.getText());
        int yeni = (int) (a / 10);
        sonuc1.setText(String.valueOf(yeni));
    }//GEN-LAST:event_jButton16ActionPerformed

    private void btnXuzeriYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuzeriYActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonuc1.setText("");
        tiklaUsAl = 1;
        tiklaNokta1 = 0;
    }//GEN-LAST:event_btnXuzeriYActionPerformed

    private void btnKareAlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKareAlActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = Math.pow(ilkDeger1, 2);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
        tiklaKareAl = 0;
    }//GEN-LAST:event_btnKareAlActionPerformed

    private void btnKarekokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKarekokActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = Math.sqrt(ilkDeger1);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
        tiklaKareKokAl = 0;
    }//GEN-LAST:event_btnKarekokActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonuc1.setText("");
        tiklaModAl = 1;
        tiklaNokta1 = 0;
    }//GEN-LAST:event_btnModActionPerformed

    private void btnYuzdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYuzdeActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonuc1.setText("");
        tiklaYuzdeAl = 1;
        tiklaNokta1 = 0;
    }//GEN-LAST:event_btnYuzdeActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = Math.sin(ilkDeger1);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = Math.cos(ilkDeger1);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = Math.tan(ilkDeger1);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = Math.log10(ilkDeger1);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = Math.expm1(ilkDeger1);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnFaktoriyelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFaktoriyelActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = fak(ilkDeger1);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
    }//GEN-LAST:event_btnFaktoriyelActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = Math.exp(ilkDeger1);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
    }//GEN-LAST:event_btnEActionPerformed

    private void btnLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLnActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = Math.log(ilkDeger1);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
    }//GEN-LAST:event_btnLnActionPerformed

    private void btnbirBoluXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbirBoluXActionPerformed
        ilkDeger1 = (Double.parseDouble(String.valueOf(sonuc1.getText())));
        sonDeger1 = (1/ilkDeger1);
        sonuc1.setText(String.valueOf(sonDeger1));
        ilkDeger1 = 0;
        ikinciDeger1 = 0;
    }//GEN-LAST:event_btnbirBoluXActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        sonuc2.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int a = Integer.parseInt(sonuc2.getText());
        int yeni = (int) (a / 10);
        sonuc2.setText(String.valueOf(yeni));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        sonuc2.setText(sonuc2.getText() + jButton1.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        sonuc2.setText(sonuc2.getText() + jButton2.getText());
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Odev().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bol;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn01;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn41;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn51;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn61;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn71;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn81;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn91;
    private javax.swing.JButton btnArtiEksi1;
    private javax.swing.JButton btnBol1;
    private javax.swing.JButton btnCarp1;
    private javax.swing.JButton btnCikar1;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEsittir1;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnFaktoriyel;
    private javax.swing.JButton btnKareAl;
    private javax.swing.JButton btnKarekok;
    private javax.swing.JButton btnLn;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnNokta1;
    private javax.swing.JButton btnPI;
    private javax.swing.JButton btnSil1;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnTopla1;
    private javax.swing.JButton btnXuzeriY;
    private javax.swing.JButton btnYuzde;
    private javax.swing.JButton btnbirBoluX;
    private javax.swing.JButton btnnokta;
    private javax.swing.JButton btnpztfngtf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton carp;
    private javax.swing.JButton cikar;
    private javax.swing.JButton esittir;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton sil;
    private javax.swing.JTextField sonuc;
    private javax.swing.JTextField sonuc1;
    private javax.swing.JTextField sonuc2;
    private javax.swing.JButton topla;
    // End of variables declaration//GEN-END:variables

}
