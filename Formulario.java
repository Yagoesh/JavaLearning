import javax.swing.*;
public class Formulario extends JFrame {
  private JLabel label1;
  private JLabel label2;
  public Formulario() {
    setLayout(null);
    label1 = new JLabel("HOLA");
    label1.setBounds(100, -20, 500, 300);
    add(label1);

    label2 = new JLabel("MUNDO");
    label2.setBounds(0, 10, 200, 300);
    add(label2);

  }
  public static void main(String[] args) {
    Formulario swing1 = new Formulario();
    swing1.setBounds(0,0,400,300);
    swing1.setVisible(true);
    swing1.setLocationRelativeTo(null);
  }
}


