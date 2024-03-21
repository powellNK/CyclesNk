import java.util.Scanner;

public class cycles_13 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int number = reader.nextInt();
        System.out.println("Введите число d: ");
        int d = reader.nextInt();
        String delitelNumber = "";
        int sumDelitel = 0;
        int sumChDelitel = 0;
        int countChDelitel = 0;
        int countNechDelitel = 0;
        int countMoreD = 0;
        for (int delitel = 1; delitel <= number; delitel++) {
            if (number % delitel == 0) {
                delitelNumber += delitel + " ";
                sumDelitel+=delitel;
                if (delitel%2==0){
                    sumChDelitel+=delitel;
                    countChDelitel+=1;
                }else{
                    countNechDelitel+=1;
                }
                if (delitel>d){
                    countMoreD+=1;
                }
            }
        }
        System.out.println("Делители числа "+number+ " : " + delitelNumber);
        System.out.println("Сумма делителей : " + sumDelitel);
        System.out.println("Сумма четных делителей : " + sumChDelitel);
        System.out.println("Количество делителей : " + (countChDelitel+countNechDelitel));
        System.out.println("Количество четных делителей : " + countChDelitel + "    Количество нечетных делителей : " + countNechDelitel);
        System.out.println("Количество делителей > " +d+ " : " + countMoreD);
    }
}
