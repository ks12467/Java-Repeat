import java.util.Arrays;

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
    }
}
