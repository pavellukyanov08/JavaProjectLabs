package source.labs.laba7.Aggregation;

public class Pharmaceutical {
    int id;
    String name;
    Manufacturer InfoManufacturer;
    String category;
    double price;

    // Параметрический конструктор
    Pharmaceutical(int id,
                          String name,
                          Manufacturer manufacturer,
                          String category,
                          double price) {
        this.id = id;
        this.name = name;
        this.InfoManufacturer = manufacturer;
        this.category = category;
        this.price = price;
    }

    // Методы чтения полей
//    public int get_id() {
//        return id;
//    }
//
//    public String get_name() {
//        return name;
//    }
//
//    public String get_manufacturer() {
//        return manufacturer;
//    }
//
//    public String get_category() {
//        return category;
//    }
//
//    public double get_price() {
//        return price;
//    }
//
//    // Методы изменения полей
//    public void set_id(int id) {
//        this.id = id;
//    }
//
//    public void set_name(String name) {
//        this.name = name;
//    }
//
//    public void set_manufacturer(String manufacturer) {
//        this.manufacturer = manufacturer;
//    }
//
//    public void set_category(String category) {
//        this.category = category;
//    }
//
//    public void set_price(double price) {
//        this.price = price;
//    }
//
//    // Метод печати
//    public void print() {
//        System.out.println("Код: " + id);
//        System.out.println("Наименование: " + name);
//        System.out.println("Производитель: " + manufacturer);
//        System.out.println("Категория: " + category);
//        System.out.println("price: " + price);
//    }
}