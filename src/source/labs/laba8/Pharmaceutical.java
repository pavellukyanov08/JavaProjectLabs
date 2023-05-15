package source.labs.laba8;

public abstract class Pharmaceutical {
    int id;
    String name;
    String date_prod;
    double price;

    public Pharmaceutical(int id, String name, String date_prod, double price) {
        this.id = id;
        this.name = name;
        this.date_prod = date_prod;
        this.price = price;
    }

    public abstract void PrintInfo();

    @Override
    public String toString() {
         return id + "\n" + name + "\n" + date_prod + "\n" + price;
    }
}