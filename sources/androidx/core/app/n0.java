package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public abstract class n0 {
    @Nullable
    @RequiresApi(com.vungle.ads.internal.protos.n.NOTIFICATION_REDIRECT_VALUE)
    public static q0 a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
        PendingIntent intent;
        PendingIntent intent2;
        Icon icon;
        boolean autoExpandBubble;
        PendingIntent deleteIntent;
        boolean isNotificationSuppressed;
        int desiredHeight;
        int desiredHeightResId;
        int desiredHeightResId2;
        int desiredHeight2;
        if (bubbleMetadata == null) {
            return null;
        }
        intent = bubbleMetadata.getIntent();
        if (intent == null) {
            return null;
        }
        intent2 = bubbleMetadata.getIntent();
        icon = bubbleMetadata.getIcon();
        PorterDuff.Mode mode = IconCompat.f1278k;
        p0 p0Var = new p0(intent2, h0.c.a(icon));
        autoExpandBubble = bubbleMetadata.getAutoExpandBubble();
        p0Var.b(1, autoExpandBubble);
        deleteIntent = bubbleMetadata.getDeleteIntent();
        p0Var.f1223g = deleteIntent;
        isNotificationSuppressed = bubbleMetadata.isNotificationSuppressed();
        p0Var.b(2, isNotificationSuppressed);
        desiredHeight = bubbleMetadata.getDesiredHeight();
        if (desiredHeight != 0) {
            desiredHeight2 = bubbleMetadata.getDesiredHeight();
            p0Var.f1218b = Math.max(desiredHeight2, 0);
            p0Var.f1220d = 0;
        }
        desiredHeightResId = bubbleMetadata.getDesiredHeightResId();
        if (desiredHeightResId != 0) {
            desiredHeightResId2 = bubbleMetadata.getDesiredHeightResId();
            p0Var.f1220d = desiredHeightResId2;
            p0Var.f1218b = 0;
        }
        return p0Var.a();
    }
}
