package Edu.University.Ecommerce;

public class MainAppEcommerce {
    public static void main(String[] args) {

        Order order = new Order("JD-123-456", "Badzlina Atika");

        Order.OrderItem[] items = {
                order.new OrderItem("Lotion Slavina",  100_000, 2),
                order.new OrderItem("Micellar Water 200 ml",  85_000, 1),
                order.new OrderItem("Lip Balm",    55_000, 1),
                order.new OrderItem("Sheet Mask",             35_000, 5),
        };

        order.tampilkanRincian(items);

        System.out.printf("%nTotal pesanan anda: Rp%,.0f%n", order.getTotal());
    }
}
