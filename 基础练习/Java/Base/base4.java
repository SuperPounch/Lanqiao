package Base;

import java.util.Scanner;

public class base4 {
    public static void main(String[] args) {
        int max, min, count;
        Scanner in1 = new Scanner(System.in);
        int number = in1.nextInt();
        if (number>10000||number<1){
            return;
        }
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        in1.close();
        in.close();
        String[] strs = str.split(" ");
        if(strs.length!=number){
            return;
        }
        int[] num = new int[strs.length];
        for (int j = 0; j < strs.length; j++) {
            num[j] = Integer.parseInt(strs[j]);
            if (Math.abs(num[j]) > 100000) {
                return;
            }
        }
        max = min = count = num[0];
        for (int j = 1; j < num.length; j++) {
            if (num[j] > max) {
                max = num[j];
            }
            if (num[j] < min) {
                min = num[j];
            }
            count += num[j];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
    }
}
