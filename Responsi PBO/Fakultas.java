/*  Nama File   : Fakultas.java
    Deskripsi   : Kelas yang merepresentasikan fakultas di universitas.
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 29 - September - 2023
*/

public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.setNama(nama);
        this.setTarifUKT(tarifUKT);
        this.setGajiPokok(gajiPokok);
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getTarifUKT() {
        return this.tarifUKT;
    }

    public void setTarifUKT(double tarifUKT) {
        this.tarifUKT = tarifUKT;
    }

    public double getGajiPokok() {
        return this.gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }
    
    public void showInfo() {
        System.out.println("Fakultas: " + this.getNama());
        System.out.println("Tarif UKT: " + this.getTarifUKT());
        System.out.println("Gaji Pokok: " + this.getGajiPokok());
    }
}
