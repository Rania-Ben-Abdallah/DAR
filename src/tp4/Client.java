package tp4;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        System.out.println("connection request");

        //Create a client socket
        Socket socket = new Socket("127.0.0.1", port);
        System.out.println("Connection established");

        // create in / out
        BufferedReader inClient = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outClient = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

        System.out.println("saisir une chaine: ");
        Scanner s=new Scanner(System.in);
        String ch=s.nextLine();
        outClient.println(ch);


        System.out.println(inClient.readLine());

        System.out.println("saisir une chaine: ");
        Scanner s2=new Scanner(System.in);
        String ch2=s2.nextLine();

        System.out.println("saisir un caractère: ");
        Scanner s3=new Scanner(System.in);
        char c=s3.nextLine().charAt(0);*/

        //Write message to the server
        outClient.println(ch);
        outClient.println(c);
        // Read a message from the server
         System.out.println(inClient.readLine());

        //****** if you're using DataInputStream & DataOutputStream ******

        //DataInputStream inClient = new DataInputStream(socket.getInputStream());
        //DataOutputStream outClient = new DataOutputStream(socket.getOutputStream());

        //System.out.println("Enter your msg");
        //String str = new Scanner(System.in).nextLine();
        //outClient.writeUTF(str);
        //outClient.flush();

        //****** if you're using DataInputStream & DataOutputStream ******

        //close in / out
        inClient.close();
        outClient.close();

        // close client socket
        socket.close();
    }
}
