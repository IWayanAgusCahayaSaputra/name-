import java.util.Locale;

interface biaya {
    double pajak = 0.11;
    double bpjs = 0.1;
    int upahLembur = 60000;
}

public class karyawan implements biaya {

    String nama;
    int umur;
    String nomorKaryawan;
    String jabatan;
    double gajiPokok;
    int lembur;

    karyawan(String nama, int umur, String nomorKar, String jabatan, double gaji, int lembur) {
        this.nama = nama;
        this.umur = umur;
        this.nomorKaryawan = nomorKar;
        this.jabatan = jabatan;
        this.gajiPokok = gaji;
        this.lembur = lembur;
    }

    double potongan() {
        return (gajiPokok * pajak) + (gajiPokok * bpjs);
    }

    int gajiLembur() {
        if (lembur < 0) {
            return 0;
        } else {
            return upahLembur * lembur;
        }
    }

    double bonusGaji() {
        if (lembur < 0) {
            return gajiPokok * 0;
        } else if (lembur < 12) {
            return gajiPokok * 0.10;
        } else if (lembur < 24) {
            return gajiPokok * 0.20;
        } else if (lembur < 36) {
            return gajiPokok * 0.30;
        } else {
            return gajiPokok * 0.40;
        }
    }

    double gajiBersih() {
        return (gajiPokok + gajiLembur() + bonusGaji()) - potongan(); 
    }

    String formatData() {
        return String.format(
            Locale.forLanguageTag("id-ID"),
            "Nama            : %s\n" +
            "Umur            : %d\n" +
            "Nomor Karyawan  : %s\n" +
            "Jabatan         : %s\n" +
            "Gaji            : Rp%,.0f\n\n" +
            "Banyaknya lembur: %d-jam\n" +
            "Potongan        : Rp%,.0f\n" +
            "Upah Lembur     : Rp%d\n" +
            "Bonus Gaji      : Rp%,.0f\n" +
            "Gaji Bersih     : Rp%,.0f\n\n",
            nama, umur, nomorKaryawan, jabatan, gajiPokok, lembur, potongan(), gajiLembur(), bonusGaji(), gajiBersih()
        );
    }

}
