import java.util.Scanner;
import java.util.ArrayList;

public class inputKaryawan {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarKaryawan = new ArrayList<>();
        String NK;

        while (true) {
            System.out.print("Ingin menambah data? (iya/tidak): ");
            String pilih = input.nextLine();

            if (pilih.equalsIgnoreCase("tidak")) {
                break;
            }

            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();

            System.out.print("Masukkan Umur: ");
            int umur = input.nextInt();
            input.nextLine();

            while (true) {
                System.out.print("Masukkan Nomor Karyawan (8 digit): ");
                NK = input.nextLine();

                if (NK.length() != 8) {
                    System.out.print("Nomor Karyawan harus 8 digit!\n");
                } else {
                    break;
                }
            }

            System.out.print("Masukkan Jabatan Karyawan: ");
            String jabatan = input.nextLine();

            System.out.print("Input Gaji: ");
            double gaji = input.nextDouble();
            input.nextLine();

            System.out.print("Banyaknya Jam Lembur yang Diambil: ");
            int lembur = input.nextInt();
            input.nextLine();

            karyawan dataKar = new karyawan(nama, umur, NK, jabatan, gaji, lembur);
            daftarKaryawan.add(dataKar.formatData());
        }

        daftarPekerja.daftar(daftarKaryawan);
    }

}
