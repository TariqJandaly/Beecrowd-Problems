/*
    Problem: 1008
    Link   : https://www.beecrowd.com.br/judge/en/problems/view/1008

    Written by @TariqJandaly
*/

import java.util.Scanner;

public class P1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int employeeNumber = input.nextInt();
        int hours = input.nextInt();
        float perHour = input.nextFloat();

        float SALARY = (hours * perHour);

        input.close();

        System.out.println("NUMBER = " + employeeNumber);
        System.out.println(String.format("SALARY = U$ %.2f", SALARY));

    }
}