import java.util.Scanner;
import java.util.ArrayList;

public class java7 {
    
    static double penjumlahan(double a, double b) {
        double hasil = a + b;
        return hasil;
    }

    static double pengurangan(double a, double b) {
        double hasil = a - b;
        return hasil;
    }

    static double perkalian(double a, double b) {
        double hasil = a * b;
        return hasil;
    }

    static double pembagian(double a, double b) {
        double hasil = a / b;
        return hasil;
    }

    static double modulo(double a, double b) {
        double hasil = a % b;
        return hasil;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> Histori = new ArrayList<>();

        String[] menu = {"Penjumlahan", "Pengurangan", "Perkalian", "Pembagian", "Modulo"};
        String[] simbol = {"+", "-", "x", "/", "%"};
        for (int i = 0; i < menu.length; i++) {
            System.out.print((i + 1) + ". " + menu[i] + "\n");
        }
        System.out.println();

        String pilih;
        

        do {

            System.out.print("Pilih operasi (selesai jika sudah): ");
            pilih = input.nextLine();

            boolean ketemu = false;

            for (int i = 0; i < menu.length; i++) {
                if (menu[i].equalsIgnoreCase(pilih)) {
                    System.out.print("Nilai A: ");
                    double a  = input.nextDouble();
                    System.out.print("Nilai B: ");
                    double b = input.nextDouble();
                    input.nextLine();

                    double hasil = 0;

                    if (menu[i].equalsIgnoreCase("Penjumlahan")) {
                        hasil = penjumlahan(a, b);
                    } else if (menu[i].equalsIgnoreCase("Pengurangan")) {
                        hasil = pengurangan(a, b);
                    } else if (menu[i].equalsIgnoreCase("Perkalian")) {
                        hasil = perkalian(a, b);
                    } else if (menu[i].equalsIgnoreCase("Pembagian")) {
                        hasil = pembagian(a, b);
                    } else if (menu[i].equalsIgnoreCase("Modulo")) {
                        hasil = modulo(a, b);
                    }

                    System.out.println("Hasil " + menu[i] + ": " + a + " "+ simbol[i] +" " + b + " = " + hasil);
                    Histori.add(menu[i] + " : " + a + " " + simbol[i] + " " +  b + " = " + hasil);
                } 
            } if (!ketemu) {
                System.out.println("Pilihan tidak ada!");
            }

        } while (!pilih.equalsIgnoreCase("selesai"));
            for (String histori : Histori) {
                System.out.println("- " + histori);
            }


    }

}
