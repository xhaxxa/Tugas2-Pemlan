package Project1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList listMahasiswa = new ArrayList();

        Scanner in = new Scanner(System.in);
        boolean next = true;

        while (next) {
            System.out.print("Masukan Nama\t: ");
            String Nama = in.nextLine();

            System.out.print("Masukan NIM\t: ");
            String NIM = in.nextLine();

            System.out.print("Masukan Alamat\t: ");
            String Alamat = in.nextLine();
            
            System.out.print("tambah lagi? (y/t) ");
            String tambah = in.nextLine();

            if (tambah.equals("t")) {
                next = false;
            }

            mahasiswa m = new mahasiswa();
            m.setNama(Nama);
            m.setNIM(NIM);
            m.setAlamat(Alamat);
            listMahasiswa.add(m);
        }

        System.out.println("|Nama          | NIM              | Alamat         |");
        System.out.println("|--------------|------------------|----------------|");
        for (int i = 0; i < listMahasiswa.size(); i++) {
            mahasiswa m = (mahasiswa) listMahasiswa.get(i);
            System.out.printf("|%-14s| %-16s| %-15s|\n", m.getNama(), m.getNIM(), m.getAlamat());
        }
    }
}
