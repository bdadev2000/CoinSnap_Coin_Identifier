package h4;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class b implements k {
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public int f18735b;

    /* renamed from: c, reason: collision with root package name */
    public int f18736c;

    /* renamed from: d, reason: collision with root package name */
    public Bitmap.Config f18737d;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // h4.k
    public final void a() {
        this.a.j(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f18735b != bVar.f18735b || this.f18736c != bVar.f18736c || this.f18737d != bVar.f18737d) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = ((this.f18735b * 31) + this.f18736c) * 31;
        Bitmap.Config config = this.f18737d;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return d3.g.q(this.f18735b, this.f18736c, this.f18737d);
    }
}
