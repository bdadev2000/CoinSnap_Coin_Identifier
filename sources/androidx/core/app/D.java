package androidx.core.app;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class D {
    public static int a(Notification.Action action) {
        return action.getSemanticAction();
    }
}
