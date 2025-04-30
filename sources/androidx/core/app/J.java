package androidx.core.app;

import android.app.Notification;

/* loaded from: classes.dex */
public final class J extends B1.f {

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f4365d;

    @Override // B1.f
    public final void e(b1.h hVar) {
        new Notification.BigTextStyle((Notification.Builder) hVar.f5270c).setBigContentTitle(null).bigText(this.f4365d);
    }

    @Override // B1.f
    public final String k() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
