package Task2;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");

        // Input dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Hitung dan tampilkan hasil operasi matematika
        double penjumlahan = angka1 + angka2;
        double pengurangan = angka1 - angka2;
        double perkalian = angka1 * angka2;
        Double pembagian = (angka2 != 0) ? (angka1 / angka2): null;
        Double modulus = (angka2 != 0) ? (angka1 % angka2): null;

        // Tampilkan hasil dengan format yang rapi
        System.out.println("\\n=== HASIL PERHITUNGAN ===");
        System.out.printf("Penjumlahan (%.4f + %.4f) = %.4f%n", angka1, angka2, penjumlahan);
        System.out.printf("Pengurangan (%.4f - %.4f) = %.4f%n", angka1, angka2, pengurangan);
        System.out.printf("Perkalian (%.4f * %.4f) = %.4f%n", angka1, angka2, perkalian);

        if (pembagian != null) {
            System.out.printf("Pembagian (%.4f / %.4f) = %.4f%n", angka1, angka2, pembagian);
        } else {
            System.out.printf("Pembagian (%.4f / %.4f) = tidak terdefinisi (pembagi 0)%n", angka1, angka2);
        }
        if(modulus != null) {
            System.out.printf("Modulus (%.4f %% %.4f) = %.4f%n", angka1, angka2, modulus);
        } else {
            System.out.printf("Modulus (%.4f %% %.4f) = Tidak terdefinisi (pembagi 0)%n", angka1, angka2);
        }
        scanner.close();
    }
}
