package androidx.core.app;

import android.app.NotificationChannelGroup;

/* renamed from: androidx.core.app.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0421w {
    public static String a(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getDescription();
    }

    public static boolean b(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.isBlocked();
    }

    public static void c(NotificationChannelGroup notificationChannelGroup, String str) {
        notificationChannelGroup.setDescription(str);
    }
}
