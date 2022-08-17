package Lesson4;

public class BankAccount {
    int id = 1;
    String name;
    double balance;

}

class BankAccountTest{
    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        MyAccount.id = 1;
        MyAccount.name = "Виталий";
        MyAccount.balance = 98.56;

        BankAccount YourAccount = new BankAccount();
        YourAccount.id = 2;
        YourAccount.name = "Петя";
        YourAccount.balance = 8.4;

        BankAccount HisAccount = new BankAccount();
        HisAccount.id = 3;
        HisAccount.name = "Серёга";
        HisAccount.balance = 18.28;

        System.out.println(MyAccount.balance);
    }
}
