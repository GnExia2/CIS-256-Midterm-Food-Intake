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
                    userInterface.displayExitMessage();
                    return;
                default:
                    userInterface.displayInvalidChoiceMessage();
            }
        }
    }

    private void logMeal() {
        userInterface.displayLogMealMessage();
        String foodName = userInterface.getFoodName();
        int quantity = userInterface.getQuantity();

        if (foodDatabase.containsFoodItem(foodName)) {
            FoodItem foodItem = foodDatabase.getFoodItem(foodName);
            MealEntry mealEntry = new MealEntry(foodItem, quantity);
            mealLog.addMealEntry(mealEntry);
            userInterface.displayMealLoggedMessage();
        } else {
            userInterface.displayFoodNotFoundMessage();
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
}
