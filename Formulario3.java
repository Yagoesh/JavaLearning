import javax.swing.*;
import java.awt.event.*;

public class Formulario3 extends JFrame implements ActionListener{
  private JButton boton1, boton2, boton3;
  private JLabel label1;

  public Formulario3() {
    setLayout(null);
    boton1 = new JButton("1");
    boton1.setBounds(10,100,90,30);
    add(boton1);
    boton1.addActionListener(this);
  
  
    boton2 = new JButton("2");
    boton2.setBounds(110,100,90,30);
    add(boton2);
    boton2.addActionListener(this);

    boton3 = new JButton("3");
    boton3.setBounds(210,100,90,30);
    add(boton3);
    boton3.addActionListener(this);

    label1 = new JLabel("En espera...");
    label1.setBounds(10,10,300,30);
    add(label1);
  }

  public void actionPerformed(ActionEvent evento) {
    if (evento.getSource() == boton1 ) {
      label1.setText("Elegiste el boton 1");
    } else if ( evento.getSource() == boton2) {
      label1.setText("Elegiste el boton 2");
    } else {
      label1.setText("Elegiste el boton 3");

    }
  }
  public static void main(String[] args) {
    Formulario3 formulario = new Formulario3();
    formulario.setBounds(0,0,500,500);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}
