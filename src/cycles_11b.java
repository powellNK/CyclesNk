public class cycles_11b {
    public static void main(String[] args) {
        // найти все трехзначные числа, кратные 7 и у которых сумма цифр также кратна 7
        for (int i = 100; i <= 999; i++) {
            if (i % 7 == 0) {
                int sumNum = 0;
                int number = i;
                while (number > 0) {
                    sumNum += number % 10;
                    number /= 10;
                }
                if (sumNum % 7 == 0) {
                    System.out.println(i +" "+ sumNum);
                }
            }
        }
    }
}