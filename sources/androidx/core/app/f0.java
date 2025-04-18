package androidx.core.app;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class f0 {
    public static int a(Notification notification) {
        int badgeIconType;
        badgeIconType = notification.getBadgeIconType();
        return badgeIconType;
    }

    public static String b(Notification notification) {
        String channelId;
        channelId = notification.getChannelId();
        return channelId;
    }

    public static int c(Notification notification) {
        int groupAlertBehavior;
        groupAlertBehavior = notification.getGroupAlertBehavior();
        return groupAlertBehavior;
    }

    public static CharSequence d(Notification notification) {
        CharSequence settingsText;
        settingsText = notification.getSettingsText();
        return settingsText;
    }

    public static String e(Notification notification) {
        String shortcutId;
        shortcutId = notification.getShortcutId();
        return shortcutId;
    }

    public static long f(Notification notification) {
        long timeoutAfter;
        timeoutAfter = notification.getTimeoutAfter();
        return timeoutAfter;
    }
}
