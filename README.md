# 🍔 Online Food Delivery App — Backend

A simple Java backend that calculates food order bills using OOP concepts like Inheritance, Abstraction, and Polymorphism.

---

## 📁 Project Structure

```
FoodDelivery/
├── Order.java          # Abstract base class
├── RegularOrder.java   # Subclass — no discount
├── PremiumOrder.java   # Subclass — 20% discount
└── Main.java           # Entry point with user input
```

---

## ⚙️ How It Works

- `Order` is an abstract class with fields `orderId`, `baseAmount`, `orderType`, `orderDate`, and a static `deliveryCharge = ₹40`.
- `RegularOrder` extends `Order` — no discount applied.
- `PremiumOrder` extends `Order` — applies a 20% discount on base amount.
- `calculateBill()` is overridden in each subclass (polymorphism).
- Order date is automatically set to today's date.

---

## 💡 Bill Calculation

| Order Type | Formula |
|------------|---------|
| Regular    | `baseAmount + deliveryCharge` |
| Premium    | `(baseAmount - 20%) + deliveryCharge` |

---

## 🚀 How to Run

**1. Compile**
```bash
javac Order.java RegularOrder.java PremiumOrder.java Main.java
```

**2. Run**
```bash
java Main
```

---

## 🖥️ Sample Input / Output

```
Enter number of orders: 1

--- Order 1 ---
Enter Order ID       : 101
Enter Base Amount (₹): 500
Order Type (1 = Regular / 2 = Premium): 2

========== BILL SUMMARY ==========
-------------------------------
Order ID     : 101
Order Type   : Premium
Order Date   : 20-02-2026
Base Amount  : ₹500.0
Discount     : ₹100.0
Delivery     : ₹40.0
Total Bill   : ₹440.0
-------------------------------
```

---

## 🧠 OOP Concepts Used

- **Abstraction** — `Order` is abstract with `calculateBill()` as an abstract method.
- **Inheritance** — `RegularOrder` and `PremiumOrder` extend `Order`.
- **Polymorphism** — `calculateBill()` and `getDiscount()` behave differently per subclass.
- **Static Variable** — `deliveryCharge` is shared across all orders.

---

## 📋 Requirements

- Java 8 or above
