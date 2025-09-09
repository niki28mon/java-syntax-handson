package Task3;
public class DataLossStudy {
    public static void main(String[] args) {
        System.out.println("=== STUDI KASUS DATA LOSS ===");

        // Kasus 1: Sistem Penilaian
        System.out.println("1. Sistem Penilaian:");
        double nilaiAsli = 87.65;
        int nilaiHuruf = (int) nilaiAsli; // Data loss!

        System.out.println("Nilai asli: " + nilaiAsli);
        System.out.println("Nilai setelah casting ke int: " + nilaiHuruf);
        System.out.println("Data yang hilang: " + (nilaiAsli - nilaiHuruf));

        // Kasus 2: Populasi Negara
        System.out.println("\\n2. Data Populasi:");
        long populasiIndonesia = 273_523_615L; // 273 juta+
        int populasiInt = (int) populasiIndonesia; // Overflow!

        System.out.println("Populasi asli (long): " + populasiIndonesia);
        System.out.println("Populasi setelah casting ke int: " + populasiInt);

        // Kasus 3: Konversi mata uang(rupiah ke dollar dengan presisi)
        System.out.println("\\n3. Konversi Mata Uang:");
        double rupiah = 15_785.75;
        int dollar = (int) (rupiah/ 15_000);
        System.out.println("Rupiah: " + rupiah);
        System.out.println("Dollar (dibulatkan kebawah): " + dollar);

        // Kasus 4: Pengukuran GPS
        System.out.println("\\n4. Pengukuran GPS:");
        double latitude = -6.21462;
        float latitudeFloat = (float) latitude;
        System.out.println("Latitude asli (double): " + latitude);
        System.out.println("Latitude setelah casting ke float: " + latitudeFloat);

        // Kasus 5: Perhitungan waktu dengan milidetik
        System.out.println("\\n5. Perhitungan Waktu");
        long waktuMillis = 3_600_000L;
        int waktuInt = (int) waktuMillis;
        long waktuHari = 100_000_000_000L;
        int  WaktuHariInt = (int) waktuHari;
        System.out.println("Waktu 1 jam (long): " + waktuMillis + " ms -> int: " +waktuInt);
        System.out.println("Waktu 100 miliar ms (long): " + waktuHari + " -> int: " + WaktuHariInt);
    }
}

