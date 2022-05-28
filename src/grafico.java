import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;

public class grafico {
  public JFrame frame;
  //main principal que llamara a la funcion principal
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          grafico window = new grafico();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  public void reiniciar() {
    initialize();
  }

  public grafico() {
    initialize();
  }

  public void initialize() {
    //contador que va a ser el que utilizaremos para saber los intentos que tenemos.
    int contador = 0;
    //CREACION DE TODA LA PARTE GRAFICA
    frame = new JFrame();
    frame.setTitle("WORDLE");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // frame.setResizable(false);
    frame.setSize(647, 844);
    frame.getContentPane().setForeground(new Color(0, 0, 0));
    frame.getContentPane().setBackground(Color.BLACK);
    frame.setLayout(null);

    JLabel f1c1 = new JLabel("");
    f1c1.setHorizontalAlignment(SwingConstants.CENTER);
    f1c1.setOpaque(true);
    f1c1.setBackground(Color.LIGHT_GRAY);
    f1c1.setBounds(169, 114, 51, 50);
    frame.getContentPane().add(f1c1);

    JLabel f1c2 = new JLabel("");
    f1c2.setHorizontalAlignment(SwingConstants.CENTER);
    f1c2.setOpaque(true);
    f1c2.setBackground(Color.LIGHT_GRAY);
    f1c2.setBounds(230, 114, 51, 50);
    frame.getContentPane().add(f1c2);

    JLabel f1c3 = new JLabel("");
    f1c3.setHorizontalAlignment(SwingConstants.CENTER);
    f1c3.setOpaque(true);
    f1c3.setBackground(Color.LIGHT_GRAY);
    f1c3.setBounds(291, 114, 51, 50);
    frame.getContentPane().add(f1c3);

    JLabel f1c4 = new JLabel("");
    f1c4.setHorizontalAlignment(SwingConstants.CENTER);
    f1c4.setOpaque(true);
    f1c4.setBackground(Color.LIGHT_GRAY);
    f1c4.setBounds(352, 114, 51, 50);
    frame.getContentPane().add(f1c4);

    JLabel f1c5 = new JLabel("");
    f1c5.setHorizontalAlignment(SwingConstants.CENTER);
    f1c5.setOpaque(true);
    f1c5.setBackground(Color.LIGHT_GRAY);
    f1c5.setBounds(413, 114, 51, 50);
    frame.getContentPane().add(f1c5);

    JLabel f2c1 = new JLabel("");
    f2c1.setHorizontalAlignment(SwingConstants.CENTER);
    f2c1.setOpaque(true);
    f2c1.setBackground(Color.LIGHT_GRAY);
    f2c1.setBounds(169, 174, 51, 50);
    frame.getContentPane().add(f2c1);

    JLabel f2c2 = new JLabel("");
    f2c2.setHorizontalAlignment(SwingConstants.CENTER);
    f2c2.setOpaque(true);
    f2c2.setBackground(Color.LIGHT_GRAY);
    f2c2.setBounds(230, 174, 51, 50);
    frame.getContentPane().add(f2c2);

    JLabel f2c3 = new JLabel("");
    f2c3.setHorizontalAlignment(SwingConstants.CENTER);
    f2c3.setOpaque(true);
    f2c3.setBackground(Color.LIGHT_GRAY);
    f2c3.setBounds(291, 174, 51, 50);
    frame.getContentPane().add(f2c3);

    JLabel f2c4 = new JLabel("");
    f2c4.setHorizontalAlignment(SwingConstants.CENTER);
    f2c4.setOpaque(true);
    f2c4.setBackground(Color.LIGHT_GRAY);
    f2c4.setBounds(352, 174, 51, 50);
    frame.getContentPane().add(f2c4);

    JLabel f2c5 = new JLabel("");
    f2c5.setHorizontalAlignment(SwingConstants.CENTER);
    f2c5.setOpaque(true);
    f2c5.setBackground(Color.LIGHT_GRAY);
    f2c5.setBounds(413, 174, 51, 50);
    frame.getContentPane().add(f2c5);

    JLabel f3c1 = new JLabel("");
    f3c1.setHorizontalAlignment(SwingConstants.CENTER);
    f3c1.setOpaque(true);
    f3c1.setBackground(Color.LIGHT_GRAY);
    f3c1.setBounds(169, 234, 51, 50);
    frame.getContentPane().add(f3c1);

    JLabel f3c2 = new JLabel("");
    f3c2.setHorizontalAlignment(SwingConstants.CENTER);
    f3c2.setOpaque(true);
    f3c2.setBackground(Color.LIGHT_GRAY);
    f3c2.setBounds(230, 234, 51, 50);
    frame.getContentPane().add(f3c2);

    JLabel f3c3 = new JLabel("");
    f3c3.setHorizontalAlignment(SwingConstants.CENTER);
    f3c3.setOpaque(true);
    f3c3.setBackground(Color.LIGHT_GRAY);
    f3c3.setBounds(291, 234, 51, 50);
    frame.getContentPane().add(f3c3);

    JLabel f3c4 = new JLabel("");
    f3c4.setHorizontalAlignment(SwingConstants.CENTER);
    f3c4.setOpaque(true);
    f3c4.setBackground(Color.LIGHT_GRAY);
    f3c4.setBounds(352, 234, 51, 50);
    frame.getContentPane().add(f3c4);

    JLabel f3c5 = new JLabel("");
    f3c5.setHorizontalAlignment(SwingConstants.CENTER);
    f3c5.setOpaque(true);
    f3c5.setBackground(Color.LIGHT_GRAY);
    f3c5.setBounds(413, 234, 51, 50);
    frame.getContentPane().add(f3c5);

    JLabel f4c1 = new JLabel("");
    f4c1.setHorizontalAlignment(SwingConstants.CENTER);
    f4c1.setOpaque(true);
    f4c1.setBackground(Color.LIGHT_GRAY);
    f4c1.setBounds(169, 294, 51, 50);
    frame.getContentPane().add(f4c1);

    JLabel f4c2 = new JLabel("");
    f4c2.setHorizontalAlignment(SwingConstants.CENTER);
    f4c2.setOpaque(true);
    f4c2.setBackground(Color.LIGHT_GRAY);
    f4c2.setBounds(230, 294, 51, 50);
    frame.getContentPane().add(f4c2);

    JLabel f4c3 = new JLabel("");
    f4c3.setHorizontalAlignment(SwingConstants.CENTER);
    f4c3.setOpaque(true);
    f4c3.setBackground(Color.LIGHT_GRAY);
    f4c3.setBounds(291, 294, 51, 50);
    frame.getContentPane().add(f4c3);

    JLabel f4c4 = new JLabel("");
    f4c4.setHorizontalAlignment(SwingConstants.CENTER);
    f4c4.setOpaque(true);
    f4c4.setBackground(Color.LIGHT_GRAY);
    f4c4.setBounds(352, 294, 51, 50);
    frame.getContentPane().add(f4c4);

    JLabel f4c5 = new JLabel("");
    f4c5.setHorizontalAlignment(SwingConstants.CENTER);
    f4c5.setOpaque(true);
    f4c5.setBackground(Color.LIGHT_GRAY);
    f4c5.setBounds(413, 294, 51, 50);
    frame.getContentPane().add(f4c5);

    JLabel f5c1 = new JLabel("");
    f5c1.setHorizontalAlignment(SwingConstants.CENTER);
    f5c1.setOpaque(true);
    f5c1.setBackground(Color.LIGHT_GRAY);
    f5c1.setBounds(169, 354, 51, 50);
    frame.getContentPane().add(f5c1);

    JLabel f5c2 = new JLabel("");
    f5c2.setHorizontalAlignment(SwingConstants.CENTER);
    f5c2.setOpaque(true);
    f5c2.setBackground(Color.LIGHT_GRAY);
    f5c2.setBounds(230, 354, 51, 50);
    frame.getContentPane().add(f5c2);

    JLabel f5c3 = new JLabel("");
    f5c3.setHorizontalAlignment(SwingConstants.CENTER);
    f5c3.setOpaque(true);
    f5c3.setBackground(Color.LIGHT_GRAY);
    f5c3.setBounds(291, 354, 51, 50);
    frame.getContentPane().add(f5c3);

    JLabel f5c4 = new JLabel("");
    f5c4.setHorizontalAlignment(SwingConstants.CENTER);
    f5c4.setOpaque(true);
    f5c4.setBackground(Color.LIGHT_GRAY);
    f5c4.setBounds(352, 354, 51, 50);
    frame.getContentPane().add(f5c4);

    JLabel f5c5 = new JLabel("");
    f5c5.setHorizontalAlignment(SwingConstants.CENTER);
    f5c5.setOpaque(true);
    f5c5.setBackground(Color.LIGHT_GRAY);
    f5c5.setBounds(413, 354, 51, 50);
    frame.getContentPane().add(f5c5);

    JLabel l1 = new JLabel("");
    l1.setForeground(Color.WHITE);
    l1.setHorizontalAlignment(SwingConstants.CENTER);
    l1.setOpaque(true);
    l1.setBackground(Color.LIGHT_GRAY);
    l1.setBounds(169, 459, 51, 50);
    frame.getContentPane().add(l1);

    JLabel l2 = new JLabel("");
    l2.setForeground(Color.WHITE);
    l2.setHorizontalAlignment(SwingConstants.CENTER);
    l2.setOpaque(true);
    l2.setBackground(Color.LIGHT_GRAY);
    l2.setBounds(230, 459, 51, 50);
    frame.getContentPane().add(l2);

    JLabel l3 = new JLabel("");
    l3.setForeground(Color.WHITE);
    l3.setHorizontalAlignment(SwingConstants.CENTER);
    l3.setOpaque(true);
    l3.setBackground(Color.LIGHT_GRAY);
    l3.setBounds(291, 459, 51, 50);
    frame.getContentPane().add(l3);

    JLabel l4 = new JLabel("");
    l4.setForeground(Color.WHITE);
    l4.setHorizontalAlignment(SwingConstants.CENTER);
    l4.setOpaque(true);
    l4.setBackground(Color.LIGHT_GRAY);
    l4.setBounds(352, 459, 51, 50);
    frame.getContentPane().add(l4);

    JLabel l5 = new JLabel("");
    l5.setForeground(Color.WHITE);
    l5.setHorizontalAlignment(SwingConstants.CENTER);
    l5.setOpaque(true);
    l5.setBackground(Color.LIGHT_GRAY);
    l5.setBounds(413, 459, 51, 50);
    frame.getContentPane().add(l5);

    JLabel TITULO = new JLabel("WORDLE");
    TITULO.setHorizontalAlignment(SwingConstants.CENTER);
    TITULO.setOpaque(true);
    TITULO.setFont(new Font("Tahoma", Font.PLAIN, 16));
    TITULO.setBackground(UIManager.getColor("Button.light"));
    TITULO.setBounds(223, 42, 187, 36);
    frame.getContentPane().add(TITULO);

    JLabel contadorintentos = new JLabel("");
    contadorintentos.setHorizontalAlignment(SwingConstants.CENTER);
    contadorintentos.setFont(new Font("Tahoma", Font.PLAIN, 26));
    contadorintentos.setForeground(Color.WHITE);
    contadorintentos.setOpaque(true);
    contadorintentos.setText(String.valueOf(contador) + "/5");
    contadorintentos.setBackground(Color.BLACK);
    contadorintentos.setBounds(520, 40, 59, 37);
    frame.getContentPane().add(contadorintentos);
    //CREAMOS UNA MATRIZ LLAMADA CUADRICULA LA CUAL CONTENDRA 
    //LOS LABELS DE LA CUADRICULA Y PODER ENVIARLE LOS DATOS A LA CLASE UTIL PARA QUE PODAMOS USARLOS.

    JLabel[][] cuadricula = {
      {
        f1c1,
        f1c2,
        f1c3,
        f1c4,
        f1c5
      },
      {
        f2c1,
        f2c2,
        f2c3,
        f2c4,
        f2c5
      },
      {
        f3c1,
        f3c2,
        f3c3,
        f3c4,
        f3c5
      },
      {
        f4c1,
        f4c2,
        f4c3,
        f4c4,
        f4c5
      },
      {
        f5c1,
        f5c2,
        f5c3,
        f5c4,
        f5c5
      }
    };
    //CREACION DE TODOS LOS BOTONES DEL TECLADO
    JButton W = new JButton("W");
    W.setFont(new Font("Tahoma", Font.PLAIN, 10));
    W.setForeground(new Color(0, 0, 0));
    W.setBackground(Color.LIGHT_GRAY);

    W.setBounds(76, 560, 51, 45);
    frame.getContentPane().add(W);

    JButton Q = new JButton("Q");
    Q.setForeground(Color.BLACK);
    Q.setFont(new Font("Tahoma", Font.PLAIN, 10));
    Q.setBackground(Color.LIGHT_GRAY);
    Q.setBounds(15, 560, 51, 45);

    frame.getContentPane().add(Q);

    JButton E = new JButton("E");
    E.setForeground(Color.BLACK);
    E.setFont(new Font("Tahoma", Font.PLAIN, 10));
    E.setBackground(Color.LIGHT_GRAY);
    E.setBounds(137, 560, 51, 45);

    frame.getContentPane().add(E);

    JButton R = new JButton("R");
    R.setForeground(Color.BLACK);
    R.setFont(new Font("Tahoma", Font.PLAIN, 10));
    R.setBackground(Color.LIGHT_GRAY);
    R.setBounds(198, 560, 51, 45);

    frame.getContentPane().add(R);

    JButton T = new JButton("T");
    T.setForeground(Color.BLACK);
    T.setFont(new Font("Tahoma", Font.PLAIN, 10));
    T.setBackground(Color.LIGHT_GRAY);
    T.setBounds(259, 560, 51, 45);

    frame.getContentPane().add(T);

    JButton Y = new JButton("Y");
    Y.setForeground(Color.BLACK);
    Y.setFont(new Font("Tahoma", Font.PLAIN, 10));
    Y.setBackground(Color.LIGHT_GRAY);
    Y.setBounds(320, 560, 51, 45);

    frame.getContentPane().add(Y);

    JButton U = new JButton("U");
    U.setForeground(Color.BLACK);
    U.setFont(new Font("Tahoma", Font.PLAIN, 10));
    U.setBackground(Color.LIGHT_GRAY);
    U.setBounds(381, 560, 51, 45);

    frame.getContentPane().add(U);

    JButton I = new JButton("I");
    I.setForeground(Color.BLACK);
    I.setFont(new Font("Tahoma", Font.PLAIN, 10));
    I.setBackground(Color.LIGHT_GRAY);
    I.setBounds(442, 560, 51, 45);

    frame.getContentPane().add(I);

    JButton O = new JButton("O");
    O.setForeground(Color.BLACK);
    O.setFont(new Font("Tahoma", Font.PLAIN, 10));
    O.setBackground(Color.LIGHT_GRAY);
    O.setBounds(503, 560, 51, 45);

    frame.getContentPane().add(O);

    JButton P = new JButton("P");
    P.setForeground(Color.BLACK);
    P.setFont(new Font("Tahoma", Font.PLAIN, 10));
    P.setBackground(Color.LIGHT_GRAY);
    P.setBounds(564, 560, 51, 45);

    frame.getContentPane().add(P);

    JButton A = new JButton("A");
    A.setForeground(Color.BLACK);
    A.setFont(new Font("Tahoma", Font.PLAIN, 10));
    A.setBackground(Color.LIGHT_GRAY);
    A.setBounds(15, 611, 51, 45);

    frame.getContentPane().add(A);

    JButton S = new JButton("S");
    S.setForeground(Color.BLACK);
    S.setFont(new Font("Tahoma", Font.PLAIN, 10));
    S.setBackground(Color.LIGHT_GRAY);
    S.setBounds(76, 611, 51, 45);

    frame.getContentPane().add(S);

    JButton D = new JButton("D");
    D.setForeground(Color.BLACK);
    D.setFont(new Font("Tahoma", Font.PLAIN, 10));
    D.setBackground(Color.LIGHT_GRAY);
    D.setBounds(137, 611, 51, 45);

    frame.getContentPane().add(D);

    JButton F = new JButton("F");
    F.setForeground(Color.BLACK);
    F.setFont(new Font("Tahoma", Font.PLAIN, 10));
    F.setBackground(Color.LIGHT_GRAY);
    F.setBounds(198, 611, 51, 45);

    frame.getContentPane().add(F);

    JButton G = new JButton("G");
    /*G.setVisible(false);*/
    G.setForeground(Color.BLACK);
    G.setFont(new Font("Tahoma", Font.PLAIN, 10));
    G.setBackground(Color.LIGHT_GRAY);
    G.setBounds(259, 611, 51, 45);

    frame.getContentPane().add(G);

    JButton H = new JButton("H");
    H.setForeground(Color.BLACK);
    H.setFont(new Font("Tahoma", Font.PLAIN, 10));
    H.setBackground(Color.LIGHT_GRAY);
    H.setBounds(320, 611, 51, 45);

    frame.getContentPane().add(H);

    JButton J = new JButton("J");
    J.setForeground(Color.BLACK);
    J.setFont(new Font("Tahoma", Font.PLAIN, 10));
    J.setBackground(Color.LIGHT_GRAY);
    J.setBounds(381, 611, 51, 45);

    frame.getContentPane().add(J);

    JButton K = new JButton("K");
    K.setForeground(Color.BLACK);
    K.setFont(new Font("Tahoma", Font.PLAIN, 10));
    K.setBackground(Color.LIGHT_GRAY);
    K.setBounds(442, 611, 51, 45);

    frame.getContentPane().add(K);

    JButton L = new JButton("L");
    L.setForeground(Color.BLACK);
    L.setFont(new Font("Tahoma", Font.PLAIN, 10));
    L.setBackground(Color.LIGHT_GRAY);
    L.setBounds(503, 611, 51, 45);
    frame.getContentPane().add(L);
    JButton \u00D1 = new JButton("\u00D1");
    \u00D1.setForeground(Color.BLACK);
    \u00D1.setFont(new Font("Tahoma", Font.PLAIN, 10));
    \u00D1.setBackground(Color.LIGHT_GRAY);
    \u00D1.setBounds(564, 611, 51, 45);

    frame.getContentPane().add(\u00D1);

    JButton ENVIAR = new JButton("ENVIAR");
    ENVIAR.setForeground(Color.BLACK);
    ENVIAR.setFont(new Font("Tahoma", Font.PLAIN, 10));
    ENVIAR.setBackground(Color.LIGHT_GRAY);
    ENVIAR.setBounds(15, 663, 88, 45);

    frame.getContentPane().add(ENVIAR);

    JButton Z = new JButton("Z");
    Z.setForeground(Color.BLACK);
    Z.setFont(new Font("Tahoma", Font.PLAIN, 10));
    Z.setBackground(Color.LIGHT_GRAY);
    Z.setBounds(113, 663, 51, 45);

    frame.getContentPane().add(Z);

    JButton X = new JButton("X");
    X.setForeground(Color.BLACK);
    X.setFont(new Font("Tahoma", Font.PLAIN, 10));
    X.setBackground(Color.LIGHT_GRAY);
    X.setBounds(174, 663, 51, 45);

    frame.getContentPane().add(X);

    JButton C = new JButton("C");
    C.setForeground(Color.BLACK);
    C.setFont(new Font("Tahoma", Font.PLAIN, 10));
    C.setBackground(Color.LIGHT_GRAY);
    C.setBounds(235, 663, 51, 45);

    frame.getContentPane().add(C);

    JButton V = new JButton("V");
    V.setForeground(Color.BLACK);
    V.setFont(new Font("Tahoma", Font.PLAIN, 10));
    V.setBackground(Color.LIGHT_GRAY);
    V.setBounds(296, 663, 51, 45);

    frame.getContentPane().add(V);

    JButton B = new JButton("B");
    B.setForeground(Color.BLACK);
    B.setFont(new Font("Tahoma", Font.PLAIN, 10));
    B.setBackground(Color.LIGHT_GRAY);
    B.setBounds(357, 663, 51, 45);

    frame.getContentPane().add(B);

    JButton N = new JButton("N");
    N.setForeground(Color.BLACK);
    N.setFont(new Font("Tahoma", Font.PLAIN, 10));
    N.setBackground(Color.LIGHT_GRAY);
    N.setBounds(418, 663, 51, 45);

    frame.getContentPane().add(N);

    JButton M = new JButton("M");
    M.setForeground(Color.BLACK);
    M.setFont(new Font("Tahoma", Font.PLAIN, 10));
    M.setBackground(Color.LIGHT_GRAY);
    M.setBounds(479, 663, 51, 45);

    frame.getContentPane().add(M);

    JButton BORRAR = new JButton("");
    ImageIcon icono = new ImageIcon("eliminar.png");
    BORRAR.setIcon(icono);
    BORRAR.setForeground(Color.BLACK);
    BORRAR.setFont(new Font("Tahoma", Font.PLAIN, 10));
    BORRAR.setBackground(Color.LIGHT_GRAY);
    BORRAR.setBounds(540, 663, 75, 45);
    frame.getContentPane().add(BORRAR);

    JLabel GANADO = new JLabel("HAS GANADO!!");
    GANADO.setHorizontalAlignment(SwingConstants.CENTER);
    GANADO.setFont(new Font("Tahoma", Font.PLAIN, 21));
    GANADO.setForeground(Color.WHITE);
    GANADO.setBackground(Color.BLACK);
    GANADO.setVisible(false);
    GANADO.setBounds(204, 500, 213, 81);
    frame.getContentPane().add(GANADO);

    JLabel PERDIDO = new JLabel("HAS PERDIDO!!");
    PERDIDO.setHorizontalAlignment(SwingConstants.CENTER);
    PERDIDO.setFont(new Font("Tahoma", Font.PLAIN, 21));
    PERDIDO.setForeground(Color.WHITE);
    PERDIDO.setVisible(false);
    PERDIDO.setBounds(208, 500, 213, 81);
    frame.getContentPane().add(PERDIDO);
    //CREACION DE UN ARRAY EL CUAL TENDRA TODOS LOS BOTONES DEL TECLADO Y SE LO ENVIAREMOS A LA CLASE UTIL POR PARAMETRO
    JButton reinicio = new JButton("Volver a jugar");
    reinicio.setBounds(259, 585, 124, 68);
    reinicio.setVisible(false);
    frame.getContentPane().add(reinicio);
    JButton teclado[] = {
      Q,
      W,
      E,
      R,
      T,
      Y,
      U,
      I,
      O,
      P,
      A,
      S,
      D,
      F,
      G,
      H,
      J,
      K,
      L,
      \u00D1,
      Z,
      X,
      C,
      V,
      B,
      N,
      M,
      ENVIAR,
      BORRAR,
      reinicio
    };
    //ENVIAMOS EL ARRAY A LA CLASE UTIL POR PARAMETRO ,ESTAS SON LAS DISTINTAS PANTALLAS QUE SE HARAN VISIBLE EN EL JFRAME DEPENDIENDO DEL MOMENTO DEL JUEGO
    JLabel pantallas[] = {
      GANADO,
      PERDIDO,
      contadorintentos
    };
    //ENVIAMOS EL ARRAY DE CON LOS JLABEL QUE TENDRAN LA PALABRA DEL DIA UNA VEZ TERMINE EL JUEGO
    JLabel resumen[] = {
      l1,
      l2,
      l3,
      l4,
      l5
    };
    //INICIALIZAMOS EL OBJETO UTIL PARA PODER USAR LOS METODOS DE LA CLASE DONDE LE ENVIAMOS TODOS LOS ARRAY Y MATRIZES QUE NECESITAMOS
    util u = new util(cuadricula, teclado, pantallas, resumen);
    //DEFINIMOS LAS DISTINTAS ACCIONES QUE HARAN LOS BOTONES DE LOS TECLADOS CUANDO SEAN PULSADO
    reinicio.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
          grafico window = new grafico();
          window.frame.setVisible(true);
          frame.dispose();
      }
    });
    
    W.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('W');

      }
    });
    Q.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('Q');

      }
    });
    E.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('E');

      }
    });
    R.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('R');

      }
    });
    T.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('T');

      }
    });
    Y.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('Y');

      }
    });
    U.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('U');

      }
    });
    I.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('I');

      }
    });
    O.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('O');

      }
    });
    P.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('P');

      }
    });
    A.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('A');

      }
    });
    S.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('S');

      }
    });
    D.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('D');

      }
    });
    F.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('F');

      }
    });
    G.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('G');

      }
    });
    H.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('H');

      }
    });
    J.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('J');

      }
    });
    K.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('K');

      }
    });
    L.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('L');

      }
    });
    \u00D1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('\u00D1');

      }
    });
    ENVIAR.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.comprobar();

      }
    });
    Z.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('Z');

      }
    });
    X.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('X');

      }
    });
    C.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('C');

      }
    });
    V.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('V');
      }
    });
    B.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('B');
      }
    });
    N.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('N');

      }
    });
    M.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.escribir('M');

      }
    });
    BORRAR.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        u.borrar();

      }
    })

    ;
  }

}


