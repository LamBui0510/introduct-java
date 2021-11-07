package Loop;

import java.util.Scanner;

public class luachonmenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Draw rectangle");
            System.out.println("2. Draw Square triagle bottom-left ");
            System.out.println("3. Draw Square triagle top-left");
            System.out.println("4. Draw isosceles triangle");
            System.out.println(" Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print("*");

                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 7; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 7; i >= 0; i--) {
                        for (int j = i; j >= 0; j--) {
                            System.out.print("*");

                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    for (int i = 1; i <= 5 ; i++) {
                        for (int j = 0; j <(5-i) ; j++) {
                            System.out.print(".");
                        }
                        for (int k = 0; k <(i*2-1) ; k++) {
                            System.out.print("*");

                        }
                        System.out.println();
                    }break;

            }
            }

        }
    }

