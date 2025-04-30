package androidx.core.app;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class b0 {
    public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
        return notificationManager.getNotificationChannelGroup(str);
    }
}
