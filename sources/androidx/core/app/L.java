package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public abstract class L {
    /* JADX WARN: Type inference failed for: r0v5, types: [G5.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, androidx.core.app.M] */
    @Nullable
    @RequiresApi(com.vungle.ads.internal.protos.n.AD_PLAY_RESET_ON_DEINIT_VALUE)
    public static M a(@Nullable Notification.BubbleMetadata bubbleMetadata) {
        G5.d dVar;
        if (bubbleMetadata == null) {
            return null;
        }
        if (bubbleMetadata.getShortcutId() != null) {
            String shortcutId = bubbleMetadata.getShortcutId();
            ?? obj = new Object();
            if (!TextUtils.isEmpty(shortcutId)) {
                obj.f1280d = shortcutId;
                dVar = obj;
            } else {
                throw new NullPointerException("Bubble requires a non-null shortcut id");
            }
        } else {
            PendingIntent intent = bubbleMetadata.getIntent();
            Icon icon = bubbleMetadata.getIcon();
            PorterDuff.Mode mode = IconCompat.f4454k;
            dVar = new G5.d(intent, M.c.a(icon));
        }
        dVar.c(1, bubbleMetadata.getAutoExpandBubble());
        dVar.f1283g = bubbleMetadata.getDeleteIntent();
        dVar.c(2, bubbleMetadata.isNotificationSuppressed());
        if (bubbleMetadata.getDesiredHeight() != 0) {
            dVar.f1278a = Math.max(bubbleMetadata.getDesiredHeight(), 0);
            dVar.b = 0;
        }
        if (bubbleMetadata.getDesiredHeightResId() != 0) {
            dVar.b = bubbleMetadata.getDesiredHeightResId();
            dVar.f1278a = 0;
        }
        PendingIntent pendingIntent = (PendingIntent) dVar.f1281e;
        String str = dVar.f1280d;
        if (str == null && pendingIntent == null) {
            throw new NullPointerException("Must supply pending intent or shortcut to bubble");
        }
        IconCompat iconCompat = (IconCompat) dVar.f1282f;
        if (str == null && iconCompat == null) {
            throw new NullPointerException("Must supply an icon or shortcut for the bubble");
        }
        return new Object();
    }
}
