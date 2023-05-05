package source.labs.laba7.Unification;

public class Output {
    public static void main(String[] args) {
        System.out.println("Препарат и фарцевтическая компания");

        PharmaceuticalCompany[] pharmaceuticals = new PharmaceuticalCompany[3];
        pharmaceuticals[0] = new PharmaceuticalCompany("Иванов Дмитрий Палович", "Эвалар", "15/05/1990");
        pharmaceuticals[1] = new PharmaceuticalCompany("Семенов Алексей Викторович", "Губернский лекарь", "05/02/2005");
        pharmaceuticals[2] = new PharmaceuticalCompany("Игнатьев Аркадий Викторович", "Фармакопейка", "01/08/2010");

        Medication med = new Medication(1, "Ношпа", 400.00, pharmaceuticals);
        System.out.println(med);
    }
}
