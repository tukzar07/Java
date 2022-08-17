package Lesson4;

class Student {
    short StudBil;
    String FirstName;
    String LastName;
    short Year;
    float SrMath;
    float SrEcon;
    float SrLang;


}
public class Homework {

}
class StudentTest{
    public static void main(String[] args) {

        Student FirstSt = new Student();
        FirstSt.StudBil = 101;
        FirstSt.FirstName = "Иван";
        FirstSt.LastName = "Иванов";
        FirstSt.Year = 2005;
        FirstSt.SrMath = 4.3f;
        FirstSt.SrEcon = 3.7f;
        FirstSt.SrLang = 4.1f;
        System.out.println("Имя: " + FirstSt.FirstName + ". Фамилия: " + FirstSt.LastName + ". Средняя оценка: " + (FirstSt.SrMath+FirstSt.SrEcon+FirstSt.SrLang)/3f);

        Student SecondSt = new Student();
        SecondSt.StudBil = 201;
        SecondSt.FirstName = "Пётр";
        SecondSt.LastName = "Петров";
        SecondSt.Year = 2006;
        SecondSt.SrMath = 3.3f;
        SecondSt.SrEcon = 4.7f;
        SecondSt.SrLang = 3.1f;
        System.out.println("Имя: " + SecondSt.FirstName + ". Фамилия: " + SecondSt.LastName + ". Средняя оценка: " + (SecondSt.SrMath+SecondSt.SrEcon+SecondSt.SrLang)/3f);


        Student ThirdSt = new Student();
        ThirdSt.StudBil = 301;
        ThirdSt.FirstName = "Сергей";
        ThirdSt.LastName = "Сергеев";
        ThirdSt.Year = 2007;
        ThirdSt.SrMath = 3.8f;
        ThirdSt.SrEcon = 4.3f;
        ThirdSt.SrLang = 3.6f;
        System.out.println("Имя: " + ThirdSt.FirstName + ". Фамилия: " + ThirdSt.LastName + ". Средняя оценка: " + (ThirdSt.SrMath+ThirdSt.SrEcon+ThirdSt.SrLang)/3f);

    }

}