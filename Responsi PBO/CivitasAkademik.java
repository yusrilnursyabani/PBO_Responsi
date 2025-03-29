/*  Nama File   : CivitasAkademik.java
    Deskripsi   : Kelas abstrak yang merepresentasikan civitas akademik di universitas.
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 29 - September - 2023
*/

public class CivitasAkademik {
    private String nama;
    private String email;

    public CivitasAkademik(String nama, String email) {
        this.setNama(nama);
        this.setEmail(email);
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void showInfo() {
        System.out.println("Nama: " + this.getNama());
        System.out.println("Email: " + this.getEmail());
    }
}

