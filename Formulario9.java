import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Formulario9 extends JFrame implements ActionListener {
  
  private JLabel rgbLabel1 , rgbLabel2 , rgbLabel3;
  private JComboBox rgb1 , rgb2 , rgb3;
  private JButton boton1;

  public Formulario9() {
    setLayout(null);

    rgbLabel1 = new JLabel("rojo");
    rgbLabel1.setBounds(10,10,100,15);
    add(rgbLabel1);

    rgb1 = new JComboBox();
    rgb1.setBounds(110,10,30,15);
    for(int i = 0 ; i <= 255 ; i++){
      rgb1.addItem(String.valueOf(i));
      }
    add(rgb1);


    rgbLabel2 = new JLabel("verde");
    rgbLabel2.setBounds(10,50,100,15);
    add(rgbLabel2);

    rgb2 = new JComboBox();
    rgb2.setBounds(110,50,30,15);
    for(int i = 0 ; i <= 255 ; i++){
      rgb2.addItem(String.valueOf(i));
      }
    add(rgb2);



    rgbLabel3 = new JLabel("azul");
    rgbLabel3.setBounds(10,90,100,15);
    add(rgbLabel3);

    rgb3 = new JComboBox();
    rgb3.setBounds(110,90,30,15);
    for(int i = 0 ; i <= 255 ; i++){
      rgb3.addItem(String.valueOf(i));
      }
    add(rgb3);

    boton1 = new JButton("Fijar Color");
    boton1.setBounds(10,130,100,30);
    add(boton1);
    boton1.addActionListener(this);
  }

  public void actionPerformed(ActionEvent evento){
    if (evento.getSource() == boton1){
      String value1 = rgb1.getSelectedItem().toString();
      String value2 = rgb2.getSelectedItem().toString();
      String value3 = rgb3.getSelectedItem().toString();

      int rojo = Integer.parseInt(value1);
      int verde = Integer.parseInt(value2);
      int azul = Integer.parseInt(value3);

      Color colorElegido = new Color(rojo , verde , azul);
      boton1.setBackground(colorElegido);
    }
  }

  public static void main(String[] args) {
    Formulario9 formulario1 = new Formulario9();
    formulario1.setBounds(0,0,300,400);
    formulario1.setVisible(true);
    formulario1.setResizable(false);
    formulario1.setLocationRelativeTo(null);

  }
}
