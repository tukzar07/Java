package Lesson5;

public class test1 {

    int summa(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    int srednee (int a1, int b1, int c1){
        int result2 = summa(a1,b1,c1)/3;
        return result2;
    }
}

class rty {
    public static void main(String[] args) {
        test1 arb = new test1();
        int e = arb.srednee(5, 4, 7);
        System.out.println(e);
    }
}