package source.labs.laba8;

public class Medication extends Pharmaceutical {
    private String recipe;

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
            this.recipe = recipe;
    }

    public Medication(int id, String name, String date_prod, double price, String recipe) {
        super(id, name, date_prod, price);
        this.recipe = recipe;
    }

    public void PrintInfo(){
        System.out.printf("ID - %d;" +
                        "\nНаименование - %s;" +
                        "\nДата производства - %s;" +
                        "\nЦена - %.2f р.;" +
                        "\nРецепт - %s\n",
                id,
                name,
                date_prod,
                price,
                recipe);
    }
    @Override
    public String toString(){
        return  id + "\n" + name + "\n" + date_prod + "\n" + price + "\n" + recipe;
    }
}
