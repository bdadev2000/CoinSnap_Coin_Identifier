package h1;

import b1.z;
import e1.t0;

/* loaded from: classes2.dex */
public final class l extends z {

    /* renamed from: c, reason: collision with root package name */
    public static final l f30760c = new z();

    @Override // b1.z
    public final void h0(h0.l lVar, Runnable runnable) {
        d dVar = d.d;
        dVar.f30749c.e(runnable, k.f30759h, false);
    }

    @Override // b1.z
    public final void i0(h0.l lVar, Runnable runnable) {
        d dVar = d.d;
        dVar.f30749c.e(runnable, k.f30759h, true);
    }

    @Override // b1.z
    public final z k0(int i2) {
        t0.j(i2);
        return i2 >= k.d ? this : super.k0(i2);
    }
}
