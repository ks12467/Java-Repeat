package java_second_week;

public class SecondWeek01 {
    public static void main(String[] args) {
        //x + y
        int x = 5;
        int y = 10;
        int result;
        result = x + y;
        System.out.println(result);

        //x - y
        result = x - y;
        System.out.println(result);

        //x * y
        result = x * y;
        System.out.println(result);

        //x \ y
        result = x / y;
        System.out.println(result);

        result = y % x;
        System.out.println(result);

        System.out.println("-------------------------");

        //비교 연산
        System.out.println(10>9);
        System.out.println(12 >=9);
        System.out.println(10<9);
        System.out.println(10<=9);
        System.out.println(10==9);
        System.out.println(10!=9);
        System.out.println(10 == 10);

        System.out.println("-------------------------");
        //논리연산자
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);

        System.out.println("OR-------------------------");

        System.out.println(flag1 || flag2 );
        System.out.println(flag1 || flag2 || flag3);

        System.out.println("AND------------------------");

        System.out.println(flag1 && flag2);
        System.out.println(flag1 && flag2 && flag3);

        System.out.println("!-------------------------");
        System.out.println(!flag1);
    }
}
