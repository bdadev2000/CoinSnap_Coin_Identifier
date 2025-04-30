package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class c0 {
    public static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
        return notificationManager.getNotificationChannel(str, str2);
    }

    public static String b(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }
}
