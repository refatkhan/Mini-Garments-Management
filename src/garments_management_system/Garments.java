
package garments_management_system;


    public class Garments {
    public String id,name,description,size,color;
//    public String name;
//    public String description;
//    public String size;
//    public String color;
    public double price;
    public int stockQuantity;
    
    Garments(String id, String name,String description,String size,String color, double price, int stockQuantity){
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
        this.color = color;
        this.price = price;
        this.stockQuantity = stockQuantity;
    
    }
    
    void displayGarmentsInformation(){
    
        System.out.println("The Id of this Garments: " +id);
        System.out.println("The Name of this Garments is: " +name);
        System.out.println("The description about this Garments: " +description);
        System.out.println("The size of per flor of this Garments is: " +size);
        System.out.println("The Color of this Garments is : " +color);
        System.out.println("The Price of this Garments is near about: " +price+"cores");
        System.out.println("The Stock Quantity of this Garments is: " +stockQuantity);
    
    
    }
    
    //in previous we create a method for stock quantity
//    void updateStock(int quantity) {
//        this.stockQuantity = quantity;
//    }

    double calculateDiscountPrice(double discountPercentage) {
        double discount = price * (discountPercentage / 100);
        return discount;
    }
}
