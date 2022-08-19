package Lesson5;

public class Homework5 {
    int id = 1;
    String name;
    double balance;

    double popolnennieScheta(double popolnenie){
        balance += popolnenie;
        return balance;
    }

    double snyatieSoScheta(double snyatie){
        balance -= snyatie;
        return balance;
    }

}

class BankAccountTest{
    public static void main(String[] args) {
        Homework5 MyAccount = new Homework5();
        MyAccount.id = 1;
        MyAccount.name = "Виталий";
        MyAccount.balance = 98.56;
        MyAccount.snyatieSoScheta(43.50);
        MyAccount.popolnennieScheta(100);

        Homework5 YourAccount = new Homework5();
        YourAccount.id = 2;
        YourAccount.name = "Петя";
        YourAccount.balance = 8.4;

        Homework5 HisAccount = new Homework5();
        HisAccount.id = 3;
        HisAccount.name = "Серёга";
        HisAccount.balance = 18.28;

        System.out.println(MyAccount.balance);
    }
}