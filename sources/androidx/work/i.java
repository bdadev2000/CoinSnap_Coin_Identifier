package androidx.work;

import android.app.Notification;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class i {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2198b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f2199c;

    public i(int i10, int i11, Notification notification) {
        this.a = i10;
        this.f2199c = notification;
        this.f2198b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a != iVar.a || this.f2198b != iVar.f2198b) {
            return false;
        }
        return this.f2199c.equals(iVar.f2199c);
    }

    public final int hashCode() {
        return this.f2199c.hashCode() + (((this.a * 31) + this.f2198b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.f2198b + ", mNotification=" + this.f2199c + AbstractJsonLexerKt.END_OBJ;
    }
}
