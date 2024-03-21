public class cycles_9a {
    public static void main(String[] args){
        for (int i = 10;i<=99; i++){
            // найти все двузначные числа, сумма квадратов цифр которых делится на 13
            int number = i;
            int sum = 0;
            while (number>0){
                int lastNumber = number%10;
                number/=10;
                sum+=(lastNumber*lastNumber);
            }
            if (sum%13==0){
                System.out.println(i);
            }
        }
    }
}
