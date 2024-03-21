public class cycles_11a {
    public static void main(String[] args) {
        // найти все трехзначные числа, чьи квадраты оканчиваются тремя цифрами, которые и составляют искомые числа
        for (int i = 100; i <= 999; i++) {
            int sqr = i * i;
            if (sqr % 1000 == i) {
                System.out.println(sqr + ":" + i);
            }
        }
    }
}

