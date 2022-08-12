package Lesson2;

public class test {
    public  static void main (String [] args){
        byte b1 = 0b1100;
        byte b2 = 0_14;
        byte b3 = 12;
        byte b4 = 0xC;
        System.out.println("byte:");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println();

        short s1 = -0b1010_0010_100;
        short s2 = -0_2_424;
        short s3 = -1_300;
        short s4 = -0x514;
        System.out.println("short:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println();

        int i1 = 0b0;
        int i2 = 0_0;
        int i3 = 0;
        int i4 = 0x0;
        System.out.println("int:");
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println();


        long l1 = 0b0111_0101_1011_1100_1101_0001_0101L;
        long l2 = 0_726_746_425L;
        long l3 = 123_456_789L;
        long l4 = 0x75B_CD15L;
        System.out.println("long:");
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
        System.out.println();


        boolean bool1 = true;
        boolean bool2 = false;
        System.out.println("boolean:");
        System.out.println(bool1);
        System.out.println(bool2);
        System.out.println();


        double d1 = 3.23;
        double d2 = 100.03;
        System.out.println("double:");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println();

        float f1 = 64.3333F;
        float f2 = 23.007F;
        System.out.println("float:");
        System.out.println(f1);
        System.out.println(f2);
        System.out.println();

        char a1 = 'F';
        char a2 = 37;
        char a3 = '\u5427';
        System.out.println("char:");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

    }
}
