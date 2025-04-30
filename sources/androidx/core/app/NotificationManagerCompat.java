package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static h0 sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    @NonNull
    public static NotificationManagerCompat from(@NonNull Context context) {
        return new NotificationManagerCompat(context);
    }

    @NonNull
    public static Set<String> getEnabledListenerPackages(@NonNull Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string != null) {
                try {
                    if (!string.equals(sEnabledNotificationListeners)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        sEnabledNotificationListenerPackages = hashSet;
                        sEnabledNotificationListeners = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(i0 i0Var) {
        synchronized (sLock) {
            try {
                if (sSideChannelManager == null) {
                    sSideChannelManager = new h0(this.mContext.getApplicationContext());
                }
                sSideChannelManager.f4407c.obtainMessage(0, i0Var).sendToTarget();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        if (extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL)) {
            return true;
        }
        return false;
    }

    public boolean areNotificationsEnabled() {
        return Z.a(this.mNotificationManager);
    }

    public boolean canUseFullScreenIntent() {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 29) {
            return true;
        }
        if (i9 < 34) {
            if (this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0) {
                return true;
            }
            return false;
        }
        return d0.a(this.mNotificationManager);
    }

    public void cancel(int i9) {
        cancel(null, i9);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(@NonNull NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            a0.a(this.mNotificationManager, notificationChannel);
        }
    }

    public void createNotificationChannelGroup(@NonNull C0422x c0422x) {
        NotificationChannelGroup notificationChannelGroup;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 26) {
            c0422x.getClass();
            notificationChannelGroup = null;
        } else {
            NotificationChannelGroup a6 = AbstractC0420v.a(c0422x.f4441a, c0422x.b);
            if (i9 >= 28) {
                AbstractC0421w.c(a6, c0422x.f4442c);
            }
            notificationChannelGroup = a6;
        }
        createNotificationChannelGroup(notificationChannelGroup);
    }

    public void createNotificationChannelGroups(@NonNull List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            a0.c(this.mNotificationManager, list);
        }
    }

    public void createNotificationChannelGroupsCompat(@NonNull List<C0422x> list) {
        NotificationChannelGroup notificationChannelGroup;
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (C0422x c0422x : list) {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 < 26) {
                    c0422x.getClass();
                    notificationChannelGroup = null;
                } else {
                    NotificationChannelGroup a6 = AbstractC0420v.a(c0422x.f4441a, c0422x.b);
                    if (i9 >= 28) {
                        AbstractC0421w.c(a6, c0422x.f4442c);
                    }
                    notificationChannelGroup = a6;
                }
                arrayList.add(notificationChannelGroup);
            }
            a0.c(this.mNotificationManager, arrayList);
        }
    }

    public void createNotificationChannels(@NonNull List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            a0.d(this.mNotificationManager, list);
        }
    }

    public void createNotificationChannelsCompat(@NonNull List<C0419u> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<C0419u> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            a0.d(this.mNotificationManager, arrayList);
        }
    }

    public void deleteNotificationChannel(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            a0.e(this.mNotificationManager, str);
        }
    }

    public void deleteNotificationChannelGroup(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            a0.f(this.mNotificationManager, str);
        }
    }

    public void deleteUnlistedNotificationChannels(@NonNull Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator<NotificationChannel> it = a0.k(this.mNotificationManager).iterator();
            while (it.hasNext()) {
                NotificationChannel c9 = V1.a.c(it.next());
                if (!collection.contains(a0.g(c9)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(c0.b(c9)))) {
                    a0.e(this.mNotificationManager, a0.g(c9));
                }
            }
        }
    }

    @NonNull
    public List<StatusBarNotification> getActiveNotifications() {
        return Y.a(this.mNotificationManager);
    }

    public int getCurrentInterruptionFilter() {
        return Y.b(this.mNotificationManager);
    }

    public int getImportance() {
        return Z.b(this.mNotificationManager);
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return a0.i(this.mNotificationManager, str);
        }
        return null;
    }

    @Nullable
    public C0419u getNotificationChannelCompat(@NonNull String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new C0419u(notificationChannel);
    }

    @Nullable
    public NotificationChannelGroup getNotificationChannelGroup(@NonNull String str) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            return b0.a(this.mNotificationManager, str);
        }
        if (i9 >= 26) {
            Iterator<NotificationChannelGroup> it = getNotificationChannelGroups().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup d2 = V1.a.d(it.next());
                if (a0.h(d2).equals(str)) {
                    return d2;
                }
            }
        }
        return null;
    }

    @Nullable
    public C0422x getNotificationChannelGroupCompat(@NonNull String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new C0422x(notificationChannelGroup2);
            }
            return null;
        }
        if (i9 >= 26 && (notificationChannelGroup = getNotificationChannelGroup(str)) != null) {
            return new C0422x(notificationChannelGroup, getNotificationChannels());
        }
        return null;
    }

    @NonNull
    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        if (Build.VERSION.SDK_INT >= 26) {
            return a0.j(this.mNotificationManager);
        }
        return Collections.emptyList();
    }

    @NonNull
    public List<C0422x> getNotificationChannelGroupsCompat() {
        List<NotificationChannel> notificationChannels;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                if (i9 >= 28) {
                    notificationChannels = Collections.emptyList();
                } else {
                    notificationChannels = getNotificationChannels();
                }
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                Iterator<NotificationChannelGroup> it = notificationChannelGroups.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup d2 = V1.a.d(it.next());
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new C0422x(d2));
                    } else {
                        arrayList.add(new C0422x(d2, notificationChannels));
                    }
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @NonNull
    public List<NotificationChannel> getNotificationChannels() {
        if (Build.VERSION.SDK_INT >= 26) {
            return a0.k(this.mNotificationManager);
        }
        return Collections.emptyList();
    }

    @NonNull
    public List<C0419u> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                Iterator<NotificationChannel> it = notificationChannels.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C0419u(V1.a.c(it.next())));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(int i9, @NonNull Notification notification) {
        notify(null, i9, notification);
    }

    public void cancel(@Nullable String str, int i9) {
        this.mNotificationManager.cancel(str, i9);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@Nullable String str, int i9, @NonNull Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new e0(this.mContext.getPackageName(), i9, str, notification));
            this.mNotificationManager.cancel(str, i9);
        } else {
            this.mNotificationManager.notify(str, i9, notification);
        }
    }

    public void createNotificationChannel(@NonNull C0419u c0419u) {
        createNotificationChannel(c0419u.a());
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return c0.a(this.mNotificationManager, str, str2);
        }
        return getNotificationChannel(str);
    }

    public NotificationManagerCompat(@NonNull NotificationManager notificationManager, @NonNull Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    @Nullable
    public C0419u getNotificationChannelCompat(@NonNull String str, @NonNull String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new C0419u(notificationChannel);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@NonNull List<Object> list) {
        if (list.size() <= 0) {
            return;
        }
        com.mbridge.msdk.foundation.entity.o.v(list.get(0));
        throw null;
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            a0.b(this.mNotificationManager, notificationChannelGroup);
        }
    }
}
