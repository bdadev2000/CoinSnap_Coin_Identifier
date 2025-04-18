package androidx.core.app;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class i0 {
    public static boolean a(Notification.Action action) {
        boolean isAuthenticationRequired;
        isAuthenticationRequired = action.isAuthenticationRequired();
        return isAuthenticationRequired;
    }
}
