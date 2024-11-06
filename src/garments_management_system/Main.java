
package garments_management_system;

public class Main {
        public static void main(String[] args) {
        Garments garments = new Garments("245","ABC Garments","Work with goods","1450 sqr feet","Red",20,30);
       
        garments.displayGarmentsInformation();
        
        
        
        //we can create more object for others constructor
        
        Garments garment2 = new Garments("556gdf","FGH","nais & attractive");
        garment2.displayGarmentsInformation();
        
//        double x = g1.calculateDiscountPrice(10);
//        System.out.println(x);

    }
}
