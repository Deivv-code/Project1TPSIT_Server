import java.net.ServerSocket;
import java.net.Socket;

import main.java.it.fi.meucci.ServerThread;

public class MultiServer {
    public void Beginning()
    {
        try {
            ServerSocket server = new ServerSocket(7073);
        for(;;)
        {
            System.out.println("---Server still waiting---");
            Socket socket = server.accept();
            System.out.println("Server socket " + socket);
            ServerThread server_thread = new ServerThread(socket);
            server_thread.start();
        }
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
            System.out.println("Error during server instance");
            System.exit(1);
        }
        
    }
}
