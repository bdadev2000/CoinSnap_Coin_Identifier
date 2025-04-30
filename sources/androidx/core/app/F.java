package androidx.core.app;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class F {
    public static boolean a(Notification.Action action) {
        return action.isAuthenticationRequired();
    }
}
