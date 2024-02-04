package Socket;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateServer {
    private static final int PORT = 9090;

    public static void main (String[] args) throws IOException {

        ServerSocket serversocket = new ServerSocket(PORT);
        System.out.println("waiting for client........");
        Socket clientSocket = serversocket.accept();
        System.out.println("client has connected");


        PrintWriter outputToClient = new PrintWriter(clientSocket.getOutputStream(), true);

        outputToClient.println("Today is " + LocalDateTime.now().toString());

        System.out.println("Date is sent to client.......");

        System.out.println("Closing down server...bye ");

        clientSocket.close();
        serversocket.close();


    }

}
