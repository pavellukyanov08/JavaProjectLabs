package source.labs.laba9_collections;

public class PharmaceuticalProductCollection {
  private ArrayList<PharmaceuticalProduct> products;

  public PharmaceuticalProductCollection() {
    products = new ArrayList<>();
  }

  public void addProduct(PharmaceuticalProduct product) {
    products.add(product);
  }

  public void removeProduct(PharmaceuticalProduct product) {
    products.remove(product);
  }

  public ArrayList<PharmaceuticalProduct> getProducts() {
    return products;
  }

  // Other methods for managing the product collection

  public static void main(String[] args) {
    PharmaceuticalProductCollection productCollection = new PharmaceuticalProductCollection();

    PharmaceuticalProduct product1 = new PharmaceuticalProduct("Ibuprofen", "Advil", "Pfizer");
    PharmaceuticalProduct product2 = new PharmaceuticalProduct(500, "Motrin", "Johnson & Johnson");

    productCollection.addProduct(product1);
    productCollection.addProduct(product2);

    for (PharmaceuticalProduct product : productCollection.getProducts()) {
      System.out.println(product.getBrandName() + " contains " + product.getActiveIngredient() + " and is made by " + product.getManufacturer());
    }
  }
}
