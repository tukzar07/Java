package Lesson5;

public class Human {
    String name;
    Car car;
    BankAccount ba;

    void info(){
        System.out.println("Имя:" + name + " Цвет машины:" + car.color + " Бабло:" + ba.balance);

    }
}

class Humantest{
    public static void main(String[] args) {
        Human a = new Human();
        a.name = "David";
        a.car = new Car("красная", "V8");
        a.ba = new BankAccount(2, 9999.99);
        a.info();
    }
}

class Car {
    Car(String c, String b){
        color = c;
        engine = b;
    }
    String engine;
    String color;
}

class BankAccount{
    BankAccount(int id2, double balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;
}
