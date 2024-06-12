package Proyecto;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Principal extends JFrame implements ActionListener{

  private JMenuBar menubar;
  private JMenu menuOpciones , menuCalcular , menuColorFondo, menuAcercaDe;
  private JMenuItem miSalir , miElCreador, miNuevo, miCalculo, miRojo, miNegro, miMorado;
  private JLabel logo, bienvenido, title , nombre, aPaterno, aMaterno, departamento, antiguedad, resultado , footer;
  private JTextField nombreTrabajador , APaterno, AMaterno;
  private JComboBox Departamento , Antiguedad;
  private JScrollPane scroll;
  private JTextArea textArea;

public Principal() {
  setLayout(null);
  setTitle("Pantalla Principal");
  getContentPane().setBackground(new Color(250,0,0));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  menubar = new JMenuBar();
  menubar.setBackground(new Color(250,0,0));
  setJMenuBar(menubar);

  menuOpciones = new JMenu("Opciones");
  menuOpciones.setFont(new Font("Andale Mono" , 1 , 14));
  menuOpciones.setForeground(new Color(255,255,255));
  menuOpciones.addActionListener(this);
  menubar.add(menuOpciones);

  menuCalcular = new JMenu("Calcular");
  menuCalcular.setFont(new Font("Andale Mono" , 1 , 14));
  menuCalcular.setForeground(new Color(255,255,255));
  menuCalcular.addActionListener(this);
  menubar.add(menuCalcular);

  menuAcercaDe = new JMenu("Acerca de");
  menuAcercaDe.setFont(new Font("Andale Mono" , 1 , 14));
  menuAcercaDe.setForeground(new Color(255,0,0));
  menuAcercaDe.addActionListener(this);
  menubar.add(menuAcercaDe);

  menuColorFondo = new JMenu("Color Fondo");
  menuColorFondo.setFont(new Font("Andale Mono" , 1 , 14));
  menuColorFondo.setForeground(new Color(255,0,0));
  menuColorFondo.addActionListener(this);
  menuOpciones.add(menuColorFondo);

  miCalculo = new JMenuItem("Mi Calculo");
  miCalculo.setFont(new Font("Andale Mono" , 1 , 14));
  miCalculo.setForeground(new Color(255,0,0));
  miCalculo.addActionListener(this);
  menuCalcular.add(miCalculo);

  miRojo = new JMenuItem("Rojo");
  miRojo.setFont(new Font("Andale Mono" , 1 , 14));
  miRojo.setForeground(new Color(255,0,0));
  miRojo.addActionListener(this);
  menuColorFondo.add(miRojo);

  miMorado = new JMenuItem("Morado");
  miMorado.setFont(new Font("Andale Mono" , 1 , 14));
  miMorado.setForeground(new Color(255,0,0));
  miMorado.addActionListener(this);
  menuColorFondo.add(miMorado);
  
  miNegro = new JMenuItem("Negro");
  miNegro.setFont(new Font("Andale Mono" , 1 , 14));
  miNegro.setForeground(new Color(255,0,0));
  miNegro.addActionListener(this);
  menuColorFondo.add(miNegro);

  miSalir = new JMenuItem("Salir");
  miSalir.setFont(new Font("Andale Mono" , 1 , 14));
  miSalir.setForeground(new Color(255,0,0));
  miSalir.addActionListener(this);
  menuOpciones.add(miSalir);

  miNuevo = new JMenuItem("Nuevo");
  miNuevo.setFont(new Font("Andale Mono" , 1 , 14));
  miNuevo.setForeground(new Color(255,0,0));
  miNuevo.addActionListener(this);
  menuOpciones.add(miNuevo);

  miElCreador = new JMenuItem("ElmiElCreador");
  miElCreador.setFont(new Font("Andale Mono" , 1 , 14));
  miElCreador.setForeground(new Color(255,0,0));
  miElCreador.addActionListener(this);
  menuAcercaDe.add(miElCreador);

  ImageIcon imagen = new ImageIcon("Proyecto/images/logo-coca.png");
  logo = new JLabel(imagen);
  logo.setBounds(5,5,250,100);
  add(logo);

  bienvenido = new JLabel("Bienvenido");
  bienvenido.setBounds(280,30,300,50);
  bienvenido.setFont(new Font("Andale Mono" , 1 , 32));
  bienvenido.setForeground(new Color(255,255,255));
  add(bienvenido);

  title = new JLabel("Datos del trabajador para el calculo de vacaciones");
  title.setBounds(45,140,900,25);
  title.setFont(new Font("Andale Mono" , 0 , 24));
  title.setForeground(new Color(255,255,255));
  add(title);

  nombre = new JLabel("Nombre del trabajador:");
  nombre.setBounds(25,188,180,25);
  nombre.setFont(new Font("Andale Mono" , 1 , 14));
  nombre.setForeground(new Color(255,0,0));
  add(nombre);



}
}
