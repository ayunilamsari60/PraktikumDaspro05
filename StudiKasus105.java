import java.util.Scanner;

public class StudiKasus105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup = 18000,
            jumlahCup,
            uangBayar,
            totalHarga,
            diskon,
            totalBayar,
            kembalian,
            kurang;

        System.out.print("Masukkan Jumlah cup\t: ");
        jumlahCup = sc.nextInt();

        System.out.print("Masukkan uang bayar\t: ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;

        if (totalHarga >=100000) {
            diskon = totalHarga * 10/100;
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }

        System.out.println("Total harga\t\t: Rp" + totalHarga);
        System.out.println("Diskon\t\t\t: Rp" + diskon);
        System.out.println("Total bayar\t\t: Rp" + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian\t\t\t: Rp" + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
    }
}