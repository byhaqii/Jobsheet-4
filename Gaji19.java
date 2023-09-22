import java.util.Scanner;

class Gaji19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numAttendance, numAbsence, totalSalary;
        int salary = 40000, salarydeduction = 25000;
        System.out.print("Input attedance number : ");
        numAttendance= input.nextInt();
        System.out.print("Input absence number : ");
        numAbsence = input.nextInt();
        totalSalary = (numAttendance*salary)-(numAbsence*salarydeduction);
        System.out.print("Total salary : Rp" + totalSalary);
    }
}