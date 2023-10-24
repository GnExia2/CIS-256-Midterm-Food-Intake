import java.util.Scanner;

public class FoodIntakeTrackerApp {
    private FoodDatabase foodDatabase;
    private MealLog mealLog;
    private DietaryGoalsStack dietaryGoalsStack;
    private NotificationQueue notificationQueue;
    private UserInterface userInterface;

    public FoodIntakeTrackerApp() {
        foodDatabase = new FoodDatabase();
        mealLog = new MealLog();
        dietaryGoalsStack = new DietaryGoalsStack();
        notificationQueue = new NotificationQueue();
        userInterface = new UserInterface(new Scanner(System.in));

        foodDatabase.addFoodItem("Chicken Salad", 350);
        foodDatabase.addFoodItem("Pasta", 450);
        foodDatabase.addFoodItem("Pizza", 300);
        foodDatabase.addFoodItem("Burger", 600);
        foodDatabase.addFoodItem("Fried Rice", 400);
        foodDatabase.addFoodItem("Salmon", 250);
        foodDatabase.addFoodItem("Steak", 700);
        foodDatabase.addFoodItem("Eggs", 70);
        foodDatabase.addFoodItem("Yogurt", 120);
        foodDatabase.addFoodItem("Apple", 80);
        foodDatabase.addFoodItem("Banana", 105);
        foodDatabase.addFoodItem("Orange", 62);
        foodDatabase.addFoodItem("Carrots", 41);
        foodDatabase.addFoodItem("Broccoli", 55);
        

    }

    public void start() {
        while (true) {
            userInterface.displayMenu();
            int choice = userInterface.getUserChoice();

            switch (choice) {
                case 1:
                    logMeal();
                    break;
                case 2:
                    setDietaryGoal();
                    break;
                case 3:
                    scheduleNotification();
                    break;
                case 4:
                    viewDietaryGoals();
                    break;
                case 5:
                    receiveNotifications();
                    break;
                case 6:
                    viewAllMeals();
                    break;
                case 7:
                    userInterface.displayExitMessage();
                    return;
                default:
                    userInterface.displayInvalidChoiceMessage();
            }        }
    }

    private void logMeal() {
        userInterface.displayLogMealMessage();
        String foodName = userInterface.getFoodName();
        int quantity = userInterface.getQuantity();
        int calories = userInterface.getCalories();
    
        if (foodDatabase.containsFoodItem(foodName)) {
            FoodItem foodItem = foodDatabase.getFoodItem(foodName);
            MealEntry mealEntry = new MealEntry(foodItem, quantity, calories);
            mealLog.addMealEntry(mealEntry);
            userInterface.displayMealLoggedMessage();
        } else {
            // Food item not found in the database, so add it and then log the meal
            userInterface.displayFoodNotFoundMessage();
            // Add the food item to the database
            foodDatabase.addFoodItem(foodName, calories);
            // Create a meal entry
            FoodItem newFoodItem = foodDatabase.getFoodItem(foodName);
            MealEntry mealEntry = new MealEntry(newFoodItem, quantity, calories);
            mealLog.addMealEntry(mealEntry);
            userInterface.displayMealLoggedMessage();
        }
    }

    private void setDietaryGoal() {
        userInterface.displaySetDietaryGoalMessage();
        String goalDescription = userInterface.getDietaryGoalDescription();
        DietaryGoal goal = new DietaryGoal(goalDescription);
        dietaryGoalsStack.pushGoal(goal);
        userInterface.displayGoalSetMessage();
    }

    private void scheduleNotification() {
        userInterface.displayScheduleNotificationMessage();
        String message = userInterface.getNotificationMessage();
        Notification notification = new Notification(message);
        notificationQueue.enqueueNotification(notification);
        userInterface.displayNotificationScheduledMessage();
    }

    private void viewDietaryGoals() {
        userInterface.displayDietaryGoals(dietaryGoalsStack.getAllGoals());
    }

    

    private void receiveNotifications() {
        userInterface.displayNotifications(notificationQueue.getAllNotifications());
    }
    
    private void viewAllMeals() {
        Iterable<MealEntry> meals = mealLog.getAllMealEntries();

        userInterface.displayAllMealsTitle();

        Iterable<MealEntry> allMeals = mealLog.getAllMealEntries();
    
        for (MealEntry mealEntry : allMeals) {
            userInterface.displayMealEntry(mealEntry);
        }
    
        // Calculate and display the calorie summary
        int totalCalories = mealLog.calculateTotalCalories();
        userInterface.displayCalorieSummary(totalCalories);
    

        System.out.println("All Logged Meals:");
        for (MealEntry meal : meals) {
            System.out.println("Food: " + meal.getFoodItem().getName());
            System.out.println("Quantity: " + meal.getQuantity());
            System.out.println("Calories: " + meal.getCalories());
            System.out.println("Timestamp: " + meal.getTimestamp());
            System.out.println("------------------------");
        }
    }

}
