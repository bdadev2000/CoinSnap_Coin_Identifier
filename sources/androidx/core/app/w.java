package androidx.core.app;

import android.app.NotificationChannel;

/* loaded from: classes.dex */
public abstract class w {
    public static String a(NotificationChannel notificationChannel) {
        String conversationId;
        conversationId = notificationChannel.getConversationId();
        return conversationId;
    }

    public static String b(NotificationChannel notificationChannel) {
        String parentChannelId;
        parentChannelId = notificationChannel.getParentChannelId();
        return parentChannelId;
    }

    public static boolean c(NotificationChannel notificationChannel) {
        boolean isImportantConversation;
        isImportantConversation = notificationChannel.isImportantConversation();
        return isImportantConversation;
    }

    public static void d(NotificationChannel notificationChannel, String str, String str2) {
        notificationChannel.setConversationId(str, str2);
    }
}
