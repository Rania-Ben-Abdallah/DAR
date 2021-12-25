package tp4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;

public class Server {

    static final int port = 1200;
    public static String palidrome (String ch){
        int n=ch.length();
        for(int j=0;j<n/2;j++){
            if(ch.charAt(j) != ch.charAt(n-j-1)){
                return "false";
            }
        }
        return "true";
    }
    public static void main(String[] args) throws Exception {

        // Listen to a specific p
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("Waiting for connection");
        Socket socClient = serverSocket.accept(); // Accept a client socket
        System.out.println("Connection established");

        // Initialize in / out
        BufferedReader inServer = new BufferedReader(new InputStreamReader(socClient.getInputStream()));
        PrintWriter outServer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socClient.getOutputStream())), true);
        
        // Activité1
        // Read message sent by the client
        String a=inServer.readLine();
        // Write message to the client
        outServer.println(a.toUpperCase(Locale.ROOT));
        
        // Activité2
        String x=inServer.readLine();
        String y=inServer.readLine();
        outServer.println(x.indexOf(y));
        
        // Activité3
        String b=inServer.readLine();
        outServer.println(palidrome(b));
        
        // Close in / out
        inServer.close();
        outServer.close();

        // Close client socket
        socClient.close();
        serverSocket.close();
    }
}
