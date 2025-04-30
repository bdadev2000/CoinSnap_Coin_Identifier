package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import java.util.List;

/* renamed from: androidx.core.app.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0420v {
    public static NotificationChannelGroup a(String str, CharSequence charSequence) {
        return new NotificationChannelGroup(str, charSequence);
    }

    public static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getChannels();
    }

    public static String c(NotificationChannel notificationChannel) {
        return notificationChannel.getGroup();
    }

    public static String d(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getId();
    }

    public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
        return notificationChannelGroup.getName();
    }
}
