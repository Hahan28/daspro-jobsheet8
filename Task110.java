import java.util.Scanner;

public class Task110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("n must be at least 1.");
        } else {
            int total = 0;

            for (int i = 1; i <= n; i++) {          // loop baris
                for (int j = 1; j <= i; j++) {      // loop angka per baris
                    System.out.print(j + " ");
                    total++;
                }
                System.out.println();               // pindah baris
            }

            System.out.println("Total numbers printed: " + total);
        }

        sc.close();
    }
}
