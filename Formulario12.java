import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario12 extends JFrame implements ChangeListener {
  private JCheckBox ingles , frances , español;

  public Formulario12() {
    setLayout(null);

    ingles = new JCheckBox("Ingles");
    ingles.setBounds(10,10,150,30);
    ingles.addChangeListener(this);
    add(ingles);

    frances = new JCheckBox("frances");
    frances.setBounds(10,50,150,30);
    frances.addChangeListener(this);
    add(frances);

    
    español = new JCheckBox("Español");
    español.setBounds(10,90,150,30);
    español.addChangeListener(this);
    add(español);
  }

  public void stateChanged(ChangeEvent evento){
    String titulo = "";
    if(ingles.isSelected()) {
      titulo += "- ingles -";
    };
    if(frances.isSelected() ) {
      titulo += "- frances -";
      
    };
    if(español.isSelected()) {
      titulo += "- Español -";
      };
    setTitle(titulo);

  }

  public static void main(String[] args) {
    Formulario12 formulario = new Formulario12();
    formulario.setBounds(0,0,500,500);  
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }

}
