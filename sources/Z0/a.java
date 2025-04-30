package Z0;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3872a;
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3873c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3874d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f3872a == aVar.f3872a && this.b == aVar.b && this.f3873c == aVar.f3873c && this.f3874d == aVar.f3874d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z8 = this.b;
        ?? r12 = this.f3872a;
        int i9 = r12;
        if (z8) {
            i9 = r12 + 16;
        }
        int i10 = i9;
        if (this.f3873c) {
            i10 = i9 + NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (this.f3874d) {
            return i10 + 4096;
        }
        return i10;
    }

    public final String toString() {
        return "[ Connected=" + this.f3872a + " Validated=" + this.b + " Metered=" + this.f3873c + " NotRoaming=" + this.f3874d + " ]";
    }
}
