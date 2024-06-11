import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario11 extends JFrame implements ActionListener{
  private JMenuBar menubar;
  private JMenu menu1, menu2 , menu3 ;
  private JMenuItem menuItem1 , menuItem2, menuItem3 , menuItem4;


  public Formulario11 () {
    setLayout(null);

    menubar = new JMenuBar();
    setJMenuBar(menubar);

    menu1 = new JMenu("Opciones");
    menubar.add(menu1);

    menu2 = new JMenu("Tamaño de la ventana");
    menu1.add(menu2);

    menu3 = new JMenu("Color de fondo");
    menu1.add(menu3);

    menuItem1 = new JMenuItem("300*200");
    menu2.add(menuItem1);
    menuItem1.addActionListener(this);

    menuItem2 = new JMenuItem("640*480");
    menu2.add(menuItem2);
    menuItem2.addActionListener(this);


    menuItem3 = new JMenuItem("rojo");
    menu3.add(menuItem3);
    menuItem3.addActionListener(this);

    
    menuItem4 = new JMenuItem("verde");
    menu3.add(menuItem4);
    menuItem4.addActionListener(this);


  }
  public void actionPerformed(ActionEvent evento) {
  Container fondo = this.getContentPane();
  
  if(evento.getSource() == menuItem1){
    setSize(300,200);
  }
  if(evento.getSource() == menuItem2){
    setSize(640,480);
    
  }

  if(evento.getSource() == menuItem3) {
    fondo.setBackground(new Color(250,0,0));;
  }
  if(evento.getSource() == menuItem4) {
    fondo.setBackground(new Color(0,250,0));;
  }
    
  }
  public static void main(String[] args) {
    Formulario11 formulario = new Formulario11();
    formulario.setBounds(0,0,500,500);  
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
  }
}
