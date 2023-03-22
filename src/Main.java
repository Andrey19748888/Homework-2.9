public class Main {
    public static void main(String[] args) {

        Product kiwi = new Product(20, 4.1, "киви");
        Product kiwi2 = new Product(40,4.1,"киви");

        System.out.println(kiwi);
        System.out.println(kiwi2);

        try {
            kiwi.addProduct(3);

            System.out.println(Product.products);

            kiwi2.addProduct();

            System.out.println(Product.products);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }



        Recipes greekSalad = new Recipes();
        Product cheese = new Product(2,200,"сыр");
        Product salad = new Product(1,50, "салат");

        greekSalad.addIngredient(cheese,-3);
        greekSalad.addIngredient(salad,2);

        System.out.println("стоимость рецепта " + greekSalad.calculateCost());

        try {
            greekSalad.addRecipes();

            System.out.println();

            greekSalad.addRecipes();

            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }






    }
}