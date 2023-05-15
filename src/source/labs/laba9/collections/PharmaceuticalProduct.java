package source.labs.laba9.collections;

import java.util.*;

public class PharmaceuticalProduct {
    private String name;
    private double price;
    private List<String> ingredients;
    private Map<String, Double> dosages;

    public PharmaceuticalProduct(String name, double price) {
        this.name = name;
        this.price = price;
        this.ingredients = new ArrayList<>();
        this.dosages = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void addIngredient(String ingredient) {
        this.ingredients.add(ingredient);
    }

    public Map<String, Double> getDosages() {
        return dosages;
    }

    public void addDosage(String dosageForm, double dosageStrength) {
        this.dosages.put(dosageForm, dosageStrength);
    }

    @Override
    public String toString() {
        return "Pharmaceutical Product:\n" +
                "Name: " + name + "\n" +
                "Price: " + price + "\n" +
                "Ingredients: " + ingredients + "\n" +
                "Dosages: " + dosages;
    }
    public static void main(String[] args) {
        PharmaceuticalProduct product = new PharmaceuticalProduct("Aspirin", 5.99);
        product.addIngredient("Acetylsalicylic Acid");
        product.addDosage("Tablet", 500.0);
        System.out.println(product.toString());
    }
}



