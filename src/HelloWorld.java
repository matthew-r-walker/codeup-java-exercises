public class HelloWorld {
    public static void main(String[] agrs) {
        System.out.print("Hello");
        System.out.print(", World!");

        int myFavoriteNumber = 4;
        System.out.println(myFavoriteNumber);

        String myString = "I'm a string!";
        System.out.println(myString);

        float myNumber = 3.14F;
        System.out.println(myNumber);

        // This will output 5 then 6 because x is incremented after it is printed
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
        // This will output 6 then 6 because x is incremented before it is printed
        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        // this will not work because class is a reserved word
//        int class = 5;

        String theNumberThree = "three";
        Object o = theNumberThree;
        System.out.println(o);
        // cannot cast a string class to a int class
//        int three = (int) o;
        // cannot convert string to int
//        int three = (int) "three";

        x = 4;
        x += 5;

        x = 3;
        int y = 4;
        y *= x;

        x = 10;
        y = 2;
        x /= y;
        y -= x;


        int num300 = 33000;
        short num = 40;
        byte bigByte = Byte.MAX_VALUE;
        System.out.println(bigByte);
        ++bigByte;
        System.out.println(++bigByte);

        num = (short) num300;
        System.out.println(num);

        int medInt = 50000;
        num = (short) medInt;

        int bigInt = Integer.MAX_VALUE;
        System.out.println(++bigInt);

    }
}
