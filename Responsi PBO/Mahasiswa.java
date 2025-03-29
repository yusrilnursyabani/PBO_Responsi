/*  Nama File   : Mahasiswa.java
    Deskripsi   : Kelas yang merepresentasikan mahasiswa di universitas.
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 29 - September - 2023
*/

public class Mahasiswa extends CivitasAkademik {
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counter = 0;

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.setNim(nim);
        this.setSemester(semester);
        this.setFakultas(fakultas);
        counter++;
    }

    public String getNim() {
        return this.nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Fakultas getFakultas() {
        return this.fakultas;
    }

    public void setFakultas(Fakultas fakultas) {
        this.fakultas = fakultas;
    }

    public double getBiayaUKT() {
        //Diskon 5% per semester (semester 1 tanpa diskon)
        return this.getFakultas().getTarifUKT() * Math.pow(0.95, this.getSemester() - 1);
    }
    
    @Override
    public void showInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama: " + this.getNama());
        System.out.println("Email: " + this.getEmail());
        System.out.println("NIM: " + this.getNim());
        System.out.println("Semester: " + this.getSemester());
        System.out.println("Fakultas: " + this.getFakultas().getNama());
        System.out.printf("Biaya UKT: %.2f\n", this.getBiayaUKT());
        System.out.println("Total Mahasiswa: " + counter);
        System.out.println();
    }
}
