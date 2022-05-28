import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class util {
  gestionfichero gf = new gestionfichero();
  //TENDREMOS UN CONTADOR DE COLUMNAS EL CUAL CADA VEZ QUE ESCRIBAMOS UNA LETRA SE INCREMENTARA Y SI LLEGA A 5 PULSAMOS EL BOTON ENVIAR Y SE RESETEA EL CONTADOR Y SUMARA 1 A LA FILA
  int cc = 0;
  //ESTE SERA EL CONTADOR DE FILAS QUE SE INCREMENTARA CUANDO LA PALABRA INTRODUCIDA PASE TODOS LOS FILTROS DE COMPROBAR Y SI LLEGA A 5 SALTARA LA PANTALLA DE PERDIDO
  int cf = 0;
  //EStas variables seran las que recibira la clase util procedente de la clase grafico
  private JLabel[][] matriz;
  private JButton[] botones;
  private JLabel[] pantallas;
  private JLabel[] resumen;
  private HashMap < Character, Integer > colorteclado = new HashMap < Character, Integer > ();
  Color amarillo = new Color(208, 180, 92);
  Color verde = new Color(112, 172, 100);
  Color gris = new Color(120, 124, 126);
  Color blanco=new Color(255,255,255);
  //creamos un arraylist de tipo string para ir almacenando las letras que vaya introduciendo el usuario para crear la palabra final
  ArrayList < String > pa = new ArrayList < String > ();
  //creamos un arraylist de tipo string para ir almacenando todas las palabras  que encontramos en nuestro diccionario y nos devuelve el metodo leer de la clase gestionfichero
  ArrayList < String > diccionario = gf.leer();
  //creamos un arraylist de tipo string para ir almacenando las palabras que va introduciendo el usuario y no pueda introducir la misma palabra mas de una vez
  ArrayList < String > palabrasintroducidas = new ArrayList < String > ();
  //tenemos una variable de tipo string que sera la palabra del dia y nos la devolvera el metodo palabra dia
  //String palabra = palabradia(diccionario, random());
  String palabra="araña";

  public util(JLabel[][] matriz, JButton[] botones, JLabel[] pantallas, JLabel[] resumen) {
    super();
    this.matriz = matriz;
    this.botones = botones;
    this.pantallas = pantallas;
    this.resumen = resumen;
  }
  //metodo borrar eliminara la ultima letra introducida por el usuario y si no hay ninguna letra no hara nada.
  //funcionara teniendo encuenta el contador de columnas
  public void borrar() {
    if (cc != 0) {
      cc = cc - 1;
      matriz[cf][cc].setText("");
      pa.remove(cc);

    } else {
      if (pa.size() == 0) {
        matriz[cf][cc].setText("");
      } else {
        matriz[cf][cc].setText("");
        pa.remove(cc);
      }

    }
  }
  //metodo escribir, recibira una letra y la introducira en la matriz de letras teniendo en cuenta el contador de columnas y la fila , si estan todos los espacios ocupados cambiara la ultima posicion
  public void escribir(Character letra) {
    if (cc < 5) {
      matriz[cf][cc].setText(Character.toString(letra));
      pa.add(cc, Character.toString(letra));
      cc += 1;
    } else {
      cc = cc - 1;
      matriz[cf][cc].setText(Character.toString(letra));

      pa.set(cc, Character.toString(letra));
      cc += 1;
    }
  }
  //metodo random nos devolvera un numero aleatorio entre 0 y el tamaño del arraylist de palabras del diccionario que se lo enviaremos  al metodo palabra dia
  public int random() {
    int numero;
    Random r = new Random();
    numero = r.nextInt(diccionario.size());
    return numero;
  }
  //metodo palabradia nos devolvera una palabra aleatoria del diccionario ,recibira el arraylist de palabras del diccionario y el numero aleatorio que nos devolvera el metodo random
  public String palabradia(ArrayList < String > diccionario, int numero) {
    String palabra = diccionario.get(numero);
    return palabra;
  }
  //metodo cambiar color que recibira la palabra del usuario,la palabra del dia y la matriz de label y los botones del teclado el cual cuando 

  public void cambiarcolor(String palabrausuario, String palabradia, JLabel[][] matriz, JButton[] botones) {
    palabrausuario="araña";
    //recorremos la palabra del usuario letra por letra
    HashMap < Character, ArrayList < Integer >> letrasdia = new HashMap < Character, ArrayList < Integer >> ();
    HashMap < Character, ArrayList < Integer >> letrasusuario = new HashMap < Character, ArrayList < Integer >> ();
    for (int i = 0; i < palabrausuario.length(); i++) {
      ArrayList < Integer > posiciones = new ArrayList < Integer > ();
      posiciones.add(i);
      if (letrasusuario.containsKey(palabrausuario.charAt(i)) == false) {
        letrasusuario.put(palabrausuario.charAt(i), posiciones);
      } else {
        posiciones = letrasusuario.get(palabrausuario.charAt(i));
        posiciones.add(i);
        letrasusuario.remove(palabrausuario.charAt(i));
        letrasusuario.put(palabrausuario.charAt(i), posiciones);
      }
    }

    for (int i = 0; i < palabradia.length(); i++) {
      ArrayList < Integer > posiciones = new ArrayList < Integer > ();
      posiciones.add(i);
      if (letrasdia.containsKey(palabradia.charAt(i)) == false) {
        letrasdia.put(palabradia.charAt(i), posiciones);
      } else {
        posiciones = letrasdia.get(palabradia.charAt(i));
        posiciones.add(i);
        letrasdia.remove(palabradia.charAt(i));
        letrasdia.put(palabradia.charAt(i), posiciones);
      }
    }

    for (Character letra: letrasusuario.keySet()) {
      ArrayList < Integer > posicionesusuario = letrasusuario.get(letra);
      ArrayList < Integer > posicionesdia = letrasdia.get(letra);
      if (letrasdia.containsKey(letra)) {
        int contador=0;
        while(posicionesdia.size()>contador){
          if(posicionesusuario.contains(posicionesdia.get(contador))){
            matriz[cf][posicionesdia.get(contador)].setBackground(verde);
            matriz[cf][posicionesdia.get(contador)].setForeground(blanco);
            posicionesusuario.remove(posicionesdia.get(contador));
            posicionesdia.remove(posicionesdia.get(contador));
          }else{
            contador++;
          }
        }
        if (posicionesdia.size() == 0) {
          for (int i = 0; i < posicionesusuario.size(); i++) {
            matriz[cf][posicionesusuario.get(i)].setBackground(gris);
            matriz[cf][posicionesusuario.get(i)].setForeground(blanco);
          }
        }else {
          if (posicionesusuario.size() != 0) {
            if ( posicionesdia.size()>=posicionesusuario.size() ) {
              for (int i = 0; i < posicionesusuario.size(); i++) {
                matriz[cf][posicionesusuario.get(i)].setBackground(amarillo);
                matriz[cf][posicionesusuario.get(i)].setForeground(blanco);
              }
            }else{
              int a=0;
              int cantidad=posicionesdia.size();
              while (cantidad>a){
                  matriz[cf][posicionesusuario.get(a)].setBackground(amarillo);
                  matriz[cf][posicionesusuario.get(a)].setForeground(blanco);
                  posicionesusuario.remove(posicionesusuario.get(a));
                  a++;
              }
              for (int i = 0; i < posicionesusuario.size(); i++) {
                matriz[cf][posicionesusuario.get(i)].setBackground(gris);
                matriz[cf][posicionesusuario.get(i)].setForeground(blanco);
              }
            }
          }
        }
      } else {
        for (int i = 0; i < posicionesusuario.size(); i++) {
          matriz[cf][posicionesusuario.get(i)].setBackground(gris);
          matriz[cf][posicionesusuario.get(i)].setForeground(blanco);
        }
      }
    }

    for (int i = 0; i < palabrausuario.length(); i++) {
      //si la letra de la palabra del usuario se encuentra en la palabra del dia pasara el primer filtro y comprobara si coincide la posiciones de ambas palabras ,si coincide se cambiara el color a verde
      //si no coincide se cambiara el color a amarillo
      if (colorteclado.containsKey(palabrausuario.charAt(i)) == false) {
        colorteclado.put(palabrausuario.charAt(i), 0);
      }

      if (palabradia.contains(Character.toString(palabrausuario.charAt(i)))) {
        if (palabradia.charAt(i) == palabrausuario.charAt(i)) {
          colorteclado.remove(palabrausuario.charAt(i));
          colorteclado.put(palabrausuario.charAt(i), 2);
        } else {
          if (colorteclado.get(palabrausuario.charAt(i)) != 2) {
            colorteclado.remove(palabrausuario.charAt(i));
            colorteclado.put(palabrausuario.charAt(i), 1);
          }
        }
        //si no pasa ninguno de los fltros anteriores se pondra el color a gris
      }}

      for (Character clave: colorteclado.keySet()) {
        for (JButton jButton: botones) {
          if (jButton.getText().equals(Character.toString(clave))) {
            if (colorteclado.get(clave) == 0) {
              jButton.setBackground(gris);
            } else if (colorteclado.get(clave) == 1) {
              jButton.setBackground(amarillo);
            } else if (colorteclado.get(clave) == 2) {
              jButton.setBackground(verde);
            }
          }
        }
      }
    
    }

  //metodo terminado ,ocultara el teclado y recorrera la matriz para borrar todas las letras que se encuentren en la matriz
  public void terminado() {
    for (JButton jButton: botones) {
      jButton.setVisible(false);
    }
    int e = botones.length;
    botones[e - 1].setVisible(true);
    for (int i = 0; i < matriz.length; i++) {
      resumen[i].setText(Character.toString(palabra.charAt(i)).toUpperCase());
      for (int j = 0; j < matriz[i].length; j++) {
        matriz[i][j].setText("");
      }
    }
  }

  //metodo ganado que se activara solo cuando la palabra del ususario y del dia coincidan
  //hara visible el label correspondiente que pondra de color verde la ayuda de la palabra y nos mostrara el mensaje de has ganado
  public void ganado() {
    pantallas[0].setVisible(true);
    for (int i = 0; i < resumen.length; i++) {
      resumen[i].setBackground(verde);
    }
  }

  //metodo perdido que se activara cuando el contador de filas sea 5 
  //hara visible el label correspondiente que pondra de color rojo la ayuda de la palabra y nos mostrara el mensaje de has perdido
  public void perdido() {
    pantallas[1].setVisible(true);
    for (int i = 0; i < resumen.length; i++) {
      resumen[i].setBackground(Color.red);
    }
  }

  //metodo comprobar que tendra varios filtros, primero comprobara que la palabra introducida tiene un tamaño de 5 letras, si es asi se comprobara que la palabra introducida esta dentro de nuestro diccionario
  //pasara al segundo filtro de si la palabra no se ha introducido anteriormente
  public void comprobar() {
    boolean encontrado = false;
    boolean repetido = false;
    String p = "";
    //introduciremos la palabra del usuario en una variable
    for (int i = 0; i < pa.size(); i++) {
      p += pa.get(i);
    }

    //comprobamos que la palabra esta dentro del diccionario 
    for (String s: diccionario) {
      if (s.toUpperCase().equals(p)) {
        encontrado = true;
      }
    }

    //comprobamos que la palabra no se ha introducido anteriormente
    for (String pala: palabrasintroducidas) {
      if (pala.toUpperCase().equals(p)) {
        repetido = true;
      }
    }

    if (p.length() == 5) {
      if (encontrado) {
        if (repetido) {
          JOptionPane.showMessageDialog(null, "Escribe una palabra que no hayas introducido");
        } else {
          //si pasa todos los filtros llamamos a la funcion cambiar color que nos cambiara el color de las letras de la matriz
          cambiarcolor(p, palabra.toUpperCase(), matriz, botones);
          //si la palabra coincide con la palabra del dia llamamos a la funcion ganado que nos mostrara el mensaje de has ganado y a la funcion terminado que ocultara el teclado y limpiara la matriz
          if (p.equals(palabra.toUpperCase())) {
            terminado();
            ganado();
            cf += 1;
            pantallas[2].setText(String.valueOf(cf) + "/5");
          } else {
            //sumaremos uno al contador de filas
            cf += 1;
            //incrementaremos el contador de intentos
            pantallas[2].setText(String.valueOf(cf) + "/5");
            //restableceremos el contador de columnas a 0
            cc = 0;
            //si el contador de filas es 5 llamamos a la funcion perdido que nos mostrara el mensaje de has perdido y a la funcion terminado que ocultara el teclado y limpiara la matriz
            if (cf == 5) {
              terminado();
              perdido();
            }
            //añadiremos la palabra introducida a la lista de palabras introducidas
            palabrasintroducidas.add(p);
            //restableceremos el arraylist de palabras introducidas 
            pa.clear();
          }
        }
      } else {
        JOptionPane.showMessageDialog(null, "Escribe una palabra que exista");
      }
    } else {
      JOptionPane.showMessageDialog(null, "Rellena todos los campos");
    }
    System.out.println(palabra);
  }
}