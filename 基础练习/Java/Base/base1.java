package Base;

import java.util.Scanner;

//闰年的判断
public class base1 {

    public static void main(String[] args) {
        int year = 0;
        Scanner in = new Scanner(System.in);
        year = in.nextInt();
        in.close();
        if ((year % 4 == 0 && year / 100 != 0) || (year / 400 == 0)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

}
