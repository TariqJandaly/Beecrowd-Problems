/*
    Problem: 1001
    Link   : https://www.beecrowd.com.br/judge/en/problems/view/1001

    Written by @TariqJandaly
*/

import java.util.Scanner;

public class P1001 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        input.close();

        int X = A + B;

        System.out.println("X = " + X);
    }
}