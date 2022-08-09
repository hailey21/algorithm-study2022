package step1;

import java.util.Scanner;

public class BJ3003 {

    public static void main(String[] args) {
        int[] chessRule = {1, 1, 2, 2, 2, 8};
        StringBuilder result = new StringBuilder();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] inputs = input.split(" ");

        for (int i = 0; i < inputs.length; i++) {
            result.append(chessRule[i] -Integer.parseInt(inputs[i]));
            result.append(" ");
        }

        System.out.println(result);
    }
}
