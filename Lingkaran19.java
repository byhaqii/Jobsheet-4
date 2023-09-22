import java.util.Scanner;

class Lingkaran19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double circumference, area;
        System.out.print("Input radius: ");
        r = input.nextInt();
        circumference = 2*3.14*r;
        area = 3.14*r*r;
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);

    }
}