import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;

    public UserInterface(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMenu() {
        System.out.println("\nFood Intake Tracker Menu:");
        System.out.println("1. Log Meal");
        System.out.println("2. Set Dietary Goal");
        System.out.println("3. Schedule Notification");
        System.out.println("4. View Dietary Goals");
        System.out.println("5. Receive Notifications");
        System.out.println("6. View All Meals");
        System.out.println("7. Exit");
        System.out.print("Enter your choice: ");
    }

    public int getUserChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        return choice;
    }

    public void displayLogMealMessage() {
        System.out.println("Log a Meal:");
        System.out.print("Enter the food item name: ");
    }

    public String getFoodName() {
        return scanner.nextLine();
    }

    public int getCalories() {
        System.out.print("Enter the number of calories: ");
        return scanner.nextInt();
    }

    public int getQuantity() {
        System.out.print("Enter the quantity: ");
        return scanner.nextInt();
    }

    public void displayMealLoggedMessage() {
        System.out.println("Meal logged successfully.");
    }

    public void displayFoodNotFoundMessage() {
        System.out.println("Food item not found in the database.");
    }

    public void displaySetDietaryGoalMessage() {
        System.out.println("Set a Dietary Goal:");
        System.out.print("Enter your dietary goal: ");
    }

    public String getDietaryGoalDescription() {
        return scanner.nextLine();
    }

    public void displayGoalSetMessage() {
        System.out.println("Dietary goal set successfully.");
    }

    public void displayScheduleNotificationMessage() {
        System.out.println("Schedule a Notification:");
        System.out.print("Enter the notification message: ");
    }

    public String getNotificationMessage() {
        return scanner.nextLine();
    }

    public void displayNotificationScheduledMessage() {
        System.out.println("Notification scheduled successfully.");
    }

    public void displayDietaryGoals(Iterable<DietaryGoal> goals) {
        System.out.println("Dietary Goals:");
        for (DietaryGoal goal : goals) {
            System.out.println("- " + goal.getDescription());
        }
    }

    public void displayNotifications(Iterable<Notification> notifications) {
        System.out.println("Notifications:");
        for (Notification notification : notifications) {
            System.out.println("- " + notification.getMessage());
        }
    }

    public void displayExitMessage() {
        System.out.println("Exiting Food Intake Tracker. Goodbye!");
    }

    public void displayInvalidChoiceMessage() {
        System.out.println("Invalid choice. Please try again.");
    }
}
