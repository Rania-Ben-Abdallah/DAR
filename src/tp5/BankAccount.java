package tp5;

public class BankAccount {
    int id;
    String username;
    double balance;

    public BankAccount(int id, String username, double balance) {
        this.id = id;
        this.username = username;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", balance=" + balance +
                '}';
    }
    public double deposit(double m){
        balance=balance+m;
        return balance;
    }

}
