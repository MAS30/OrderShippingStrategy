import java.util.Calendar;
import java.util.Date;

public class Air implements Shipping {
    @Override
    public double getCost(Order order) {
        double weight = order.getTotalWeight();
        return weight * 3.0; // $3 per kilogram
    }

    @Override
    public Date getDate(Order order) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, 2); // Air shipping takes 2 days
        return cal.getTime();
    }
}
