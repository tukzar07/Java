package Lesson5;

public class Homework5_3 {
}

class Employee {
   Employee(int a, String b, int c, float d, String e) {
       id = a;
       surname = b;
       age = c;
       salary = d;
       department = e;
   }
    int id;
    String surname;
    int age;
    float salary;
    String department;

   float zarplata_x2() {
       salary *=  2;
       return  salary;
   }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee Employee1 = new Employee(1, "Ivanov", 26, 234.87f, "sbut");
        System.out.println("Фамилия: " + Employee1.surname + ". Отдел: " + Employee1.department + ". Зарплата: " + Employee1.salary + ". Зарплата x2: " + Employee1.zarplata_x2());
        Employee Employee2 = new Employee(2, "Petrov", 45, 9999.99f, "IT");
        System.out.println("Фамилия: " + Employee2.surname + ". Отдел: " + Employee2.department + ". Зарплата: " + Employee2.salary + ". Зарплата x2: " + Employee2.zarplata_x2());
    }
}