package q2;

import androidx.core.app.NotificationCompat;

/* loaded from: classes.dex */
public final class a {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23674b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f23675c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f23676d;

    public a(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.a = z10;
        this.f23674b = z11;
        this.f23675c = z12;
        this.f23676d = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a == aVar.a && this.f23674b == aVar.f23674b && this.f23675c == aVar.f23675c && this.f23676d == aVar.f23676d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [boolean, int] */
    public final int hashCode() {
        boolean z10 = this.f23674b;
        ?? r12 = this.a;
        int i10 = r12;
        if (z10) {
            i10 = r12 + 16;
        }
        int i11 = i10;
        if (this.f23675c) {
            i11 = i10 + NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (this.f23676d) {
            return i11 + 4096;
        }
        return i11;
    }

    public final String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.a), Boolean.valueOf(this.f23674b), Boolean.valueOf(this.f23675c), Boolean.valueOf(this.f23676d));
    }
}
