package L06DefiningClasses.Lab.P03BankAccount;

public class BankAccount {
    private static int accounts = 1;
    private static double interest = 0.02;

    private double balance;
    private int id;

    public BankAccount (){
        id = accounts++;
    }

    public static void setInterest (double interest){
        BankAccount.interest = interest;
    }

    public double getInterest(int years){
        return balance * interest * years;
    }

    public void deposit (double amount){
        balance += amount;
    }

    public int getId (){
        return id;
    }

}

