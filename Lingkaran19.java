import java.util.Scanner;

class Lingkaran19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double  keliling, luas;
        System.out.println("Masukkan jari-jari lingkaran: ");
        r = input.nextInt();
        keliling = 2*3.14*r;
        luas = 3.14*r*r;
        System.out.println("Keliling: " + keliling);
        System.out.println("Luas: " + luas);

    }
}