import java.util.ArrayList;
abstract class orang {
    private String nama;

    public orang(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public abstract void tampilkanPeran();
}
class MataKuliah {
    private String kode;
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
    }

    public String getInfo(){
        return kode + " - " + nama + "(" + sks + "SKS)";
    }
}
class Dosen extends orang {
    private String nidn;
    private ArrayList<MataKuliah> MataKuliahDiajar;

    public Dosen(String nama, String nidn) {
        super(nama);
        this.nidn = nidn;
        this.MataKuliahDiajar = new ArrayList<>();
    }

    
}
    public static void main(String[] args) {
        
    }

