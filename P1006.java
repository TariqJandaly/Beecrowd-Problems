/*
    Problem: 1006
    Link   : https://www.beecrowd.com.br/judge/en/problems/view/1006
*/

import java.util.Scanner;

public class P1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float A = input.nextFloat() * 2f;
        float B = input.nextFloat() * 3f;
        float C = input.nextFloat() * 5f;

        float MEDIA = (A + B + C) / 10f;


        input.close();

        System.out.println(String.format("MEDIA = %.1f", MEDIA));
    }
}