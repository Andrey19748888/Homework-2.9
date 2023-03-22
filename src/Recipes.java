import java.util.*;

public class Recipes {

    static Set<Recipes> recipes  = new HashSet<>();
    private Map<Product, Integer> ingredients = new HashMap<>();
    private String manyProducts;
    private double totalCost;
    private String recipeName;


    public Recipes() {
        try {
            this.addRecipes();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addIngredient(Product product, int amount) {
        if (amount <= 0) {
            amount = 1;
        }
        ingredients.put(product, amount);
        calculateCost();
    }


    public double calculateCost() {
        int totalPrice = 0;

        for (Map.Entry<Product, Integer> ingredientAndAmount : ingredients.entrySet()) {

            Product product = ingredientAndAmount.getKey();
            totalPrice = totalPrice + product.getPrice() * ingredientAndAmount.getValue();
        }

        totalCost = totalPrice;
        return totalCost;
    }

    public void addRecipes() throws Exception
    { if (!recipes.contains(this)) {
        recipes.add(this);
    } else {
        throw new Exception("Рецепты не могут иметь одинаковое название");
    }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipes recipes = (Recipes) o;
        return  Objects.equals(recipeName, recipes.recipeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeName);
    }
}




