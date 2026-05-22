
package InterfazGrafica;
import java.awt.Color;

public class VentanaPrincipal extends javax.swing.JFrame {
    /*Class variables for sharing*/
    private static double resultadoPromedio;
    private static double desviacionEstandar;
    private static double notaMayor;
    private static double notaMenor;

    
    
    public VentanaPrincipal() {
        initComponents();
        getContentPane().setBackground(new Color(2, 49, 79));
        setLocationRelativeTo(null);
        
        
    }




    
    

/*Design and window contain-------------------------------------------------*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jCheckBox1 = new javax.swing.JCheckBox();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        inputNota1 = new javax.swing.JTextField();
        inputNota3 = new javax.swing.JTextField();
        inputNota4 = new javax.swing.JTextField();
        inputNota5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        inputNota2 = new javax.swing.JTextField();

        jLabel6.setFont(new java.awt.Font("Caladea", 0, 14)); // NOI18N
        jLabel6.setText("Nota 1");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jCheckBox1.setText("jCheckBox1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notas - Hecho por Andres Julian Moreno Montoya");
        setBackground(new java.awt.Color(0, 87, 184));

        jPanel1.setToolTipText("bold");

        jLabel1.setFont(new java.awt.Font("Caladea", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Cálculo de Notas");

        jLabel2.setFont(new java.awt.Font("Caladea", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese las cinco notas del estudiante para calcular");

        jLabel3.setFont(new java.awt.Font("Caladea", 0, 14)); // NOI18N
        jLabel3.setText("el promedio, la desviación estándar, la nota mayor ");

        jLabel4.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        jLabel4.setText("Nota 1:");

        jLabel5.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        jLabel5.setText("Nota 3:");

        jLabel7.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        jLabel7.setText("Nota 2:");

        jLabel8.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        jLabel8.setText("Nota 4:");

        jLabel9.setFont(new java.awt.Font("Caladea", 1, 14)); // NOI18N
        jLabel9.setText("Nota 5:");

        btnCalcular.setBackground(new java.awt.Color(0, 87, 184));
        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Cálcular");
        btnCalcular.addActionListener(this::btnCalcularActionPerformed);

        btnLimpiar.setBackground(new java.awt.Color(0, 87, 184));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        inputNota1.setText("0");

        inputNota3.setText("0");

        inputNota4.setText("0");

        inputNota5.setText("0");

        jLabel10.setFont(new java.awt.Font("Caladea", 0, 14)); // NOI18N
        jLabel10.setText("y la nota menor.");

        inputNota2.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel4)
                                                            .addComponent(jLabel7))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(inputNota1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(inputNota2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(inputNota5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(135, 135, 135))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel5))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(inputNota3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(inputNota4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(134, 134, 134)))
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(inputNota1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNota2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputNota3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(inputNota4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(inputNota5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

;    
/*Methods*/
private double calcularPromedio(double nota1, double nota2, double nota3, double nota4, double nota5){
    double promedio=(nota1+nota2+nota3+nota4+nota5)/5;
    return promedio;
}

private double calcularNotaMayor(double nota1, double nota2, double nota3, double nota4, double nota5){
    double notaMayor=Math.max(Math.max(nota1, nota2),Math.max(Math.max(nota3, nota4),nota5));
    return notaMayor;
}

private double calcularNotaMenor(double nota1, double nota2, double nota3, double nota4, double nota5){
    double notaMenor=Math.min(Math.min(nota1, nota2),Math.min(Math.min(nota3, nota4),nota5));
    return notaMenor;
}

private double calcularDesviacionEstandar(double nota1, double nota2, double nota3, double nota4, double nota5){
    resultadoPromedio=getResultadoPromedio();
    double suma=Math.pow((nota1-resultadoPromedio),2)+
            Math.pow((nota2-resultadoPromedio),2)+
            Math.pow((nota3-resultadoPromedio),2)+
            Math.pow((nota4-resultadoPromedio),2)+
            Math.pow((nota5-resultadoPromedio),2);
    double desviacionEstandar=Math.sqrt(suma/5);
    return desviacionEstandar;
}


    
    
/*Actions*/    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double nota1=Double.parseDouble(inputNota1.getText());
        double nota2=Double.parseDouble(inputNota2.getText());
        double nota3=Double.parseDouble(inputNota3.getText());
        double nota4=Double.parseDouble(inputNota4.getText());
        double nota5=Double.parseDouble(inputNota5.getText());
        java.awt.EventQueue.invokeLater(() -> new VentanaResultados().setVisible(true));
        this.resultadoPromedio=calcularPromedio(nota1, nota2, nota3, nota4, nota5);
        this.desviacionEstandar=Math.round(calcularDesviacionEstandar(nota1, nota2, nota3, nota4, nota5)*1000.0)/1000.0;
        this.notaMayor=calcularNotaMayor(nota1, nota2, nota3, nota4, nota5);
        this.notaMenor=calcularNotaMenor(nota1, nota2, nota3, nota4, nota5);

    }//GEN-LAST:event_btnCalcularActionPerformed

            
/*Get data---------------------------*/

    public static double getResultadoPromedio(){
        return resultadoPromedio;
    }

    public static double getDesviacionEstandar() {
        return desviacionEstandar;
    }

    public static double getNotaMayor() {
        return notaMayor;
    }

    public static double getNotaMenor() {
        return notaMenor;
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField inputNota1;
    private javax.swing.JTextField inputNota2;
    private javax.swing.JTextField inputNota3;
    private javax.swing.JTextField inputNota4;
    private javax.swing.JTextField inputNota5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
