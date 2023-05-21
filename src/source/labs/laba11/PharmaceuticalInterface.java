package source.labs.laba11;

public interface PharmaceuticalInterface {

    void id();

    void name();

    void date_prod();

    void price();

    void manufacturer();
}

class Medicine implements PharmaceuticalInterface {
    private int id;
    private String name;
    private String date_prod;
    private double price;
    private String manufacturer;

    public Medicine(int id, String name, String date_prod, double price, String manufacturer) {
        this.id = id;
        this.name = name;
        this.date_prod = date_prod;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    @Override
    public void id() {
        System.out.println("Идентификатор препарата: " + id);
    }

    @Override
    public void name() {
        System.out.println("Наименование препарата: " + name);
        // Логика упаковки препарата
    }

    @Override
    public void date_prod() {
        System.out.println("Дата производства: " + date_prod);
    }

    @Override
    public void price() {
        System.out.println("Стоимость препарата: " + price);
    }

    @Override
    public void manufacturer() {
        System.out.println("Производитель: " + manufacturer);
    }
    public static void main(String[] args) {
        Medicine medicine = new Medicine(10, "Аспирин", "16.05.2023", 400.00, "Apteka.ru");
        medicine.id();
        medicine.name();
        medicine.date_prod();
        medicine.price();
        medicine.manufacturer();
    }
}


