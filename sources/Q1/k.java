package Q1;

import android.graphics.Bitmap;
import j2.n;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final e f2488a;
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f2489c;

    public k(e eVar) {
        this.f2488a = eVar;
    }

    @Override // Q1.i
    public final void a() {
        this.f2488a.m(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.b != kVar.b || !n.b(this.f2489c, kVar.f2489c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i9;
        int i10 = this.b * 31;
        Bitmap.Config config = this.f2489c;
        if (config != null) {
            i9 = config.hashCode();
        } else {
            i9 = 0;
        }
        return i10 + i9;
    }

    public final String toString() {
        return l.c(this.b, this.f2489c);
    }
}
