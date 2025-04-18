package androidx.core.app;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g1 {
    public static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public static void b(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
        notificationManager.createNotificationChannelGroup(notificationChannelGroup);
    }

    public static void c(NotificationManager notificationManager, List<NotificationChannelGroup> list) {
        notificationManager.createNotificationChannelGroups(list);
    }

    public static void d(NotificationManager notificationManager, List<NotificationChannel> list) {
        notificationManager.createNotificationChannels(list);
    }

    public static void e(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannel(str);
    }

    public static void f(NotificationManager notificationManager, String str) {
        notificationManager.deleteNotificationChannelGroup(str);
    }

    public static String g(NotificationChannel notificationChannel) {
        String id2;
        id2 = notificationChannel.getId();
        return id2;
    }

    public static String h(NotificationChannelGroup notificationChannelGroup) {
        String id2;
        id2 = notificationChannelGroup.getId();
        return id2;
    }

    public static NotificationChannel i(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel;
        notificationChannel = notificationManager.getNotificationChannel(str);
        return notificationChannel;
    }

    public static List<NotificationChannelGroup> j(NotificationManager notificationManager) {
        List<NotificationChannelGroup> notificationChannelGroups;
        notificationChannelGroups = notificationManager.getNotificationChannelGroups();
        return notificationChannelGroups;
    }

    public static List<NotificationChannel> k(NotificationManager notificationManager) {
        List<NotificationChannel> notificationChannels;
        notificationChannels = notificationManager.getNotificationChannels();
        return notificationChannels;
    }
}
