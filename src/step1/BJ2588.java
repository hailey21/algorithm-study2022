package step1;

import java.util.Scanner;

public class BJ2588 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = scanner.nextInt();

        String number2 = scanner.next();

        char[] numbers2 = number2.toCharArray();

        int sum = 0;

        for (int j = numbers2.length - 1; j >= 0; j--) {
            int tmp = number1 * Integer.parseInt(String.valueOf(number2.charAt(j)));
            System.out.println(tmp);
            sum += (int) (tmp * Math.pow(10, numbers2.length - j - 1));
        }
        System.out.println(sum);

    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int firstNumber = scanner.nextInt();
//        int secondNumber = scanner.nextInt();
//
//        System.out.println(firstNumber * (secondNumber % 10));
//        System.out.println(firstNumber * ((secondNumber % 100) / 10));
//        System.out.println(firstNumber * (secondNumber / 100));
//        System.out.println(firstNumber * secondNumber);
//    }
}
