package day01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();
        Scanner scanner = new Scanner(System.in);
        double number;
        do {
            number = scanner.nextDouble();
            if (number > 0) {
                positiveNumberContainer.addNumber(number);
            }
        }
        while ( number > 0);
        System.out.println(positiveNumberContainer.getList());
    }

}
