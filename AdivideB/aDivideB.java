package AdivideB;

import java.util.Scanner;

public class aDivideB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        double result = (double) firstNum / (double) secondNum;

        System.out.println(result);
    }
}
