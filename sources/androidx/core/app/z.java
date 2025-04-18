package androidx.core.app;

import android.app.NotificationChannelGroup;

/* loaded from: classes.dex */
public abstract class z {
    public static String a(NotificationChannelGroup notificationChannelGroup) {
        String description;
        description = notificationChannelGroup.getDescription();
        return description;
    }

    public static boolean b(NotificationChannelGroup notificationChannelGroup) {
        boolean isBlocked;
        isBlocked = notificationChannelGroup.isBlocked();
        return isBlocked;
    }

    public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
        notificationChannelGroup.setDescription(str);
    }
}
