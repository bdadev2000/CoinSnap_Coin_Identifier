package androidx.core.app;

import android.app.Notification;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class y0 {
    public static Notification.Builder a(Context context, String str) {
        a4.j.s();
        return s.i(context, str);
    }

    public static Notification.Builder b(Notification.Builder builder, int i10) {
        Notification.Builder badgeIconType;
        badgeIconType = builder.setBadgeIconType(i10);
        return badgeIconType;
    }

    public static Notification.Builder c(Notification.Builder builder, boolean z10) {
        Notification.Builder colorized;
        colorized = builder.setColorized(z10);
        return colorized;
    }

    public static Notification.Builder d(Notification.Builder builder, int i10) {
        Notification.Builder groupAlertBehavior;
        groupAlertBehavior = builder.setGroupAlertBehavior(i10);
        return groupAlertBehavior;
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
        Notification.Builder settingsText;
        settingsText = builder.setSettingsText(charSequence);
        return settingsText;
    }

    public static Notification.Builder f(Notification.Builder builder, String str) {
        Notification.Builder shortcutId;
        shortcutId = builder.setShortcutId(str);
        return shortcutId;
    }

    public static Notification.Builder g(Notification.Builder builder, long j3) {
        Notification.Builder timeoutAfter;
        timeoutAfter = builder.setTimeoutAfter(j3);
        return timeoutAfter;
    }
}
