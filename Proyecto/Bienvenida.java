package Proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class Bienvenida extends JFrame implements ActionListener {
  private JTextField textField;
  private JLabel encabezado , subtitulo , label , footer;
  private JButton boton;

  public Bienvenida() {
    setLayout(null);
    setTitle("Bienvenida");
    getContentPane().setBackground(new Color(250,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    encabezado = new JLabel(imagen);
    encabezado.setBounds(25,25,400,400);
    add(encabezado);

    subtitulo = new JLabel("Sistema de control vacacional ");
    subtitulo.setBounds(20,125,300,30);
    subtitulo.setFont(new Font("Andale Mono", 3, 18));
    subtitulo.setForeground(new Color(255,255,255));
    add(subtitulo);

    label = new JLabel("Tu nombre");
    label.setBounds(55,195,300,30);
    label.setFont(new Font("Andale Mono", 3, 12));
    label.setForeground(new Color(255,255,255));
    add(label);

    footer = new JLabel("2024 - The CocaCola Company");
    footer.setBounds(75,425,300,30);
    footer.setFont(new Font("Andale Mono", 3, 12));
    footer.setForeground(new Color(255,255,255));
    add(footer);

    textField = new JTextField();
    textField.setBounds(45,240,255,25);
    textField.setBackground(new Color(224,224,224));
    textField.setFont(new Font("Andale Mono" , 1 , 14));
    textField.setForeground(new Color(255,0,0));
    add(textField);

    boton = new JButton("Enviar");
    boton.setBounds(125,280,100,30);
    boton.setBackground(new Color(255,255,255));
    boton.setFont(new Font("Andale Mono" , 1 , 14));
    boton.setForeground(new Color(255,0,0));
    boton.addActionListener(this);
    add(boton);
  }
  
  public void actionPerformed (ActionEvent evento) {
    if (evento.getSource() == boton) {

    }
  }

public static void main(String[] args) {
  Bienvenida funcion = new Bienvenida();
  funcion.setBounds(0,0,500,500);  
  funcion.setVisible(true);
  funcion.setResizable(true);
  funcion.setLocationRelativeTo(null);
}

}
