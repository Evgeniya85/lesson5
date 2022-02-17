package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("ВВедите значение массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Ведите значение для сравнения с элементами массива: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
            if (array[i] == x | array[i] == y | array[i] == z )
                System.out.println("Данное значение имеется в константах");
            break;
        }
    }
}
