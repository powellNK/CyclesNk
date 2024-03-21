public class cycles_9b {
    public static void main(String[] args){
            for (int i = 10;i<=99; i++){
                // найти все двузначные числа, обладающие след свойством: если к сумме цифр числа прибавить квадрат этой суммы, то получится снова искомое число
                int number = i;
                int sum = 0;
                while (number>0){
                    sum += number%10;
                    number/=10;
                }
                int sqrSum = sum*sum;
                if (sum+sqrSum==i){
                    System.out.println(i);
                }
            }
    }
}
