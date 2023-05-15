package source.labs.laba7.Aggregation;

public class Output {
    public static void main(String[] args) {
        PharmaceuticalCompany pc = new PharmaceuticalCompany(
                "Алтайский край",
                "Барнаул",
                "Социалистический",
                "Губернский лекарь");
        Medication pharm = new Medication(
                1,
                "Ношпа",
                pc,
                400.00);

        System.out.println("ID препарата: " + pharm.id);
        System.out.println("Название: " + pharm.name);
        System.out.println("Аптека: " + pc.comp_name);
        System.out.println(pharm.price);
    }
}