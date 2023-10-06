import java.util.Date;

public class MealEntry {
    private FoodItem foodItem;
    private int quantity;
    private Date timestamp;

    public MealEntry(FoodItem foodItem, int quantity) {
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.timestamp = new Date();
    }

    // Getters for foodItem, quantity, and timestamp
}
