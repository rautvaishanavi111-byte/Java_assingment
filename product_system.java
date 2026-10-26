
class Product {
    private String productName;
    private int productId;
    private double unitPrice;
    private int quantity;
    Product(String productName, int productId,
            double unitPrice, int quantity) {
        if (unitPrice <= 0) {
            throw new IllegalArgumentException(
                "Price must be greater than zero"
            );
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException(
                "Quantity must be greater than zero"
            );
        }
        this.productName = productName;
        this.productId = productId;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    double calculateSubtotal() {
        return unitPrice * quantity;
    }
    double calculateDiscount() {
        double subtotal = calculateSubtotal();
        double percentage;
        if (subtotal < 1000) {
            percentage = 0;
        } else if (subtotal < 5000) {
            percentage = 5;
        } else if (subtotal < 10000) {
            percentage = 10;
        } else {
            percentage = 15;
        }
        return subtotal * percentage / 100;
    }
    double calculateFinalBill() {
        return calculateSubtotal() - calculateDiscount();
    }
    void displayBill() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product ID: " + productId);
        System.out.println("Subtotal: " + calculateSubtotal());
        System.out.println("Discount: " + calculateDiscount());
        System.out.println("Final Bill: " + calculateFinalBill());
    }
}
public class product_system {
    public static void main(String[] args) {
        Product p1 = new Product("Keyboard", 501, 2000, 3);
        p1.displayBill();
    }
}