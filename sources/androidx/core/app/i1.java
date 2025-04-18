package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationManager;

/* loaded from: classes.dex */
public abstract class i1 {
    public static NotificationChannel a(NotificationManager notificationManager, String str, String str2) {
        NotificationChannel notificationChannel;
        notificationChannel = notificationManager.getNotificationChannel(str, str2);
        return notificationChannel;
    }

    public static String b(NotificationChannel notificationChannel) {
        String parentChannelId;
        parentChannelId = notificationChannel.getParentChannelId();
        return parentChannelId;
    }
}
