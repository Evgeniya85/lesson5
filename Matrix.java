package lesson5;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int num = sc.nextInt();
        int num1 = sc.nextInt();

        int[][] twoDimArray = new int[num][num1];

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = (int) Math.round((Math.random() * 30) - 5);
                System.out.print(" " + twoDimArray[i][j] + " " );

            }
            System.out.println();
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < 1; j++) {
                twoDimArray[i][j] = (int) Math.round((Math.random() * 30) - 5);
                    System.out.print(twoDimArray[i][0] + " ");

            }
            System.out.println();
        }
        int c=3;
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                twoDimArray[i][j] = (int) Math.round((Math.random() * 30) - 5);
                twoDimArray[i][j]=twoDimArray[i][j]*c;
                System.out.print(twoDimArray[i][j] + " ");

            }
            System.out.println();
        }

    }
}
