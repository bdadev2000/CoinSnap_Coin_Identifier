package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.LocusId;

/* loaded from: classes.dex */
public abstract class E {
    public static boolean a(Notification notification) {
        return notification.getAllowSystemGeneratedContextualActions();
    }

    public static Notification.BubbleMetadata b(Notification notification) {
        return notification.getBubbleMetadata();
    }

    public static int c(RemoteInput remoteInput) {
        return remoteInput.getEditChoicesBeforeSending();
    }

    public static LocusId d(Notification notification) {
        return notification.getLocusId();
    }

    public static boolean e(Notification.Action action) {
        return action.isContextual();
    }
}
