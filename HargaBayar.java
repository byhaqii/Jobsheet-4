import java.util.Scanner;

class HargaBayar19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price, quantity;
        double dis=0.1, totalPrice, purchasePrice, totalDiscount;
        System.out.print("Input price:");
        price = input.nextInt();
        System.out.print("Input quantity:");
        quantity = input.nextInt();
        totalPrice = price*quantity;
        totalDiscount = totalPrice*dis;
        purchasePrice=totalPrice-totalDiscount;
        System.out.print("Total discount " + totalDiscount);
        System.out.print("Final purchase price " + purchasePrice);
    }
}