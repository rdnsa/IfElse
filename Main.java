import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("masukkan umur anda:");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Dewasa.");
        } else {
            System.out.println("Minor.");
        }

        scanner.close();
    }
}
