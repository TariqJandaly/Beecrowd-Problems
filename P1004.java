/*
    Problem: 1004
    Link   : https://www.beecrowd.com.br/judge/en/problems/view/1004
*/

import java.util.Scanner;

public class P1004 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        int PROD = A * B;

        input.close();

        System.out.println("PROD = " + PROD);
    }
}