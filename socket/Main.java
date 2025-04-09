package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

// clases involucradas:
// InputStream
// InputStreamReader
// Socket y ServerSocket

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket socket = new ServerSocket();
            Socket client_socket = socket.accept();
            InputStreamReader reader = new InputStreamReader(client_socket.getInputStream());
            // Declarar una variable para almacenar el nombre del metodo
            // while(reader.read() != 32) do: metodo[i] = reader.read()
            // convertir metodo a String
            // asignarlo al nuevo objeto HttpRequest
        } catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
