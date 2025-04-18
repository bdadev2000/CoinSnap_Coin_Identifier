package androidx.core.app;

import android.app.Notification;
import android.graphics.drawable.Icon;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public abstract class k0 {
    @RequiresApi(com.vungle.ads.internal.protos.n.TEMPLATE_HTML_SIZE_VALUE)
    public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
        bigPictureStyle.bigPicture(icon);
    }

    @RequiresApi(com.vungle.ads.internal.protos.n.TEMPLATE_HTML_SIZE_VALUE)
    public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
        bigPictureStyle.setContentDescription(charSequence);
    }

    @RequiresApi(com.vungle.ads.internal.protos.n.TEMPLATE_HTML_SIZE_VALUE)
    public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
        bigPictureStyle.showBigPictureWhenCollapsed(z10);
    }
}
