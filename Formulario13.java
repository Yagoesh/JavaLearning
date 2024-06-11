import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Formulario13 extends JFrame implements ActionListener, ChangeListener {
  private JLabel label;
  private JCheckBox checkbox;
  private JButton boton;

  public Formulario13() {
    setLayout(null);

    setTitle("Formulario13");

    label = new JLabel("terminos y condiciones");
    label.setBounds(10,10,400,30);
    add(label);

    checkbox = new JCheckBox("acepto");
    checkbox.setBounds(10,50,100,30);
    checkbox.addChangeListener(this);
    add(checkbox);

    boton = new JButton("Continuar");
    boton.setBounds(10,100,100,30);
    add(boton);
    boton.addActionListener(this);
    boton.setEnabled(false);
  }

  public void stateChanged(ChangeEvent evento){
    if (checkbox.isSelected()) {
      boton.setEnabled(true);
    } else {
      boton.setEnabled(false);

    }
  }
  public void actionPerformed(ActionEvent evento){
    if (evento.getSource() == boton) {
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    Formulario13 formulario = new Formulario13();
    formulario.setBounds(0,0,500,500);  
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }

}
