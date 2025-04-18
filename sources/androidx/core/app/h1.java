package androidx.core.app;

import android.app.NotificationChannelGroup;
import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class h1 {
    public static NotificationChannelGroup a(NotificationManager notificationManager, String str) {
        NotificationChannelGroup notificationChannelGroup;
        notificationChannelGroup = notificationManager.getNotificationChannelGroup(str);
        return notificationChannelGroup;
    }
}
