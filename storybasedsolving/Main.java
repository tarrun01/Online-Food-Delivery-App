import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("===== ONLINE FOOD DELIVERY APP =====\n");

        System.out.print("Enter number of orders: ");
        int n = sc.nextInt();

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Order " + (i + 1) + " ---");

            System.out.print("Enter Order ID       : ");
            int orderId = sc.nextInt();

            System.out.print("Enter Base Amount (₹): ");
            double baseAmount = sc.nextDouble();

            System.out.print("Order Type (1 = Regular / 2 = Premium): ");
            int type = sc.nextInt();

            if (type == 1) {
                orders[i] = new RegularOrder(orderId, baseAmount);
            } else if (type == 2) {
                orders[i] = new PremiumOrder(orderId, baseAmount);
            } else {
                System.out.println("Invalid type! Defaulting to Regular Order.");
                orders[i] = new RegularOrder(orderId, baseAmount);
            }
        }

        System.out.println("\n========== BILL SUMMARY ==========");
        for (Order order : orders) {
            order.printBill();
        }

        sc.close();
    }
}
