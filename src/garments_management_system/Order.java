
package garments_management_system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
        public String orderId;
    public Date orderDate;
    public List<Garments> garments = new ArrayList<>();
    private double totalAmount;

    void addGarment(Garments garment) {
        garments.add(garment);
    }

    double calculateTotalAmount() {
        for (Garments g : garments) {
            totalAmount = totalAmount + g.price;
        }
        return totalAmount;
    }

    void printOrderDetails() {
        System.out.println("--------------------------");
        System.out.println("Order Details");
        System.out.println("--------------------------");
        for (Garments g : garments) {
            System.out.println("Name: " + g.name);
            System.out.println("Price: " + g.price);
            System.out.println("Description: " + g.description);
            System.out.println("--------------------------");
        }
    }
}
