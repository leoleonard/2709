package integer.number;
import java.util.Scanner;

public class IntegerNumber {

    int total() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą");
        int number = scan.nextInt();

        int x = 0;
        while (number != 0) {
            x += number % 10;
            number /= 10;
        }

        return x;
    }


}


