package s7;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public abstract class f implements h2 {
    public final w2 a = new w2();

    public final int a() {
        i0 i0Var = (i0) this;
        x2 x10 = i0Var.x();
        if (x10.p()) {
            return -1;
        }
        int t5 = i0Var.t();
        i0Var.S();
        int i10 = i0Var.D;
        if (i10 == 1) {
            i10 = 0;
        }
        i0Var.S();
        return x10.e(t5, i10, i0Var.E);
    }

    public final int b() {
        i0 i0Var = (i0) this;
        x2 x10 = i0Var.x();
        if (x10.p()) {
            return -1;
        }
        int t5 = i0Var.t();
        i0Var.S();
        int i10 = i0Var.D;
        if (i10 == 1) {
            i10 = 0;
        }
        i0Var.S();
        return x10.k(t5, i10, i0Var.E);
    }

    public final boolean c(int i10) {
        i0 i0Var = (i0) this;
        i0Var.S();
        return i0Var.L.f24324b.a.get(i10);
    }

    public final boolean d() {
        i0 i0Var = (i0) this;
        x2 x10 = i0Var.x();
        if (!x10.p() && x10.m(i0Var.t(), this.a).f24847k) {
            return true;
        }
        return false;
    }

    public final boolean e() {
        i0 i0Var = (i0) this;
        x2 x10 = i0Var.x();
        if (!x10.p() && x10.m(i0Var.t(), this.a).a()) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        i0 i0Var = (i0) this;
        x2 x10 = i0Var.x();
        if (!x10.p() && x10.m(i0Var.t(), this.a).f24846j) {
            return true;
        }
        return false;
    }

    public abstract void g(int i10, long j3, boolean z10);

    public final void h(int i10, int i11) {
        g(i10, C.TIME_UNSET, false);
    }

    public final void i() {
        boolean z10;
        i0 i0Var = (i0) this;
        if (!i0Var.x().p() && !i0Var.C()) {
            if (a() != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int a = a();
                if (a != -1) {
                    if (a == i0Var.t()) {
                        g(i0Var.t(), C.TIME_UNSET, true);
                        return;
                    } else {
                        h(a, 9);
                        return;
                    }
                }
                return;
            }
            if (e() && d()) {
                h(i0Var.t(), 9);
            }
        }
    }

    public final void j(int i10, long j3) {
        long Q;
        i0 i0Var = (i0) this;
        long v10 = i0Var.v() + j3;
        i0Var.S();
        if (i0Var.C()) {
            a2 a2Var = i0Var.f24403f0;
            v8.z zVar = a2Var.f24265b;
            Object obj = zVar.a;
            x2 x2Var = a2Var.a;
            v2 v2Var = i0Var.f24413n;
            x2Var.g(obj, v2Var);
            Q = n9.h0.Q(v2Var.a(zVar.f26318b, zVar.f26319c));
        } else {
            x2 x10 = i0Var.x();
            if (x10.p()) {
                Q = -9223372036854775807L;
            } else {
                Q = n9.h0.Q(x10.m(i0Var.t(), i0Var.a).f24852p);
            }
        }
        if (Q != C.TIME_UNSET) {
            v10 = Math.min(v10, Q);
        }
        g(i0Var.t(), Math.max(v10, 0L), false);
    }

    public final void k() {
        boolean z10;
        int b3;
        i0 i0Var = (i0) this;
        if (!i0Var.x().p() && !i0Var.C()) {
            if (b() != -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (e() && !f()) {
                if (z10 && (b3 = b()) != -1) {
                    if (b3 == i0Var.t()) {
                        g(i0Var.t(), C.TIME_UNSET, true);
                        return;
                    } else {
                        h(b3, 7);
                        return;
                    }
                }
                return;
            }
            if (z10) {
                long v10 = i0Var.v();
                i0Var.S();
                if (v10 <= 3000) {
                    int b10 = b();
                    if (b10 != -1) {
                        if (b10 == i0Var.t()) {
                            g(i0Var.t(), C.TIME_UNSET, true);
                            return;
                        } else {
                            h(b10, 7);
                            return;
                        }
                    }
                    return;
                }
            }
            g(i0Var.t(), 0L, false);
        }
    }
}
