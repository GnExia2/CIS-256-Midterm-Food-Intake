import java.util.LinkedList;

public class MealLog {
    private LinkedList<MealEntry> mealEntries = new LinkedList<>();

    public void addMealEntry(MealEntry mealEntry) {
        mealEntries.add(mealEntry);
    }

    public Iterable<MealEntry> getAllMealEntries() {
        return mealEntries;
    }
}
