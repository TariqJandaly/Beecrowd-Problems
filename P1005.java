/*
    Problem: 1005
    Link   : https://www.beecrowd.com.br/judge/en/problems/view/1005
*/

import java.util.Scanner;

public class P1005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float A = input.nextFloat() * 3.5f;
        float B = input.nextFloat() * 7.5f;

        float MEDIA = (A + B) / (3.5f + 7.5f);

        input.close();

        System.out.println(String.format("MEDIA = %.5f", MEDIA));
    }
}