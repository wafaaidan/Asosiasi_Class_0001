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

    public void tambahMataKuliah(MataKuliah mataKuliah){
        MataKuliahDiajar.add(mataKuliah);
    }
    @Override
    public void tampilkanPeran(){
        System.out.println(getNama() + "");
    }
    public void tampilkanMataKuliahDiajar(){
        System.out.println("Dosen : " + getNama());
        System.out.println("NIDN :" + nidn);
        System.out.println("Mata Kuliah yang Diajar");

        for (MataKuliah mk : MataKuliahDiajar) {
            System.out.println("-" + mk.getInfo());

        }
    }
}
public class Main {
    public static void main(String[] args) {
        MataKuliah pbo = new MataKuliah("IF204", "PBO", 3);
        MataKuliah web = new MataKuliah("IF305", "Web", 3);
        MataKuliah strukturData = new MataKuliah("IF201", "Struktur Data", 3);

        
    }
}

