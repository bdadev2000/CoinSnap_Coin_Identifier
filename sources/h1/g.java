package h1;

import b1.z0;

/* loaded from: classes3.dex */
public abstract class g extends z0 {

    /* renamed from: c, reason: collision with root package name */
    public final b f30749c;

    public g(int i2, int i3, String str, long j2) {
        this.f30749c = new b(i2, i3, str, j2);
    }

    @Override // b1.z
    public final void h0(h0.l lVar, Runnable runnable) {
        b.h(this.f30749c, runnable, false, 6);
    }

    @Override // b1.z
    public final void i0(h0.l lVar, Runnable runnable) {
        b.h(this.f30749c, runnable, true, 2);
    }
}
