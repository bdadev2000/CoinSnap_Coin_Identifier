package com.applovin.impl;

import com.applovin.impl.go;
import com.applovin.impl.nh;

/* renamed from: com.applovin.impl.c2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0680c2 implements nh {

    /* renamed from: a, reason: collision with root package name */
    protected final go.d f6948a = new go.d();

    private int J() {
        int m = m();
        if (m == 1) {
            return 0;
        }
        return m;
    }

    @Override // com.applovin.impl.nh
    public final void B() {
        b(-F());
    }

    @Override // com.applovin.impl.nh
    public final void D() {
        if (!n().c() && !d()) {
            boolean L8 = L();
            if (N() && !y()) {
                if (L8) {
                    Q();
                }
            } else if (L8 && getCurrentPosition() <= q()) {
                Q();
            } else {
                a(0L);
            }
        }
    }

    public final long G() {
        go n2 = n();
        if (n2.c()) {
            return com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET;
        }
        return n2.a(t(), this.f6948a).d();
    }

    public final int H() {
        go n2 = n();
        if (n2.c()) {
            return -1;
        }
        return n2.a(t(), J(), r());
    }

    public final int I() {
        go n2 = n();
        if (n2.c()) {
            return -1;
        }
        return n2.b(t(), J(), r());
    }

    public final boolean K() {
        if (H() != -1) {
            return true;
        }
        return false;
    }

    public final boolean L() {
        if (I() != -1) {
            return true;
        }
        return false;
    }

    public final boolean M() {
        go n2 = n();
        if (!n2.c() && n2.a(t(), this.f6948a).f7954j) {
            return true;
        }
        return false;
    }

    public final boolean N() {
        go n2 = n();
        if (!n2.c() && n2.a(t(), this.f6948a).e()) {
            return true;
        }
        return false;
    }

    public final void O() {
        c(t());
    }

    public final void P() {
        int H8 = H();
        if (H8 != -1) {
            c(H8);
        }
    }

    public final void Q() {
        int I5 = I();
        if (I5 != -1) {
            c(I5);
        }
    }

    @Override // com.applovin.impl.nh
    public final void a(long j7) {
        a(t(), j7);
    }

    @Override // com.applovin.impl.nh
    public final boolean b(int i9) {
        return i().a(i9);
    }

    public final void c(int i9) {
        a(i9, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET);
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
        go n2 = n();
        if (!n2.c() && n2.a(t(), this.f6948a).f7953i) {
            return true;
        }
        return false;
    }

    private void b(long j7) {
        long currentPosition = getCurrentPosition() + j7;
        long duration = getDuration();
        if (duration != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
            currentPosition = Math.min(currentPosition, duration);
        }
        a(Math.max(currentPosition, 0L));
    }

    public nh.b a(nh.b bVar) {
        return new nh.b.a().a(bVar).a(3, !d()).a(4, y() && !d()).a(5, L() && !d()).a(6, !n().c() && (L() || !N() || y()) && !d()).a(7, K() && !d()).a(8, !n().c() && (K() || (N() && M())) && !d()).a(9, !d()).a(10, y() && !d()).a(11, y() && !d()).a();
    }
}
