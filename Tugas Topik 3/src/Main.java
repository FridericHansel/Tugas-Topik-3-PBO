import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Jurusan d3IF = new Jurusan("D3IF","Diploma 3 Rekayasa Perangkat Lunak Aplikasi");
        Jurusan d3SI = new Jurusan("D3SI","Diploma 3 Sistem Informasi");

        Mahasiswa mhs1 = new Mahasiswa("6701","Rendi");
        Mahasiswa mhs2 = new Mahasiswa("6702","Chaca");
        Mahasiswa mhs3 = new Mahasiswa("6703","Agus");
        Mahasiswa mhs4 = new Mahasiswa("6301","Ridwan");
        Mahasiswa mhs5 = new Mahasiswa("6302","Siska");
        Mahasiswa mhs6 = new Mahasiswa("6303","Zayn");
        Mahasiswa mhs7 = new Mahasiswa("6304","Rahmat");

        d3IF.addmhs(mhs1);
        d3IF.addmhs(mhs2);
        d3IF.addmhs(mhs3);

        d3SI.addmhs(mhs4);
        d3SI.addmhs(mhs5);
        d3SI.addmhs(mhs6);
        d3SI.addmhs(mhs7);

        System.out.println("Kode: " + d3IF.getKode());
        System.out.println("Nama: " + d3IF.getNama());
        System.out.println("Daftar Mahasiswa: ");
        ArrayList<Mahasiswa> mhsIF = d3IF.getMhs();
        for (int i = 0; i < mhsIF.size(); i++){
            System.out.println(i + 1 + ". " + mhsIF.get(i).getNim() + " - " + mhsIF.get(i).getNama());
        }

        System.out.println("\nKode: " + d3SI.getKode());
        System.out.println("Nama: " + d3SI.getNama());
        System.out.println("Daftar Mahasiswa: ");
        ArrayList<Mahasiswa> mhsSi = d3SI.getMhs();
        for (int i = 0; i < mhsSi.size(); i++){
            System.out.println(i + 1 + ". " + mhsSi.get(i).getNim() + " - " + mhsSi.get(i).getNama());
        }
    }
}
