import java.util.Scanner;
 class GSTProfitLossCalculator
 {
    public static void calculcate()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double costPrice = scanner.nextDouble();

        System.out.print("Enter the selling price: ");
        double sellingPrice = scanner.nextDouble();

        System.out.print("Enter the GST rate (in percentage): ");
        double gstRate = scanner.nextDouble();

        double gstAmount = (sellingPrice * gstRate) / 100;
        double totalSellingPrice = sellingPrice + gstAmount;
        double profitOrLoss = totalSellingPrice - costPrice;

        if (profitOrLoss > 0) 
        {
            System.out.println("Congratulations! You have a profit of $" + profitOrLoss);
        } else if (profitOrLoss < 0)
        {
            System.out.println("Oops! You have a loss of $" + (-profitOrLoss));
        } else {
            System.out.println("No profit, no loss.");
        }

        scanner.close();
    }
}
