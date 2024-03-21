public class cycles_12 {
    public static void main(String[] args) {
        // найти сумму положительных чисел, больших 30 и меньших 100, кратных 3 и оканчивающихся на 2,4,8
        int sum = 0;
        String numbers = "";
        for (int i = 30; i < 100; i++) {
            int lastNum = i % 10;
            if (i % 3 == 0 && (lastNum == 2 || lastNum == 4 || lastNum == 8)) {
                sum += i;
                numbers+=i+" ";
            }
        }
        System.out.println(sum + "  Числа: "+ numbers);
    }
}
