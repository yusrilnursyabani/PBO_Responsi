/*  Nama File   : Main.java
    Deskripsi   : Kelas utama untuk menjalankan program universitas.
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 29 - September - 2023
*/

public class Main {
    public static void main(String[] args) {
        //Objek Fakultas
        Fakultas teknik = new Fakultas("Teknik", 5000000, 7000000);
        Fakultas ekonomi = new Fakultas("Ekonomi", 4500000, 6500000);

        // Menampilkan info fakultas
        System.out.println("=== Info Fakultas ===");
        teknik.showInfo();
        System.out.println();
        ekonomi.showInfo();
        System.out.println("====================================");

        //Objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("Andi", "andi@mail.com", "NIM001", 1, teknik);
        Mahasiswa mhs2 = new Mahasiswa("Budi", "budi@mail.com", "NIM002", 3, ekonomi);

        //Objek Dosen
        Dosen dosen1 = new Dosen("Dr. Sari", "sari@mail.com", "NIP001", 10, teknik);
        Dosen dosen2 = new Dosen("Dr. Joko", "joko@mail.com", "NIP002", 5, ekonomi);

        //Objek Tendik
        Tendik tendik1 = new Tendik("Siti", "siti@mail.com", "NIP003", 8);
        Tendik tendik2 = new Tendik("Dewi", "dewi@mail.com", "NIP004", 3);

        // Menampilkan informasi masing-masing
        mhs1.showInfo();
        mhs2.showInfo();
        dosen1.showInfo();
        dosen2.showInfo();
        tendik1.showInfo();
        tendik2.showInfo();
    }
}
