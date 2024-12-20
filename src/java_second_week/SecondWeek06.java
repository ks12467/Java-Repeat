package java_second_week;

import java.util.Scanner;

public class SecondWeek06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("A 입력 : (예시) 가위, 바위, 보");
        String A = sc.nextLine();
        System.out.println("B 입력 : (예시) 가위, 바위, 보");
        String B = sc.nextLine();


        if(A.equals("가위") ) {
            if(B.equals("바위")){
                System.out.println("A : 가위 | B : 바위 | 결과 : B 승리");
            } else if(B.equals("보")){
                System.out.println("A : 가위 | B : 보 | 결과 : A 승리");
            } else {
                System.out.println("A : 가위 | B : 가위 | 결과 : 무승부");
            }
        } else if(A.equals("바위")){
            if(B.equals("가위")){
                System.out.println("A : 바위 | B : 가위 | 결과 : A 승리");
            } else if(B.equals("보")){
                System.out.println("A : 바위 | B : 보 | 결과 : B 승리");
            } else {
                System.out.println("A : 바위 | B : 바위 | 결과 : 무승부");
            }
        } else if(A.equals("보")){
            if(B.equals("바위")){
                System.out.println("A : 보 | B : 바위 | 결과 : A 승리");
            } else if(B.equals("가위")){
                System.out.println("A : 보 | B : 가위 | 결과 : B 승리");
            } else {
                System.out.println("A : 보 | B : 보 | 결과 : 무승부");
            }
        } else {
            System.out.println("입력한 값이 올바르지 않습니다.");
        }
    }
}
