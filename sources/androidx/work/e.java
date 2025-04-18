package androidx.work;

import android.net.Uri;

/* loaded from: classes.dex */
public final class e {
    public final Uri a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2195b;

    public e(Uri uri, boolean z10) {
        this.a = uri;
        this.f2195b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f2195b == eVar.f2195b && this.a.equals(eVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (this.f2195b ? 1 : 0);
    }
}
