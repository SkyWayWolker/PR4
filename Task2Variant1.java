import java.util.Scanner;

public class Task2Variant1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int n = sc.nextInt();

        int original = n;
        int temp = Math.abs(n);
        int digits = 0;

        if (temp == 0) digits = 1;
        else {
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
        }

        int reversedWhile = 0;
        int t = Math.abs(n);
        while (t > 0) {
            int digit = t % 10;
            reversedWhile = reversedWhile * 10 + digit;
            t /= 10;
        }
        if (n < 0) reversedWhile = -reversedWhile;

        int reversedDoWhile = 0;
        t = Math.abs(n);
        if (t == 0) reversedDoWhile = 0;
        else {
            do {
                int digit = t % 10;
                reversedDoWhile = reversedDoWhile * 10 + digit;
                t /= 10;
            } while (t > 0);
        }
        if (n < 0) reversedDoWhile = -reversedDoWhile;

        System.out.println("\n=== Результаты ===");
        System.out.println("Исходное число: " + original);

        System.out.println("Реверс (while)    : " + reversedWhile);
        System.out.println("Реверс (do-while) : " + reversedDoWhile);

        String pattern = "%0" + digits + "d";

        System.out.println("\nС сохранением ведущих нулей:");
        System.out.printf("Реверс (while)    : " + pattern + "%n", Math.abs(reversedWhile));
        System.out.printf("Реверс (do-while) : " + pattern + "%n", Math.abs(reversedDoWhile));

        sc.close();
    }
}
