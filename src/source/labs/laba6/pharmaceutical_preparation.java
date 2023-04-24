package source.labs.laba6;

public class Pharmaceutical{
    private int id;
    private String name;
    private String manufacturer;
    private String category;
    private double price;

    // Параметрический конструктор
    public Pharmaceutical(int id,
                          String name,
                          String manufacturer,
                          String category,
                          double price) {
        this.id = id;
        this.name = name;
        this.manufacturer = manufacturer;
        this.category = category;
        this.price = price;
    }

    // Методы чтения полей
    public int get_id() {
        return id;
    }

    public String get_name() {
        return name;
    }

    public String get_manufacturer() {
        return manufacturer;
    }

    public String get_category() {
        return category;
    }

    public double get_price() {
        return price;
    }

    // Методы изменения полей
    public void set_id(int id) {
        this.id = id;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_manufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void set_category(String category) {
        this.category = category;
    }

    public void set_price(double price) {
        this.price = price;
    }

    // Метод печати
    public void print() {
        System.out.println("Код: " + id);
        System.out.println("Наименование: " + name);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Категория: " + category);
        System.out.println("price: " + price);
    }
    public class Output {
        public static void main(String[] args) {
            Pharmaceutical pharmaceutical1= new Pharmaceutical(1, "Анальгин", "Россия", "Болеутоляющие", 50.0);
            System.out.println(pharmaceutical1.get_name()); // выведет "Анальгин"
            pharmaceutical1.set_price(40.0);
            pharmaceutical1.print(); // выведет информацию о лекарстве, в том числе новую цену
        }
    }

}
