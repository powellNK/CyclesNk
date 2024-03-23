package practice;

import java.util.Scanner;

public class Euclid_algorithm {
    public static void main(String[] args){
        // Алгоритм Евклида для вычисления наибольшего общего делителя двух натуральных чисел формулируется так:
        // нужно заменять большее число на разность большего и меньшего до тех пор, пока одно из них не станет равно нулю; тогда второе и есть НОД.
        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();
        int b = reader.nextInt();
        int copyA = a;
        int copyB = b;
        int counterCycle1 = 0;
        int counterCycle2 = 1;
        //1 метод
        while (a!=0 && b!=0){
            if (a>b){
                a-=b;
            }else{
                b-=a;
            }
            System.out.println("a: "+a+"    b: "+b);
            counterCycle1++;
        }
    //Модифицированный алгоритм Евклида для вычисления наибольшего общего делителя двух натуральных чисел, формулируется так:
    //нужно заменять большее число на остаток от деления большего на меньшее до тех пор, пока остаток не станет равно нулю; тогда второе число и есть НОД.
        while (copyA%copyB!=0 && copyB%copyA!=0){
            if (copyA>copyB){
                copyA%=copyB;
            }else{
                copyB%=copyA;
            }
            System.out.println("a: "+copyA+"    b: "+copyB);
            counterCycle2++;
        }
        System.out.println("1 метод. НОД:" + a + "   Итераций цикла: "+counterCycle1);
        System.out.println("2 метод. НОД:" + copyA + "   Итераций цикла: "+counterCycle2);
    }
}
