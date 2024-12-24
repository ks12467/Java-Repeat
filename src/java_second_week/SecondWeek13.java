package java_second_week;

public class SecondWeek13 {
    public static void main(String[] args) {

        int[][] array = new int[2][3];

        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.println("출력값 => " + i + ", " + j);
                array[i][j] = 0;
            }
        }

        System.out.println("가변 배열 ==========");
        int[][] intArray = new int[3][];

        intArray[0] = new int[2];
        intArray[1] = new int[4];
        intArray[2] = new int[1];

        int[][] array2 = {{10,20},{10,20,30,40},{10,20}};

        System.out.println("실습 - 최대값 구하기 ========");
        int[] arr = {3,2,1,5,1};

        int max = arr[0];

        for(int num : arr){
            if(num > max){
                max = num;
            }
        }

        System.out.println(max);
    }
}
