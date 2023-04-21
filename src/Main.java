import Task.*;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product bread1 = new Bread("Булка 1", 100, "чеснок");
        Product bread2 = new Bread("Булка 2", 200, "мак");


        List<Product> products = new ArrayList<>();
        products.add(bread1);
        products.add(bread2);

        VendingMachine vendingMachine = new VendingMachine(products);

        Bread breadRes = vendingMachine.getBottleOfWater("Булка 1", "чеснок");
        if (breadRes != null){
            System.out.println("Вы купили: ");
            System.out.println(breadRes.displayInfo());
        }
        else {
            System.out.println("Такого продукта не существует!");
        }
    }
}