
package garments_management_system;

public class Customer {
        public String customerId;
    public String name;
    public String email;
    public String phone;

    void placeOrder(Order order) {
        order.printOrderDetails();
        System.out.println("Order Placed");
    }

//    List<Order> viewOrders() {
//        
//    }
}
