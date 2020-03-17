package Base;

import java.util.Scanner;

public class base5 {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);
        int count = 0, num;
        count = inScanner.nextInt();
        int[] list = new int[count];
        for (int i = 0; i < count; i++) {
            list[i] = inScanner.nextInt();
        }
        num = inScanner.nextInt();
        inScanner.close();
        for (int i = 0; i < list.length; i++) {
            if (num == list[i]) {
                System.out.println(i+1);
                break;
            }
            if (i == count) {
                System.out.println(-1);
            }
        }
    }
}
