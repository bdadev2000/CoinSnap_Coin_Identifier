package androidx.media.app;

import android.app.Notification;
import androidx.core.app.NotificationBuilderWithBuilderAccessor;
import androidx.core.app.NotificationCompat;

/* loaded from: classes3.dex */
public class NotificationCompat {

    /* loaded from: classes3.dex */
    public static class DecoratedMediaCustomViewStyle extends MediaStyle {
        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.a().setStyle(new Notification.DecoratedMediaCustomViewStyle());
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public final void d() {
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        public final void e() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void f() {
        }
    }

    /* loaded from: classes3.dex */
    public static class MediaStyle extends NotificationCompat.Style {
        @Override // androidx.core.app.NotificationCompat.Style
        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.a().setStyle(new Notification.MediaStyle());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void d() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void e() {
        }
    }
}
