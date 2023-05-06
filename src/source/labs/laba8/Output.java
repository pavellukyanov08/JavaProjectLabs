package source.labs.laba8;

public class Output {
    public static void main(String[] args) {
         Medication med = new Medication(1, "Нопша", "17.03.2023", 400.00, "Lorem ipsum dolor sit amet.");

         med.PrintInfo();
        System.out.print("\n" + med.toString());
    }
}
