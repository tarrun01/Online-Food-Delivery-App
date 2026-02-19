import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Order {

    protected int orderId;
    protected double baseAmount;
    protected String orderType;
    protected String orderDate;
    static double deliveryCharge = 40;

    // Constructor — captures today's date automatically
    public Order(int orderId, double baseAmount, String orderType) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
        this.orderType = orderType;
        this.orderDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public abstract double calculateBill();

    public double getDiscount() {
        return 0;
    }

    public void printBill() {
        System.out.println("-------------------------------");
        System.out.println("Order ID     : " + orderId);
        System.out.println("Order Type   : " + orderType);
        System.out.println("Order Date   : " + orderDate);
        System.out.println("Base Amount  : ₹" + baseAmount);
        System.out.println("Discount     : ₹" + getDiscount());
        System.out.println("Delivery     : ₹" + deliveryCharge);
        System.out.println("Total Bill   : ₹" + calculateBill());
        System.out.println("-------------------------------");
    }
}