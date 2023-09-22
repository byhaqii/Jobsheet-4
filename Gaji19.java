import java.util.Scanner;

class Gaji19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, JmlTdkMasuk, TotGaji;
        int gaji = 40000, potGaji = 25000;
        System.out.print("Masukkan jumlah hari masuk kerja anda:");
        jmlMasuk = input.nextInt();
        System.out.print("Masukkan jumlah hari tidak masuk kerja anda:");
        JmlTdkMasuk = input.nextInt();
        TotGaji = (jmlMasuk*gaji)-(JmlTdkMasuk*potGaji);
        System.out.print("Gaji yang anda terima adalah:Rp" + TotGaji);
    }
}