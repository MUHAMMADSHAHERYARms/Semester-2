import java.io.*;
import java.net.*;

public class ServerMT2.0 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9090);
        System.out.println("Server started...");

        while (true) {  // Keep serving clients, one at a time
            System.out.println("Waiting for client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            // Thread to read messages from client
            Thread reader = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String msg;
                        while ((msg = in.readLine()) != null) {
                            if (msg.equalsIgnoreCase("quit")) {
                                System.out.println("Client left the chat.");
                                socket.close();
                                break;
                            }
                            System.out.println("Client: " + msg);
                        }
                    } catch (IOException e) {
                        // Client disconnected
                    }
                }
            });

            // Thread to send messages to client
            Thread writer = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        String msg;
                        while ((msg = console.readLine()) != null) {
                            out.println(msg);
                            if (msg.equalsIgnoreCase("quit")) {
                                System.out.println("Server closed the chat.");
                                socket.close();
                                break;
                            }
                        }
                    } catch (IOException e) {
                        // Socket closed
                    }
                }
            });

            reader.start();
            writer.start();

            // Wait until both threads finish before serving next client
            reader.join();
            writer.join();
        }
    }
}
