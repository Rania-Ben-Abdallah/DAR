package tp5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    String sayHello()throws RemoteException;
    String uppercase (String ch)throws RemoteException;
    double index (String ch, char c)throws RemoteException;
    String palindrome (String ch)throws RemoteException;
    void createAccount(int i, String u, double b)throws RemoteException;
    double remotewithdrow(double m)throws RemoteException;
    double deposit(double m)throws RemoteException;

}
