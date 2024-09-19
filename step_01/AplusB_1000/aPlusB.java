package step_01.AplusB_1000;

import java.util.Scanner;

public class aPlusB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int first = in.nextInt();
        int second = in.nextInt();

        System.out.println(first + second);

        in.close();
    }
}
