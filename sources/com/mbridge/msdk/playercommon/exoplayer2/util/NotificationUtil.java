package com.mbridge.msdk.playercommon.exoplayer2.util;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import com.bykv.vk.openvk.component.video.zp.jU.a;
import com.google.ar.core.G;

/* loaded from: classes3.dex */
public final class NotificationUtil {
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;

    /* loaded from: classes3.dex */
    public @interface Importance {
    }

    private NotificationUtil() {
    }

    public static void createNotificationChannel(Context context, String str, int i9, int i10) {
        if (Util.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            a.B();
            notificationManager.createNotificationChannel(G.d(i10, str, context.getString(i9)));
        }
    }

    public static void setNotification(Context context, int i9, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notification != null) {
            notificationManager.notify(i9, notification);
        } else {
            notificationManager.cancel(i9);
        }
    }
}
