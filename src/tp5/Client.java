package tp5;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println(service1.sayHello());

            // Activité 1
            System.out.println("Doneez une chaine");
            Scanner s=new Scanner(System.in);
            String a=s.nextLine();
            System.out.println(service1.uppercase(a));

            // Activité 2
            System.out.println("Doneez une chaine");
            Scanner s2=new Scanner(System.in);
            String x=s2.nextLine();
            System.out.println("Doneez un caractère");
            Scanner t=new Scanner(System.in);
            char y=t.nextLine().charAt(0);
            System.out.println(service1.index(x,y));

            // Activité 3
            System.out.println("Doneez une chaine");
            Scanner f=new Scanner(System.in);
            String b=f.nextLine();
            System.out.println(service1.palindrome(b));

            // Activité 4
            System.out.println("Doneez id");
            Scanner s1=new Scanner(System.in);
            int i=s1.nextInt();
            System.out.println("usename");
            Scanner d=new Scanner(System.in);
            String u=d.nextLine();

            System.out.println("balance");
            Scanner f1=new Scanner(System.in);
            Double bl=f1.nextDouble();

            service1.createAccount(i,u,bl);
            System.out.println(service1.remotewithdrow(50));
            System.out.println(service1.deposit(100));

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e);
        }
    }
}
