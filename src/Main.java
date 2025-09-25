import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------");
        System.out.print("Enter your Bill: $");
        double billAmt = scan.nextDouble();
        System.out.print("Tip Percent: %");
        int tipPerc= scan.nextInt();
        System.out.print("# of People:");
        int amtPeople = scan.nextInt();
        System.out.println("---------------------");
        double totalTipAmt = billAmt * (tipPerc/100.0);
        double roundedTipAmt = Math.round(totalTipAmt * 100.0) / 100.0;
        System.out.printf("| Total tip Amt: $%.2f", roundedTipAmt);
        System.out.print(" |");
        System.out.println();
        System.out.println("---------------------");
        double totalBillAmt= billAmt + totalTipAmt;
        double roundedBillAmt = Math.round(totalBillAmt * 100.0) / 100.0;
        System.out.printf("| Total Bill Amt: $%.2f", roundedBillAmt );
        System.out.print(" |");
        System.out.println();
        System.out.println("---------------------");
        double tipPerPerson = totalTipAmt/amtPeople;
        double roundedTipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;
        System.out.printf("| Tip Per Person: $%.2f",roundedTipPerPerson);
        System.out.print(" |");
        System.out.println();
        System.out.println("---------------------");
        double billPerPerson = totalBillAmt/amtPeople;
        double roundedPerBillAmt = Math.round(billPerPerson * 100.0) / 100.0;
        System.out.printf("| Total Bill per Person: $%.2f", roundedPerBillAmt );
        System.out.print(" |");
        System.out.println();
        System.out.println("---------------------");




        scan.close();

    }
    }
