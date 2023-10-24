import java.util.Date;

public class MealEntry {
    private FoodItem foodItem;
    private int quantity;
    private int calories; // New field to store calories.
    private Date timestamp;

    public MealEntry(FoodItem foodItem, int quantity, int calories) {
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.calories = calories; // Initialize the calories field.
        this.timestamp = new Date();
    }

    public FoodItem getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(FoodItem foodItem) {
        this.foodItem = foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}