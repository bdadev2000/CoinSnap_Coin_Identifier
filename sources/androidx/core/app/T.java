package androidx.core.app;

import android.app.Notification;
import android.widget.RemoteViews;

/* loaded from: classes.dex */
public abstract class T {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z8) {
        return builder.setAllowGeneratedReplies(z8);
    }

    public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomBigContentView(remoteViews);
    }

    public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomContentView(remoteViews);
    }

    public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
        return builder.setCustomHeadsUpContentView(remoteViews);
    }

    public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
        return builder.setRemoteInputHistory(charSequenceArr);
    }
}
