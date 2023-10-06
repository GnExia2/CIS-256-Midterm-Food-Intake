import java.util.Stack;

public class DietaryGoalsStack {
    private Stack<DietaryGoal> goals = new Stack<>();

    public void pushGoal(DietaryGoal goal) {
        goals.push(goal);
    }

    public DietaryGoal popGoal() {
        if (!goals.isEmpty()) {
            return goals.pop();
        } else {
            return null; // Return null when the stack is empty
        }
    }

    public Iterable<DietaryGoal> getAllGoals() {
        return goals;
    }
}
