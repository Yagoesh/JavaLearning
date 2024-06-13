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
  private JComboBox<String> antiguedad1, departamento1;
  private JScrollPane scroll;
  private JTextArea textArea;
  String nombre1 ;

public Principal() {
  setLayout(null);
  setDefaultCloseOperation(EXIT_ON_CLOSE);
  setTitle("Pantalla Principal");
  getContentPane().setBackground(new Color(250,0,0));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  Licencia ventana = new Licencia();
  nombre1 = ventana.nombre;
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
  menuAcercaDe.setForeground(new Color(255,255,255));
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

  bienvenido = new JLabel("Bienvenido " + nombre1);
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
  nombre.setForeground(new Color(255,255,255));
  add(nombre);

  nombreTrabajador = new JTextField();
  nombreTrabajador.setBounds(25,213,150,25);
  nombreTrabajador.setBackground(new java.awt.Color(224,224,224));
  nombreTrabajador.setFont(new Font("Andale Mono" , 1 , 14));
  nombreTrabajador.setForeground(new Color(255,0,0));
  add(nombreTrabajador);

  aPaterno = new JLabel("Apellido Paterno :");
  aPaterno.setBounds(25,248,180,25);
  aPaterno.setFont(new Font("Andale Mono" , 1 , 14));
  aPaterno.setForeground(new Color(255,255,255));
  add(aPaterno);

  APaterno = new JTextField();
  APaterno.setBounds(25,273,150,25);
  APaterno.setBackground(new java.awt.Color(224,224,224));
  APaterno.setFont(new Font("Andale Mono" , 1 , 14));
  APaterno.setForeground(new Color(255,0,0));
  add(APaterno);

  aMaterno = new JLabel("Apellido Materno :");
  aMaterno.setBounds(25,308,180,25);
  aMaterno.setFont(new Font("Andale Mono" , 1 , 14));
  aMaterno.setForeground(new Color(255,255,255));
  add(aMaterno);

  AMaterno = new JTextField();
  AMaterno.setBounds(25,333,150,25);
  AMaterno.setBackground(new java.awt.Color(224,224,224));
  AMaterno.setFont(new Font("Andale Mono" , 1 , 14));
  AMaterno.setForeground(new Color(255,0,0));
  add(AMaterno);

  departamento = new JLabel("Selecciona Departamento:");
  departamento.setBounds(220,188,180,25);
  departamento.setFont(new Font("Andale Mono" , 1 , 14));
  departamento.setForeground(new Color(255,255,255));
  add(departamento);

  departamento1 = new JComboBox<>();
  departamento1.setBounds(220,213,220,25);
  departamento1.setBackground(new java.awt.Color(224,224,224));
  departamento1.setFont(new Font("Andale Mono" , 1 , 14));
  departamento1.setForeground(new Color(255,0,0));
  add(departamento1);
  departamento1.addItem("");
  departamento1.addItem("Atencion Al Cliente");
  departamento1.addItem("Logistica");
  departamento1.addItem("Gerencia");



  antiguedad = new JLabel("Selecciona Antiguedad:");
  antiguedad.setBounds(220,248,180,25);
  antiguedad.setFont(new Font("Andale Mono" , 1 , 14));
  antiguedad.setForeground(new Color(255,255,255));
  add(antiguedad);

  antiguedad1 = new JComboBox<>();
  antiguedad1.setBounds(220,273,220,25);
  antiguedad1.setBackground(new java.awt.Color(224,224,224));
  antiguedad1.setFont(new Font("Andale Mono" , 1 , 14));
  antiguedad1.setForeground(new Color(255,0,0));
  add(antiguedad1);
  antiguedad1.addItem("");
  antiguedad1.addItem("1 año");
  antiguedad1.addItem("2 a 6 años");
  antiguedad1.addItem("7 años o más");


  resultado = new JLabel("Resultado del Cálculo:");
  resultado.setBounds(220,307,180,25);
  resultado.setFont(new Font("Andale Mono" , 1 , 14));
  resultado.setForeground(new Color(255,255,255));
  add(resultado);

  textArea = new JTextArea();
  textArea.setBackground(new java.awt.Color(224,224,224));
  textArea.setFont(new Font("Andale Mono" , 1 , 11));
  textArea.setForeground(new Color(255,0,0));
  textArea.setEditable(false);
  // textArea.setEnabled(false);
  textArea.setText("\n Aqui aparece el resultado del cálculo de las vacaciones.");
  scroll = new JScrollPane(textArea);
  scroll.setBounds(220,333,385,90);
  add(scroll);

  footer = new JLabel("The Cocacola Company | Todos los derechos reservados");
  footer.setBounds(135,445,500,30);
  footer.setFont(new Font("Andale Mono" , 1 , 14));
  footer.setForeground(new Color(255,255,255));
  add(footer);

}

public void actionPerformed(ActionEvent evento) {
  if (evento.getSource() == miCalculo){
    String trabajadorNombre = nombreTrabajador.getText();
    String paternoApe = APaterno.getText();
    String maternoApe = AMaterno.getText();
    String departamento = departamento1.getSelectedItem().toString();
    String antiguedad = antiguedad1.getSelectedItem().toString();
    if( trabajadorNombre.equals("") || paternoApe.equals("") || maternoApe.equals("") || departamento.equals("") || antiguedad.equals("")  ){
      JOptionPane.showMessageDialog(null, "Debes completar el formulario.");
    }else {
      if (departamento.equals("Atencion Al Cliente")){
          if(antiguedad.equals("1 año")){
            textArea.setText("\n El trabajador " + trabajadorNombre + " " + paternoApe + " " + maternoApe + 
                          "\n que trabaja en el departamento " + departamento + " con " + antiguedad + "años de antiguedad" +
                          "\n recibe 6 dias de vacaciones.") ;
          }
          if(antiguedad.equals("2 a 6 años")){
            textArea.setText("\n El trabajador " + trabajadorNombre + " " + paternoApe + " " + maternoApe + 
                          "\n que trabaja en el departamento " + departamento + " con " + antiguedad + "años de antiguedad" +
                          "\n recibe 14 dias de vacaciones.") ;
          }
          
          if(antiguedad.equals("7 años o más")){
            textArea.setText("\n El trabajador " + trabajadorNombre + " " + paternoApe + " " + maternoApe + 
                          "\n que trabaja en el departamento " + departamento + " con " + antiguedad + "años de antiguedad" +
                          "\n recibe 20 dias de vacaciones.") ;
          }
      }
      if (departamento.equals("Logistica")){
          if(antiguedad.equals("1 año")){
            textArea.setText("\n El trabajador " + trabajadorNombre + " " + paternoApe + " " + maternoApe + 
                          "\n que trabaja en el departamento " + departamento + " con " + antiguedad + "años de antiguedad" +
                          "\n recibe 7 dias de vacaciones.") ;
          }
          if(antiguedad.equals("2 a 6 años")){
            textArea.setText("\n El trabajador " + trabajadorNombre + " " + paternoApe + " " + maternoApe + 
                          "\n que trabaja en el departamento " + departamento + " con " + antiguedad + "años de antiguedad" +
                          "\n recibe 15 dias de vacaciones.") ;
          }
          
          if(antiguedad.equals("7 años o más")){
            textArea.setText("\n El trabajador " + trabajadorNombre + " " + paternoApe + " " + maternoApe + 
                          "\n que trabaja en el departamento " + departamento + " con " + antiguedad + "años de antiguedad" +
                          "\n recibe 22 dias de vacaciones.") ;
          }
      }

      if (departamento.equals("Gerencia")){
        if(antiguedad.equals("1 año")){
          textArea.setText("\n El trabajador " + trabajadorNombre + " " + paternoApe + " " + maternoApe + 
                        "\n que trabaja en el departamento " + departamento + " con " + antiguedad + "años de antiguedad" +
                        "\n recibe 10 dias de vacaciones.") ;
        }
        if(antiguedad.equals("2 a 6 años")){
          textArea.setText("\n El trabajador " + trabajadorNombre + " " + paternoApe + " " + maternoApe + 
                        "\n que trabaja en el departamento " + departamento + " con " + antiguedad + "años de antiguedad" +
                        "\n recibe 20 dias de vacaciones.") ;
        }
        
        if(antiguedad.equals("7 años o más")){
          textArea.setText("\n El trabajador " + trabajadorNombre + " " + paternoApe + " " + maternoApe + 
                        "\n que trabaja en el departamento " + departamento + " con " + antiguedad + "años de antiguedad" +
                        "\n recibe 30 dias de vacaciones.") ;
        }
    }

    }

  }
  if (evento.getSource() == miRojo){
    getContentPane().setBackground(new Color(255,0,0));
  }
  if (evento.getSource() == miMorado){
    getContentPane().setBackground(new Color(51,0,51));
    
  }
  if (evento.getSource() == miNegro){
    getContentPane().setBackground(new Color(0,0,0));
    
  }
  if (evento.getSource() == miNuevo){
    nombreTrabajador.setText("nombre1");
      APaterno.setText("");
      AMaterno.setText("");
      departamento1.setSelectedIndex(0);
      antiguedad1.setSelectedIndex(0);
      textArea.setText("\n Aqui aparece el resultado del calculo de las vacaciones");
      textArea.setEditable(false);
      this.setVisible(false);

  }
  if (evento.getSource() == miElCreador){
    JOptionPane.showMessageDialog(null, "Desarrollado por Yogesh Samtani \n" + 
                                  "                       672906095");
  }
  if (evento.getSource() == miSalir){
    Bienvenida funcion = new Bienvenida();
    funcion.setBounds(0,0,500,500);  
    funcion.setVisible(true);
    funcion.setResizable(true);
    funcion.setLocationRelativeTo(null);
    this.setVisible(false);
  }
  
}

public static void main(String[] args) {
  Principal funcion = new Principal();
  funcion.setBounds(0,0,650,600);  
  funcion.setVisible(true);
  funcion.setResizable(true);
  funcion.setLocationRelativeTo(null);
}


}
