package androidx.core.app;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class e0 {
    public static boolean a(Notification.Action action) {
        return action.getAllowGeneratedReplies();
    }
}
