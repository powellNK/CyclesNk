package practice;

import java.util.Scanner;

public class Euclid_algorithm {
    public static void main(String[] args){
        // Алгоритм Евклида для вычисления наибольшего общего делителя двух натуральных чисел,
        // формулируется так: нужно заменять большее число на разность большего и меньшего до тех пор, пока одно из них не станет равно нулю; тогда второе и есть НОД.
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int counterCycle = 0;
        while (a!=0 && b!=0){
            if (a>b){
                a-=b;
            }else{
                b-=a;
            }
            System.out.println("a: "+a+"    b: "+b);
            counterCycle++;
        }
        System.out.println("НОД:" + a + "   Итераций цикла: "+counterCycle);
    }
}
