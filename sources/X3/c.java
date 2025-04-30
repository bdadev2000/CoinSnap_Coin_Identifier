package X3;

import android.app.PendingIntent;

/* loaded from: classes2.dex */
public final class c extends b {
    public final PendingIntent b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3667c;

    public c(PendingIntent pendingIntent, boolean z8) {
        if (pendingIntent != null) {
            this.b = pendingIntent;
            this.f3667c = z8;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.b.equals(((c) bVar).b) && this.f3667c == ((c) bVar).f3667c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        if (true != this.f3667c) {
            i9 = 1237;
        } else {
            i9 = 1231;
        }
        return hashCode ^ i9;
    }

    public final String toString() {
        return "ReviewInfo{pendingIntent=" + this.b.toString() + ", isNoOp=" + this.f3667c + "}";
    }
}
