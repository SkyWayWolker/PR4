import java.util.Scanner;

public class Task1Variant1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите значение x: ");
        double x = sc.nextDouble();

        double y;

        if (x < 0) {
            y = x * x;
        } else if (x < 10) {
            if (x < 5) {
                y = 2 * x + 1;
            } else {
                y = 3 * x - 1;
            }
        } else {
            y = 0;
        }

        System.out.println("Результат функции y = " + y);
        sc.close();
    }
}
