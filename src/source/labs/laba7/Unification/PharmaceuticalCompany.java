package source.labs.laba7.Unification;


public class PharmaceuticalCompany {
    String owner;
    String name;
    String date_foundation;

    public PharmaceuticalCompany(String owner, String name, String date_foundation) {
        this.owner = owner;
        this.name = name;
        this.date_foundation = date_foundation;
    }

    public String toString() {
        return String.format("Владелец: %s/t, название: %s\t дата основания: %s\t",
                this.owner,
                this.name,
                this.date_foundation);
    }
}
