package s7;

import android.os.SystemClock;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* loaded from: classes3.dex */
public final class a2 {

    /* renamed from: t, reason: collision with root package name */
    public static final v8.z f24264t = new v8.z(new Object());
    public final x2 a;

    /* renamed from: b, reason: collision with root package name */
    public final v8.z f24265b;

    /* renamed from: c, reason: collision with root package name */
    public final long f24266c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24267d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24268e;

    /* renamed from: f, reason: collision with root package name */
    public final r f24269f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f24270g;

    /* renamed from: h, reason: collision with root package name */
    public final v8.j1 f24271h;

    /* renamed from: i, reason: collision with root package name */
    public final k9.x f24272i;

    /* renamed from: j, reason: collision with root package name */
    public final List f24273j;

    /* renamed from: k, reason: collision with root package name */
    public final v8.z f24274k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f24275l;

    /* renamed from: m, reason: collision with root package name */
    public final int f24276m;

    /* renamed from: n, reason: collision with root package name */
    public final b2 f24277n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f24278o;

    /* renamed from: p, reason: collision with root package name */
    public volatile long f24279p;

    /* renamed from: q, reason: collision with root package name */
    public volatile long f24280q;

    /* renamed from: r, reason: collision with root package name */
    public volatile long f24281r;

    /* renamed from: s, reason: collision with root package name */
    public volatile long f24282s;

    public a2(x2 x2Var, v8.z zVar, long j3, long j10, int i10, r rVar, boolean z10, v8.j1 j1Var, k9.x xVar, List list, v8.z zVar2, boolean z11, int i11, b2 b2Var, long j11, long j12, long j13, long j14, boolean z12) {
        this.a = x2Var;
        this.f24265b = zVar;
        this.f24266c = j3;
        this.f24267d = j10;
        this.f24268e = i10;
        this.f24269f = rVar;
        this.f24270g = z10;
        this.f24271h = j1Var;
        this.f24272i = xVar;
        this.f24273j = list;
        this.f24274k = zVar2;
        this.f24275l = z11;
        this.f24276m = i11;
        this.f24277n = b2Var;
        this.f24279p = j11;
        this.f24280q = j12;
        this.f24281r = j13;
        this.f24282s = j14;
        this.f24278o = z12;
    }

    public static a2 g(k9.x xVar) {
        u2 u2Var = x2.f24864b;
        v8.z zVar = f24264t;
        return new a2(u2Var, zVar, C.TIME_UNSET, 0L, 1, null, false, v8.j1.f26179f, xVar, com.google.common.collect.z1.f12062g, zVar, false, 0, b2.f24301f, 0L, 0L, 0L, 0L, false);
    }

    public final a2 a(v8.z zVar) {
        return new a2(this.a, this.f24265b, this.f24266c, this.f24267d, this.f24268e, this.f24269f, this.f24270g, this.f24271h, this.f24272i, this.f24273j, zVar, this.f24275l, this.f24276m, this.f24277n, this.f24279p, this.f24280q, this.f24281r, this.f24282s, this.f24278o);
    }

    public final a2 b(v8.z zVar, long j3, long j10, long j11, long j12, v8.j1 j1Var, k9.x xVar, List list) {
        return new a2(this.a, zVar, j10, j11, this.f24268e, this.f24269f, this.f24270g, j1Var, xVar, list, this.f24274k, this.f24275l, this.f24276m, this.f24277n, this.f24279p, j12, j3, SystemClock.elapsedRealtime(), this.f24278o);
    }

    public final a2 c(int i10, boolean z10) {
        return new a2(this.a, this.f24265b, this.f24266c, this.f24267d, this.f24268e, this.f24269f, this.f24270g, this.f24271h, this.f24272i, this.f24273j, this.f24274k, z10, i10, this.f24277n, this.f24279p, this.f24280q, this.f24281r, this.f24282s, this.f24278o);
    }

    public final a2 d(r rVar) {
        return new a2(this.a, this.f24265b, this.f24266c, this.f24267d, this.f24268e, rVar, this.f24270g, this.f24271h, this.f24272i, this.f24273j, this.f24274k, this.f24275l, this.f24276m, this.f24277n, this.f24279p, this.f24280q, this.f24281r, this.f24282s, this.f24278o);
    }

    public final a2 e(int i10) {
        return new a2(this.a, this.f24265b, this.f24266c, this.f24267d, i10, this.f24269f, this.f24270g, this.f24271h, this.f24272i, this.f24273j, this.f24274k, this.f24275l, this.f24276m, this.f24277n, this.f24279p, this.f24280q, this.f24281r, this.f24282s, this.f24278o);
    }

    public final a2 f(x2 x2Var) {
        return new a2(x2Var, this.f24265b, this.f24266c, this.f24267d, this.f24268e, this.f24269f, this.f24270g, this.f24271h, this.f24272i, this.f24273j, this.f24274k, this.f24275l, this.f24276m, this.f24277n, this.f24279p, this.f24280q, this.f24281r, this.f24282s, this.f24278o);
    }

    public final long h() {
        long j3;
        long j10;
        if (!i()) {
            return this.f24281r;
        }
        do {
            j3 = this.f24282s;
            j10 = this.f24281r;
        } while (j3 != this.f24282s);
        return n9.h0.H(n9.h0.Q(j10) + (((float) (SystemClock.elapsedRealtime() - j3)) * this.f24277n.f24302b));
    }

    public final boolean i() {
        return this.f24268e == 3 && this.f24275l && this.f24276m == 0;
    }
}
