import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
    
{ Scanner scanner = new Scanner(System.in);

     // Ask user to enter cost price and selling price
     System.out.print("Enter Cost Price: ");
     double costPrice = scanner.nextDouble();

     System.out.print("Enter Selling Price: ");
     double sellingPrice = scanner.nextDouble();

     // Calculate and display profit or loss
    if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("Profit: ₹" + profit);
        } else if (costPrice > sellingPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("Loss: ₹" + loss);
        } else {
            System.out.println("No Profit, No Loss.");
        }

        scanner.close();
    }
}

    }
    

