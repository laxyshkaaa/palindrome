import java.util.Scanner;
public class Main {
    public static boolean Palin(int number) {
        int reversed = 0;
        int original = number;

        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number = number / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (Palin(number)) {
            System.out.println(number + " является палиндромом.");
        } else {
            System.out.println(number + " не является палиндромом.");
        }
    }
}