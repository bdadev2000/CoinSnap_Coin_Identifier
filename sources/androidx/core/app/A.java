package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;

/* loaded from: classes.dex */
public abstract class A {
    public static Icon a(Notification.Action action) {
        return action.getIcon();
    }
}
