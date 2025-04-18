package androidx.core.app;

import android.app.NotificationChannel;

/* loaded from: classes.dex */
public abstract class u {
    public static boolean a(NotificationChannel notificationChannel) {
        boolean canBubble;
        canBubble = notificationChannel.canBubble();
        return canBubble;
    }
}
