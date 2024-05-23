import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//Leet code : 1281. Subtract the Product and Sum of Digits of an Integer
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(subtractProductAndSum(in.nextInt()));
    }

    static int subtractProductAndSum(int n) {

        //Q: Given an integer number n, return the difference between the product of its digits and the sum of its digits.
        int productOfDigits = 1;
        int sumOfDigits = 0;
        while(n > 0) {
            int digit = n % 10;
            productOfDigits = productOfDigits * digit;
            sumOfDigits += digit;
            n = n / 10;
        }
        return productOfDigits - sumOfDigits;
    }
}