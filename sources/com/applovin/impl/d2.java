package com.applovin.impl;

import com.applovin.impl.fo;
import com.applovin.impl.qh;

/* loaded from: classes3.dex */
public abstract class d2 implements qh {

    /* renamed from: a, reason: collision with root package name */
    protected final fo.d f23400a = new fo.d();

    private int J() {
        int m2 = m();
        if (m2 == 1) {
            return 0;
        }
        return m2;
    }

    @Override // com.applovin.impl.qh
    public final void B() {
        b(-F());
    }

    @Override // com.applovin.impl.qh
    public final void D() {
        if (n().c() || d()) {
            return;
        }
        boolean L = L();
        if (N() && !y()) {
            if (L) {
                Q();
            }
        } else if (!L || getCurrentPosition() > q()) {
            a(0L);
        } else {
            Q();
        }
    }

    public final long G() {
        fo n2 = n();
        if (n2.c()) {
            return -9223372036854775807L;
        }
        return n2.a(t(), this.f23400a).d();
    }

    public final int H() {
        fo n2 = n();
        if (n2.c()) {
            return -1;
        }
        return n2.a(t(), J(), r());
    }

    public final int I() {
        fo n2 = n();
        if (n2.c()) {
            return -1;
        }
        return n2.b(t(), J(), r());
    }

    public final boolean K() {
        return H() != -1;
    }

    public final boolean L() {
        return I() != -1;
    }

    public final boolean M() {
        fo n2 = n();
        return !n2.c() && n2.a(t(), this.f23400a).f23968j;
    }

    public final boolean N() {
        fo n2 = n();
        return !n2.c() && n2.a(t(), this.f23400a).e();
    }

    public final void O() {
        c(t());
    }

    public final void P() {
        int H = H();
        if (H != -1) {
            c(H);
        }
    }

    public final void Q() {
        int I = I();
        if (I != -1) {
            c(I);
        }
    }

    @Override // com.applovin.impl.qh
    public final void a(long j2) {
        a(t(), j2);
    }

    @Override // com.applovin.impl.qh
    public final boolean b(int i2) {
        return i().a(i2);
    }

    public final void c(int i2) {
        a(i2, -9223372036854775807L);
    }

    @Override // com.applovin.impl.qh
    public final boolean isPlaying() {
        return o() == 3 && l() && j() == 0;
    }

    @Override // com.applovin.impl.qh
    public final void u() {
        if (n().c() || d()) {
            return;
        }
        if (K()) {
            P();
        } else if (N() && M()) {
            O();
        }
    }

    @Override // com.applovin.impl.qh
    public final void w() {
        b(e());
    }

    @Override // com.applovin.impl.qh
    public final boolean y() {
        fo n2 = n();
        return !n2.c() && n2.a(t(), this.f23400a).f23967i;
    }

    private void b(long j2) {
        long currentPosition = getCurrentPosition() + j2;
        long duration = getDuration();
        if (duration != -9223372036854775807L) {
            currentPosition = Math.min(currentPosition, duration);
        }
        a(Math.max(currentPosition, 0L));
    }

    public qh.b a(qh.b bVar) {
        return new qh.b.a().a(bVar).a(3, !d()).a(4, y() && !d()).a(5, L() && !d()).a(6, !n().c() && (L() || !N() || y()) && !d()).a(7, K() && !d()).a(8, !n().c() && (K() || (N() && M())) && !d()).a(9, !d()).a(10, y() && !d()).a(11, y() && !d()).a();
    }
}
