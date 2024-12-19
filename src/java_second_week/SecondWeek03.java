package java_second_week;

public class SecondWeek03 {
    public static void main(String[] args) {
        //기타연산자
        //(1) 형변환 연산자
        System.out.println("형변환 연산자" );
        int intNumber = 93 + (int)93.12;
        System.out.println(intNumber);

        double doubleNumber = (double) 93 +93.12;
        System.out.println(doubleNumber);
        //(2) 삼항 연산자
        //비교연산자와 항상 함께 쓰인다.
        //비교연산자의 결과 : ture or false -> 이 결과의 값에 따라 결정되는 무언가
        System.out.println("조건 ? 참 : 거짓 ========");
        int x = 1;
        int y = 10;

        boolean b = (x == y) ? true : false;
        System.out.println(b);

        String s = (x != y) ? "정답" : "오답";
        System.out.println(s);

        int max = (x > y) ? x : y;
        System.out.println(max);

        int min = (x > y) ? y : x;
        System.out.println(min);

        //(3) instance of
        //피연산자가 조건에 명시된 클래스의 객체인지 비교
        //맞으면 true / 틀리면 false

    }
}
