public class PremiumOrder extends Order {

    private static final double DISCOUNT_RATE = 0.20; // 20% discount

    // Automatically passes "Premium" as order type
    public PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount, "Premium");
    }

    // Returns the discount amount
    @Override
    public double getDiscount() {
        return baseAmount * DISCOUNT_RATE;
    }

    // 20% discount on baseAmount, then add deliveryCharge
    @Override
    public double calculateBill() {
        return (baseAmount - getDiscount()) + deliveryCharge;
    }
}