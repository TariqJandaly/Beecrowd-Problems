/*
    Problem: 1003
    Link   : https://www.beecrowd.com.br/judge/en/problems/view/1003
*/

import java.util.Scanner;

public class P1003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();

        int SOMA = A + B;

        input.close();

        System.out.println("SOMA = " + SOMA);
    }
}