import java.util.HashMap;

public class FoodDatabase {
    private HashMap<String, FoodItem> foodItems = new HashMap<>();

    public void addFoodItem(String name, int calories) {
        FoodItem foodItem = new FoodItem(name, calories);
        foodItems.put(name, foodItem);
    }

    public boolean containsFoodItem(String name) {
        return foodItems.containsKey(name);
    }

    public FoodItem getFoodItem(String name) {
        return foodItems.get(name);
    }

    public Iterable<FoodItem> getAllFoodItems() {
        return foodItems.values();
    }
}
