package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            System.out.print("Enter number: ");

            Scanner scanner = new Scanner(System.in);
            short input = scanner.nextShort();

            if(input % 5 == 0 && input % 3 == 0)
                System.out.println("FizzBuzz");
            else if(input % 3 == 0)
                System.out.println("Buzz");
            else if(input % 5 == 0)
                System.out.println("Fizz");
            else
                System.out.println(input);

    }
}
