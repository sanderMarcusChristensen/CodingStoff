package Socket;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    private static final String server_IP = "127.0.0.1";
    private static final int PORT = 9090;

    public static void main ( String[] args) throws IOException {

        Socket clientSocket = new Socket(server_IP,PORT);

        BufferedReader inputFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // ??????????????????

        String meassageFromServer = inputFromServer.readLine();
        System.out.println("From server: " + meassageFromServer);
        clientSocket.close();



    }


}
