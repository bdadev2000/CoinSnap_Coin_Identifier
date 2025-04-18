package h4;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class m implements k {
    public final c a;

    /* renamed from: b, reason: collision with root package name */
    public int f18759b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f18760c;

    public m(c cVar) {
        this.a = cVar;
    }

    @Override // h4.k
    public final void a() {
        this.a.j(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f18759b != mVar.f18759b || !w4.m.b(this.f18760c, mVar.f18760c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int i11 = this.f18759b * 31;
        Bitmap.Config config = this.f18760c;
        if (config != null) {
            i10 = config.hashCode();
        } else {
            i10 = 0;
        }
        return i11 + i10;
    }

    public final String toString() {
        return n.f(this.f18759b, this.f18760c);
    }
}
