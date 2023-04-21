package Task;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public Bread getBottleOfWater(String name, String ingredient) {
        for (Product product : products) {
            if (product instanceof Bread) {
                Bread packaging = ((Bread) product);
                if (packaging.name.equals(name) && packaging.getIngredient() == ingredient)
                    return packaging;
            }
            }
            return null;
        }

    }