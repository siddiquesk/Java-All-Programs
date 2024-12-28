import java.util.Scanner;

class Account {
    int bal;

    Account(int w) {
        bal = w;  // Corrected the variable name
    }

    boolean isSufficientbal(int w) {
        if (bal >= w) {  // Changed the condition to include equality
            return true;
        } else {
            return false;
        }
    }

    void withdraw(int amt, String g1) {  // Corrected method name spelling
        bal = bal - amt;
        System.out.println(g1 + " Transaction successful");
        System.out.println(g1 + " Current balance: " + bal);
    }
}

class Customer implements Runnable {
    String m1;
    Account x1;

    Customer(Account j1, String h1) {
        x1 = j1;
        m1 = h1;
    }

    public void run() {
        Scanner s1 = new Scanner(System.in);
        synchronized (x1) {
            System.out.println("Enter amount to withdraw " + m1 + ":");
            int amt = s1.nextInt();
            if (x1.isSufficientbal(amt)) {
                x1.withdraw(amt, m1);
            } else {
                System.out.println(m1 + ": Insufficient balance");
            }
        }
    }
}

public class MultithreadingBig {
    public static void main(String args[]) {
        Account a1 = new Account(500);
        Customer c1 = new Customer(a1, "Amit");
        Customer c2 = new Customer(a1, "Sumit");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}