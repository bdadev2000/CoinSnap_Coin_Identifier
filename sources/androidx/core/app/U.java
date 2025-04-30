package androidx.core.app;

import android.app.Notification;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class U {
    public static Notification.Builder a(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static Notification.Builder b(Notification.Builder builder, int i9) {
        return builder.setBadgeIconType(i9);
    }

    public static Notification.Builder c(Notification.Builder builder, boolean z8) {
        return builder.setColorized(z8);
    }

    public static Notification.Builder d(Notification.Builder builder, int i9) {
        return builder.setGroupAlertBehavior(i9);
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSettingsText(charSequence);
    }

    public static Notification.Builder f(Notification.Builder builder, String str) {
        return builder.setShortcutId(str);
    }

    public static Notification.Builder g(Notification.Builder builder, long j7) {
        return builder.setTimeoutAfter(j7);
    }
}
