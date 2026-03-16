import java.util.Scanner;

public class THT3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vip = 5;
        int fest = 25;
        int trib = 35;

        int pilih = 0;

        while(true){

            System.out.println("\n==== KIOSK SOUND FEST ====");
            System.out.println("1. VIP (1500000) stok: "+vip);
            System.out.println("2. Festival (800000) stok: "+fest);
            System.out.println("3. Tribune (500000) stok: "+trib);
            System.out.println("4. Matikan mesin");
            System.out.print("pilih: ");
            pilih = sc.nextInt();

            if(pilih==4){
                System.out.println("mesin dimatikan");
                break;
            }

            int harga = 0;
            int minU = 0;
            int stok = 0;

            if(pilih==1){
                harga = 1500000;
                minU = 18;
                stok = vip;
            }
            else if(pilih==2){
                harga = 800000;
                minU = 15;
                stok = fest;
            }
            else if(pilih==3){
                harga = 500000;
                minU = 0;
                stok = trib;
            }
            else{
                System.out.println("menu salah");
                continue;
            }

            System.out.print("jumlah tiket: ");
            int j = sc.nextInt();

            if(j > stok){
                System.out.println("stok tidak cukup!!");
                continue;
            }

            int total = 0;
            int berhasil = 0;
            boolean batal = false;

            for(int i=1;i<=j;i++){

                int usia = 0;

                while(true){
                    System.out.print("usia tiket "+i+" (-1 batal): ");
                    usia = sc.nextInt();

                    if(usia == -1){
                        batal = true;
                        break;
                    }

                    if(usia<=0 || usia>120){
                        System.out.println("usia ga logis ulangi");
                    }else{
                        break;
                    }
                }

                if(batal){
                    System.out.println("batal darurat");
                    break;
                }

                if(usia >= minU){
                    System.out.println("tiket "+ i +" ok");
                    total += harga;
                    berhasil++;
                }else{
                    System.out.println("tiket "+ i +" gagal umur");
                }
            }

            if(!batal){

                if(berhasil>0){

                    if(pilih==1) vip -= berhasil;
                    if(pilih==2) fest -= berhasil;
                    if(pilih==3) trib -= berhasil;

                    System.out.println("=== nota ===");
                    System.out.println("tiket jadi: "+ berhasil);
                    System.out.println("bayar: "+ total);

                }else{
                    System.out.println("tidak ada tiket berhasil");
                }

            }

        }

    }
}