import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class cycles_10 {
    public static void main(String[] args) {
        //найти все двузначные числа, которые делятся на n или содержат цифру n
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = reader.nextInt();
        for (int i = 10; i <= 99; i++) {
            if (i % n == 0) {
                System.out.println(i);
            } else {
                int number = i;
                while(number>0){
                    if (number%10==n){
                        System.out.println(i);
                        break;
                    }
                    number/=10;
                }
            }
        }
    }
}
