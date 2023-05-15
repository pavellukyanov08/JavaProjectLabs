package source.labs.laba7.Composition;

public class Output {
    public static void main(String[] args) {
        Pharmaceutical pharma = new Pharmaceutical();
        pharma.id = 10;
        pharma.name = "ООО Эвалар";
        pharma.med.add(pharma.CreateMedication(1, "Петров", 32000));
        pharma.med.add(pharma.CreateMedication(2, "Сидоров", 25000));
        pharma.med.add(pharma.CreateMedication(3, "Орлов", 33000));
        System.out.printf("%s", pharma);
    }
}
