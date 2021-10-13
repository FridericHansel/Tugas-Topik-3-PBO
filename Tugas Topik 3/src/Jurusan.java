import java.util.ArrayList;

public class Jurusan {
    private final String kode;
    private final String nama;
    ArrayList<Mahasiswa> mhs = new ArrayList<>();

    public Jurusan (String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public void addmhs(Mahasiswa m){
        this.mhs.add(m);
    }

    public String getKode(){
        return kode;
    }

    public String getNama(){
        return nama;
    }

    public ArrayList<Mahasiswa> getMhs(){
        return mhs;
    }
}
