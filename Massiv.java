package lesson5;


import java.util.Scanner;

public class Massiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int num = sc.nextInt();
        process(num);
    }

    public static void process(int num) {
        int arr[] = new int[num];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30) - 5);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int arg = 0;
        for (int i = 0; i < arr.length; i++) {
            arg += arr[i];
        }
        arg /= arr.length;
        System.out.println("Среднее арифметическое  : " + arg);
        for (int i = 0; i < arr.length; i++) {
            int p =arr[i] * arg;
                System.out.print(p + " " );
        }
        System.out.println();
    }
}