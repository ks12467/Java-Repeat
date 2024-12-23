package java_second_week;

import java.util.Arrays;

public class SecondWeek11 {
    public static void main(String[] args) {

        System.out.println("배열 ================");
        int[] intArray = new int[3];
        boolean[] boolArray = new boolean[3];
        String[] stringArray = new String[3];

        int[] intArray2;
        intArray2 = new int[3];

        System.out.println("배열 단건 조회 =========");
        System.out.println(intArray[2]);

        System.out.println("다건 조회 ==========");
        for(int i = 0; i< intArray2.length; i++){
            System.out.println(intArray2[i]);
        }

        System.out.println("초기화 ===========");
        int[] intArray3 = {1,2,3,4,5};
        String[] stringArray2 = {"a", "b", "c", "d", "e" };

        for(int i = 0; i < intArray3.length; i++){
            intArray3[i] = i;
        }

        for(int i = 0; i < intArray3.length; i++){
            System.out.println(intArray3[i]);
        }

        System.out.println("향상된 for문 사용한 배열 =============");

        for(int i : intArray3){
            System.out.println(i);
        }

        System.out.println("Arrays ===========");
        Arrays.fill(intArray3, 5);
        for(int item : intArray3){
            System.out.println(item);
        }
    }
}
