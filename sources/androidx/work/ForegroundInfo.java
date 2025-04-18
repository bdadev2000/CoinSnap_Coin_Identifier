package androidx.work;

import android.app.Notification;

/* loaded from: classes3.dex */
public final class ForegroundInfo {

    /* renamed from: a, reason: collision with root package name */
    public final int f21873a;

    /* renamed from: b, reason: collision with root package name */
    public final int f21874b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f21875c;

    public ForegroundInfo(int i2, int i3, Notification notification) {
        this.f21873a = i2;
        this.f21875c = notification;
        this.f21874b = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ForegroundInfo.class != obj.getClass()) {
            return false;
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) obj;
        if (this.f21873a == foregroundInfo.f21873a && this.f21874b == foregroundInfo.f21874b) {
            return this.f21875c.equals(foregroundInfo.f21875c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21875c.hashCode() + (((this.f21873a * 31) + this.f21874b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f21873a + ", mForegroundServiceType=" + this.f21874b + ", mNotification=" + this.f21875c + '}';
    }
}
