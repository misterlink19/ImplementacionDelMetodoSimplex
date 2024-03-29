/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciondelmetodosimplex;

import java.awt.CardLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

/**
 *
 * @author Amle 100388132
 */
public class VentanaGUI extends javax.swing.JFrame {

  /**
   * Creates new form VentanaGUI
   */
  private Simplex metodoSimplex;
  int numeroDeRestricciones;
  int numeroDeIncognitas;
  boolean maximoOMinimo;
  
  public VentanaGUI() {
    initComponents();
    this.setTitle( "Metodo Simplex Creado por Amle Martinez" );
    setExtendedState( java.awt.Frame.MAXIMIZED_BOTH );
    
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    java.awt.GridBagConstraints gridBagConstraints;

    buttonGroup1 = new javax.swing.ButtonGroup();
    PanelPrincipal = new javax.swing.JPanel();
    PanelDeInicio = new javax.swing.JPanel();
    PanelContendor1 = new javax.swing.JPanel();
    cantidadDeRestriccionesLabel = new javax.swing.JLabel();
    cantidadDeIncognitasTextField = new javax.swing.JTextField();
    cantidadDeRestriccionesTextField = new javax.swing.JTextField();
    maximizarRadioButton = new javax.swing.JRadioButton();
    minimizarRadioButton = new javax.swing.JRadioButton();
    crearMatrizButton = new javax.swing.JButton();
    tituloAdentroLabel = new javax.swing.JLabel();
    cantidadDeIncognitasLabel = new javax.swing.JLabel();
    PanelDeInputVariables = new javax.swing.JPanel();
    PanelContendor2 = new javax.swing.JPanel();
    tituloDelPanelDeInputLabel = new javax.swing.JLabel();
    resolverProblemaButton = new javax.swing.JButton();
    elScrollPane1 = new javax.swing.JScrollPane();
    tablaMatriz = new javax.swing.JTable();
    tituloFilaZ = new javax.swing.JLabel();
    avisoSobreEnter = new javax.swing.JLabel();
    elOtroScrollPane = new javax.swing.JScrollPane();
    tablaZ = new javax.swing.JTable();
    botonDeRegresar1 = new javax.swing.JButton();
    PanelDeMostrarResultados = new javax.swing.JPanel();
    PanelContenedor3 = new javax.swing.JPanel();
    tituloDelPanelResultados = new javax.swing.JLabel();
    botonDeCacularSimplex = new javax.swing.JButton();
    botonDeRegresar2 = new javax.swing.JButton();
    elScrollPanelDeResultados = new javax.swing.JScrollPane();
    areaDeResultadosjTextArea1 = new javax.swing.JTextArea();
    salirBoton = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setName("VentanaPrincipal"); // NOI18N

    PanelPrincipal.setLayout(new java.awt.CardLayout());

    PanelDeInicio.setLayout(new java.awt.GridBagLayout());

    cantidadDeRestriccionesLabel.setText("Cantidad de restricciones");

    cantidadDeIncognitasTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cantidadDeIncognitasTextFieldActionPerformed(evt);
      }
    });

    cantidadDeRestriccionesTextField.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cantidadDeRestriccionesTextFieldActionPerformed(evt);
      }
    });

    buttonGroup1.add(maximizarRadioButton);
    maximizarRadioButton.setSelected(true);
    maximizarRadioButton.setText("Maximizar");
    maximizarRadioButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        maximizarRadioButtonActionPerformed(evt);
      }
    });

    buttonGroup1.add(minimizarRadioButton);
    minimizarRadioButton.setText("Minimizar");

    crearMatrizButton.setText("Crear Matriz");
    crearMatrizButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        crearMatrizButtonActionPerformed(evt);
      }
    });

    tituloAdentroLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    tituloAdentroLabel.setText("Metodo Simplex");

    cantidadDeIncognitasLabel.setText("Cantidad de incognitas");

    javax.swing.GroupLayout PanelContendor1Layout = new javax.swing.GroupLayout(PanelContendor1);
    PanelContendor1.setLayout(PanelContendor1Layout);
    PanelContendor1Layout.setHorizontalGroup(
      PanelContendor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContendor1Layout.createSequentialGroup()
        .addContainerGap(144, Short.MAX_VALUE)
        .addComponent(cantidadDeRestriccionesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
      .addGroup(PanelContendor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PanelContendor1Layout.createSequentialGroup()
          .addContainerGap()
          .addGroup(PanelContendor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PanelContendor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(PanelContendor1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(tituloAdentroLabel))
              .addGroup(PanelContendor1Layout.createSequentialGroup()
                .addComponent(cantidadDeIncognitasLabel)
                .addGap(16, 16, 16)
                .addComponent(cantidadDeIncognitasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(PanelContendor1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(maximizarRadioButton)
                .addGap(17, 17, 17)
                .addComponent(minimizarRadioButton))
              .addGroup(PanelContendor1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(crearMatrizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(PanelContendor1Layout.createSequentialGroup()
              .addComponent(cantidadDeRestriccionesLabel)
              .addGap(123, 123, 123)))
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );
    PanelContendor1Layout.setVerticalGroup(
      PanelContendor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelContendor1Layout.createSequentialGroup()
        .addGap(86, 86, 86)
        .addComponent(cantidadDeRestriccionesTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(127, Short.MAX_VALUE))
      .addGroup(PanelContendor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(PanelContendor1Layout.createSequentialGroup()
          .addContainerGap()
          .addComponent(tituloAdentroLabel)
          .addGap(21, 21, 21)
          .addGroup(PanelContendor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cantidadDeIncognitasLabel)
            .addComponent(cantidadDeIncognitasTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
          .addComponent(cantidadDeRestriccionesLabel)
          .addGap(38, 38, 38)
          .addGroup(PanelContendor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(maximizarRadioButton)
            .addComponent(minimizarRadioButton))
          .addGap(7, 7, 7)
          .addComponent(crearMatrizButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
    );

    PanelDeInicio.add(PanelContendor1, new java.awt.GridBagConstraints());

    PanelPrincipal.add(PanelDeInicio, "PanelDeInicio");

    PanelDeInputVariables.setLayout(new java.awt.GridBagLayout());

    tituloDelPanelDeInputLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    tituloDelPanelDeInputLabel.setText("Digite el valor de las variables");

    resolverProblemaButton.setText("Resolver");
    resolverProblemaButton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        resolverProblemaButtonActionPerformed(evt);
      }
    });

    tablaMatriz.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {

      }
    ));
    tablaMatriz.setName(""); // NOI18N
    elScrollPane1.setViewportView(tablaMatriz);

    tituloFilaZ.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    tituloFilaZ.setText("Fila Z");

    avisoSobreEnter.setText("Debe presione Enter al introducir cada valor para que se guarden");

    elOtroScrollPane.setViewportView(tablaZ);

    botonDeRegresar1.setText("Regresar");
    botonDeRegresar1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonDeRegresar1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout PanelContendor2Layout = new javax.swing.GroupLayout(PanelContendor2);
    PanelContendor2.setLayout(PanelContendor2Layout);
    PanelContendor2Layout.setHorizontalGroup(
      PanelContendor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(elScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
      .addGroup(PanelContendor2Layout.createSequentialGroup()
        .addGroup(PanelContendor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(PanelContendor2Layout.createSequentialGroup()
            .addGap(82, 82, 82)
            .addGroup(PanelContendor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addGroup(PanelContendor2Layout.createSequentialGroup()
                .addComponent(botonDeRegresar1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resolverProblemaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(PanelContendor2Layout.createSequentialGroup()
                .addComponent(tituloFilaZ, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(elOtroScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(PanelContendor2Layout.createSequentialGroup()
            .addGap(182, 182, 182)
            .addComponent(tituloDelPanelDeInputLabel))
          .addGroup(PanelContendor2Layout.createSequentialGroup()
            .addGap(148, 148, 148)
            .addComponent(avisoSobreEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    PanelContendor2Layout.setVerticalGroup(
      PanelContendor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelContendor2Layout.createSequentialGroup()
        .addComponent(tituloDelPanelDeInputLabel)
        .addGap(1, 1, 1)
        .addComponent(avisoSobreEnter)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(elScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGroup(PanelContendor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(PanelContendor2Layout.createSequentialGroup()
            .addGap(24, 24, 24)
            .addComponent(tituloFilaZ))
          .addGroup(PanelContendor2Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(elOtroScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addGroup(PanelContendor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(resolverProblemaButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
          .addComponent(botonDeRegresar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.ipadx = 236;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(11, 0, 11, 0);
    PanelDeInputVariables.add(PanelContendor2, gridBagConstraints);

    PanelPrincipal.add(PanelDeInputVariables, "PanelDeInputVariables");

    PanelDeMostrarResultados.setLayout(new java.awt.GridBagLayout());

    tituloDelPanelResultados.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    tituloDelPanelResultados.setText("Resultados del metódo Simplex");

    botonDeCacularSimplex.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    botonDeCacularSimplex.setText("Empezar a calcular");
    botonDeCacularSimplex.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonDeCacularSimplexActionPerformed(evt);
      }
    });

    botonDeRegresar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    botonDeRegresar2.setText("Regresar");
    botonDeRegresar2.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        botonDeRegresar2ActionPerformed(evt);
      }
    });

    areaDeResultadosjTextArea1.setColumns(20);
    areaDeResultadosjTextArea1.setRows(5);
    elScrollPanelDeResultados.setViewportView(areaDeResultadosjTextArea1);

    salirBoton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    salirBoton.setText("Salir");
    salirBoton.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        salirBotonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout PanelContenedor3Layout = new javax.swing.GroupLayout(PanelContenedor3);
    PanelContenedor3.setLayout(PanelContenedor3Layout);
    PanelContenedor3Layout.setHorizontalGroup(
      PanelContenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelContenedor3Layout.createSequentialGroup()
        .addGroup(PanelContenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(elScrollPanelDeResultados, javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(PanelContenedor3Layout.createSequentialGroup()
            .addGap(151, 151, 151)
            .addComponent(botonDeRegresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30)
            .addComponent(botonDeCacularSimplex, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(33, 33, 33)
            .addComponent(salirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 164, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedor3Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tituloDelPanelResultados)
            .addGap(188, 188, 188)))
        .addContainerGap())
    );
    PanelContenedor3Layout.setVerticalGroup(
      PanelContenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelContenedor3Layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addComponent(tituloDelPanelResultados)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(elScrollPanelDeResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(26, 26, 26)
        .addGroup(PanelContenedor3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(botonDeCacularSimplex, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(botonDeRegresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(salirBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(26, Short.MAX_VALUE))
    );

    PanelDeMostrarResultados.add(PanelContenedor3, new java.awt.GridBagConstraints());

    PanelPrincipal.add(PanelDeMostrarResultados, "PanelDeMostrarResultados");

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
    );

    PanelPrincipal.getAccessibleContext().setAccessibleDescription("");

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void maximizarRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maximizarRadioButtonActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_maximizarRadioButtonActionPerformed

  private void crearMatrizButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearMatrizButtonActionPerformed
    // TODO add your handling code here:   
    String numeroInco = this.cantidadDeIncognitasTextField.getText();
    String numeroRestri = this.cantidadDeRestriccionesTextField.getText();
    
    if ( !(numeroInco.equals( "1" ) || numeroInco.equals( "" ) || numeroRestri.equals( "" ) || numeroRestri.equals( "1" )) ) {
      
      numeroDeIncognitas = Integer.parseInt( numeroInco );
      numeroDeRestricciones = Integer.parseInt( numeroRestri );
      maximoOMinimo = !maximizarRadioButton.isSelected();
      metodoSimplex = new Simplex( numeroDeRestricciones, numeroDeIncognitas, maximoOMinimo );
      
      for ( int i = 0; i <= numeroDeIncognitas + numeroDeRestricciones; i++ ) {
        
      }
      CardLayout card = (CardLayout) PanelPrincipal.getLayout();
      card.show( PanelPrincipal, "PanelDeInputVariables" );
      
      DefaultTableModel model = (DefaultTableModel) tablaMatriz.getModel();
      DefaultTableModel modeloZ = (DefaultTableModel) tablaZ.getModel();
      
      for ( int i = 0; i <= numeroDeIncognitas; i++ ) {
        modeloZ.addColumn( "X" + (i + 1) );
      }
      modeloZ.setRowCount( 1 );
      modeloZ.setColumnCount( numeroDeIncognitas );
      
      for ( int i = 0; i < numeroDeIncognitas; i++ ) {
        tablaZ.setValueAt( "", 0, i );
      }
      
      for ( int i = 0; i < numeroDeIncognitas + 2; i++ ) {
        if ( i == numeroDeIncognitas ) {
          model.addColumn( "Signo" );
        }
        else if ( i == numeroDeIncognitas + 1 ) {
          model.addColumn( "R" );
        }
        else {
          model.addColumn( "X" + (i + 1) );
        }
      }
      
      model.setRowCount( numeroDeRestricciones );
      model.setColumnCount( (numeroDeIncognitas + 2) );
      
      for ( int i = 0; i < numeroDeRestricciones; i++ ) {
        for ( int j = 0; j < numeroDeIncognitas + 2; j++ ) {
          if ( j == numeroDeIncognitas ) {
            tablaMatriz.setValueAt( "<=", i, j );
          }
          else {
            tablaMatriz.setValueAt( "", i, j );
          }
        }
      }
      TableColumn columnaSigno = tablaMatriz.getColumnModel().getColumn( numeroDeIncognitas );
      JComboBox<String> signos = new JComboBox<>();
      signos.addItem( "<=" );
      signos.addItem( "=" );
      signos.addItem( ">=" );
      columnaSigno.setCellEditor( new DefaultCellEditor( signos ) );
    }
    else {
      JDialog dialog = new JOptionPane( "No se permiten valores menores que 1 en ambos campos", JOptionPane.ERROR_MESSAGE, JOptionPane.DEFAULT_OPTION ).createDialog( " Error" );
      dialog.setAlwaysOnTop( true );
      dialog.setVisible( true );
      dialog.dispose();
    }
  }//GEN-LAST:event_crearMatrizButtonActionPerformed

  private void cantidadDeIncognitasTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDeIncognitasTextFieldActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cantidadDeIncognitasTextFieldActionPerformed

  private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_jTextField1ActionPerformed

  private void cantidadDeRestriccionesTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadDeRestriccionesTextFieldActionPerformed
    // TODO add your handling code here:
  }//GEN-LAST:event_cantidadDeRestriccionesTextFieldActionPerformed

  private void resolverProblemaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolverProblemaButtonActionPerformed
    // TODO add your handling code here:
    float[][] matriz = new float[numeroDeRestricciones + 1][numeroDeIncognitas + 2];
    
    CardLayout card = (CardLayout) PanelPrincipal.getLayout();
    card.show( PanelPrincipal, "PanelDeMostrarResultados" );
    
    TableModel mTabla = tablaMatriz.getModel();
    int nFilas = mTabla.getRowCount();
    int nColumnas = mTabla.getColumnCount();
    
    for ( int i = 0; i < nFilas; i++ ) {
      for ( int j = 0; j < nColumnas; j++ ) {
        String valor = mTabla.getValueAt( i, j ).toString();
        switch ( valor ) {
          case "<=":
            matriz[i][j] = 1;
            break;
          case "=":
            matriz[i][j] = 0;
            break;
          case ">=":
            matriz[i][j] = -1;
            break;
          case "":
            matriz[i][j] = 0;
            break;
          default:
            matriz[i][j] = Float.parseFloat( valor );
            break;
        }
      }
    }
    
    TableModel mTablaZ = tablaZ.getModel();
    int nColumnasZ = mTablaZ.getColumnCount();
    String valorColZ;
    for ( int i = 0; i < nColumnasZ; i++ ) {
      valorColZ = mTablaZ.getValueAt( 0, i ).toString();
      if ( valorColZ.equals( "" ) ) {
        matriz[numeroDeRestricciones][i] = 0;
      }
      else {
        matriz[numeroDeRestricciones][i] = -1 * Float.parseFloat( valorColZ );
      }
    }
    metodoSimplex.rellenaTabla( matriz );
    metodoSimplex.imprimirTablas();
    
    float[][] tabla = metodoSimplex.getTabla();
    
    for ( int i = 0; i < tabla[0].length; i++ ) {
      if ( i < numeroDeIncognitas ) {
        areaDeResultadosjTextArea1.append( "X" + (i + 1) + "\t" );
      }
      else if ( i >= numeroDeIncognitas && i < (numeroDeIncognitas + numeroDeRestricciones) ) {
        areaDeResultadosjTextArea1.append( "S" + (i - 1) + "\t" );
      }
      else {
        areaDeResultadosjTextArea1.append( "R" + "\t" );
      }
    }
    areaDeResultadosjTextArea1.append( "\n" );
    
    for ( int i = 0; i < tabla.length; i++ ) {
      for ( int j = 0; j < tabla[i].length; j++ ) {
        String valor = String.format( "%.2f", tabla[i][j] );
        areaDeResultadosjTextArea1.append( valor + "\t" );
      }
      areaDeResultadosjTextArea1.append( "\n" );
    }
    areaDeResultadosjTextArea1.append( "\n" );

  }//GEN-LAST:event_resolverProblemaButtonActionPerformed

  private void botonDeRegresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeRegresar1ActionPerformed
    // TODO add your handling code here:
    CardLayout card = (CardLayout) PanelPrincipal.getLayout();
    card.show( PanelPrincipal, "PanelDeInicio" );
  }//GEN-LAST:event_botonDeRegresar1ActionPerformed

  private void botonDeRegresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeRegresar2ActionPerformed
    // TODO add your handling code here:
    CardLayout card = (CardLayout) PanelPrincipal.getLayout();
    card.show( PanelPrincipal, "PanelDeInputVariables" );
    areaDeResultadosjTextArea1.setText( "" );
  }//GEN-LAST:event_botonDeRegresar2ActionPerformed

  private void botonDeCacularSimplexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeCacularSimplexActionPerformed
    // TODO add your handling code here:
    float[][] tabla = metodoSimplex.getTabla();    
    metodoSimplex.buscarVariableDeEntrada();
    metodoSimplex.buscarFilaPivote();
    areaDeResultadosjTextArea1.append( "Elemento Pivote: " + metodoSimplex.getElementoPivote() + " en la fila " + (metodoSimplex.getPosicicionDeFilaPivote() + 1) + " columna " + (metodoSimplex.getPosicicionDeColumnaPivote() + 1) );
    areaDeResultadosjTextArea1.append( "\n" );
    
    metodoSimplex.actualizaFilaPivote();
    metodoSimplex.caculaElRestoDeFilas();
    
    for ( int i = 0; i < tabla[0].length; i++ ) {
      if ( i < numeroDeIncognitas ) {
        areaDeResultadosjTextArea1.append( "X" + (i + 1) + "\t" );
      }
      else if ( i >= numeroDeIncognitas && i < (numeroDeIncognitas + numeroDeRestricciones) ) {
        areaDeResultadosjTextArea1.append( "S" + (i - 1) + "\t" );
      }
      else {
        areaDeResultadosjTextArea1.append( "R" + "\t" );
      }
    }
    areaDeResultadosjTextArea1.append( "\n" );
    
    for ( int i = 0; i < tabla.length; i++ ) {
      for ( int j = 0; j < tabla[i].length; j++ ) {
        String valor = String.format( "%.2f", tabla[i][j] );
        areaDeResultadosjTextArea1.append( valor + "\t" );
      }
      areaDeResultadosjTextArea1.append( "\n" );
    }
    areaDeResultadosjTextArea1.append( "\n" );
    botonDeCacularSimplex.setText( "Siguiente Iteraccion" );
    
    if ( metodoSimplex.esOptimo() ) {
      areaDeResultadosjTextArea1.append( "\n" + "Esta es la solucion optima" + "\n" );
      String valor = String.format( "%.2f", tabla[tabla.length - 1][tabla[0].length - 1] );
      areaDeResultadosjTextArea1.append( "Z = " + valor + "\n" );
      
      float[] valoresSolucion = metodoSimplex.getColumnaSolucion();
      
      for ( int i = 0; i < valoresSolucion.length; i++ ) {
        if ( i + 1 <= numeroDeIncognitas ) {
          valor = String.format( "%.2f", valoresSolucion[i] );
          areaDeResultadosjTextArea1.append( "X" + (i + 1) + " = " + valor + "\n" );
        }
        else {
          valor = String.format( "%.2f", valoresSolucion[i] );
          areaDeResultadosjTextArea1.append( "S" + (i - 1) + " = " + valor + "\n" );
        }
      }
      if ( metodoSimplex.isSolInfinita() ) {
        areaDeResultadosjTextArea1.append( "Este problema tiene mas de una solucion.\n Ya que hay mas variables no basicas con valor cero en la fila Z" );
      }else if ( numeroDeIncognitas > numeroDeRestricciones ) {
        areaDeResultadosjTextArea1.append( "Este problema tiene mas de una solucion.\n Ya que hay mas variables que cumplen con la restriccion del problema" );        
      }
      botonDeCacularSimplex.setEnabled( false );
      botonDeRegresar2.setEnabled( false );
    }
    else if ( metodoSimplex.esAcotada() ) {
      
      areaDeResultadosjTextArea1.append( "El problema tiene solución ilimitada (no acotada).\nHasta aqui llego la matriz.\n" );      
      
      String valor = String.format( "%.2f", tabla[tabla.length - 1][tabla[0].length - 1] );
      areaDeResultadosjTextArea1.append( "Z = " + valor + "\n" );
      
      float[] valoresSolucion = metodoSimplex.getColumnaSolucion();
      
      for ( int i = 0; i < valoresSolucion.length; i++ ) {
        if ( i + 1 <= numeroDeIncognitas ) {
          valor = String.format( "%.2f", valoresSolucion[i] );
          areaDeResultadosjTextArea1.append( "X" + (i + 1) + " = " + valor + "\n" );
        }
        else {
          valor = String.format( "%.2f", valoresSolucion[i] );
          areaDeResultadosjTextArea1.append( "S" + (i - 1) + " = " + valor + "\n" );
        }
      }
      botonDeCacularSimplex.setEnabled( false );
      botonDeRegresar2.setEnabled( false );
    }
  }//GEN-LAST:event_botonDeCacularSimplexActionPerformed

  private void salirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBotonActionPerformed
    // TODO add your handling code here:
    System.exit( 0 );
  }//GEN-LAST:event_salirBotonActionPerformed

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
      for ( javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels() ) {
        if ( "Nimbus".equals( info.getName() ) ) {
          javax.swing.UIManager.setLookAndFeel( info.getClassName() );
          break;
        }
      }
    }
    catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger( VentanaGUI.class
              .getName() ).log( java.util.logging.Level.SEVERE, null, ex );
    }
    catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger( VentanaGUI.class
              .getName() ).log( java.util.logging.Level.SEVERE, null, ex );
    }
    catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger( VentanaGUI.class
              .getName() ).log( java.util.logging.Level.SEVERE, null, ex );
    }
    catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger( VentanaGUI.class
              .getName() ).log( java.util.logging.Level.SEVERE, null, ex );
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater( new Runnable() {
      public void run() {
        new VentanaGUI().setVisible( true );
      }
    } );
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel PanelContendor1;
  private javax.swing.JPanel PanelContendor2;
  private javax.swing.JPanel PanelContenedor3;
  private javax.swing.JPanel PanelDeInicio;
  private javax.swing.JPanel PanelDeInputVariables;
  private javax.swing.JPanel PanelDeMostrarResultados;
  private javax.swing.JPanel PanelPrincipal;
  private javax.swing.JTextArea areaDeResultadosjTextArea1;
  private javax.swing.JLabel avisoSobreEnter;
  private javax.swing.JButton botonDeCacularSimplex;
  private javax.swing.JButton botonDeRegresar1;
  private javax.swing.JButton botonDeRegresar2;
  private javax.swing.ButtonGroup buttonGroup1;
  private javax.swing.JLabel cantidadDeIncognitasLabel;
  private javax.swing.JTextField cantidadDeIncognitasTextField;
  private javax.swing.JLabel cantidadDeRestriccionesLabel;
  private javax.swing.JTextField cantidadDeRestriccionesTextField;
  private javax.swing.JButton crearMatrizButton;
  private javax.swing.JScrollPane elOtroScrollPane;
  private javax.swing.JScrollPane elScrollPane1;
  private javax.swing.JScrollPane elScrollPanelDeResultados;
  private javax.swing.JRadioButton maximizarRadioButton;
  private javax.swing.JRadioButton minimizarRadioButton;
  private javax.swing.JButton resolverProblemaButton;
  private javax.swing.JButton salirBoton;
  private javax.swing.JTable tablaMatriz;
  private javax.swing.JTable tablaZ;
  private javax.swing.JLabel tituloAdentroLabel;
  private javax.swing.JLabel tituloDelPanelDeInputLabel;
  private javax.swing.JLabel tituloDelPanelResultados;
  private javax.swing.JLabel tituloFilaZ;
  // End of variables declaration//GEN-END:variables
}
