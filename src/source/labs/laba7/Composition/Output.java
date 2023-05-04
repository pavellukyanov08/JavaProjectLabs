package source.labs.laba7.Composition;

public class Output {
    public static void main(String[] args) {
        Pharmaceutical e = new Pharmaceutical();
        e.id = 10;
        e.name = "ООО Эвалар";
        e.emp.add(e.CreateEmployee(10, "Петров", 32000));
        e.emp.add(e.CreateEmployee(20, "Сидоров", 25000));
        e.emp.add(e.CreateEmployee(30, "Орлов", 33000));
        System.out.printf("%s", e);
    }
}
