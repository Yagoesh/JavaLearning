import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario10 extends JFrame implements ActionListener{
  private JMenuBar menubar;
  private JMenu menu1;
  private JMenuItem menuItem1 , menuItem2 , menuItem3;

public Formulario10 () {
  setLayout(null);

  menubar = new JMenuBar();
  setJMenuBar(menubar);

  menu1 = new JMenu("opciones");
  menubar.add(menu1);


  menuItem1 = new JMenuItem("rojo");
  menuItem1.addActionListener(this);
  menu1.add(menuItem1);

  menuItem2 = new JMenuItem("Verde");
menuItem2.addActionListener(this);
  menu1.add(menuItem2);
  menuItem3 = new JMenuItem("Azul");
  menuItem3.addActionListener(this);
  menu1.add(menuItem3);

  
}

public void actionPerformed(ActionEvent evento) {
  Container fondo = this.getContentPane();
  if (evento.getSource() == menuItem1) {
    fondo.setBackground(new Color(250,0,0));
  }  if (evento.getSource() == menuItem2) {
    fondo.setBackground(new Color(0,250,0));
  }
  if (evento.getSource() == menuItem3) {
    fondo.setBackground(new Color(0,0,250));
  }}
  public static void main(String[] args) {
    Formulario10 formulario = new Formulario10();
    formulario.setBounds(0,0,500,500);  
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);

  }
}