package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public abstract class K {
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, androidx.core.app.M] */
    @Nullable
    @RequiresApi(29)
    public static M a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
        if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
            return null;
        }
        PendingIntent intent = bubbleMetadata.getIntent();
        Icon icon = bubbleMetadata.getIcon();
        PorterDuff.Mode mode = IconCompat.f4454k;
        M.c.a(icon);
        if (intent != null) {
            bubbleMetadata.getAutoExpandBubble();
            bubbleMetadata.getDeleteIntent();
            bubbleMetadata.isNotificationSuppressed();
            if (bubbleMetadata.getDesiredHeight() != 0) {
                Math.max(bubbleMetadata.getDesiredHeight(), 0);
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                bubbleMetadata.getDesiredHeightResId();
            }
            return new Object();
        }
        throw new NullPointerException("Bubble requires non-null pending intent");
    }
}
