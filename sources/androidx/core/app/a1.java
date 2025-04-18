package androidx.core.app;

import android.app.Notification;

/* loaded from: classes.dex */
public abstract class a1 {
    public static Notification.Builder a(Notification.Builder builder, boolean z10) {
        Notification.Builder allowSystemGeneratedContextualActions;
        allowSystemGeneratedContextualActions = builder.setAllowSystemGeneratedContextualActions(z10);
        return allowSystemGeneratedContextualActions;
    }

    public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
        Notification.Builder bubbleMetadata2;
        bubbleMetadata2 = builder.setBubbleMetadata(bubbleMetadata);
        return bubbleMetadata2;
    }

    public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z10) {
        Notification.Action.Builder contextual;
        contextual = builder.setContextual(z10);
        return contextual;
    }

    public static Notification.Builder d(Notification.Builder builder, Object obj) {
        Notification.Builder locusId;
        locusId = builder.setLocusId(androidx.appcompat.widget.k1.k(obj));
        return locusId;
    }
}
