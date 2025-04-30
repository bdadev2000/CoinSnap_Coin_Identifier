package androidx.core.app;

import android.app.NotificationChannel;

/* renamed from: androidx.core.app.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0418t {
    public static String a(NotificationChannel notificationChannel) {
        return notificationChannel.getConversationId();
    }

    public static String b(NotificationChannel notificationChannel) {
        return notificationChannel.getParentChannelId();
    }

    public static boolean c(NotificationChannel notificationChannel) {
        return notificationChannel.isImportantConversation();
    }

    public static void d(NotificationChannel notificationChannel, String str, String str2) {
        notificationChannel.setConversationId(str, str2);
    }
}
