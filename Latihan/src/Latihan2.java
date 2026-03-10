import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;

        while (i < 3) {
            System.out.print("Masukkan PIN: ");
            int pin = input.nextInt();

            if (pin == 123456) {
                System.out.println("PIN benar. Akses diterima.");
                break;
            } else {
                i++;
                if (i == 3) {
                System.out.println("Anda telah mencoba 3 kali. Akun terkunci.");
            }
            }
        }
    }
}