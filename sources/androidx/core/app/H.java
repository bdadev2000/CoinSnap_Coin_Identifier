package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public abstract class H {
    @RequiresApi(31)
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    @RequiresApi(31)
    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    @RequiresApi(31)
    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z8) {
        bigPictureStyle.showBigPictureWhenCollapsed(z8);
    }
}
