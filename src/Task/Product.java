package Task;

public class Product {

    protected String name;
    protected String brand;
    protected  double price;

    public Product(){
        this("Продукт");
    }

    public Product(String name){
        this(name, 1);
    }
    public Product(String name, double price){
        this("Noname", name, price);
    }

    public String displayInfo(){
        return String.format("%s - %s - %f", brand, name, price);
    }

    public Product(String brand, String name, double price){
        System.out.println("Constructor");
        if (brand.length() < 3)
            this.brand = "Noname";
        else
            this.brand = brand;

        if (name.length() < 3)
            this.name = "Товар";
        else
            this.name = name;

        if (price <= 0)
            throw new RuntimeException("Некорректная сумма товара.");
        this.price = price;
    }

}
