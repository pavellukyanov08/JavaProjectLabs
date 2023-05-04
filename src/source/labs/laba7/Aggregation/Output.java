package source.labs.laba7.Aggregation;

public class Output {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer(
                "Алтайский край",
                "Барнаул",
                "Социалистический",
                "ООО Эвалар");
        Pharmaceutical pharm = new Pharmaceutical(
                1,
                "Ношпа",
                manufacturer,
                "Лекарство",
                400.0);

        System.out.println(pharm.id);
        System.out.println(pharm.name);
        System.out.println(pharm.InfoManufacturer.region);
        System.out.println(pharm.InfoManufacturer.city);
        System.out.println(pharm.InfoManufacturer.street);
        System.out.println(pharm.InfoManufacturer.name);
    }
}