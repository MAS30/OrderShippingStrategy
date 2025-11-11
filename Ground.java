import java.util.Calendar;
import java.util.Date;

public class Ground implements Shipping {
    @Override
    public double getCost(Order order) {
        double total = order.getTotal();
        if (total > 100) {
            return 0; // Free shipping for big orders
        }
        double weight = order.getTotalWeight();
        return Math.max(10, weight * 1.5); // $1.5/kg, minimum $10
    }

    @Override
    public Date getDate(Order order) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 5); // Ground shipping takes 5 days
        return cal.getTime();
    }
}
