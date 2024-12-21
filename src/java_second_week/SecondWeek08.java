package java_second_week;

public class SecondWeek08 {
    public static void main(String[] args) {
        for(int i = 0; i < 4; i++){
            System.out.println(i + "번째 출력");
        }

        int[] numbers = {3,6,9,12,15};
        for(int number : numbers){
            System.out.println(number + " ");
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
