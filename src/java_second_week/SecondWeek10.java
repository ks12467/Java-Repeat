package java_second_week;

import java.util.Scanner;

public class SecondWeek10 {
    public static void main(String[] args) {
        int result;
        for(int i = 2; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }

        System.out.println("입력받는 단 제외 출력 =========== \n");

        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt();
        for(int i = 2; i <= 9; i++){
            if(i == passNum){
                continue;
            }
            for(int j = 1; j <= 9; j++){
                result = i * j;
                System.out.println(i + " * " + j + " = " + result);
            }
        }
    }
}
