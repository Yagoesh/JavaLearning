package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Logger;

public class ClienteUDP {

  public static void main(String[] args) {
    final int PUERTO_SERVIDOR = 5000;
    byte[] buffer = new byte[1024];
    
    try {
      
      InetAddress dirreccionServidor =  InetAddress.getByName("localhost");

      DatagramSocket socketUDP = new DatagramSocket();

      String mensaje = "Hola mundo desde el cliente";
      buffer = mensaje.getBytes();

      // creamos el paquete/caja para enviar 
            DatagramPacket pregunta = new DatagramPacket(buffer, buffer.length, dirreccionServidor , PUERTO_SERVIDOR );
      System.out.println("Envio informacion a modo datagrama al servidor ");
      socketUDP.send(pregunta);

      DatagramPacket peticion = new DatagramPacket((buffer) , buffer.length);
      socketUDP.receive(peticion);
      System.out.println("recibo informacion del servidor ");

      mensaje = new String(peticion.getData());
      System.out.println(mensaje);

      socketUDP.close();




    } catch (Exception e) {
            Logger.getLogger(ServidorUDP.class.getName());

    }
  }
  
}
