package socket;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket server_socket = new ServerSocket(1234);
            server_socket.accept();
            server_socket.close();
        } catch(IOException ex) {

        }
    }
}
