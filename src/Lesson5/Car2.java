package Lesson5;

public class Car2 {
    String color;
    String ingine;
    int speed;

    int qaz(int skorost) {
        speed += skorost;
        return speed;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return speed;
    }

    void showinfo() {
        System.out.println("цвет: " + color + ". мотор:" + ingine + ". скорость:" + speed);
    }
}

class vinechle {
    public static void main(String[] args) {
        Car2 car1 = new Car2();
        car1.color = "красная";
        car1.ingine = "v6";
        car1.speed = 120;
        car1.qaz(40);
        car1.tormoz(140);
        car1.showinfo();
    }

}
