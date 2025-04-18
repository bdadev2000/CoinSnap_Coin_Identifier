package h;

import android.os.Build;
import okio.BufferedSource;

/* loaded from: classes.dex */
public final class x implements i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f30706a = true;

    @Override // h.i
    public final j a(k.n nVar, q.n nVar2) {
        BufferedSource h2 = nVar.f30892a.h();
        if (!h2.rangeEquals(0L, r.f30695b) && !h2.rangeEquals(0L, r.f30694a) && (!h2.rangeEquals(0L, r.f30696c) || !h2.rangeEquals(8L, r.d) || !h2.rangeEquals(12L, r.e) || !h2.request(17L) || ((byte) (h2.getBuffer().getByte(16L) & 2)) <= 0)) {
            if (Build.VERSION.SDK_INT < 30 || !h2.rangeEquals(4L, r.f30697f)) {
                return null;
            }
            if (!h2.rangeEquals(8L, r.f30698g) && !h2.rangeEquals(8L, r.f30699h) && !h2.rangeEquals(8L, r.f30700i)) {
                return null;
            }
        }
        return new c0(nVar.f30892a, nVar2, this.f30706a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof x;
    }

    public final int hashCode() {
        return x.class.hashCode();
    }
}
