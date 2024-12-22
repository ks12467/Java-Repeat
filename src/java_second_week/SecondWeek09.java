package java_second_week;

public class SecondWeek09 {
    public static void main(String[] args) {
        int number = 0;
        while (number < 3) {
            number++;
            System.out.println(number + " 출력");
        }
        System.out.println("do while ===========");

        int intNumber = 4;
        do{
            System.out.println(intNumber + " 출력");
        } while(intNumber < 3);

        System.out.println("break ============");

        int doNumber = 0;
        while(doNumber < 3){
            doNumber++;
            if(doNumber == 2){
                 break;
            }
            System.out.println(doNumber + "출력");
        }

        for(int i = 0; i<10; i++){
            System.out.println("i :" + i);
            if(i == 2){
                break;
            }
            for(int j = 0; j < 10; j++){
                System.out.println("j :" + j);
                if(j == 2){
                    break;
                }
            }
        }

        System.out.println("continue ==========");

        int conNumber = 0;
        while(conNumber < 3){
            number++;
            if(conNumber == 2){
                continue;
            }
            System.out.println(conNumber + "출력");

        }
    }
}
