/*  Nama File   : Dosen.java
    Deskripsi   : Kelas abstrak yang merepresentasikan Dosen di universitas.
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 29 - September - 2023
*/

public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counter = 0;

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.setFakultas(fakultas);
        counter++;
    }
    
    public Fakultas getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }
    
    // Gaji = gaji pokok fakultas + (masa kerja * 1% * gaji pokok fakultas)
    public double getGaji() {
        double gajiPokok = this.getFakultas().getGajiPokok();
        return gajiPokok + (this.getMasaKerja() * 0.01 * gajiPokok);
    }
    
    @Override
    public void showInfo() {
        System.out.println("=== Data Dosen ===");
        System.out.println("Nama: " + this.getNama());
        System.out.println("Email: " + this.getEmail());
        System.out.println("NIP: " + this.getNip());
        System.out.println("Masa Kerja: " + this.getMasaKerja() + " tahun");
        System.out.println("Fakultas: " + this.getFakultas().getNama());
        System.out.printf("Gaji: %.2f\n", this.getGaji());
        System.out.println("Total Dosen: " + counter);
        System.out.println();
    }
}
