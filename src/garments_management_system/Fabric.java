package garments_management_system;

public class Fabric {

    public String id;
    public String type;
    public String color;
    public double pricePerMeter;

    Fabric(String id, String type, String color, double pricePerMeter) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.pricePerMeter = pricePerMeter;
    }

    Fabric(String id, String type, String color) {
        this.id = id;
        this.type = type;
        this.color = color;

    }

    Fabric(String id, String type) {
        this.id = id;
        this.type = type;
    }

    Fabric(String id) {
        this.id = id;
    }

    void displayInformation() {
        System.out.println("---------------INFORMATION ABOUT Fabrics----------------" + "\n");
        System.out.println("The Id of this Fabrics : " + id);
        System.out.println("The Type of this Fabrics is: " + type);
        System.out.println("The Color about the Fabrics: " + color);
        System.out.println("The price of per meter of this Fabrics is: " + pricePerMeter);

    }

    double calculateCost(double meters) {
        double newPrice = pricePerMeter * meters;
        return newPrice;
    }
}
