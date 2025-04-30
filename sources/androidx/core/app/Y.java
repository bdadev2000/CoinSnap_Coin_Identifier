package androidx.core.app;

import android.app.NotificationManager;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Y {
    public static List<StatusBarNotification> a(NotificationManager notificationManager) {
        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
        if (activeNotifications == null) {
            return new ArrayList();
        }
        return Arrays.asList(activeNotifications);
    }

    public static int b(NotificationManager notificationManager) {
        return notificationManager.getCurrentInterruptionFilter();
    }
}
