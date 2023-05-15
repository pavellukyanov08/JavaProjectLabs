package source.labs.laba7.Aggregation;

public class Medication {
    int id;
    String name;
    PharmaceuticalCompany pharmaceutical_company;
    double price;

    // Параметрический конструктор
    Medication(int id,
               String name,
               PharmaceuticalCompany pharmaceutical_company,
               double price) {
        this.id = id;
        this.name = name;
        this.pharmaceutical_company = pharmaceutical_company;
        this.price = price;
    }
}