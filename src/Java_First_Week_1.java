import java.util.Arrays;
import java.util.Scanner;

public class Java_First_Week_1 {
    public static void main(String[] args) {
        //(1) boolean
        //변수를 선언해보자 => 타입 이름 = 값;
        boolean flag = true;

        flag = false;

        System.out.println(flag);

        //(2) char
        char alphabet = 'A';
        System.out.println(alphabet);

        //(3) 정수형(byte, short, int, long)
        byte byteNumber = 127;
        short shortNumber = 32767;
        int intNumber = 214783647;
        long longNumber = 214783647L;

        System.out.println(byteNumber);
        System.out.println(intNumber);
        System.out.println(shortNumber);
        System.out.println(longNumber);

        //(4) 실수형 float, double
        float floatNumber = 0.123F;
        double doubleNumber = 0.123;

        System.out.println(floatNumber);
        System.out.println(doubleNumber);

        //참조형 (1) 문자열 변수 String
        String hellowWorld = "Hello World!";
        System.out.println(hellowWorld);

        //참조형 (2) 배열
        int[] a = {1,2,3};
        System.out.println(Arrays.toString(a));

        //래퍼 클래스
        int number = 21;
        Integer num = number;

        System.out.println(num.intValue());

        //숫자 - > 문자 (아스키코드)
        Scanner sc = new Scanner(System.in);
        int asciiNumber = sc.nextInt();
        char ch = (char)asciiNumber;

        System.out.println(ch);

        //문자 -> 숫자(아스키코드)
        Scanner sc1 = new Scanner(System.in);
        char letter = sc1.nextLine().charAt(0);
        int asciiNumber2 = (int)letter;

        System.out.println(asciiNumber2);

        //형변환 double or float
        double doubleNumber1 = 10.101010;
        float floatNumber1 = 10.1010f;

        int intNumber1;
        intNumber1 = (int)doubleNumber1;
        System.out.println(intNumber1);

        int intNumber2;
        intNumber2 = (int)floatNumber1;
        System.out.println(intNumber2);

        //형변환 정수형
        int intNumber3 = 10;
        double doubleNumber2 = (double)intNumber3;
        float floatNumber2 = (float)intNumber3;

        System.out.println(doubleNumber2);
        System.out.println(floatNumber2);

        //변수 타입별 크기 순서
        //byte -> short -> int -> long -> float -> double
        byte byteNumber1 = 10;
        int intNumber4 = byteNumber1;
        System.out.println(intNumber4);

        char charAlphabet = 'A';
        intNumber4 = charAlphabet;
        System.out.println(intNumber4);

        intNumber4 = 100;
        long longNumber1 = intNumber4;
        System.out.println(longNumber1);

        intNumber4 = 200;
        double doubleNumber3 = intNumber4;
        System.out.println(doubleNumber3);


    }
}
