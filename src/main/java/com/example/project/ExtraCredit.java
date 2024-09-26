package com.example.project;
import java.util.Scanner;


public class ExtraCredit {


    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        double decPercent = (double)percent/100;
        double tip = cost * decPercent;
        double temp = tip;
        tip = Math.round(tip * 100.0) / 100.0;
        // I learned how to round from this https://stackoverflow.com/questions/8825209/rounding-decimal-points

        double bill = cost + tip;
        // calculates the total bill
        double perPerson = cost/people;
        perPerson = Math.round(perPerson * 100.0)/100.0;
        // calculates the cost per person
        double tipPerson = tip/people;
        tipPerson = Math.round(tipPerson * 100.0)/100.0;
        // calculates the tip per person
        double totPerson = cost + temp;
        totPerson = totPerson/people;
        totPerson = Math.round(totPerson * 100.0)/100.0;
        // calculates the cost per person
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: $" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: $" + tip + "\n");
        result.append("Total Bill with tip: $" + bill + "\n");
        result.append("Per person cost before tip: $" + perPerson + "\n");
        result.append("Tip per person: $" + tipPerson + "\n");
        result.append("Total cost per person: $" + totPerson + "\n");
        result.append("-------------------------------\n");

        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }

                                   
    public static void main(String[] args) {
        int people = 0;
        int percent = 0;
        double cost = 0.0;
        String items = ""; 

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a item name or type '-1' to finish: ");
        String itemName = scan.nextLine();
    
        while (!itemName.equals("-1")) {
            items += itemName;
            items += "\n";
            System.out.print("Enter a item name or type '-1' to finish: ");
            itemName = scan.nextLine();

        System.out.println(calculateTip(people,percent,cost,items));
        }
    }
}
