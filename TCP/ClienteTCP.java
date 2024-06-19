package TCP;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.logging.Logger;

public class ClienteTCP {
  public static void main(String[] args) {
    final String HOST="127.0.0.1";
    final int PUERTO = 5000;
    DataInputStream in;
    DataOutputStream out;
    try {
      Socket sc = new Socket(HOST , PUERTO);
      // de cliente a seervidor PARA LEER
      in = new DataInputStream(sc.getInputStream());
      // del servidor al cliente PARA ENVIAR RESPUESTA
      out = new DataOutputStream(sc.getOutputStream());
      // esto envia el out
      out.writeUTF("Hola munndo desde el cliente TCP");

      String mensaje = in.readUTF();
      System.out.println(mensaje);

      sc.close();

      
    } catch (Exception e) {
      Logger.getLogger(ClienteTCP.class.getName());
    }
  }
}
