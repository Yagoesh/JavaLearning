package TCP;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ServidorTCP {
  public static void main(String[] args) {
    
    // SOCKET DEL SERVIDOR 
      ServerSocket servidor = null;

      // SOCKET DEL CLIENTE
      Socket sc = null;


      DataInputStream in;
      DataOutputStream out;
      final int PUERTO= 5000;
      try {
        servidor = new ServerSocket(PUERTO);
        System.out.println("Servidor iniciado");
        while (true) {
          sc = servidor.accept();
          System.out.println("Cliente conectado");

          // creamos dataInputStream y DataOutputStream para comunicarnos
          // de cliente a seervidor PARA LEER
          in = new DataInputStream(sc.getInputStream());
          // del servidor al cliente PARA ENVIAR RESPUESTA
          out = new DataOutputStream(sc.getOutputStream());

          // RECIBE DEL IN
          String mensaje = in.readUTF();
          System.out.println(mensaje);

          out.writeUTF("Hola mundo desde el servidor UTF");

          // cerramos el socket de cliente
          sc.close();
          System.out.println("Cliente desconectado");

        }
      } catch (Exception e) {
      Logger.getLogger(ServidorTCP.class.getName());

      }
  }
}
