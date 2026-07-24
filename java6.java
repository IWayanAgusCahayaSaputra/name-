import java.util.ArrayList;
import java.util.Scanner;

public class java6 {
    
    static void judul() {
        System.out.println(" === SELAMAT DATANG KE TOKO KAMI === ");
    }

    static String daftarBeli(ArrayList<String> daftarBelanja) {
        String daftar = "Daftar Belanja:\n";
        for (int i = 0; i < daftarBelanja.size(); i++) {
            daftar += (i + 1) + ". " + daftarBelanja.get(i) + "\n";
        }
        return daftar;
        
    }

    static void struk() {
        System.out.println("=====================");
    }

    static void penutup() {
        System.out.println(" === Terima Kasih Telah Berbelanja di Toko Kami === ");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int jumlah = 0;
        int hasil = 0;

        String[] barang = {"Seragam", "Celana", "Sepatu", "Gesper", 
                            "Dasi", "Kaos Kaki", "Topi"};

        int[] harga = {40000, 35000, 30000, 10000, 7000, 5000, 6000};
        ArrayList<String> daftarBelanja = new ArrayList<>();

        judul();
        for (int i = 0; i < barang.length; i++) {
            for (int j = 0; j < harga.length; j++) {
                if (i == j) {
                     System.out.println((i + 1) + ". " + barang[i] + " - Rp" + harga[i]);
                }
            }
        }

        while (true) {
            System.out.print("Mau pilih apa? (ketik selesai jika sudah!): ");
            String pilih = input.nextLine();

            if(pilih.equals("selesai")) {
                System.out.println();
                break;
            }

            System.out.print("Berapa jumlahnya? ");
            jumlah = input.nextInt();
            input.nextLine();

            for (int i = 0; i < barang.length; i++) {
                if (barang[i].equals(pilih)) {
                    total = harga[i] * jumlah;
                    hasil += total;
                    daftarBelanja.add(barang[i] + " - Rp" + harga[i] + " x " + jumlah + " total: " + total);
                    System.out.println(daftarBeli(daftarBelanja));
                    break;
                }
            }
        }
        
        struk();
        System.out.println(daftarBeli(daftarBelanja));
        System.out.println("Totalnya: Rp" + hasil);
        struk();
        penutup();


    }

}
