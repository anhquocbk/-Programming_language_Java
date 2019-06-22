package Bai1;

public class Prime100 {
    public static void main(String[] args) {
        System.out.print("Prime is less than 100: ");
        for (int i = 2 ;i < 100; i ++) {
            boolean flag = true;
            for (int j = 2; j < i; j ++) {
                if (i%j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.print(i + " ");
            }
        }
    }
}
