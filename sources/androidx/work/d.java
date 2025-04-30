package androidx.work;

import android.net.Uri;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f5210a;
    public final boolean b;

    public d(Uri uri, boolean z8) {
        this.f5210a = uri;
        this.b = z8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.b == dVar.b && this.f5210a.equals(dVar.f5210a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5210a.hashCode() * 31) + (this.b ? 1 : 0);
    }
}
