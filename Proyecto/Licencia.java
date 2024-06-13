package Proyecto;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener {
  private JLabel encabezado , imag ;
  private JScrollPane scrollpane;
  private JTextArea textArea;
  private JCheckBox checkbox;
  private JButton continuar , noContinuar;
  public String nombre = "";

  public Licencia() {
    setLayout(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle("Licencia de uso");
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
    Bienvenida ventana = new Bienvenida();
    nombre = ventana.nombreUsuario;

    encabezado = new JLabel("TERMINOS Y CONDICIONES");
    encabezado.setBounds(215,5,200,30);
    encabezado.setFont(new Font("Andale Mono" , 1 , 14));
    encabezado.setForeground(new Color(0,0,0));
    add(encabezado);


    textArea = new JTextArea();
    textArea.setEditable(false);
    textArea.setFont(new Font("Andale Mono" , 0 , 9));
    textArea.setText("\n\n     Terminos y condiciones " +
                      "\n\n      Lorem espinart");
    scrollpane = new JScrollPane(textArea);
    scrollpane.setBounds(10,40,575,200);
    add(scrollpane);

    checkbox = new JCheckBox("Yo Acepto");
    checkbox.setBounds(10,250,300,30);
    checkbox.addChangeListener(this);;
    add(checkbox);


    continuar = new JButton("Continuar");
    continuar.setBounds(10,290,100,30);
    continuar.addActionListener(this);
    continuar.setEnabled(false);
    add(continuar);


    noContinuar = new JButton("No acepto");
    noContinuar.setBounds(120,290,100,30);
    noContinuar.addActionListener(this);
    noContinuar.setEnabled(true);
    add(noContinuar);


    ImageIcon imagen = new ImageIcon("Proyecto/images/coca-cola.png");
    imag = new JLabel(imagen);
    imag.setBounds(215,215,300,300);
    add(imag);
  }

  public void stateChanged(ChangeEvent evento) {
    if(checkbox.isSelected()) {
      continuar.setEnabled(true);
      noContinuar.setEnabled(false);
    } else {
      continuar.setEnabled(false);
      noContinuar.setEnabled(true);
    }
  }
  public void actionPerformed(ActionEvent evento) {
    if (evento.getSource() == continuar){
      Principal funcion = new Principal();
      funcion.setBounds(0,0,650,600);  
      funcion.setVisible(true);
      funcion.setResizable(true);
      funcion.setLocationRelativeTo(null);
      this.setVisible(false);
    }
    if (evento.getSource() == noContinuar) {
      Bienvenida funcion = new Bienvenida();
      funcion.setBounds(0,0,500,500);  
      funcion.setVisible(true);
      funcion.setResizable(true);
      funcion.setLocationRelativeTo(null);
      this.setVisible(false);

    }
  }

  public static void main(String[] args) {
    Licencia funcion = new Licencia();
    funcion.setBounds(0,0,620,500);  
    funcion.setVisible(true);
    funcion.setResizable(true);
    funcion.setLocationRelativeTo(null);

  }
}
