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
    private static n1 sSideChannelManager;
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
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(o1 o1Var) {
        synchronized (sLock) {
            if (sSideChannelManager == null) {
                sSideChannelManager = new n1(this.mContext.getApplicationContext());
            }
            sSideChannelManager.f1215c.obtainMessage(0, o1Var).sendToTarget();
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
        return e1.a(this.mNotificationManager);
    }

    public boolean canUseFullScreenIntent() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29) {
            return true;
        }
        if (i10 < 34) {
            if (this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0) {
                return true;
            }
            return false;
        }
        return j1.a(this.mNotificationManager);
    }

    public void cancel(int i10) {
        cancel(null, i10);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(@NonNull NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            g1.a(this.mNotificationManager, notificationChannel);
        }
    }

    public void createNotificationChannelGroup(@NonNull a0 a0Var) {
        NotificationChannelGroup notificationChannelGroup;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            a0Var.getClass();
            notificationChannelGroup = null;
        } else {
            NotificationChannelGroup a = y.a(a0Var.a, a0Var.f1172b);
            if (i10 >= 28) {
                z.c(a, a0Var.f1173c);
            }
            notificationChannelGroup = a;
        }
        createNotificationChannelGroup(notificationChannelGroup);
    }

    public void createNotificationChannelGroups(@NonNull List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            g1.c(this.mNotificationManager, list);
        }
    }

    public void createNotificationChannelGroupsCompat(@NonNull List<a0> list) {
        NotificationChannelGroup notificationChannelGroup;
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            for (a0 a0Var : list) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 26) {
                    a0Var.getClass();
                    notificationChannelGroup = null;
                } else {
                    NotificationChannelGroup a = y.a(a0Var.a, a0Var.f1172b);
                    if (i10 >= 28) {
                        z.c(a, a0Var.f1173c);
                    }
                    notificationChannelGroup = a;
                }
                arrayList.add(notificationChannelGroup);
            }
            g1.c(this.mNotificationManager, arrayList);
        }
    }

    public void createNotificationChannels(@NonNull List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            g1.d(this.mNotificationManager, list);
        }
    }

    public void createNotificationChannelsCompat(@NonNull List<x> list) {
        if (Build.VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<x> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a());
            }
            g1.d(this.mNotificationManager, arrayList);
        }
    }

    public void deleteNotificationChannel(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            g1.e(this.mNotificationManager, str);
        }
    }

    public void deleteNotificationChannelGroup(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            g1.f(this.mNotificationManager, str);
        }
    }

    public void deleteUnlistedNotificationChannels(@NonNull Collection<String> collection) {
        if (Build.VERSION.SDK_INT >= 26) {
            Iterator<NotificationChannel> it = g1.k(this.mNotificationManager).iterator();
            while (it.hasNext()) {
                NotificationChannel j3 = s.j(it.next());
                if (!collection.contains(g1.g(j3)) && (Build.VERSION.SDK_INT < 30 || !collection.contains(i1.b(j3)))) {
                    g1.e(this.mNotificationManager, g1.g(j3));
                }
            }
        }
    }

    @NonNull
    public List<StatusBarNotification> getActiveNotifications() {
        return d1.a(this.mNotificationManager);
    }

    public int getCurrentInterruptionFilter() {
        return d1.b(this.mNotificationManager);
    }

    public int getImportance() {
        return e1.b(this.mNotificationManager);
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return g1.i(this.mNotificationManager, str);
        }
        return null;
    }

    @Nullable
    public x getNotificationChannelCompat(@NonNull String str) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str)) == null) {
            return null;
        }
        return new x(notificationChannel);
    }

    @Nullable
    public NotificationChannelGroup getNotificationChannelGroup(@NonNull String str) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            return h1.a(this.mNotificationManager, str);
        }
        if (i10 >= 26) {
            Iterator<NotificationChannelGroup> it = getNotificationChannelGroups().iterator();
            while (it.hasNext()) {
                NotificationChannelGroup k10 = s.k(it.next());
                if (g1.h(k10).equals(str)) {
                    return k10;
                }
            }
        }
        return null;
    }

    @Nullable
    public a0 getNotificationChannelGroupCompat(@NonNull String str) {
        NotificationChannelGroup notificationChannelGroup;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            NotificationChannelGroup notificationChannelGroup2 = getNotificationChannelGroup(str);
            if (notificationChannelGroup2 != null) {
                return new a0(notificationChannelGroup2);
            }
            return null;
        }
        if (i10 >= 26 && (notificationChannelGroup = getNotificationChannelGroup(str)) != null) {
            return new a0(notificationChannelGroup, getNotificationChannels());
        }
        return null;
    }

    @NonNull
    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        if (Build.VERSION.SDK_INT >= 26) {
            return g1.j(this.mNotificationManager);
        }
        return Collections.emptyList();
    }

    @NonNull
    public List<a0> getNotificationChannelGroupsCompat() {
        List<NotificationChannel> notificationChannels;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                if (i10 >= 28) {
                    notificationChannels = Collections.emptyList();
                } else {
                    notificationChannels = getNotificationChannels();
                }
                ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
                Iterator<NotificationChannelGroup> it = notificationChannelGroups.iterator();
                while (it.hasNext()) {
                    NotificationChannelGroup k10 = s.k(it.next());
                    if (Build.VERSION.SDK_INT >= 28) {
                        arrayList.add(new a0(k10));
                    } else {
                        arrayList.add(new a0(k10, notificationChannels));
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
            return g1.k(this.mNotificationManager);
        }
        return Collections.emptyList();
    }

    @NonNull
    public List<x> getNotificationChannelsCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            List<NotificationChannel> notificationChannels = getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                ArrayList arrayList = new ArrayList(notificationChannels.size());
                Iterator<NotificationChannel> it = notificationChannels.iterator();
                while (it.hasNext()) {
                    arrayList.add(new x(s.j(it.next())));
                }
                return arrayList;
            }
        }
        return Collections.emptyList();
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(int i10, @NonNull Notification notification) {
        notify(null, i10, notification);
    }

    public void cancel(@Nullable String str, int i10) {
        this.mNotificationManager.cancel(str, i10);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@Nullable String str, int i10, @NonNull Notification notification) {
        if (useSideChannelForNotification(notification)) {
            pushSideChannelQueue(new k1(this.mContext.getPackageName(), i10, str, notification));
            this.mNotificationManager.cancel(str, i10);
        } else {
            this.mNotificationManager.notify(str, i10, notification);
        }
    }

    public void createNotificationChannel(@NonNull x xVar) {
        createNotificationChannel(xVar.a());
    }

    @Nullable
    public NotificationChannel getNotificationChannel(@NonNull String str, @NonNull String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            return i1.a(this.mNotificationManager, str, str2);
        }
        return getNotificationChannel(str);
    }

    public NotificationManagerCompat(@NonNull NotificationManager notificationManager, @NonNull Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    @Nullable
    public x getNotificationChannelCompat(@NonNull String str, @NonNull String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = getNotificationChannel(str, str2)) == null) {
            return null;
        }
        return new x(notificationChannel);
    }

    @RequiresPermission("android.permission.POST_NOTIFICATIONS")
    public void notify(@NonNull List<Object> list) {
        if (list.size() <= 0) {
            return;
        }
        a4.j.t(list.get(0));
        throw null;
    }

    public void createNotificationChannelGroup(@NonNull NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            g1.b(this.mNotificationManager, notificationChannelGroup);
        }
    }
}
