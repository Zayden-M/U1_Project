import java.util.Scanner;

public class Main
{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------------------");

        System.out.println("|  Do not use any symbols such as ($ or %) while you input data  | "); //Instructions for the user

        System.out.println("------------------------------------------");
        //the prompts for the user inputs are here
        System.out.print("Enter your Bill: $");//bill
        double billAmt = scan.nextDouble();
        System.out.print("Tip Percent: %"); //tip percent
        int tipPerc= scan.nextInt();
        System.out.print("# of People:"); //# of people
        int amtPeople = scan.nextInt();

        System.out.println("---------------------");
        //after this is the output
//the tip amount
        double totalTipAmt = billAmt * (tipPerc/100.0); //The actual math is at the start of each "Section" of code
        double roundedTipAmt = Math.round(totalTipAmt * 100.0) / 100.0; //rounding did not work well with just math round so I had to format it too
        System.out.printf("| Total tip Amt: $%.2f", roundedTipAmt);
        System.out.print(" |");
        System.out.println();

        System.out.println("---------------------");
//Total bill amount
        double totalBillAmt= billAmt + totalTipAmt; // The rest of the code from here takes the user input AND calculations
        double roundedBillAmt = Math.round(totalBillAmt * 100.0) / 100.0;//rounding
        System.out.printf("| Total Bill Amt: $%.2f", roundedBillAmt ); //formating
        System.out.print(" |");
        System.out.println();//line break

        System.out.println("---------------------");
//The tip per person
        double tipPerPerson = totalTipAmt/amtPeople;
        double roundedTipPerPerson = Math.round(tipPerPerson * 100.0) / 100.0;
        System.out.printf("| Tip Per Person: $%.2f",roundedTipPerPerson);
        System.out.print(" |");
        System.out.println();// since I used "System.out.printf" I couldn't make a new line, so I had to add the line break here

        System.out.println("---------------------");
//the total bill for each person
        double billPerPerson = totalBillAmt/amtPeople;
        double roundedPerBillAmt = Math.round(billPerPerson * 100.0) / 100.0;
        System.out.printf("| Total Bill per Person: $%.2f", roundedPerBillAmt );
        System.out.print(" |");//this is just to make it look nice on each of the "sections"
        System.out.println();

        System.out.println("---------------------");




        scan.close(); //I closed it down here in case I needed to make changes

    }
    }
