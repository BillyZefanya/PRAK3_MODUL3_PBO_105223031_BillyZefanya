import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan skor: ");
        int skor = input.nextInt();
        System.out.print("Masukkan absensi: ");
        int absensi = input.nextInt();

        String nilai = (skor >= 75 && absensi >= 80) ? "lulus" : "tidak lulus";
        System.out.println("Nilai akhir: " + nilai); 
    }
}