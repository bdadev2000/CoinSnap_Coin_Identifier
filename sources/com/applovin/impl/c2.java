package com.applovin.impl;

import com.applovin.impl.go;
import com.applovin.impl.nh;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public abstract class c2 implements nh {
    protected final go.d a = new go.d();

    private int J() {
        int m10 = m();
        if (m10 == 1) {
            return 0;
        }
        return m10;
    }

    @Override // com.applovin.impl.nh
    public final void B() {
        b(-F());
    }

    @Override // com.applovin.impl.nh
    public final void D() {
        if (!n().c() && !d()) {
            boolean L = L();
            if (N() && !y()) {
                if (L) {
                    Q();
                }
            } else if (L && getCurrentPosition() <= q()) {
                Q();
            } else {
                a(0L);
            }
        }
    }

    public final long G() {
        go n10 = n();
        if (n10.c()) {
            return C.TIME_UNSET;
        }
        return n10.a(t(), this.a).d();
    }

    public final int H() {
        go n10 = n();
        if (n10.c()) {
            return -1;
        }
        return n10.a(t(), J(), r());
    }

    public final int I() {
        go n10 = n();
        if (n10.c()) {
            return -1;
        }
        return n10.b(t(), J(), r());
    }

    public final boolean K() {
        return H() != -1;
    }

    public final boolean L() {
        return I() != -1;
    }

    public final boolean M() {
        go n10 = n();
        if (!n10.c() && n10.a(t(), this.a).f4977j) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        go n10 = n();
        if (!n10.c() && n10.a(t(), this.a).e()) {
            return true;
        }
        return false;
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

    @Override // com.applovin.impl.nh
    public final void a(long j3) {
        a(t(), j3);
    }

    @Override // com.applovin.impl.nh
    public final boolean b(int i10) {
        return i().a(i10);
    }

    public final void c(int i10) {
        a(i10, C.TIME_UNSET);
    }

    @Override // com.applovin.impl.nh
    public final boolean isPlaying() {
        if (o() == 3 && l() && j() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.applovin.impl.nh
    public final void u() {
        if (!n().c() && !d()) {
            if (K()) {
                P();
            } else if (N() && M()) {
                O();
            }
        }
    }

    @Override // com.applovin.impl.nh
    public final void w() {
        b(e());
    }

    @Override // com.applovin.impl.nh
    public final boolean y() {
        go n10 = n();
        if (!n10.c() && n10.a(t(), this.a).f4976i) {
            return true;
        }
        return false;
    }

    private void b(long j3) {
        long currentPosition = getCurrentPosition() + j3;
        long duration = getDuration();
        if (duration != C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        a(Math.max(currentPosition, 0L));
    }

    public nh.b a(nh.b bVar) {
        return new nh.b.a().a(bVar).a(3, !d()).a(4, y() && !d()).a(5, L() && !d()).a(6, !n().c() && (L() || !N() || y()) && !d()).a(7, K() && !d()).a(8, !n().c() && (K() || (N() && M())) && !d()).a(9, !d()).a(10, y() && !d()).a(11, y() && !d()).a();
    }
}
