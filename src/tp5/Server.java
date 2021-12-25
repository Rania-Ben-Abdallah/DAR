package tp5;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.Locale;

public class Server extends UnicastRemoteObject implements MyInterface {

    public Server() throws RemoteException {}
    BankAccount cl;

    public String sayHello() {
        return "Hello World !!";
    }
    
    // Activité 1
    public String uppercase (String ch){
        ch=ch.toUpperCase(Locale.ROOT);
        return ch;
    }
    
    // Activité 2
    public double index (String ch, char c){
        return ch.indexOf(c);
    }
    
    // Activité 3
    @Override
    public String palindrome (String ch){
        int n=ch.length();
        for(int i=0;i<n/2;i++){
            if(ch.charAt(i) != ch.charAt(n-i-1)){
                return "false";
            }
        }
        return "true";
    }
    
    // Activité 4
    public void createAccount(int i, String u, double b){
        cl=new BankAccount(i,u,b);
        System.out.println(cl);
    }
    
    @Override
    public double remotewithdrow(double m){
        double balance=cl.balance-m;
        return balance;
    }
    public double deposit(double m){
        return cl.balance;
    }
    public static void main(String[] args) throws RemoteException, MalformedURLException {
        Server server = new Server();
        java.rmi.registry.LocateRegistry.createRegistry(1250);
        Naming.rebind("rmi://127.0.0.1:1250/server", server);

    }
}
