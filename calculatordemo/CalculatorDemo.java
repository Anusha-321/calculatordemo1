package calculatordemo;

import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {

        System.out.println("1.Enter 1 for addittion");
        System.out.println("2.Enter 2 for subtraction") ;
        System.out.println("3.Enter 3 for multipication");
        System.out.println("4.Enter 4 for division");
        System.out.println("5.Enter 5 to quit");

        Scanner scanner = new Scanner(System.in);


        int a, b;
        System.out.println(" enter value of a and b");

        a = scanner.nextInt();
        b = scanner.nextInt();

        int EnteredOption;
       do{
           System.out.println("Enter choice:");
            EnteredOption = scanner.nextInt();
        switch(EnteredOption) {

            case 1:
                System.out.println("Sum="+findSum(a,b));
                break;
            case 2:
                findSubtraction(a, b);
                break;
            case 3:
                multiply(a, b);
                break;
            case 4:
                divide(a, b);
                break;
            case 5:
                System.out.println("Exiting Program");
                break;


            default:
                System.out.println("please enter valid input");

        }
    }while(EnteredOption!=5);
    }

    private static void divide(int a, int b) {
        int div = a/b;
        System.out.println("division="+div);
    }

    private static void multiply(int a, int b) {
        int mul = a*b;
        System.out.println(mul);
    }


    private static void findSubtraction(int a, int b) {
        int sub = a-b ;
        System.out.println(sub);
    }

    private static int findSum(int a, int b) {
        return a+b;
    }
}
