package Task1;
public class NamingConvention {
    public static void main(String[] args) {
        // Variabel menggunakan camelCase
        String namaLengkapMahasiswa = "Marchelyna Nickyta Mondigir";
        String nomorIndukMahasiswa = "2482009";
        double ipkSemesterLalu = 3.67;
        boolean statusAktifKuliah = true;
        String alamatRumah = "JLN. C. HEATUBUN TIMIKA";
        int jumlahSksDiambil = 20;

        // Tampilkan semua data
        System.out.println("=== DATA MAHASISWA ===");
        System.out.println("Nama Lengkap      : " + namaLengkapMahasiswa);
        System.out.println("NIM               : " + nomorIndukMahasiswa);
        System.out.println("IPK Semester Lalu : " + ipkSemesterLalu);
        System.out.println("Status Aktif      : " + (statusAktifKuliah ? "Aktif" : "Tidak Aktif"));
        System.out.println("Alamat Rumah      : " + alamatRumah);
        System.out.println("Jumlah SKS        : " + jumlahSksDiambil);
    }
}

