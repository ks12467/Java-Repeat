package java_second_week;

public class SecondWeek05 {
    public static void main(String[] args) {
        boolean flag = true;

        System.out.println("if - else 문 ============");
        if(flag ){
            System.out.println("값이 true 입니다");
        } else {
            System.out.println("값이 false 입니다.");
        }

        System.out.println("if - else if - els 문 =======");
        if(1 != 1){

        } else if( 1 > 3){

        } else {

        }

        System.out.println("연습==========");
        int number = 2;
        if(number == 1){
            System.out.println("number 값은 1입니다");
        } else if(number == 2){
            System.out.println("number 값은 2입니다.");
        } else {
            System.out.println("number 값은 모르는 값입니다.");
        }

        System.out.println("중첩 if 문 ===========");
        if(flag){
            System.out.println("flag가 true입니다.");
            if(number == 1){
                System.out.println("number 값은 1입니다");
            } else if(number == 2){
                System.out.println("number 값은 2입니다");
            }else {
                System.out.println("number 값은 모르는 값입니다.");
            }
        } else {
            System.out.println("flag가 false입니다.");
        }
    }
}
