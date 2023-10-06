import java.util.LinkedList;
import java.util.Queue;

public class NotificationQueue {
    private Queue<Notification> notifications = new LinkedList<>();

    public void enqueueNotification(Notification notification) {
        notifications.offer(notification);
    }

    public Notification dequeueNotification() {
        return notifications.poll();
    }

    public Iterable<Notification> getAllNotifications() {
        return notifications;
    }
}
