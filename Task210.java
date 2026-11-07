import java.util.Scanner;

public class Task210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("n must be at least 3.");
        } else {
            int total = 0;

            for (int i = 1; i <= n; i++) {          // loop baris
                for (int j = 1; j <= n; j++) {      // loop kolom
                    int result = i * j;
                    System.out.printf("%4d", result);
                    total += result;
                }
                System.out.println();               // pindah baris
            }

            System.out.println("Total of all numbers: " + total);
        }

        sc.close();
    }
}