import java.util.Scanner;
// import java.util.Iterator;

public class JalankanNilai {
    public static void main(String[] args) {

        //

        // memanggil class 'MenghitungNilai'

        MenghitungNilai aksesNilai = new MenghitungNilai();

        // memanggil Scanner lewat variabel
        // 'inputanUser'
        Scanner pilihanUser = new Scanner(System.in);

        String cekNama;

        //
        Integer ulangNama, ulangNilai;
        Double cekNilai;

        // meminta input nama
        cekNama = aksesNilai.mintaNama();
        if (cekNama.isEmpty()) {
            System.out.println("nama masih kosong, silahkan isi dulu");
        }
        if (cekNama != null && cekNama.length() > 0) {
            System.out.println("nama akan disimpan");
            aksesNilai.simpanNama();
        }

        // meminta input nilai
        cekNilai = aksesNilai.mintaNilai();
        if (cekNilai == 0) {
            System.out.println("nilai masih kosong, silahkan isi dulu");
        }
        if (cekNilai != null) {
            System.out.println("nilai akan disimpan");
            aksesNilai.simpanNilai();
        }

        // menanyakan apakah ingin isi data lagi

        // menanyakan apakah ingin isi nama lagi
        System.out.print("ingin memasukkan berapa nama lagi? (1,2,3,dst...) = ");
        ulangNama = pilihanUser.nextInt();
        for (int i = 0; i < ulangNama; i++) {
            aksesNilai.mintaNama();
            aksesNilai.simpanNama();
        }

        // menanyakan apakah ingin isi nilai lagi
        System.out.print("ingin memasukkan nilai lagi? (1,2,3,dst...) = ");
        ulangNilai = pilihanUser.nextInt();
        for (int j = 0; j < ulangNilai; j++) {
            aksesNilai.mintaNilai();
            aksesNilai.simpanNilai();
        }
        System.out.println();
        aksesNilai.daftarNilai();
        pilihanUser.close();
    }

}
