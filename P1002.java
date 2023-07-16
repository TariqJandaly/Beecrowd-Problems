/*
    Problem: 1002
    Link   : https://www.beecrowd.com.br/judge/en/problems/view/1002
*/

import java.util.Scanner;

public class P1002 { // Main
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double R = input.nextDouble();

        input.close();

        R = Math.pow(R, 2);
        double Pi = 3.14159;

        double A = Pi * R;

        System.out.println(String.format("A=%.4f", A));
    }
}