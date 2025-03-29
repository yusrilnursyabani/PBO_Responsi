/*  Nama File   : Karyawan.java
    Deskripsi   : Kelas yang merepresentasikan karyawan di universitas.
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 29 - September - 2023
*/

public class Karyawan extends CivitasAkademik {
    private String nip;
    private int masaKerja;

    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.setNip(nip);
        this.setMasaKerja(masaKerja);
    }
    
    public String getNip() {
        return this.nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getMasaKerja() {
        return this.masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }
    
    @Override
    public void showInfo() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Email: " + this.getEmail());
        System.out.println("NIP: " + this.getNip());
        System.out.println("Masa Kerja: " + this.getMasaKerja() + " tahun");
    }
}
