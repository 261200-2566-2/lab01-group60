// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int n = scanner.nextInt();
        System.out.print("Enter number2: ");
        int m = scanner.nextInt();

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        print1(n);
        int[] numbers = add2(m, scanner);
        print2(numbers);
    }
    public static void print1(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("i1 = " + i);
        }
    }
    public static int[] add2(int n, Scanner scanner) {
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " number:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        return numbers;
    }
    public static void print2(int[] numbers) {
        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.println("i2 = " + num);
        }
    }

}