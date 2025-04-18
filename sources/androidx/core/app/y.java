package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import java.util.List;

/* loaded from: classes.dex */
public abstract class y {
    public static NotificationChannelGroup a(String str, CharSequence charSequence) {
        s.u();
        return s.l(str, charSequence);
    }

    public static List<NotificationChannel> b(NotificationChannelGroup notificationChannelGroup) {
        List<NotificationChannel> channels;
        channels = notificationChannelGroup.getChannels();
        return channels;
    }

    public static String c(NotificationChannel notificationChannel) {
        String group;
        group = notificationChannel.getGroup();
        return group;
    }

    public static String d(NotificationChannelGroup notificationChannelGroup) {
        String id2;
        id2 = notificationChannelGroup.getId();
        return id2;
    }

    public static CharSequence e(NotificationChannelGroup notificationChannelGroup) {
        CharSequence name;
        name = notificationChannelGroup.getName();
        return name;
    }
}
