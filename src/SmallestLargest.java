import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input the 1st number: ");
        int num1 = in.nextInt();

        System.out.println("Input the 2nd number: ");
        int num2 = in.nextInt();

        System.out.println("Input the 3rd number: ");
        int num3 = in.nextInt();

        if (num1 == num2 || num1 == num3 || num2 == num3) {
            System.out.println("Please rerun the program and enter 3 different numbers");
        }

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("The greatest: " + num1);
                if (num2 < num3) {
                    System.out.println("The smallest: " + num2);
                } else {
                    System.out.println("The smallest: " + num3);
                }
            } else {
                System.out.println("The greatest: " + num3);
                System.out.println("The smallest: " + num2);
            }
        } else if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("The greatest: " + num2);
                if (num1 < num3) {
                    System.out.println("The smallest: " + num1);
                } else {
                    System.out.println("The smallest: " + num3);
                }
            } else {
                System.out.println("The greatest: " + num3);
                System.out.println("The smallest: " + num1);
            }
        }
    }
}

