/*  Nama File   : Tendik.java
    Deskripsi   : Kelas yang merepresentasikan tenaga kependidikan di universitas.
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 29 - September - 2023
*/

public class Tendik extends Karyawan {
    private static int counter = 0;
    private final double GAJI_POKOK_TENDIK = 4000000;

    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counter++;
    }
    
    // Gaji = 4.000.000 + (masa kerja * 1% * 4.000.000)
    public double getGaji() {
        return GAJI_POKOK_TENDIK + (this.getMasaKerja() * 0.01 * GAJI_POKOK_TENDIK);
    }
    
    @Override
    public void showInfo() {
        System.out.println("=== Data Tendik ===");
        System.out.println("Nama: " + this.getNama());
        System.out.println("Email: " + this.getEmail());
        System.out.println("NIP: " + this.getNip());
        System.out.println("Masa Kerja: " + this.getMasaKerja() + " tahun");
        System.out.printf("Gaji: %.2f\n", this.getGaji());
        System.out.println("Total Tendik: " + counter);
        System.out.println();
    }
}
