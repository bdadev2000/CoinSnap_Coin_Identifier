package androidx.work;

import android.app.Notification;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f5215a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f5216c;

    public h(int i9, Notification notification, int i10) {
        this.f5215a = i9;
        this.f5216c = notification;
        this.b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f5215a != hVar.f5215a || this.b != hVar.b) {
            return false;
        }
        return this.f5216c.equals(hVar.f5216c);
    }

    public final int hashCode() {
        return this.f5216c.hashCode() + (((this.f5215a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f5215a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.f5216c + '}';
    }
}
