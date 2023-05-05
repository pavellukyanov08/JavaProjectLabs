package source.labs.laba7.Unification;

public class Medication {
    int id;
    String name;
    double price;
    PharmaceuticalCompany[] pharmaceutical;
    public Medication(int id, String name, double price, PharmaceuticalCompany[] pharmaceutical) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.pharmaceutical = pharmaceutical;
    }

    public String toString() {
        String s = String.format("Препарат № %d; название '%s'; Стоимость %10.2f р. \n",
                this.id,
                this.name,
                this.price);
        for (PharmaceuticalCompany ph : this.pharmaceutical) {
            s += ph.toString() + "\n";
        }
        return  s;
    }
}
