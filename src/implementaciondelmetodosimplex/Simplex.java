/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementaciondelmetodosimplex;

import java.util.Arrays;

/*
TODO:
-Revisar cosas sobre solucion infinita y borrar codigo de mas
 */
/**
 *
 * @author Amle
 */
public class Simplex {

  private int filas, columnas;
  private float[][] tabla;
  private boolean estamosMinimizando;
  private boolean solucionOptima;
  private float[] filaPivote;
  private float[] columnaPivote;
  private float[] columnaSolucion;
  private float elementoPivote;
  private int posicicionDeColumnaPivote;
  private int posicicionDeFilaPivote;
  private String nombreColumna;
  private String[] nombresFilas;
  private boolean solAcotada;
  private boolean solInfinita;

  //Constructor de la clase Simplex
  public Simplex(int numeroDeRestricciones, int numeroDeIncognitas, boolean maximoOMinimo) {
    filas = numeroDeRestricciones + 1; // numero de fila
    columnas = numeroDeIncognitas;   // numero de columna
    tabla = new float[filas][]; // Se crea un arrgleo 2d
    estamosMinimizando = maximoOMinimo; // Se averigua si va a maximizar o minimizar
    solucionOptima = false;
    solAcotada = false;
    solInfinita = false;
    posicicionDeColumnaPivote = 0;
    posicicionDeFilaPivote = 0;
    elementoPivote = 0;

    // Se inicializan las referencias a los arreglos
    for ( int i = 0; i < filas; i++ ) {
      tabla[i] = new float[columnas + numeroDeRestricciones + 1];
    }
    columnaPivote = new float[tabla.length];
    columnaSolucion = new float[tabla[0].length - 1];
    filaPivote = new float[tabla[0].length];
    nombresFilas = new String[numeroDeRestricciones];
    for ( int i = 0; i < nombresFilas.length; i++ ) {
      nombresFilas[i] = "S" + (i + 1);
    }
    for ( int i = 0; i < columnaSolucion.length; i++ ) {
      columnaSolucion[i] = 0;
    }

  }

  public int getPosicicionDeColumnaPivote() {
    return posicicionDeColumnaPivote;
  }

  public float[] getFilaPivote() {
    return filaPivote;
  }

  public int getPosicicionDeFilaPivote() {
    return posicicionDeFilaPivote;
  }

  public int getFilas() {
    return filas;
  }

  public void setFilas(int filas) {
    if ( filas > 0 ) {
      this.filas = filas;
    }
    else {
      System.out.println( "Error no se aceptan numeros negativos en las filas" );
    }
  }

  public int getColumnas() {
    return columnas;
  }

  public void setColumnas(int columnas) {
    if ( columnas > 0 ) {
      this.columnas = columnas;
    }
    else {
      System.out.println( "Error no se aceptan numeros negativos en las columnas" );
    }
  }

  public float[][] getTabla() {
    return tabla;
  }

  public void setTabla(float[][] tabla) {
    this.tabla = tabla;
  }

  public boolean isEstamosMinimizando() {
    return estamosMinimizando;
  }

  public void setEstamosMinimizando(boolean estamosMinimizando) {
    this.estamosMinimizando = estamosMinimizando;
  }

  public boolean isSolucionOptima() {
    return solucionOptima;
  }

  public void setSolucionOptima(boolean solucionOptima) {
    this.solucionOptima = solucionOptima;
  }

  public float getElementoPivote() {
    return elementoPivote;
  }

  public float[] getColumnaSolucion() {
    return columnaSolucion;
  }

  public boolean isSolInfinita() {
    return solInfinita;
  }

  //Metodo para poner los datos en la tabla
  public void rellenaTabla(float[][] datos) {
    float[][] matrixIdentidad;
    matrixIdentidad = new float[filas][filas];

    for ( int i = 0; i < filas; i++ ) {
      matrixIdentidad[i][i] = datos[i][columnas];
    }

    for ( int i = 0; i < tabla.length; i++ ) {
      System.arraycopy( datos[i], 0, this.tabla[i], 0, columnas );
      System.arraycopy( matrixIdentidad[i], 0, this.tabla[i], columnas, matrixIdentidad.length );
      tabla[i][tabla[i].length - 1] = datos[i][datos[i].length - 1];
    }
  }

  public boolean esAcotada() {
    if ( solAcotada ) {
      System.out.println( "El problema tiene solución ilimitada (no acotada)." );
      System.out.println( "Hasta aqui llego la matriz" );
      this.imprimirTablas();

      System.out.println( "Z = " + tabla[filas - 1][tabla[0].length - 1] );
      for ( int i = 0; i < tabla.length - 1; i++ ) {
        for ( int j = 0; j < tabla[i].length - 1; j++ ) {
          if ( j + 1 <= columnas ) {
            if ( ("X" + (j + 1)).equals( nombresFilas[i] ) ) {
              columnaSolucion[j] = tabla[i][tabla[i].length - 1];
              break;
            }
          }
          else {
            if ( ("S" + (j - 1)).equals( nombresFilas[i] ) ) {
              columnaSolucion[j] = tabla[i][tabla[i].length - 1];
              break;
            }
          }
        }
      }
      for ( int i = 0; i < columnaSolucion.length; i++ ) {
        if ( i + 1 <= columnas ) {
          System.out.println( "X" + (i + 1) + " = " + columnaSolucion[i] );
        }
        else {
          System.out.println( "S" + (i - 1) + " = " + columnaSolucion[i] );
        }
      }
    }
    return solAcotada;
  }

  public boolean esOptimo() {
    int contadorDeNegativos = 0,
            contadorDePositivos = 0,
            contadorDeNumeros = 0,
            cuentaCeros = 0;
    float valor;
    for ( int i = 0; i < tabla[0].length; i++ ) {
      valor = tabla[filas - 1][i];
      if ( valor != 0 ) {
        contadorDeNumeros++;
        if ( valor >= 0 ) {
          contadorDePositivos++;
        }
        else if ( valor <= 0 ) {
          contadorDeNegativos++;
        }
      }
    }
    if ( contadorDePositivos == contadorDeNumeros ) {
      if ( !estamosMinimizando ) {
        solucionOptima = true;
        System.out.println( "Es solucion optima para maximizacion" );
        System.out.println( "Z = " + tabla[filas - 1][tabla[0].length - 1] );

        for ( int i = 0; i < tabla.length - 1; i++ ) {
          for ( int j = 0; j < tabla[i].length - 1; j++ ) {
            if ( j + 1 <= columnas ) {
              if ( ("X" + (j + 1)).equals( nombresFilas[i] ) ) {
                columnaSolucion[j] = tabla[i][tabla[i].length - 1];
                break;
              }
            }
            else {
              if ( ("S" + (j - 1)).equals( nombresFilas[i] ) ) {
                columnaSolucion[j] = tabla[i][tabla[i].length - 1];
                break;
              }
            }
          }
        }
        for ( int i = 0; i < columnaSolucion.length; i++ ) {
          if ( i + 1 <= columnas ) {
            System.out.println( "X" + (i + 1) + " = " + columnaSolucion[i] );
          }
          else {
            System.out.println( "S" + (i - 1) + " = " + columnaSolucion[i] );
          }
        }
      }
      for ( int i = 0; i < tabla[0].length - 1; i++ ) {
        if ( tabla[filas - 1][i] == 0 ) {
          cuentaCeros++;
        }
      }
      if ( cuentaCeros > (filas - 1) ) {
        solInfinita = true;
        System.out.println( "Este problema tiene mas de una solucion." );
      }
    }
    else if ( contadorDeNegativos == contadorDeNumeros ) {
      if ( estamosMinimizando ) {
        solucionOptima = true;
        System.out.println( "Es solucion optima para minizar" );
        System.out.println( "Z = " + tabla[filas - 1][tabla[0].length - 1] );
        for ( int i = 0; i < tabla.length - 1; i++ ) {
          for ( int j = 0; j < tabla[i].length - 1; j++ ) {
            if ( j + 1 <= columnas ) {
              if ( ("X" + (j + 1)).equals( nombresFilas[i] ) ) {
                columnaSolucion[j] = tabla[i][tabla[i].length - 1];
                break;
              }
            }
            else {
              if ( ("S" + (j - 1)).equals( nombresFilas[i] ) ) {
                columnaSolucion[j] = tabla[i][tabla[i].length - 1];
                break;
              }
            }
          }
        }
        for ( int i = 0; i < columnaSolucion.length; i++ ) {
          if ( i + 1 <= columnas ) {
            System.out.println( "X" + (i + 1) + " = " + columnaSolucion[i] );
          }
          else {
            System.out.println( "S" + (i - 1) + " = " + columnaSolucion[i] );
          }
        }
      }
      for ( int i = 0; i < tabla[0].length - 1; i++ ) {
        if ( tabla[filas - 1][i] == 0 ) {
          cuentaCeros++;
        }
      }
      if ( cuentaCeros > (filas -1) ) {
        solInfinita = true;
        System.out.println( "Este problema tiene mas de una solucion." );
      }
    }
    else {
      solucionOptima = false;
    }

    return solucionOptima;

  }

  //Este metodo encuentra cual columna de la fila z
  // es la columna de entrada.
  public void buscarVariableDeEntrada() {
    float[] filaZ = new float[tabla[0].length];
    System.arraycopy( tabla[filas - 1], 0, filaZ, 0, tabla[filas - 1].length );
    float entrada = filaZ[0];

    if ( !estamosMinimizando ) {
      for ( int i = 0; i < filaZ.length; i++ ) {
        if ( filaZ[i] < entrada ) {
          entrada = filaZ[i];
          this.posicicionDeColumnaPivote = i;
        }
        else if ( entrada == filaZ[0] ) {
          posicicionDeColumnaPivote = 0;
        }
      }
    }
    else if ( estamosMinimizando ) {
      for ( int i = 0; i < filaZ.length; i++ ) {
        if ( filaZ[i] > entrada ) {
          entrada = filaZ[i];
          this.posicicionDeColumnaPivote = i;
        }
        else if ( entrada == filaZ[0] ) {
          posicicionDeColumnaPivote = 0;
        }
      }
    }
    else {
      System.out.println( "Error en el sistema." );
    }
    for ( int i = 0; i < filas; i++ ) {
      this.columnaPivote[i] = tabla[i][this.posicicionDeColumnaPivote];
    }

    if ( posicicionDeColumnaPivote + 1 <= columnas ) {
      nombreColumna = "X" + (posicicionDeColumnaPivote + 1);
    }
    else {
      nombreColumna = "S" + (posicicionDeColumnaPivote - 1);
    }

  }

  //Obtenido la columna, se revisa cual valor de esa columna
  // puede eser la fila pivote para las demas operaciones
  public void buscarFilaPivote() {
    float valorPequeño = 9999;
    int posicionFinal = this.tabla[0].length - 1;

    for ( int i = 0; i < this.tabla.length - 1; i++ ) {
      if ( tabla[i][posicicionDeColumnaPivote] > 0 ) {
        if ( (this.tabla[i][posicionFinal] / this.tabla[i][this.posicicionDeColumnaPivote]) < valorPequeño ) {
          valorPequeño = (this.tabla[i][posicionFinal] / this.tabla[i][this.posicicionDeColumnaPivote]);
          posicicionDeFilaPivote = i;
          elementoPivote = tabla[posicicionDeFilaPivote][posicicionDeColumnaPivote];
        }
      }
    }
    if ( valorPequeño == 9999 ) {
      System.out.println( "Solucion no acotada" );
      solAcotada = true;
    }
    else {
      System.arraycopy( this.tabla[posicicionDeFilaPivote], 0, this.filaPivote, 0, tabla[posicicionDeFilaPivote].length );
//      System.out.println( "Elemento Pivote:" + elementoPivote );
    }
    nombresFilas[posicicionDeFilaPivote] = nombreColumna;
  }

  //Luego de obtenido la posicion de la columna y fila pivote
  // se procede a transformar esa fila dividiendo
  // todo con el elemento pivote.
  public void actualizaFilaPivote() {
    for ( int i = 0; i < filaPivote.length; i++ ) {

      filaPivote[i] = filaPivote[i] * (1 / elementoPivote);
    }
    System.arraycopy( filaPivote, 0, tabla[posicicionDeFilaPivote], 0, filaPivote.length );
//    System.out.println( Arrays.toString( tabla[posicicionDeFilaPivote] ) + "\t" );
  }

  //Aqui se calculan los valores de cada fila haciendo cero
  // todas las filas que esten arriba o abajo del elemento pivote
  // y que no son ceros.
  public void caculaElRestoDeFilas() {
    float[] resultadoDeCalculo = new float[filaPivote.length];
    float valorPrincipalDeEsaFila;
    System.out.println( "Posicion del pivote en la columna " + posicicionDeColumnaPivote + " y en la fila " + posicicionDeFilaPivote );
    for ( int i = 0; i < columnaPivote.length; i++ ) {
      if ( i != posicicionDeFilaPivote ) {
        for ( int j = 0; j < filaPivote.length; j++ ) {
          valorPrincipalDeEsaFila = tabla[i][posicicionDeColumnaPivote];
          resultadoDeCalculo[j] = (filaPivote[j] * (-valorPrincipalDeEsaFila)) + tabla[i][j];
        }
        System.arraycopy( resultadoDeCalculo, 0, tabla[i], 0, resultadoDeCalculo.length );
      }
    }
  }

  //Muestra la tabla por consola
  public void imprimirTablas() {
    for ( int i = 0; i < tabla.length; i++ ) {
      for ( int j = 0; j < tabla[i].length; j++ ) {
        String valor = String.format( "%.3f", tabla[i][j] );
        System.out.print( valor + "\t" );
      }
      System.out.println();
    }
    System.out.println();
  }
}
