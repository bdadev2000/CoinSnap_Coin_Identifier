package androidx.core.app;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class b1 {
    public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z10) {
        Notification.Action.Builder authenticationRequired;
        authenticationRequired = builder.setAuthenticationRequired(z10);
        return authenticationRequired;
    }

    public static Notification.Builder b(Notification.Builder builder, int i10) {
        Notification.Builder foregroundServiceBehavior;
        foregroundServiceBehavior = builder.setForegroundServiceBehavior(i10);
        return foregroundServiceBehavior;
    }
}
