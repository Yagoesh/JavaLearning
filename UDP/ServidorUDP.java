package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.logging.Logger;

public class ServidorUDP {
  public static void main(String[] args) {
    final int PUERTO = 5000;
    byte[] buffer = new byte[1024];

    try {

      while (true) {
        System.out.println("Iniciado el servidor UDP");

        DatagramSocket socketUdp = new DatagramSocket(PUERTO);
  
        // buffer es la caja/paquete donde va a ir metido todos los datos
        DatagramPacket peticion = new DatagramPacket(buffer, buffer.length);
  
        socketUdp.receive(peticion);
        System.out.println("Recibo informacion del cliente ");
  
        String mensaje = new String(peticion.getData());
        System.out.println(mensaje);
  
        int puertoCliente = peticion.getPort();
        InetAddress dirreccion = peticion.getAddress();
  
        String mensajeRespuesta = "Hola mundo desde el servidor UDP";
        buffer = mensajeRespuesta.getBytes();
  
        // incluirmos en la caja (buffer) direccion y puerto para enviarlo
        DatagramPacket respuesta = new DatagramPacket(buffer, buffer.length, dirreccion , puertoCliente );
        System.out.println("Envio informacion al cliente ");
  
        socketUdp.send(respuesta);
      }
     
      
    } catch (Exception e) {
      Logger.getLogger(ServidorUDP.class.getName());

      
      
    }

  }
  
}
