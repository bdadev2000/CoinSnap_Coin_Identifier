package androidx.core.app;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class C {
    public static int a(Notification notification) {
        return notification.getBadgeIconType();
    }

    public static String b(Notification notification) {
        return notification.getChannelId();
    }

    public static int c(Notification notification) {
        return notification.getGroupAlertBehavior();
    }

    public static CharSequence d(Notification notification) {
        return notification.getSettingsText();
    }

    public static String e(Notification notification) {
        return notification.getShortcutId();
    }

    public static long f(Notification notification) {
        return notification.getTimeoutAfter();
    }
}
