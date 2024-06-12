import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;


public class Formulario14 extends JFrame implements ChangeListener {
  private JRadioButton box1 , box2 , box3;
  private ButtonGroup boxes;

  public Formulario14() {
    setLayout(null);

    boxes = new ButtonGroup();

    box1 = new JRadioButton("640*480");
    box1.setBounds(10,20,100,30);
    box1.addChangeListener(this);
    add(box1);
    boxes.add(box1);

    box2 = new JRadioButton("800*600");
    box2.setBounds(10,70,100,30);
    box2.addChangeListener(this);
    add(box2);
    boxes.add(box2);

    box3 = new JRadioButton("1024*768");
    box3.setBounds(10,120,100,30);
    box3.addChangeListener(this);
    add(box3);
    boxes.add(box3);
  }

  public void stateChanged (ChangeEvent evento){
    if ( box1.isSelected()) {
      setSize(640, 480);
    }
    if ( box2.isSelected()) {
      setSize(800,600);

    }
    if ( box3.isSelected()) {
      setSize(1024, 768);      
    }
  }

  public static void main(String[] args) {
    Formulario14 formulario = new Formulario14();
    formulario.setBounds(0,0,500,500);  
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }

}
