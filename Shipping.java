import java.util.Date;

public interface Shipping {
    double getCost(Order order);
    Date getDate(Order order);
}
