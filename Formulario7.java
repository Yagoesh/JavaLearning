import javax.swing.*;
import java.awt.event.*;

// Jframe para traer textfields , labels y botones
// ActionListener para traer eventos para cuando se haga click en este caso
public class Formulario7 extends JFrame implements ActionListener {

  //  Paso1: elementos que nos harán falta 
  private JLabel label1 , label2, label3;
  private JTextField textField1 , textField2;
  private JButton boton1; 
  
  // Paso2: diseñamos los textFieds , labels y el boton
  public Formulario7() {
    // paso2.1: setlayout
    setLayout(null);

    // paso2.2: crear un label/boton/textfield dandole un nombre creado por mi
    label1 = new JLabel("Valor 1: ");
    // paso3: situarlo en un lugar y darle su ancho  alto
    label1.setBounds(50,5,100,30);
    // paso2.4: añadirlo para que aparezca
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
    // paso2.5: darle un listener que mas adelante daremos la lógica
    boton1.addActionListener((this));
  }

  // paso3: crear la lógica del listener
  public void actionPerformed(ActionEvent evento) {
    // paso3.1: asegurarse que el click se ha hecho en el boton1
    if (evento.getSource() == boton1) {
      // paso3.2: en este caso creamos variables para sumar y el resultado
      int first = 0, second = 0 , result = 0 ;
      // paso3.3: .getText() nos da el valor que el usuario introduce
      // Integer.parseInt() covierte a todo lo que hay dentro en INT
      first = Integer.parseInt(textField1.getText());
      second = Integer.parseInt(textField2.getText());
      result = first + second;
      // paso3.4: setText (del label en este caso) cambia el texto del label a lo que hay detro de las ()
      label3.setText("Resultado :" + result);
    }
  }
// paso4: diseñar la clase
  public static void main(String[] args) {
    // paso4.1: Siempre usamos el nombre del archivo
    Formulario7 formulario = new Formulario7();
    // paso4.2: situar y dar medidas
    formulario.setBounds(0,0,500,500);  
    // paso4.3: copia y pega los siguientes 3
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}
