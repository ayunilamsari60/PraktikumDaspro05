import java.util.Scanner;

public class StudiKasus205 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String  namaMahasiswa,
                jenisKegiatan;
        int jumlahDokumen = 0,
            peringkatJuara = 0,
            statusPendanaan = 0;

        System.out.print("Nama Mahasiswa\t: ");
        namaMahasiswa = sc.nextLine();

        System.out.print("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
        || jenisKegiatan.equalsIgnoreCase("BAKORMA")
        || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen\t: ");
            jumlahDokumen = sc.nextInt();

            if (jumlahDokumen < 4) {
                System.out.print("Peringkat juara\t: ");
                peringkatJuara = sc.nextInt();

                System.out.println("Status: dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                System.out.print("Peringkat juara\t: ");
                peringkatJuara = sc.nextInt();

                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status: Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status: Bukan juara 1, 2, dan 3. Dana penghargaan tidak diberikan.");
                }
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {

            System.out.print("Status pendanaan PKM (1 = Lolos, 0 = Tidak lolos): ");
            statusPendanaan = sc.nextInt();

            if (statusPendanaan == 1) {
                System.out.print("Jumlah dokumen\t: ");
                jumlahDokumen = sc.nextInt();

                if (jumlahDokumen == 4) {
                    System.out.println("Status: Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status: dokumen tidak lengkap (kurang " + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak lolos dana penghargaan PKM.");
            }

        } else {
            System.out.println("Status: Kegiatan lainnya. Dana penghargaan tidak diberikan.");
        }

    }
}
