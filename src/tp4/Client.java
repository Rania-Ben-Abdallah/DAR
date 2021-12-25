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

       //Activité 1
        System.out.println("Doneez une chaine");
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        outClient.println(a);
        //affichage du resultat dans le côté client
        System.out.println(inClient.readLine());



        // Activité 2
        System.out.println("Doneez une chaine");
        Scanner d=new Scanner(System.in);
        String x=d.nextLine();
        outClient.println(x);

        System.out.println("Doneez un caractère");
        Scanner t=new Scanner(System.in);
        char y=t.nextLine().charAt(0);
        outClient.println(y);

        System.out.println(inClient.readLine());



        //Activité 3
        System.out.println("Doneez une chaine");
        Scanner f=new Scanner(System.in);
        String b=f.nextLine();
        outClient.println(b);

        System.out.println(inClient.readLine());

        inClient.close();
        outClient.close();

        // close client socket
        socket.close();
    }
}
