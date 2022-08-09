package step1;

import java.util.Scanner;

public class BJ18108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year = 2541 - 1998;
        int input = scanner.nextInt();

        System.out.println(input - year);
    }
}
