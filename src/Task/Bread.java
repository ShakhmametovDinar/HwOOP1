package Task;

public class Bread extends Product {
    private String ingredient;

    public String getIngredient(){ return ingredient;}

    public Bread(String name, double price, String ingredient){
        super(name, price);
        this.ingredient = ingredient;


    }


    @Override
    public String displayInfo() {

        return String.format("%s - %s - %s ", name, price, ingredient);}
}
