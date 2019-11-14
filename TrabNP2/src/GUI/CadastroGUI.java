/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Banco.Conexao;
import Banco.PacienteDAO;
import Objetos.Paciente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class CadastroGUI extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Secretaria
     */
    
    
    
    private void limparCampos(){
        String empty="";
        
        this.txtBairro.setText(empty);
        this.txtCartaoSus.setText(empty);
        this.txtCidade.setText(empty);
        this.txtComplemento.setText(empty);
        this.txtCpf.setText(empty);
        this.txtDataNascimento.setText(empty);
        this.txtEscola.setText(empty);
        this.cmbEstado.setSelectedIndex(0);
        this.cmbDeficiencia.setSelectedIndex(0);
        this.cmbRaca.setSelectedIndex(0);
        this.txtNaturalidade.setText(empty);
        this.txtNome.setText(empty);
        this.txtNumero.setText(empty);
        this.txtProfissao.setText(empty);
        this.txtRg.setText(empty);
        this.txtRua.setText(empty);
        this.txtTelefone.setText(empty);
    }
    public CadastroGUI() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        this.limparCampos();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        panelEndereco = new javax.swing.JPanel();
        lblComplemento = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        txtRua = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        lblRua = new javax.swing.JLabel();
        txtEscola = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        lblEscola = new javax.swing.JLabel();
        lblCidade = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mascaraTelefone= new javax.swing.text.MaskFormatter("(##)9####-####");
            this.txtTelefone = new javax.swing.JFormattedTextField(mascaraTelefone);
        }
        catch (Exception e){
        }
        cmbEstado = new javax.swing.JComboBox<>();
        panelDadosPessoais = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblCartaoSUS = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        radioMasculino = new javax.swing.JRadioButton();
        this.radioMasculino.setSelected(true);
        radioFeminino = new javax.swing.JRadioButton();
        lblNaturalidade = new javax.swing.JLabel();
        txtNaturalidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtProfissao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbRaca = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbDeficiencia = new javax.swing.JComboBox<>();
        txtCartaoSus = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mascaraCartaoSus= new javax.swing.text.MaskFormatter("### #### #### ####");
            this.txtCartaoSus = new javax.swing.JFormattedTextField(mascaraCartaoSus);
        }
        catch (Exception e){
        }
        txtDataNascimento = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mascaraData= new javax.swing.text.MaskFormatter("##/##/####");
            this.txtDataNascimento = new javax.swing.JFormattedTextField(mascaraData);
        }
        catch (Exception e){
        }
        txtCpf = new javax.swing.JFormattedTextField();
        try{
            javax.swing.text.MaskFormatter mascaraCpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            this.txtCpf = new javax.swing.JFormattedTextField(mascaraCpf);
        }
        catch (Exception e){
        }
        jLabel6 = new javax.swing.JLabel();
        txtRg = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        lblComplemento.setText("Complemento:");

        lblBairro.setText("Bairro:");

        lblEstado.setText("Estado:");

        lblNumero.setText("Número:");

        lblRua.setText("Endereço:");

        lblTelefone.setText("Telefone:");

        lblEscola.setText("Escola:");

        lblCidade.setText("Cidade:");

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO" }));

        javax.swing.GroupLayout panelEnderecoLayout = new javax.swing.GroupLayout(panelEndereco);
        panelEndereco.setLayout(panelEnderecoLayout);
        panelEnderecoLayout.setHorizontalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEnderecoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRua, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEscola, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCidade, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEscola, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNumero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRua)
                    .addComponent(txtTelefone))
                .addGap(35, 35, 35)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(lblEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(lblComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelEnderecoLayout.createSequentialGroup()
                        .addComponent(lblBairro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        panelEnderecoLayout.setVerticalGroup(
            panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero)
                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(lblCidade)
                    .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEscola))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        panelDadosPessoais.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));

        lblNome.setText("Nome:");

        lblCPF.setText("CPF:");

        lblCartaoSUS.setText("Nº Cartão SUS:");

        lblDataNascimento.setText("Data de Nascimento:");

        jLabel1.setText("Sexo:");

        radioMasculino.setText("Masculino");

        radioFeminino.setText("Feminino");

        lblNaturalidade.setText("Naturalidade:");

        jLabel2.setText("Profissão:");

        jLabel3.setText("Raça/Cor:");

        cmbRaca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhum", "Branca", "Parda", "Negra", "Amarela", "Indígena", " " }));

        jLabel4.setText("Deficiência:");

        cmbDeficiencia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nenhuma", "Visual", "Auditiva", "Mental", "Física", "Múltipla" }));

        jLabel6.setText("RG:");

        javax.swing.GroupLayout panelDadosPessoaisLayout = new javax.swing.GroupLayout(panelDadosPessoais);
        panelDadosPessoais.setLayout(panelDadosPessoaisLayout);
        panelDadosPessoaisLayout.setHorizontalGroup(
            panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNaturalidade, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDataNascimento, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNome, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCartaoSUS, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCPF, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelDadosPessoaisLayout.createSequentialGroup()
                            .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtNaturalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(txtProfissao)
                                .addComponent(txtDataNascimento)
                                .addComponent(txtCpf))
                            .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDadosPessoaisLayout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(jLabel1))
                                .addGroup(panelDadosPessoaisLayout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6))))
                            .addGap(37, 37, 37)
                            .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panelDadosPessoaisLayout.createSequentialGroup()
                                    .addComponent(radioMasculino)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(radioFeminino)
                                    .addGap(41, 41, 41))
                                .addComponent(cmbDeficiencia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panelDadosPessoaisLayout.createSequentialGroup()
                                    .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(txtCartaoSus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelDadosPessoaisLayout.setVerticalGroup(
            panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDadosPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascimento)
                    .addComponent(jLabel1)
                    .addComponent(radioMasculino)
                    .addComponent(radioFeminino)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNaturalidade)
                    .addComponent(txtNaturalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbDeficiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtProfissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(panelDadosPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCartaoSUS)
                    .addComponent(txtCartaoSus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.setMinimumSize(new java.awt.Dimension(105, 23));
        btnVoltar.setPreferredSize(new java.awt.Dimension(105, 23));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("CADASTRAR USUÁRIO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(264, 264, 264))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelDadosPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDadosPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private int dadosValidados(){
        
        //VERIFICANDO SE HÁ NUMEROS NO TXT DO NOME
        for(char c : txtNome.getText().toCharArray()){
            if(Character.isDigit(c)){
                return 1;
            }
        }       
        
        //VERIFICANDO SE HÁ NUMEROS NO TXT DO NATURALIDADE
        for(char c : txtNaturalidade.getText().toCharArray()){
            if(Character.isDigit(c)){
                return 2;
            }
        }
        
        //VERIFICANDO SE HÁ NUMEROS NO TXT DO PROFISSÃO
        for(char c : txtProfissao.getText().toCharArray()){
            if(Character.isDigit(c)){
                return 3;
            }
        }
        
        //VERIFICANDO SE HÁ LETRAS NO TXT DO CPF
        for(char c : txtCpf.getText().toCharArray()){
            if(Character.isLetter(c)){
                return 4;
            }
        }
        
        //VERIFICANDO A QUANTIDADE DE DIGITOS NO TXT CPF
        if(txtCpf.getText().length()!=14){
            return 4; 
        }
        
        //VERIFICANDO SE HÁ LETRAS NO TXT DO CARTAO DO SUS
        for(char c : txtCartaoSus.getText().toCharArray()){
            if(Character.isLetter(c)){
                return 5;
            }
        }
        
        //VERIFICANDO A QUANTIDADE DE DIGITOS NO TXT CARTAO DO SUS
        if(txtCartaoSus.getText().length()!=18){
            return 5;
        }
        
        
        
        return 0;
    }
    
    
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        int dadosVal=dadosValidados();
        
        if(dadosVal==0){
                try{
                Connection con = Conexao.abrirConexao();
                Paciente pb = new Paciente();
                PacienteDAO pd = new PacienteDAO(con);

                pb.setNome(txtNome.getText());
                pb.setCartaoSUS(txtCartaoSus.getText());
                pb.setCpf(txtCpf.getText());

                pd.insert(pb);
                Conexao.fecharConexao(con);
                int continua=JOptionPane.showConfirmDialog(this,"Paciente cadastrado com sucesso!");

                if(continua==1){
                    this.dispose();
                    CadastroGUI novaTela = new CadastroGUI();
                }
            }catch(ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException e){
                System.out.println(e.getMessage());
                JOptionPane.showMessageDialog(this,"Erro ao cadastrar paciente!");
            }
        }else{
            switch(dadosVal){
                case 1:
                    JOptionPane.showMessageDialog(this,"Erro " + dadosVal + ": Nome é inválido");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(this,"Erro " + dadosVal + ": Naturalidade é inválida");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(this,"Erro " + dadosVal + ": Profissão é inválida");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(this,"Erro " + dadosVal + ": CPF é inválido");
                    break;
                case 5:
                    JOptionPane.showMessageDialog(this,"Erro " + dadosVal + ": Cartão do SUS é inválido");
                    break;
            }
            
        }
        
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        // TODO add your handling code here:
        this.limparCampos();
        
    }//GEN-LAST:event_btnLimparCamposActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CadastroGUI().setVisible(true);
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cmbDeficiencia;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbRaca;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCartaoSUS;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblComplemento;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblEscola;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblNaturalidade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel panelDadosPessoais;
    private javax.swing.JPanel panelEndereco;
    private javax.swing.JRadioButton radioFeminino;
    private javax.swing.JRadioButton radioMasculino;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCartaoSus;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtDataNascimento;
    private javax.swing.JTextField txtEscola;
    private javax.swing.JTextField txtNaturalidade;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtProfissao;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
