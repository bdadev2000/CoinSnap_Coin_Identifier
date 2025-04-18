package androidx.core.app;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class g0 {
    public static int a(Notification.Action action) {
        int semanticAction;
        semanticAction = action.getSemanticAction();
        return semanticAction;
    }
}
