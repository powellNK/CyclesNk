package practice;

import java.util.Scanner;

public class max_min_in_number {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        int maxDigit = 0;
        int minDigit = number%10;
        while (number>0){
            int lastDigit = number%10;
            if (lastDigit>maxDigit){
                maxDigit = lastDigit;
            }
            if (lastDigit<minDigit){
                minDigit = lastDigit;
            }
            number/=10;
        }
        System.out.println("Max: "+maxDigit+ " Min: "+minDigit);
    }
}
