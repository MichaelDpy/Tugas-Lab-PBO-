package edu.ecommerce;

public class Order {

    private String orderId;
    private String customerName;
    private double total;

    public Order(String orderId, String customerName) {
        this.orderId      = orderId;
        this.customerName = customerName;
        this.total        = 0.0;
    }

    public String getOrderId()       { return orderId; }
    public String getCustomerName()  { return customerName; }
    public double getTotal()         { return total; }

    public double hitungTotal(OrderItem[] items) {
        total = 0.0;
        for (OrderItem item : items) {
            total += item.getSubtotal();
        }
        return total;
    }

    public void tampilkanRincian(OrderItem[] items) {
        System.out.println("╔══════════════════════════════════════════════════════════════╗");
        System.out.printf ("║  Order ID     : %-44s║%n", orderId);
        System.out.printf ("║  Customer     : %-44s║%n", customerName);
        System.out.println("╠══════════════════════════════════════════════════════════════╣");
        System.out.printf ("║  %-22s %10s %8s %15s║%n",
                "Produk", "Harga", "Qty", "Subtotal");
        System.out.println("╠══════════════════════════════════════════════════════════════╣");

        for (OrderItem item : items) {
            System.out.printf("║  %-22s Rp%,8.0f %8d Rp%,13.0f║%n",
                    item.getProductName(),
                    item.getPrice(),
                    item.getQuantity(),
                    item.getSubtotal());
        }

        hitungTotal(items);
        System.out.println("╠══════════════════════════════════════════════════════════════╣");
        System.out.printf ("║  %-42s Rp%,13.0f║%n", "TOTAL", total);
        System.out.println("╚══════════════════════════════════════════════════════════════╝");
    }

    public class OrderItem {

        private String productName;
        private double price;
        private int    quantity;

        public OrderItem(String productName, double price, int quantity) {
            this.productName = productName;
            this.price       = price;
            this.quantity    = quantity;
        }

        public double getSubtotal() {
            return price * quantity;
        }
        public String getProductName() { return productName; }
        public double getPrice()       { return price; }
        public int    getQuantity()    { return quantity; }
    }
}
