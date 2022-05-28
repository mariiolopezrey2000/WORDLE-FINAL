import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class gestionfichero {
  public ArrayList < String > leer() {
    ArrayList < String > diccionario = new ArrayList < String > ();
    String linea = "";
    FileReader fr;
    BufferedReader br = null;

    try {
      fr = new FileReader(".\\palabras.txt");
      br = new BufferedReader(fr);
      do {
        linea = br.readLine();
        if (linea != null) {
          diccionario.add(linea);
        }
      }
      while (linea != null);
      br.close();
      fr.close();

    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return diccionario;

  }
}
