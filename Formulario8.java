import javax.swing.*;
import java.awt.event.*;


public class Formulario8 extends JFrame implements ItemListener{
  private JComboBox box1;

  public Formulario8 () {
    setLayout(null);
    box1 = new JComboBox();
    box1.setBounds(10,10,80,20);
    add(box1);

    box1.addItem("rojo" );
    box1.addItem("verde" );
    box1.addItem("azul" );
    box1.addItem("amarillo" );
    box1.addItem("negro" );

    box1.addItemListener(this);

  }

  // capturamos el box
  public void itemStateChanged(ItemEvent evento){
    if (evento.getSource() == box1){
      // creamos variable donde recuperamos como STRING
      String selected = box1.getSelectedItem().toString();
      // que muestre selected como titulo
      setTitle(selected);
    }
  }

  // metodo main
  public static void main(String[] args) {
    Formulario8 formulario = new Formulario8();
    formulario.setBounds(0,0,500,500);  
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
    }
}

