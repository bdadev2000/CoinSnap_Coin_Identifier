package v8;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.v2;
import s7.w2;
import s7.x2;

/* loaded from: classes3.dex */
public final class d1 extends x2 {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f26092i = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final long f26093c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26094d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f26095f;

    /* renamed from: g, reason: collision with root package name */
    public final s7.j1 f26096g;

    /* renamed from: h, reason: collision with root package name */
    public final s7.d1 f26097h;

    static {
        s7.w0 w0Var = new s7.w0();
        w0Var.a = "SinglePeriodTimeline";
        w0Var.f24810b = Uri.EMPTY;
        w0Var.a();
    }

    public d1(long j3, boolean z10, boolean z11, s7.j1 j1Var) {
        s7.d1 d1Var;
        if (z11) {
            d1Var = j1Var.f24454d;
        } else {
            d1Var = null;
        }
        this.f26093c = j3;
        this.f26094d = j3;
        this.f26095f = z10;
        j1Var.getClass();
        this.f26096g = j1Var;
        this.f26097h = d1Var;
    }

    @Override // s7.x2
    public final int b(Object obj) {
        return f26092i.equals(obj) ? 0 : -1;
    }

    @Override // s7.x2
    public final v2 f(int i10, v2 v2Var, boolean z10) {
        Object obj;
        u0.i(i10, 1);
        if (z10) {
            obj = f26092i;
        } else {
            obj = null;
        }
        long j3 = this.f26093c;
        v2Var.getClass();
        v2Var.i(null, obj, 0, j3, 0L, w8.b.f26918i, false);
        return v2Var;
    }

    @Override // s7.x2
    public final int h() {
        return 1;
    }

    @Override // s7.x2
    public final Object l(int i10) {
        u0.i(i10, 1);
        return f26092i;
    }

    @Override // s7.x2
    public final w2 n(int i10, w2 w2Var, long j3) {
        u0.i(i10, 1);
        w2Var.b(w2.f24833t, this.f26096g, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, this.f26095f, false, this.f26097h, 0L, this.f26094d, 0, 0, 0L);
        return w2Var;
    }

    @Override // s7.x2
    public final int o() {
        return 1;
    }
}
