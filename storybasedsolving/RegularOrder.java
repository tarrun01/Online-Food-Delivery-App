public class RegularOrder extends Order {

    // Constructor
    public RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount, "Regular");
    }
    @Override
    public double calculateBill() {
        orderType = "Regular"; 
        return baseAmount + deliveryCharge;
    }
}
