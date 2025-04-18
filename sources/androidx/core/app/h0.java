package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.LocusId;

/* loaded from: classes.dex */
public abstract class h0 {
    public static boolean a(Notification notification) {
        boolean allowSystemGeneratedContextualActions;
        allowSystemGeneratedContextualActions = notification.getAllowSystemGeneratedContextualActions();
        return allowSystemGeneratedContextualActions;
    }

    public static Notification.BubbleMetadata b(Notification notification) {
        Notification.BubbleMetadata bubbleMetadata;
        bubbleMetadata = notification.getBubbleMetadata();
        return bubbleMetadata;
    }

    public static int c(RemoteInput remoteInput) {
        int editChoicesBeforeSending;
        editChoicesBeforeSending = remoteInput.getEditChoicesBeforeSending();
        return editChoicesBeforeSending;
    }

    public static LocusId d(Notification notification) {
        LocusId locusId;
        locusId = notification.getLocusId();
        return locusId;
    }

    public static boolean e(Notification.Action action) {
        boolean isContextual;
        isContextual = action.isContextual();
        return isContextual;
    }
}
