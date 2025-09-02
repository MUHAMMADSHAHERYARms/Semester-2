import java.io.*;
import java.net.*;

public class ClientMT2.0 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9090); // Connect to server
        System.out.println("Connected to server.");

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

        // Thread to read messages from server
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String msg;
                    while ((msg = in.readLine()) != null) {
                        if (msg.equalsIgnoreCase("quit")) {
                            System.out.println("Server closed the chat.");
                            break;
                        }
                        System.out.println("Server: " + msg);
                    }
                    socket.close();
                } catch (IOException e) {
                    // connection closed
                }
            }
        }).start();

        // Thread to send messages to server
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    String msg;
                    while ((msg = console.readLine()) != null) {
                        out.println(msg);
                        if (msg.equalsIgnoreCase("quit")) {
                            System.out.println("Client closed the chat.");
                            socket.close();
                            break;
                        }
                    }
                } catch (IOException e) {
                    // connection closed
                }
            }
        }).start();
    }
}
