package arithmeticOperation;

import java.util.Scanner;

public class arithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        System.out.println(firstNum + secondNum);
        System.out.println(firstNum - secondNum);
        System.out.println(firstNum * secondNum);
        System.out.println(firstNum / secondNum);
        System.out.println(firstNum % secondNum);
    }
}
