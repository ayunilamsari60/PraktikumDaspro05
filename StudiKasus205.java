import java.util.Scanner;

public class StudiKasus205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  namaMahasiswa,
                jenisKegiatan;
        int jumlahDokumen = 0,
            peringkatJuara = 0,
            statusPendanaan = 0;

        System.out.print("Nama Mahasiswa: ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
        || jenisKegiatan.equalsIgnoreCase("BAKORMA")
        || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.println("Jumlah dokumen: ");
            jumlahDokumen = sc.nextInt();

            if (jumlahDokumen < 4) {
                System.out.println("Peringkat juara: ");
                peringkatJuara = sc.nextInt();

                System.out.println("Status: dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                System.out.println("Peringkat juara: ");
                peringkatJuara = sc.nextInt();

                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status: Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status: Bukan juara 1, 2, dan 3. Dana penghargaan tidak diberikan.");
                }
            }
        } 

    }
}
