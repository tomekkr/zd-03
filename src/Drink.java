class Drink {
    String name;
    int rating; // 0-10
    double price; // pln
    boolean alcohol;
    Ingredient ingredient1 = new Ingredient();
    Ingredient ingredient2 = new Ingredient();
    Ingredient ingredient3 = new Ingredient();

    void printInfo() {
        System.out.println("Drink " + name);
        System.out.println("Składniki: ");
        System.out.println("\t1. " + ingredient1.name + " - " + ingredient1.amount + "ml");
        System.out.println("\t2. " + ingredient2.name + " - " + ingredient2.amount + "ml");
        System.out.println("\t3. " + ingredient3.name + " - " + ingredient3.amount + "ml");
        System.out.println("Pojemność: " + sumIngredientsAmounts() + "ml");
        System.out.println("Zawiera alkohol: " + alcohol);
        System.out.println("Ocena: " + rating + "/10");
        System.out.println("Cena: " + price + "zł");
    }

    int sumIngredientsAmounts() {
        return ingredient1.amount + ingredient2.amount + ingredient3.amount;
    }

}
