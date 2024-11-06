
package garments_management_system;

import java.util.List;


public class Inventory {
        List<Garments> garments;

    void addGarment(Garments garment) {
        garments.add(garment);
    }

    void removeGarment(String id) {
        garments.remove(id);
    }

    Garments findGarment(String id) {
        for (Garments g : garments) {
            if (g.id == id) {
                return g;
            }
        }
        return null;
    }
}
