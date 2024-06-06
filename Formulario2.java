import javax.swing.*;
import java.awt.event.*;

public class Formulario2 extends JFrame implements ActionListener{
  JButton Boton1;
  public Formulario2() {
    setLayout(null);
    Boton1 = new JButton("Cerrar");
    Boton1.setBounds(300,250,100,30);
    add(Boton1);
    Boton1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent evento) {
    if(evento.getSource() == Boton1) {
      System.exit(0);
      }
      }
        public static void main(String[] args) {
          Formulario2 swing1 = new Formulario2();
          swing1.setBounds(0,0,450,400);
          swing1.setVisible(true);
          swing1.setResizable(true);
          swing1.setLocationRelativeTo(null);
        }
}
