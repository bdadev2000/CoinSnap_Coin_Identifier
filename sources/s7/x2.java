package s7;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes3.dex */
public abstract class x2 implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final u2 f24864b = new u2();

    static {
        n9.h0.E(0);
        n9.h0.E(1);
        n9.h0.E(2);
    }

    public int a(boolean z10) {
        return p() ? -1 : 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z10) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i10, v2 v2Var, w2 w2Var, int i11, boolean z10) {
        int i12 = f(i10, v2Var, false).f24787d;
        if (m(i12, w2Var).f24854r == i10) {
            int e2 = e(i12, i11, z10);
            if (e2 == -1) {
                return -1;
            }
            return m(e2, w2Var).f24853q;
        }
        return i10 + 1;
    }

    public int e(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == c(z10)) {
                        return a(z10);
                    }
                    return i10 + 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == c(z10)) {
            return -1;
        }
        return i10 + 1;
    }

    public final boolean equals(Object obj) {
        int c10;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        if (x2Var.o() != o() || x2Var.h() != h()) {
            return false;
        }
        w2 w2Var = new w2();
        v2 v2Var = new v2();
        w2 w2Var2 = new w2();
        v2 v2Var2 = new v2();
        for (int i10 = 0; i10 < o(); i10++) {
            if (!m(i10, w2Var).equals(x2Var.m(i10, w2Var2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < h(); i11++) {
            if (!f(i11, v2Var, true).equals(x2Var.f(i11, v2Var2, true))) {
                return false;
            }
        }
        int a = a(true);
        if (a != x2Var.a(true) || (c10 = c(true)) != x2Var.c(true)) {
            return false;
        }
        while (a != c10) {
            int e2 = e(a, 0, true);
            if (e2 != x2Var.e(a, 0, true)) {
                return false;
            }
            a = e2;
        }
        return true;
    }

    public abstract v2 f(int i10, v2 v2Var, boolean z10);

    public v2 g(Object obj, v2 v2Var) {
        return f(b(obj), v2Var, true);
    }

    public abstract int h();

    public final int hashCode() {
        w2 w2Var = new w2();
        v2 v2Var = new v2();
        int o10 = o() + 217;
        for (int i10 = 0; i10 < o(); i10++) {
            o10 = (o10 * 31) + m(i10, w2Var).hashCode();
        }
        int h10 = h() + (o10 * 31);
        for (int i11 = 0; i11 < h(); i11++) {
            h10 = (h10 * 31) + f(i11, v2Var, true).hashCode();
        }
        int a = a(true);
        while (a != -1) {
            h10 = (h10 * 31) + a;
            a = e(a, 0, true);
        }
        return h10;
    }

    public final Pair i(w2 w2Var, v2 v2Var, int i10, long j3) {
        Pair j10 = j(w2Var, v2Var, i10, j3, 0L);
        j10.getClass();
        return j10;
    }

    public final Pair j(w2 w2Var, v2 v2Var, int i10, long j3, long j10) {
        v8.u0.i(i10, o());
        n(i10, w2Var, j10);
        if (j3 == C.TIME_UNSET) {
            j3 = w2Var.f24851o;
            if (j3 == C.TIME_UNSET) {
                return null;
            }
        }
        int i11 = w2Var.f24853q;
        f(i11, v2Var, false);
        while (i11 < w2Var.f24854r && v2Var.f24789g != j3) {
            int i12 = i11 + 1;
            if (f(i12, v2Var, false).f24789g > j3) {
                break;
            }
            i11 = i12;
        }
        f(i11, v2Var, true);
        long j11 = j3 - v2Var.f24789g;
        long j12 = v2Var.f24788f;
        if (j12 != C.TIME_UNSET) {
            j11 = Math.min(j11, j12 - 1);
        }
        long max = Math.max(0L, j11);
        Object obj = v2Var.f24786c;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i10, int i11, boolean z10) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == a(z10)) {
                        return c(z10);
                    }
                    return i10 - 1;
                }
                throw new IllegalStateException();
            }
            return i10;
        }
        if (i10 == a(z10)) {
            return -1;
        }
        return i10 - 1;
    }

    public abstract Object l(int i10);

    public final w2 m(int i10, w2 w2Var) {
        return n(i10, w2Var, 0L);
    }

    public abstract w2 n(int i10, w2 w2Var, long j3);

    public abstract int o();

    public final boolean p() {
        return o() == 0;
    }
}
