package source.labs.laba6;

public class Output {
    public static void main(String[] args) {
        Pharmaceutical pharmaceutical1= new Pharmaceutical(1, "Анальгин", "Россия", "Болеутоляющие", 50.0);
        System.out.println(pharmaceutical1.get_name()); // выведет "Анальгин"
        pharmaceutical1.set_price(40.0);
        pharmaceutical1.print(); // выведет информацию о лекарстве, в том числе новую цену
    }
}