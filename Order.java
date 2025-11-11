import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Order {
    private List<Double> lineItems = new ArrayList<>(); // weights of items
    private Shipping shipping;

    public Order(Shipping shipping) {
        this.shipping = shipping;
    }

    public void addItem(double weight) {
        lineItems.add(weight);
    }

    public double getTotalWeight() {
        double total = 0;
        for (double w : lineItems) total += w;
        return total;
    }

    public double getTotal() {
        // Assume cost per kg = $10
        return getTotalWeight() * 10;
    }

    public void setShippingType(Shipping shipping) {
        this.shipping = shipping;
    }

    public double getShippingCost() {
        return shipping.getCost(this);
    }

    public Date getDeliveryDate() {
        return shipping.getDate(this);
    }
}
