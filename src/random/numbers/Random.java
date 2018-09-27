package random.numbers;

import java.util.Random;

 class RandomNumbers {
    public static void main(String[] args) {
        int [] numbers = new int[10];

        Random rand = new Random();

        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = rand.nextInt(10);
        }

        for (int i = 0; i < 2* numbers.length; i++) {
            if (i <= numbers.length - 1) {
                System.out.print(numbers[i] + " ");
            } else {
                System.out.print(numbers[2* numbers.length - 1 - i] + " ");
            }

        }

    }
}
