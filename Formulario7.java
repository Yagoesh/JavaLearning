import javax.swing.*;
import java.awt.event.*;

public class Formulario7 extends JFrame implements ActionListener {
  private JLabel label1 , label2, label3;
  private JTextField textField1 , textField2;
  private JButton boton1; 
  
  public Formulario7() {
    setLayout(null);
    label1 = new JLabel("Valor 1: ");
    label1.setBounds(50,5,100,30);
    add(label1);

    label2 = new JLabel("Valor 2: ");
    label2.setBounds(50,35,100,30);
    add(label2);

    label3 = new JLabel("Resultado: ");
    label3.setBounds(120,80,100,30);
    add(label3);

    textField1 = new JTextField();
    textField1.setBounds(120,10,150,20);
    add(textField1);

    textField2 = new JTextField();
    textField2.setBounds(120, 30, 150 , 20);
    add(textField2);

    boton1 = new JButton("Sumar");
    boton1.setBounds(10,80,100,30);
    add(boton1);
    boton1.addActionListener((this));
  }
  public void actionPerformed(ActionEvent evento) {
    if (evento.getSource() == boton1) {
      int first = 0, second = 0 , result = 0 ;
      first = Integer.parseInt(textField1.getText());
      second = Integer.parseInt(textField2.getText());
      result = first + second;
      label3.setText("Resultado :" + result);
    }
  }

  public static void main(String[] args) {
    Formulario7 formulario = new Formulario7();
    formulario.setBounds(0,0,500,500);  
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}
