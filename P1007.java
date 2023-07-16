/*
    Problem: 1007
    Link   : https://www.beecrowd.com.br/judge/en/problems/view/1007
*/

import java.util.Scanner;

public class P1007 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int DIFERENCA = (A * B - C * D);


        input.close();

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}