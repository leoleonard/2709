package integer.number;
import java.util.Scanner;

public class IntegerNumber {
    public static void main(String[] args) {
        int number, result;

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        number = scan.nextInt();

        result = 0;
        while ( number != 0) {
            result += number%10;
            number /= 10;
        }

        System.out.println("Suma liczb z liczby całkowitej to " + result);
        }
    }
