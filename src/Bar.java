public class Bar {
    public static void main(String[] args) {
        Drink drink1 = new Drink();

        drink1.name = "Pomarańczowo-cytrynowy";
        drink1.ingredient1.name = "Sok pomarańczowy";
        drink1.ingredient1.amount = 200;
        drink1.ingredient2.name = "Sok cytrynowy";
        drink1.ingredient2.amount = 30;
        drink1.ingredient3.name = "Wódka";
        drink1.ingredient3.amount = 50;
        drink1.alcohol = true;
        drink1.price = 24.50;
        drink1.rating = 7;

        drink1.printInfo();
        drink1.printAmount();

    }
}
