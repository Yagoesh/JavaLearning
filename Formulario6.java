import javax.swing.*;
import java.awt.event.*;

public class Formulario6 extends JFrame implements ActionListener{
  private JTextField textField1;
  private JButton boton1;
  private JScrollPane scrollPanel1;
  private JTextArea textArea1;

  String texto = "";

  public Formulario6 () {
    setLayout(null);
    textField1 = new JTextField();
    textField1.setBounds(10,10,200,30);
    add(textField1);

    boton1 = new JButton("agregar") ;
    boton1.setBounds(250,10,100,30);
    add(boton1);
    boton1.addActionListener(this);

    textArea1 = new JTextArea();
    scrollPanel1 = new JScrollPane(textArea1);
    scrollPanel1.setBounds(10,50,400,300);
    add(scrollPanel1);


  }

  public void actionPerformed(ActionEvent evento) {
    if (evento.getSource() == boton1) {
      texto += textField1.getText() + "\n"; 
      textArea1.setText(texto);
      textField1.setText("");
    }
  }
public static void main(String[] args) {
Formulario6 formulario = new Formulario6();
formulario.setBounds(0,0,500,500);  
formulario.setVisible(true);
formulario.setResizable(false);
formulario.setLocationRelativeTo(null);
}
}