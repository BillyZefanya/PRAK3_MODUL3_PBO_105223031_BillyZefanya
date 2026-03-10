import java.util.Scanner;
public class Posttest {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int saldoAwal = 500000;
        int batasSaldo = 50000;
        System.out.println("Selamat datang di ATM Bangkrut");
        do {
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();   
            switch (menu) {
                case 1:
                    System.out.println("Cek Saldo");
                    System.out.println("Saldo anda: RP." + saldoAwal);
                    break;
                case 2:
                    System.out.println("Setor Tunai");
                    System.out.print("Masukkan jumlah setor tunai: RP.");
                    int setor = scanner.nextInt();
                    saldoAwal += setor;
                    System.out.println("Saldo anda setelah setor tunai: RP." + saldoAwal);
                    break;
                case 3:
                    System.out.println("Tarik Tunai");
                    System.out.print("Masukkan jumlah tarik tunai: RP.");
                    int tarik = scanner.nextInt();
                    int sisaSaldo = saldoAwal - tarik;
                    int sisaSaldoSetelahTarik = saldoAwal - tarik;
                    saldoAwal = sisaSaldoSetelahTarik;
                    System.out.println("Saldo anda setelah tarik tunai: RP." + sisaSaldoSetelahTarik);
                    if (sisaSaldo < batasSaldo) {
                        System.out.println("Maaf tarik tunai anda gagal karena saldo harus tersisa RP.50.000");
                    } 
                    break;
                case 4:
                    System.out.println("Keluar");
                    System.exit(0);
                    } 
                    {
            }
        } while (true);
        
    }
}
