package practice;

import java.util.Scanner;

public class same_numbers {
    public static void main(String[] args){
        // состоит ли указанное число из одинаковых цифр
        Scanner reader = new Scanner(System.in);
        int number = reader.nextInt();
        int lastDigit = number%10;
        boolean result = true;
        while (number>0){
            if (lastDigit==number%10){
                number/=10;
            }else {
                result = false;
                break;
            }
        }
        if (result){
            System.out.println("Состоит из одинаковых цифр");
        }else{
            System.out.println("Не состоит из одинаковых цифр");
        }

    }
}
