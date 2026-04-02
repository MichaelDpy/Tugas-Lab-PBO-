package edu.ecommerce;

public class MainAppEcommerce {

    public static void main(String[] args) {

        Order order = new Order("ORD-2024-001", "Budi Santoso");

        Order.OrderItem[] items = {
            order.new OrderItem("Laptop ASUS VivoBook",  8_500_000, 1),
            order.new OrderItem("Mouse Wireless Logitech",  250_000, 2),
            order.new OrderItem("Keyboard Mechanical",    450_000, 1),
            order.new OrderItem("Mousepad XL",             85_000, 1),
        };

        order.tampilkanRincian(items);

        System.out.printf("%nTotal pesanan berhasil dihitung: Rp%,.0f%n", order.getTotal());
    }
}
