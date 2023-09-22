import java.util.Scanner;

class HargaBayar19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah;
        double dis=0.1, total, bayar, jmlDis;
        System.out.print("Masukkan harga barang yang dibeli:");
        harga = input.nextInt();
        System.out.print("Masukkan jumlah jumlah barang yang dibeli:");
        jumlah = input.nextInt();
        total = harga*jumlah;
        jmlDis = total*dis;
        bayar=total-jmlDis;
        System.out.print("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.print("Jumlah yang harus dibayar adalah " + bayar);
    }
}