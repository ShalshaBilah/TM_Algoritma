package Model;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);
        // Tugas / TM
        // Tampilkan hasil perhitungan dengan memanggil method yang ada pada
        // Perhitungan.java. Method yang dibuat, menerima parameter dan
        // mengembalikan nilai (method with return)
        // Dikumpulkan hari Sabtu, 30 April 2022
        // hasil diemail ke aherijanto@mimoapps.xyz
        // siswa
        // Subject email : TM_NIM_NAMALENGKAP_KELAS
        // e.g : TM_21090085_RAFIDATUSSALSABILAH_2A
        int hasilTambah = s.HasilTmbh(4, 6);
        System.out.println("Hasil Tambah =" + hasilTambah);
        int hasilKali = s.HasilKali(4, 6);
        System.out.println("Hasil Kali = " + hasilKali);
    }
}