package source.labs.laba9.generalized;

public class PharmaceuticalProduct<T> {
  private T activeIngredient;
  private String name;
  private String manufacturer;
  private double price;

  public PharmaceuticalProduct(T activeIngredient, String name, String manufacturer, double price) {
    this.activeIngredient = activeIngredient;
    this.name = name;
    this.manufacturer = manufacturer;
    this.price = price;
  }

  public T getActiveIngredient() {
    return activeIngredient;
  }

  public void setActiveIngredient(T activeIngredient) {
    this.activeIngredient = activeIngredient;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // Other methods for managing the pharmaceutical product

  public static void main(String[] args) {
    PharmaceuticalProduct<String> product1 = new PharmaceuticalProduct<>(
            "Дротаверин",
            "Но шпа",
            "Opella Helskea Commercial",
            300.00);
    PharmaceuticalProduct<Integer> product2 = new PharmaceuticalProduct<>(
            500,
            "Motrin",
            "Apteka.ru",
            300.00);

    System.out.println("Лекарство " + "'" + product1.getName() + "'" +
            " включающее в себя " + "'" + product1.getActiveIngredient() + "'" + ". " +
            "Производитель: " + product1.getManufacturer());
    System.out.println("Лекарство " + "'" + product1.getName() + "'" +
            " включающее в себя " + "'" + product1.getActiveIngredient() + "'" + ". " +
            "Производитель: " + product1.getManufacturer());
  }
}


