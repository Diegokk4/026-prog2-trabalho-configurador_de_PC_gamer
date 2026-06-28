
package com.mycompany.configurador.view;

import com.mycompany.configurador.model.Peca;


public class Principal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Principal.class.getName());

    // --- BANCO DE DADOS EM MEMÓRIA ---
    private java.util.ArrayList<Peca> listaProcessadores = new java.util.ArrayList<>();
    private java.util.ArrayList<Peca> listaPlacasVideo = new java.util.ArrayList<>();
    private java.util.ArrayList<Peca> listaMemorias = new java.util.ArrayList<>();
    private java.util.ArrayList<Peca> listaArmazenamentos = new java.util.ArrayList<>();
    private java.util.ArrayList<Peca> listaPerifericos = new java.util.ArrayList<>();
    
    // Variável para sabermos se estamos adicionando uma peça nova ou editando uma existente
    private Peca pecaEmEdicao = null;
    
    public Principal() {
        initComponents();
        inicializarDadosBase();
        
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panBuild = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaResumo = new javax.swing.JList<>();
        lblTotal = new javax.swing.JLabel();
        barraEnergia = new javax.swing.JProgressBar();
        barraDesempenho = new javax.swing.JProgressBar();
        chkCoolerExtra = new javax.swing.JCheckBox();
        chkRgb = new javax.swing.JCheckBox();
        chkGarantiaEstendida = new javax.swing.JCheckBox();
        btnExportar = new javax.swing.JButton();
        btnLimparBuild = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panProcessador = new javax.swing.JPanel();
        cmbProcessador = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProcessador = new javax.swing.JTable();
        panPlacaDeVideo = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPlacaVideo = new javax.swing.JTable();
        cmbPlacaVideo = new javax.swing.JComboBox<>();
        panMemoriaRam = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblMemoria = new javax.swing.JTable();
        cmbMemoria = new javax.swing.JComboBox<>();
        panArmazenamento = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblArmazenamento = new javax.swing.JTable();
        cmbArmazenamento = new javax.swing.JComboBox<>();
        panPerifericos = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblPerifericos = new javax.swing.JTable();
        cmbPerifericos = new javax.swing.JComboBox<>();
        panGerenciarPecas = new javax.swing.JPanel();
        cmbAdminCategoria = new javax.swing.JComboBox<>();
        labAdminNome = new javax.swing.JLabel();
        txtAdminNome = new javax.swing.JTextField();
        labAdminPreco = new javax.swing.JLabel();
        labAdminTdp = new javax.swing.JLabel();
        txtAdminPreco = new javax.swing.JTextField();
        txtAdminTdp = new javax.swing.JTextField();
        labAdminScore = new javax.swing.JLabel();
        txtAdminScore = new javax.swing.JTextField();
        txtAdminEspec = new javax.swing.JTextField();
        labAdminEspec = new javax.swing.JLabel();
        labAdminDetalhe = new javax.swing.JLabel();
        txtAdminDetalhe = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAdmin = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemExportar = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panBuild.setBorder(javax.swing.BorderFactory.createTitledBorder("Sua Build"));

        listaResumo.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(listaResumo);

        lblTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotal.setText("TOTAL: R$ 0,00");

        barraEnergia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barraEnergia.setMaximum(750);
        barraEnergia.setString("Consumo: 0W / 750W");
        barraEnergia.setStringPainted(true);

        barraDesempenho.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barraDesempenho.setString("Score de Desempenho");
        barraDesempenho.setStringPainted(true);

        chkCoolerExtra.setText("Cooler extra");
        chkCoolerExtra.addActionListener(this::chkCoolerExtraActionPerformed);

        chkRgb.setText("RGB");
        chkRgb.addActionListener(this::chkRgbActionPerformed);

        chkGarantiaEstendida.setText("Garantia estendida");
        chkGarantiaEstendida.addActionListener(this::chkGarantiaEstendidaActionPerformed);

        btnExportar.setBackground(new java.awt.Color(51, 153, 255));
        btnExportar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExportar.setForeground(new java.awt.Color(255, 255, 255));
        btnExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exportar.png"))); // NOI18N
        btnExportar.setText("Exportar / Finalizar");
        btnExportar.addActionListener(this::btnExportarActionPerformed);

        btnLimparBuild.setBackground(new java.awt.Color(255, 102, 102));
        btnLimparBuild.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimparBuild.setForeground(new java.awt.Color(255, 255, 255));
        btnLimparBuild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpar-limpo.png"))); // NOI18N
        btnLimparBuild.setText("Limpar Build");
        btnLimparBuild.addActionListener(this::btnLimparBuildActionPerformed);

        javax.swing.GroupLayout panBuildLayout = new javax.swing.GroupLayout(panBuild);
        panBuild.setLayout(panBuildLayout);
        panBuildLayout.setHorizontalGroup(
            panBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBuildLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barraDesempenho, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barraEnergia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panBuildLayout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(chkCoolerExtra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkRgb)
                        .addGap(18, 18, 18)
                        .addComponent(chkGarantiaEstendida))
                    .addGroup(panBuildLayout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(btnExportar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLimparBuild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panBuildLayout.setVerticalGroup(
            panBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBuildLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraDesempenho, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panBuildLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkCoolerExtra)
                    .addComponent(chkRgb)
                    .addComponent(chkGarantiaEstendida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimparBuild, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cmbProcessador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Ryzen 5 8600G", "I3-10100F", " " }));
        cmbProcessador.addActionListener(this::cmbProcessadorActionPerformed);

        tblProcessador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Especificação", "Detalhe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblProcessador);

        javax.swing.GroupLayout panProcessadorLayout = new javax.swing.GroupLayout(panProcessador);
        panProcessador.setLayout(panProcessadorLayout);
        panProcessadorLayout.setHorizontalGroup(
            panProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProcessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(cmbProcessador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panProcessadorLayout.setVerticalGroup(
            panProcessadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panProcessadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbProcessador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Processador", new javax.swing.ImageIcon(getClass().getResource("/processador.png")), panProcessador); // NOI18N

        tblPlacaVideo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Especificação", "Detalhe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPlacaVideo);

        cmbPlacaVideo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Ryzen 5 8600G", "I3-10100F", " " }));
        cmbPlacaVideo.addActionListener(this::cmbPlacaVideoActionPerformed);

        javax.swing.GroupLayout panPlacaDeVideoLayout = new javax.swing.GroupLayout(panPlacaDeVideo);
        panPlacaDeVideo.setLayout(panPlacaDeVideoLayout);
        panPlacaDeVideoLayout.setHorizontalGroup(
            panPlacaDeVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPlacaDeVideoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPlacaDeVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(cmbPlacaVideo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panPlacaDeVideoLayout.setVerticalGroup(
            panPlacaDeVideoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPlacaDeVideoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbPlacaVideo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Placa de vídeo", new javax.swing.ImageIcon(getClass().getResource("/placa-grafica.png")), panPlacaDeVideo); // NOI18N

        tblMemoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Especificação", "Detalhe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblMemoria);

        cmbMemoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Ryzen 5 8600G", "I3-10100F", " " }));
        cmbMemoria.addActionListener(this::cmbMemoriaActionPerformed);

        javax.swing.GroupLayout panMemoriaRamLayout = new javax.swing.GroupLayout(panMemoriaRam);
        panMemoriaRam.setLayout(panMemoriaRamLayout);
        panMemoriaRamLayout.setHorizontalGroup(
            panMemoriaRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMemoriaRamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panMemoriaRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbMemoria, 0, 724, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)))
        );
        panMemoriaRamLayout.setVerticalGroup(
            panMemoriaRamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panMemoriaRamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbMemoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Memória RAM", new javax.swing.ImageIcon(getClass().getResource("/memoria-ram.png")), panMemoriaRam); // NOI18N

        tblArmazenamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Especificação", "Detalhe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblArmazenamento);

        cmbArmazenamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Ryzen 5 8600G", "I3-10100F", " " }));
        cmbArmazenamento.addActionListener(this::cmbArmazenamentoActionPerformed);

        javax.swing.GroupLayout panArmazenamentoLayout = new javax.swing.GroupLayout(panArmazenamento);
        panArmazenamento.setLayout(panArmazenamentoLayout);
        panArmazenamentoLayout.setHorizontalGroup(
            panArmazenamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panArmazenamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panArmazenamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(cmbArmazenamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panArmazenamentoLayout.setVerticalGroup(
            panArmazenamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panArmazenamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbArmazenamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Armazenamento", new javax.swing.ImageIcon(getClass().getResource("/hd.png")), panArmazenamento); // NOI18N

        tblPerifericos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Especificação", "Detalhe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tblPerifericos);

        cmbPerifericos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione...", "Ryzen 5 8600G", "I3-10100F", " " }));
        cmbPerifericos.addActionListener(this::cmbPerifericosActionPerformed);

        javax.swing.GroupLayout panPerifericosLayout = new javax.swing.GroupLayout(panPerifericos);
        panPerifericos.setLayout(panPerifericosLayout);
        panPerifericosLayout.setHorizontalGroup(
            panPerifericosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPerifericosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPerifericosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 724, Short.MAX_VALUE)
                    .addComponent(cmbPerifericos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        panPerifericosLayout.setVerticalGroup(
            panPerifericosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPerifericosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbPerifericos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 484, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Periféricos", new javax.swing.ImageIcon(getClass().getResource("/teclado-e-mouse.png")), panPerifericos); // NOI18N

        cmbAdminCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Processador", "Placa de vídeo", "Memória RAM", "Armazenamento", "Periféricos" }));
        cmbAdminCategoria.addActionListener(this::cmbAdminCategoriaActionPerformed);

        labAdminNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labAdminNome.setText("Nome da peça:");

        labAdminPreco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labAdminPreco.setText("Preço (R$):");

        labAdminTdp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labAdminTdp.setText("Consumo (TDP):");

        labAdminScore.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labAdminScore.setText("Score (Desempenho):");

        labAdminEspec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labAdminEspec.setText("Especificação:");

        labAdminDetalhe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labAdminDetalhe.setText("Detalhe adicional:");

        tblAdmin.setModel(new javax.swing.table.DefaultTableModel(
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
        tblAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdminMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblAdmin);

        btnExcluir.setBackground(new java.awt.Color(255, 102, 102));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lixeira-de-reciclagem.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(this::btnExcluirActionPerformed);

        btnLimpar.setBackground(new java.awt.Color(255, 255, 153));
        btnLimpar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/limpar-limpo.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(this::btnLimparActionPerformed);

        btnSalvar.setBackground(new java.awt.Color(153, 255, 153));
        btnSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salve-.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        javax.swing.GroupLayout panGerenciarPecasLayout = new javax.swing.GroupLayout(panGerenciarPecas);
        panGerenciarPecas.setLayout(panGerenciarPecasLayout);
        panGerenciarPecasLayout.setHorizontalGroup(
            panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGerenciarPecasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbAdminCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7)))
            .addGroup(panGerenciarPecasLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labAdminNome)
                    .addComponent(labAdminPreco)
                    .addComponent(labAdminTdp)
                    .addComponent(labAdminScore)
                    .addComponent(labAdminEspec)
                    .addComponent(labAdminDetalhe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtAdminDetalhe)
                    .addComponent(txtAdminPreco, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdminNome, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdminTdp, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdminScore, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAdminEspec, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panGerenciarPecasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalvar)
                .addGap(217, 217, 217))
        );
        panGerenciarPecasLayout.setVerticalGroup(
            panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panGerenciarPecasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmbAdminCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labAdminNome)
                    .addComponent(txtAdminNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdminPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labAdminPreco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdminTdp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labAdminTdp))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdminScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labAdminScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdminEspec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labAdminEspec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdminDetalhe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labAdminDetalhe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panGerenciarPecasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnLimpar)
                    .addComponent(btnSalvar))
                .addGap(18, 18, 18))
        );

        jTabbedPane1.addTab("Gerenciar Peças", new javax.swing.ImageIcon(getClass().getResource("/gerenciamento-de-peças.png")), panGerenciarPecas); // NOI18N

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jMenu1.setText("Arquivo");

        menuItemExportar.setText("Exportar Build");
        menuItemExportar.addActionListener(this::menuItemExportarActionPerformed);
        jMenu1.add(menuItemExportar);

        menuSair.setText("Sair");
        menuSair.addActionListener(this::menuSairActionPerformed);
        jMenu1.add(menuSair);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        menuSobre.setText("Equipe de Desenvolvimento");
        menuSobre.addActionListener(this::menuSobreActionPerformed);
        jMenu2.add(menuSobre);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panBuild, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(panBuild, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        //fecha o sistema
        System.exit(0);
    }//GEN-LAST:event_menuSairActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        
       //Mensagem de desenvolvimento 
       javax.swing.JOptionPane.showMessageDialog(this, 
    "Configurador de PC Gamer\n\n" +
    "Desenvolvido por: Diego Oliveira Ricardo\n" +
    "Disciplina: Programação de Computadores II", 
    "Sobre o Sistema", 
    javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void cmbProcessadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProcessadorActionPerformed
        
        if (cmbProcessador.getSelectedItem() instanceof Peca) {
            
            Peca pecaSelecionada = (Peca) cmbProcessador.getSelectedItem();
            
            if (pecaSelecionada != null && pecaSelecionada.getPreco() > 0) {
                javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblProcessador.getModel();
                modelo.setRowCount(0);
                modelo.addRow(new Object[]{"Especificação", pecaSelecionada.getDetalhe1()});
                modelo.addRow(new Object[]{"Detalhe", pecaSelecionada.getDetalhe2()});
                modelo.addRow(new Object[]{"TDP (Consumo)", pecaSelecionada.getTdp() + "W"});
                modelo.addRow(new Object[]{"Preço", String.format("R$ %.2f", pecaSelecionada.getPreco())});
            }
        }
        atualizarResumo();                                          
    }//GEN-LAST:event_cmbProcessadorActionPerformed

    private void cmbMemoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMemoriaActionPerformed
        // Atualiza a tabela de especificações da memória selecionada e calcula o resumo geral da build.
        if (cmbMemoria.getSelectedItem() instanceof Peca) {
            
            Peca pecaSelecionada = (Peca) cmbMemoria.getSelectedItem();
            
            if (pecaSelecionada != null && pecaSelecionada.getPreco() > 0) {
                javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblMemoria.getModel();
                modelo.setRowCount(0);
                modelo.addRow(new Object[]{"Especificação", pecaSelecionada.getDetalhe1()});
                modelo.addRow(new Object[]{"Detalhe", pecaSelecionada.getDetalhe2()});
                modelo.addRow(new Object[]{"TDP (Consumo)", pecaSelecionada.getTdp() + "W"});
                modelo.addRow(new Object[]{"Preço", String.format("R$ %.2f", pecaSelecionada.getPreco())});
            }
        }
        atualizarResumo();
    }//GEN-LAST:event_cmbMemoriaActionPerformed

    private void cmbPlacaVideoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlacaVideoActionPerformed
        if (cmbPlacaVideo.getSelectedItem() instanceof Peca) {
            Peca pecaSelecionada = (Peca) cmbPlacaVideo.getSelectedItem();
            
            if (pecaSelecionada != null && pecaSelecionada.getPreco() > 0) {
                javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblPlacaVideo.getModel();
                modelo.setRowCount(0);
                modelo.addRow(new Object[]{"Especificação", pecaSelecionada.getDetalhe1()});
                modelo.addRow(new Object[]{"Detalhe", pecaSelecionada.getDetalhe2()});
                modelo.addRow(new Object[]{"TDP (Consumo)", pecaSelecionada.getTdp() + "W"});
                modelo.addRow(new Object[]{"Preço", String.format("R$ %.2f", pecaSelecionada.getPreco())});
            }
        }
        atualizarResumo(); 
    }//GEN-LAST:event_cmbPlacaVideoActionPerformed

    private void chkCoolerExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCoolerExtraActionPerformed
        atualizarResumo();
    }//GEN-LAST:event_chkCoolerExtraActionPerformed

    private void chkRgbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkRgbActionPerformed
        atualizarResumo();
    }//GEN-LAST:event_chkRgbActionPerformed

    private void chkGarantiaEstendidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkGarantiaEstendidaActionPerformed
        atualizarResumo();
    }//GEN-LAST:event_chkGarantiaEstendidaActionPerformed

    private void cmbArmazenamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbArmazenamentoActionPerformed
        if (cmbArmazenamento.getSelectedItem() instanceof Peca) {
            Peca peca = (Peca) cmbArmazenamento.getSelectedItem();
            if (peca != null && peca.getPreco() > 0) {
                javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblArmazenamento.getModel();
                modelo.setRowCount(0);
                modelo.addRow(new Object[]{"Especificação", peca.getDetalhe1()});
                modelo.addRow(new Object[]{"Detalhe", peca.getDetalhe2()});
                modelo.addRow(new Object[]{"TDP (Consumo)", peca.getTdp() + "W"});
                modelo.addRow(new Object[]{"Preço", String.format("R$ %.2f", peca.getPreco())});
            }
        }
        atualizarResumo();
    }//GEN-LAST:event_cmbArmazenamentoActionPerformed

    private void cmbPerifericosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPerifericosActionPerformed
        if (cmbPerifericos.getSelectedItem() instanceof Peca) {
            Peca peca = (Peca) cmbPerifericos.getSelectedItem();
            if (peca != null && peca.getPreco() > 0) {
                javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) tblPerifericos.getModel();
                modelo.setRowCount(0);
                modelo.addRow(new Object[]{"Especificação", peca.getDetalhe1()});
                modelo.addRow(new Object[]{"Detalhe", peca.getDetalhe2()});
                modelo.addRow(new Object[]{"TDP (Consumo)", peca.getTdp() + "W"});
                modelo.addRow(new Object[]{"Preço", String.format("R$ %.2f", peca.getPreco())});
            }
        }
        atualizarResumo();
    }//GEN-LAST:event_cmbPerifericosActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed
        javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
        fileChooser.setDialogTitle("Salvar Resumo da Build");
        
        int userSelection = fileChooser.showSaveDialog(this);
        
        if (userSelection == javax.swing.JFileChooser.APPROVE_OPTION) {
            java.io.File fileToSave = fileChooser.getSelectedFile();
            
            try (java.io.FileWriter fw = new java.io.FileWriter(fileToSave + ".txt")) {
                fw.write("=== ORÇAMENTO - PC GAMER ===\n\n");
                
                // Puxa os itens da lista lateral
                javax.swing.ListModel<String> model = listaResumo.getModel();
                for (int i = 0; i < model.getSize(); i++) {
                    fw.write(model.getElementAt(i) + "\n");
                }
                
                fw.write("\n" + lblTotal.getText() + "\n");
                fw.write("Status de Energia: " + barraEnergia.getString() + "\n");
                
                javax.swing.JOptionPane.showMessageDialog(this, "Orçamento exportado com sucesso!\nSalvo em: " + fileToSave.getAbsolutePath(), "Sucesso", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception ex) {
                javax.swing.JOptionPane.showMessageDialog(this, "Erro ao salvar o arquivo: " + ex.getMessage(), "Erro", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void menuItemExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExportarActionPerformed
        //chama o botão de exportar build
        btnExportarActionPerformed(evt);
    }//GEN-LAST:event_menuItemExportarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        try {
            String nome = txtAdminNome.getText();
            double preco = Double.parseDouble(txtAdminPreco.getText().replace(",", "."));
            int tdp = Integer.parseInt(txtAdminTdp.getText());
            int score = Integer.parseInt(txtAdminScore.getText());
            String espec = txtAdminEspec.getText();
            String detalhe = txtAdminDetalhe.getText();

            if (nome.isEmpty()) throw new Exception("O nome da peça não pode estar vazio.");

            if (pecaEmEdicao == null) {
                // CREATE (Novo)
                Peca novaPeca = new Peca(nome, preco, tdp, score, espec, detalhe);
                getListaCategoriaSelecionada().add(novaPeca);
                javax.swing.JOptionPane.showMessageDialog(this, "Peça cadastrada com sucesso!");
            } else {
                // UPDATE (Editar)
                Peca pecaAtualizada = new Peca(nome, preco, tdp, score, espec, detalhe);
                java.util.ArrayList<Peca> lista = getListaCategoriaSelecionada();
                int index = lista.indexOf(pecaEmEdicao);
                if(index != -1) lista.set(index, pecaAtualizada);
                javax.swing.JOptionPane.showMessageDialog(this, "Peça atualizada com sucesso!");
            }

            limparCamposAdmin();
            sincronizarTudo();

        } catch (NumberFormatException ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Erro: Digite apenas números nos campos de Preço, Consumo e Score.", "Erro de Digitação", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, ex.getMessage(), "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (pecaEmEdicao != null) {
            int confirmacao = javax.swing.JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir a peça: " + pecaEmEdicao.getNome() + "?", "Confirmar Exclusão", javax.swing.JOptionPane.YES_NO_OPTION);
            
            if (confirmacao == javax.swing.JOptionPane.YES_OPTION) {
                getListaCategoriaSelecionada().remove(pecaEmEdicao);
                limparCamposAdmin();
                sincronizarTudo();
                javax.swing.JOptionPane.showMessageDialog(this, "Peça excluída com sucesso.");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Selecione uma peça na tabela acima para excluir.", "Atenção", javax.swing.JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        limparCamposAdmin();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void cmbAdminCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAdminCategoriaActionPerformed
        limparCamposAdmin();
        sincronizarTudo();
    }//GEN-LAST:event_cmbAdminCategoriaActionPerformed

    private void tblAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdminMouseClicked
        int linhaSelecionada = tblAdmin.getSelectedRow();
        if (linhaSelecionada != -1) {
            java.util.ArrayList<Peca> listaAtual = getListaCategoriaSelecionada();
            pecaEmEdicao = listaAtual.get(linhaSelecionada);
            
            // Puxa os dados do objeto para a tela
            txtAdminNome.setText(pecaEmEdicao.getNome());
            txtAdminPreco.setText(String.valueOf(pecaEmEdicao.getPreco()));
            txtAdminTdp.setText(String.valueOf(pecaEmEdicao.getTdp()));
            txtAdminScore.setText(String.valueOf(pecaEmEdicao.getScore()));
            txtAdminEspec.setText(pecaEmEdicao.getDetalhe1());
            txtAdminDetalhe.setText(pecaEmEdicao.getDetalhe2());
        }
    }//GEN-LAST:event_tblAdminMouseClicked

    private void btnLimparBuildActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparBuildActionPerformed
        // 1. Reseta todos os ComboBoxes para a primeira opção ("Selecione...")
        cmbProcessador.setSelectedIndex(0);
        cmbPlacaVideo.setSelectedIndex(0);
        cmbMemoria.setSelectedIndex(0);
        cmbArmazenamento.setSelectedIndex(0);
        cmbPerifericos.setSelectedIndex(0);

        // 2. Desmarca todos os Checkboxes de opcionais
        chkCoolerExtra.setSelected(false);
        chkRgb.setSelected(false);
        chkGarantiaEstendida.setSelected(false);

        // 3. Limpa todas as tabelas de especificações
        ((javax.swing.table.DefaultTableModel) tblProcessador.getModel()).setRowCount(0);
        ((javax.swing.table.DefaultTableModel) tblPlacaVideo.getModel()).setRowCount(0);
        ((javax.swing.table.DefaultTableModel) tblMemoria.getModel()).setRowCount(0);
        ((javax.swing.table.DefaultTableModel) tblArmazenamento.getModel()).setRowCount(0);
        ((javax.swing.table.DefaultTableModel) tblPerifericos.getModel()).setRowCount(0);

        // 4. Chama o motor de cálculo para zerar a lista, o preço e as barras de energia/score
        atualizarResumo();
    }//GEN-LAST:event_btnLimparBuildActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Principal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraDesempenho;
    private javax.swing.JProgressBar barraEnergia;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimparBuild;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JCheckBox chkCoolerExtra;
    private javax.swing.JCheckBox chkGarantiaEstendida;
    private javax.swing.JCheckBox chkRgb;
    private javax.swing.JComboBox<String> cmbAdminCategoria;
    private javax.swing.JComboBox<Object> cmbArmazenamento;
    private javax.swing.JComboBox<Object> cmbMemoria;
    private javax.swing.JComboBox<Object> cmbPerifericos;
    private javax.swing.JComboBox<Object> cmbPlacaVideo;
    private javax.swing.JComboBox<Object> cmbProcessador;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labAdminDetalhe;
    private javax.swing.JLabel labAdminEspec;
    private javax.swing.JLabel labAdminNome;
    private javax.swing.JLabel labAdminPreco;
    private javax.swing.JLabel labAdminScore;
    private javax.swing.JLabel labAdminTdp;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JList<String> listaResumo;
    private javax.swing.JMenuItem menuItemExportar;
    private javax.swing.JMenuItem menuSair;
    private javax.swing.JMenuItem menuSobre;
    private javax.swing.JPanel panArmazenamento;
    private javax.swing.JPanel panBuild;
    private javax.swing.JPanel panGerenciarPecas;
    private javax.swing.JPanel panMemoriaRam;
    private javax.swing.JPanel panPerifericos;
    private javax.swing.JPanel panPlacaDeVideo;
    private javax.swing.JPanel panProcessador;
    private javax.swing.JTable tblAdmin;
    private javax.swing.JTable tblArmazenamento;
    private javax.swing.JTable tblMemoria;
    private javax.swing.JTable tblPerifericos;
    private javax.swing.JTable tblPlacaVideo;
    private javax.swing.JTable tblProcessador;
    private javax.swing.JTextField txtAdminDetalhe;
    private javax.swing.JTextField txtAdminEspec;
    private javax.swing.JTextField txtAdminNome;
    private javax.swing.JTextField txtAdminPreco;
    private javax.swing.JTextField txtAdminScore;
    private javax.swing.JTextField txtAdminTdp;
    // End of variables declaration//GEN-END:variables

    /**
     * Método central de inteligência do sistema.
     * Atualiza o preço total, a barra de energia, o score e a lista lateral.
     */
    private void atualizarResumo() {
        double totalPreco = 0.0;
        int totalTdp = 0;
        int totalScore = 0;
        
        javax.swing.DefaultListModel<String> modeloLista = new javax.swing.DefaultListModel<>();

        // Verifica o Processador
        if (cmbProcessador.getSelectedItem() instanceof Peca) {
            Peca proc = (Peca) cmbProcessador.getSelectedItem();
            if (proc.getPreco() > 0) {
                totalPreco += proc.getPreco();
                totalTdp += proc.getTdp();
                totalScore += proc.getScore();
                modeloLista.addElement("CPU: " + proc.getNome());
            }
        }

        // Verifica a Placa de Vídeo
        if (cmbPlacaVideo.getSelectedItem() instanceof Peca) {
            Peca video = (Peca) cmbPlacaVideo.getSelectedItem();
            if (video.getPreco() > 0) {
                totalPreco += video.getPreco();
                totalTdp += video.getTdp();
                totalScore += video.getScore();
                modeloLista.addElement("Vídeo/Placa: " + video.getNome());
            }
        }

        // Verifica a Memória RAM
        if (cmbMemoria.getSelectedItem() instanceof Peca) {
            Peca ram = (Peca) cmbMemoria.getSelectedItem();
            if (ram.getPreco() > 0) {
                totalPreco += ram.getPreco();
                totalTdp += ram.getTdp();
                totalScore += ram.getScore();
                modeloLista.addElement("RAM: " + ram.getNome());
            }
        }

        // Verifica o Armazenamento
        if (cmbArmazenamento.getSelectedItem() instanceof Peca) {
            Peca arm = (Peca) cmbArmazenamento.getSelectedItem();
            if (arm.getPreco() > 0) {
                totalPreco += arm.getPreco();
                totalTdp += arm.getTdp();
                totalScore += arm.getScore();
                modeloLista.addElement("Disco: " + arm.getNome());
            }
        }

        // Verifica os Periféricos
        if (cmbPerifericos.getSelectedItem() instanceof Peca) {
            Peca per = (Peca) cmbPerifericos.getSelectedItem();
            if (per.getPreco() > 0) {
                totalPreco += per.getPreco();
                totalTdp += per.getTdp();
                totalScore += per.getScore();
                modeloLista.addElement("Periférico: " + per.getNome());
            }
        }
        // Verifica os Opcionais
        if (chkCoolerExtra.isSelected()) { totalPreco += 150.0; modeloLista.addElement("+ Cooler Extra"); }
        if (chkRgb.isSelected()) { totalPreco += 100.0; modeloLista.addElement("+ Iluminação RGB"); }
        if (chkGarantiaEstendida.isSelected()) { totalPreco += 250.0; modeloLista.addElement("+ Garantia Estendida"); }

        // Atualiza a Interface Lateral
        listaResumo.setModel(modeloLista);
        lblTotal.setText(String.format("TOTAL: R$ %.2f", totalPreco));
        
        barraEnergia.setValue(totalTdp);
        barraEnergia.setString("Consumo: " + totalTdp + "W / 750W");
        barraDesempenho.setValue(totalScore);
    }
    
    // CRUD E SINCRONIZAÇÃO DE DADOS

    private java.util.ArrayList<Peca> getListaCategoriaSelecionada() {
        int index = cmbAdminCategoria.getSelectedIndex();
        switch (index) {
            case 0: return listaProcessadores;
            case 1: return listaPlacasVideo;
            case 2: return listaMemorias;
            case 3: return listaArmazenamentos;
            case 4: return listaPerifericos;
            default: return listaProcessadores;
        }
    }

    private void sincronizarTudo() {
        // 1. Atualiza a Tabela de Administração
        java.util.ArrayList<Peca> listaAtual = getListaCategoriaSelecionada();
        javax.swing.table.DefaultTableModel modeloAdmin = (javax.swing.table.DefaultTableModel) tblAdmin.getModel();
        modeloAdmin.setRowCount(0);
        modeloAdmin.setColumnIdentifiers(new String[]{"Nome", "Preço", "TDP", "Score"}); 
        
        for (Peca p : listaAtual) {
            modeloAdmin.addRow(new Object[]{p.getNome(), String.format("R$ %.2f", p.getPreco()), p.getTdp() + "W", p.getScore()});
        }

        // 2. Atualiza os ComboBoxes das abas de montagem
        atualizarComboBox(cmbProcessador, listaProcessadores);
        atualizarComboBox(cmbPlacaVideo, listaPlacasVideo);
        atualizarComboBox(cmbMemoria, listaMemorias);
        atualizarComboBox(cmbArmazenamento, listaArmazenamentos);
        atualizarComboBox(cmbPerifericos, listaPerifericos);
        
        // 3. Força o recalculo
        atualizarResumo();
    }

    private void atualizarComboBox(javax.swing.JComboBox<Object> combo, java.util.ArrayList<Peca> lista) {
        Object selecionado = combo.getSelectedItem();
        combo.removeAllItems();
        combo.addItem(new Peca("Selecione...", 0, 0, 0, "-", "-"));
        for (Peca p : lista) {
            combo.addItem(p);
        }
        if (selecionado instanceof Peca && lista.contains(selecionado)) {
            combo.setSelectedItem(selecionado);
        }
    }

    private void limparCamposAdmin() {
        txtAdminNome.setText("");
        txtAdminPreco.setText("");
        txtAdminTdp.setText("");
        txtAdminScore.setText("");
        txtAdminEspec.setText("");
        txtAdminDetalhe.setText("");
        pecaEmEdicao = null; 
    }
    
    
      //Carrega os dados iniciais do sistema para demonstração (Seed Data)
     
    private void inicializarDadosBase() {
        // Carga de Processadores
        listaProcessadores.add(new Peca("Ryzen 5 8600G", 1350.00, 65, 85, "Socket AM5", "Vídeo Integrado Radeon 760M"));
        listaProcessadores.add(new Peca("Core i3-10100F", 450.00, 65, 40, "Socket LGA1200", "Sem vídeo integrado"));
        listaProcessadores.add(new Peca("Ryzen 7 5700X3D", 1550.00, 105, 95, "Socket AM4", "Cache L3 Gigante (Jogos)"));
        
        // Carga de Placas de Vídeo
        listaPlacasVideo.add(new Peca("RTX 4060 8GB", 1850.00, 115, 95, "GDDR6", "NVIDIA DLSS 3"));
        listaPlacasVideo.add(new Peca("RX 7600 8GB", 1700.00, 130, 90, "GDDR6", "AMD RDNA 3"));
        
        // Carga de Memórias
        listaMemorias.add(new Peca("2x 8GB DDR5 5600MHz", 450.00, 10, 80, "Dual Channel", "Alta Frequência DDR5"));
        listaMemorias.add(new Peca("1x 16GB DDR4 3200MHz", 220.00, 5, 45, "Single Channel", "Padrão Custo Benefício"));
        
        // Carga de Armazenamento
        listaArmazenamentos.add(new Peca("SSD 1TB NVMe M.2", 550.00, 5, 80, "Leitura 7000MB/s", "Geração 4 ultra rápida"));
        listaArmazenamentos.add(new Peca("HD 2TB SATA 3", 350.00, 10, 20, "7200 RPM", "Armazenamento em massa"));
        
        // Carga de Periféricos (Note os Zeros no TDP e Score, conforme nossa estratégia)
        listaPerifericos.add(new Peca("Monitor 24\" 144Hz IPS", 850.00, 0, 0, "Painel IPS", "1ms de tempo de resposta"));
        listaPerifericos.add(new Peca("Mouse Gamer Superlight", 450.00, 0, 0, "Sem fio", "Sensor de precisão"));
        listaPerifericos.add(new Peca("Teclado Mecânico TKL", 300.00, 0, 0, "Switch Red", "Formato compacto"));

        // Após carregar os dados nas listas, sincronizamos a tela toda de uma vez
        sincronizarTudo();
    }
}

