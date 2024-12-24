package java_second_week;

import java.util.Arrays;

public class SecondWeek12 {
    public static void main(String[] args) {
        System.out.println("얕은 복사 ===========");
        int[] a = { 1,2,3,4};
        int[] b = a; // 얕은 복사

        b[0] = 3;
        System.out.println(a[0]);

        System.out.println("깊은 복사 ==========");
        System.out.println("clone() ==========");

        int[] x = {1,2,3,4,5,};
        int[] y = a.clone();

        //todo clone메서드는 2차원이상 배열에서는 얕은 복사로 동작한다.

        System.out.println("copyOf() ============");
        int[] i = {1,2,3,4,};
        int[] j = Arrays.copyOf(i, i.length);

        i[3] = 0;
        System.out.println(i[3]);
        System.out.println(j[3]);

        System.out.println("String 배열 ==========");

        String str = "ABCD";

        int strLength = str.length();
        System.out.println(strLength);

        System.out.println("charAt =========");
        char strChar = str.charAt(1);
        System.out.println(strChar);

        System.out.println("subString ========");
        String strSub = str.substring(0, 3);
        System.out.println(strSub);

        System.out.println("equals ========");
        String newStr = "ABCD";
        boolean strEquals = newStr.equals(str);
        System.out.println(strEquals);

        System.out.println("toCharArray =========");
        char[] strCharArray = str.toCharArray();

        char[] charArray = {'A', 'B', 'C', 'D'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString);
    }
}
