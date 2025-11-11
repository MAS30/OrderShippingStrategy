public class Main {
    public static void main(String[] args) {
        Order order = new Order(new Ground());
        order.addItem(3);
        order.addItem(4);

        System.out.println("Ground Shipping:");
        System.out.println("Total Weight: " + order.getTotalWeight() + " kg");
        System.out.println("Shipping Cost: $" + order.getShippingCost());
        System.out.println("Delivery Date: " + order.getDeliveryDate());

        System.out.println("----------");

        order.setShippingType(new Air());
        System.out.println("Air Shipping:");
        System.out.println("Total Weight: " + order.getTotalWeight() + " kg");
        System.out.println("Shipping Cost: $" + order.getShippingCost());
        System.out.println("Delivery Date: " + order.getDeliveryDate());
    }
}
