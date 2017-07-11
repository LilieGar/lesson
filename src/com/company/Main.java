package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, sum = 0;
        num1 = num2 = scanner.nextInt();
        while(num1 > 0){
            sum += num1 % 10;
            num1 /= 10;
        }
     System.out.println(sum);
     sum = 0;
     do {
         sum += num2 % 10;
         num2 /= 10;
     } while (num2 > 0);
     System.out.println(sum);

     }

    }
