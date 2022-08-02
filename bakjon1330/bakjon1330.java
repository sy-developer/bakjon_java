package bakjon1330;

import java.util.Scanner;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class bakjon1330 {
//     public static void main(String[] args) throws IOException {
//         // 백준 2단계 1번 문제

//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int firstNum = Integer.parseInt(br.readLine());
//         int secondNum = Integer.parseInt(br.readLine());

//         // if (firstNum <= 10000 && secondNum <= 10000 && firstNum >= -10000 && secondNum >= -10000) {
//             if (firstNum > secondNum) {
//                 System.out.println(">");
//             } else if (firstNum < secondNum) {
//                 System.out.println("<");
//             } else
//                 System.out.println("==");

//         // }
//     }
// }

public class bakjon1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}