package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s {
    public static /* synthetic */ Notification.Builder i(Context context, String str) {
        return new Notification.Builder(context, str);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel j(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* bridge */ /* synthetic */ NotificationChannelGroup k(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    public static /* synthetic */ NotificationChannelGroup l(String str, CharSequence charSequence) {
        return new NotificationChannelGroup(str, charSequence);
    }

    public static /* synthetic */ void u() {
    }
}
