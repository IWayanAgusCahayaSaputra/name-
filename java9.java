import java.util.Scanner;
import java.util.ArrayList;

class merekMobil {
    String namaMerek;
    String tahunBerdiri;

    merekMobil(String nama, String tahun) {
        this.namaMerek = nama;
        this.tahunBerdiri = tahun;
    }

    String tampilData() {
        return String.format(
            "Merek        : %s\n" +
            "Tahun Berdiri: %s\n\n",
            namaMerek, tahunBerdiri
        );
    }
}

class tipeMobil extends merekMobil {
    String namaTipe;
    String tahunKeluaran;
    String cc;
    String warna;

    tipeMobil(String nama, String tahun, String namaTipe, String tahunKeluaran, String cc, String warna) {
        super(nama, tahun);
        this.namaTipe = namaTipe;
        this.tahunKeluaran = tahunKeluaran;
        this.cc = cc;
        this.warna = warna;
    }

    String tampilInfo() {
        return String.format(
            "Merek        : %s\n" +
            "Tahun Berdiri: %s\n" +
            "Tipe         : %s\n" +
            "Tahun Keluar : %s\n" +
            "CC           : %scc\n" +
            "Warna        : %s\n\n",
            namaMerek, tahunBerdiri, namaTipe, tahunKeluaran, cc, warna
        );
    }

}
public class java9 {

    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        ArrayList<String> daftarMerek = new ArrayList<>();
        ArrayList<String> daftarMobil = new ArrayList<>();
        String pilih;

        //data merek
        String namaMerek;
        String tahun;

        //data tipe
        String tipe;
        String tahunKeluar;
        String cc;
        String warna;

        while(true) {

            System.out.print("Ingin menambah data mobil? (merek/tipe/selesai): ");
            pilih = input.nextLine();

            if(pilih.equalsIgnoreCase("selesai")) {
                break;
            } 
            
            if(pilih.equalsIgnoreCase("merek")) {
                System.out.print("Masukkan nama merek: ");
                namaMerek = input.nextLine();
                System.out.print("Masukkan tahun berdiri: ");
                tahun = input.nextLine();
                merekMobil newMerek = new merekMobil(namaMerek, tahun);
                daftarMerek.add(newMerek.tampilData());
                System.out.print("Merek berhasil ditambahkan!\n");

            } else if(pilih.equalsIgnoreCase("tipe")) {
                System.out.print("Masukkan nama merek: ");
                namaMerek = input.nextLine();

                System.out.print("Masukkan tahun berdiri: ");
                tahun = input.nextLine();

                System.out.print("Masukkan tipe mobil: ");
                tipe = input.nextLine();
                
                System.out.print("Masukkan tahun keluar: ");
                tahunKeluar = input.nextLine();

                System.out.print("Masukkan besaran CC: ");
                cc = input.nextLine();

                System.out.print("Masukkan warna mobil: ");
                warna = input.nextLine();

                tipeMobil newTipe = new tipeMobil(namaMerek, tahun, tipe, tahunKeluar, cc, warna);
                daftarMobil.add(newTipe.tampilInfo());
                System.out.print("Data berhasil ditambahkan!\n");
            }
            
        } 

        System.out.print(" === DAFTAR MEREK === \n");
        for (String daftar : daftarMerek) {
            System.out.print(daftar);
        }

        System.out.print(" === DAFTAR TIPE MOBIL === \n");
        for (String daftar : daftarMobil) {
            System.out.print(daftar);
        }
        
    }
}
