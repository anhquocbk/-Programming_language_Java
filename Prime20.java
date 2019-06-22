package Bai1;

public class Prime20 {
    public static void main(String[] args) {
        int count = 0;
        int n = 0;
        System.out.print("The first 20 primes: ");
        do {
            boolean flag = true;
            if (n < 2) {
                flag = false;
            } else {
                for (int i = 2; i < n; i++) {
                    if (n%i == 0)
                        flag = false;
                }
            }
            if (flag) {
                count++;
                System.out.print(n + " ");
            }
            n++;
        } while (count <= 20);
    }
}
