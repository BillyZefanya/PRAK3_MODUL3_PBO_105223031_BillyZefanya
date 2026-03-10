import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        /*Syarat utama donor darah di Indonesia adalah berusia 17–65 tahun (17-60 tahun untuk donor pertama), 
        berat badan (BB) minimal 45 kg, dan kadar Hemoglobin (Hb) 12,5–17 g/dL. */
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukan Nama Anda: ");
        String nama = sc.nextLine();
        System.out.print("Masukan Usia Anda: ");
        int usia = sc.nextInt();   
        System.out.println("Masukan Berat Badan Anda: ");
        double berat = sc.nextDouble();
        System.out.println("Masukan Hemoglobin Anda: ");                                         
        double hemoglobin = sc.nextDouble();

        System.out.println("Nama Anda: " + nama);   

        if (usia >= 17 && usia <= 65 ){
            System.out.println("Anda Bisa Donor Darah Karena Usia Anda " + usia);
        } else {
            System.out.println("Anda Tidak Bisa Donor Darah Karena Usia Anda " + usia);
        }

        if (berat >= 45){
            System.out.println("Anda Bisa Donor Darah Karena Berat Badan Anda " + berat);
        } else {
            System.out.println("Anda Tidak Bisa Donor Darah Karena Berat Badan Anda" + berat);
        }

        if (hemoglobin >= 12.5 && hemoglobin <= 17){
            System.out.println("Anda Bisa Donor Darah Karena Hemoglobin Anda " + hemoglobin);
        } else {
            System.out.println("Anda Tidak Bisa Donor Darah Karena Hemoglobin Anda " + hemoglobin);
        }
    }
}
