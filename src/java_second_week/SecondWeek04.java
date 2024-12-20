package java_second_week;

public class SecondWeek04 {
    public static void main(String[] args) {
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z;
        System.out.println(result);
        System.out.println("==========");

        result = x + 10 < y && y < z;
        System.out.println(result);
        System.out.println("==========");

        result = x + 2 * 3 > y;
        System.out.println(result);
        System.out.println("==========");

        result = (x + 2) * 3 > y;
        System.out.println(result);


        //연산 전에 두 피연산자의 타입이 다른 경우 타입을 일치 시켜야한다.
        //둘중에 저장공간 크기가 더 큰 타입으로 일치
        System.out.println("==========");
        short a = 10;
        int b = 20;

        int c = a + b;

        long la = 30L;
        long lb = c + la;
        System.out.println(lb);

        float fa = a;
        float fb = b;
        float fc = c;

        System.out.println(fa);
        System.out.println(fb);
        System.out.println(fc);

        System.out.println("비트 연산 ============");
        System.out.println(3 << 2);
        System.out.println(3 << 1);
    }
}
