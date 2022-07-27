package bakjon2588;

import java.util.Scanner;

public class bakjon2588 {
    public static void main(String[] args) {

        /**
         * 백준 2588번:곱셈
         */

        Scanner sc = new Scanner(System.in);

        /**
         * 1번 풀이
         */
        int firstNum = sc.nextInt(); // 472
        String secondNum = sc.next(); // 385

        // Test
        // System.out.println(secondNum.charAt(2)); // 5
        // System.out.println((secondNum.charAt(2) - 0)); // 53
        // System.out.println((secondNum.charAt(2) - '0')); // 5

        if (firstNum >= 100 && secondNum.length() >= 3) { // 세자리 이상일때 실행되도록
            System.out.println(firstNum * (secondNum.charAt(2) - '0'));
            System.out.println(firstNum * (secondNum.charAt(1) - '0'));
            System.out.println(firstNum * (secondNum.charAt(0) - '0'));
            System.out.println(firstNum * Integer.parseInt(secondNum));
        }

        /**
         * 2번 풀이
         */
        int first = sc.nextInt();
        int second = sc.nextInt();

        System.out.println(first * (second % 10));
        System.out.println(first * (second % 100 / 10));
        System.out.println(first * (second / 100));
        System.out.println(first * second);

        /**
         * 3번 풀이
         */
        int a = sc.nextInt();
        String b = sc.next();

        char[] bToArray = b.toCharArray();

        System.out.println(a * (bToArray[2] - '0'));
        System.out.println(a * (bToArray[1] - '0'));
        System.out.println(a * (bToArray[0] - '0'));
        System.out.println(a * Integer.parseInt(b));

    }
}
