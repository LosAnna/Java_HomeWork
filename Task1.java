// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) 


import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int sum = 0;
        int factorial = 1;

        for (int index = 1; index <= n; index++) {
            sum += index;
            factorial *= index;
            input.close();
        }

        System.out.println("Сумма чисел от 1 до n: " + sum);
        System.out.println("Произведение чисел от 1 до n: " + factorial);
    }
    }