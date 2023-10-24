public class Main {
    public static void main(String[] args) {
        FoodIntakeTrackerApp app = new FoodIntakeTrackerApp();
        app.start();

        FoodDatabase foodDatabase = new FoodDatabase();
        foodDatabase.addFoodItem("Chicken Salad", 350); // Example food item with calories
        foodDatabase.addFoodItem("Pasta", 450);

    }
}
