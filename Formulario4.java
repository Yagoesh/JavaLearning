import javax.swing.*;
import java.awt.event.*;

public class Formulario4 extends JFrame implements ActionListener{
  private JTextField textField1;
  private JLabel label1;
  private JButton boton1;

  public Formulario4() {
    setLayout(null);
    label1 = new JLabel("Usuario:");
    label1.setBounds(10,10,100,30);
    add(label1);
    
    textField1 = new JTextField();
    textField1.setBounds(120,17,150,20);
    add(textField1);

    boton1 = new JButton("Enviar");
    boton1.setBounds(10,80,100,30);
    add(boton1);
    boton1.addActionListener(this);
  }
  public void actionPerformed(ActionEvent evento){
    if(evento.getSource() == boton1) {
      String texto = textField1.getText() ;
      setTitle(texto);
      label1.setText(texto);
    }
  }
  public static void main(String[] args) {
    Formulario4 formulario = new Formulario4();
    formulario.setBounds(0,0,300,150);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}
