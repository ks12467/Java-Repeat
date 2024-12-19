package java_second_week;

public class SecondWeek02 {
    //대입 연산자
    // =, +=, -=, *= ....
   // ++ : += 1
   // -- : -= 1
    public static void main(String[] args) {
        //기본 대입 연산자
        int number = 10;
        number = number + 2;
        System.out.println(number);

        number = number - 2;
        System.out.println(number);

        number = number * 2;
        System.out.println(number);

        number = number / 2;
        System.out.println(number);

        number = number % 2;
        System.out.println(number);


        System.out.println("복합 대입 연산자 ==================");

        number = 10;

        number += 2;
        System.out.println(number);

        number -= 2;
        System.out.println(number);

        number *= 2;
        System.out.println(number);

        number /= 2;
        System.out.println(number);

        number %= 2;
        System.out.println(number);

        System.out.println("++ or --  ===================");

        number++;
        System.out.println(number);
        //number = number + 1;
        //number += 1;

        number--;
        System.out.println(number);
        //number = number - 1;
        //number -= 1;

        System.out.println("대입 연산자에서 주의해야 할 점");
        int a = 10;
        int b = 10;
        int val = ++a + b--;
        //++나 --가 앞에 올 경우에는 연산을 하기 전 변수에 값을 더하거나 뺀 후 연산 수행
        //++나 --가 뒤에 올 경우에는 연산을 수행한 후 값을 더하거나 뺌
        System.out.println(a);
        System.out.println(b);
        System.out.println(val);
    }
}
