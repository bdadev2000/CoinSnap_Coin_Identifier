package v8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import s7.v2;
import s7.w2;
import s7.x2;

/* loaded from: classes3.dex */
public final class s extends x2 {

    /* renamed from: c, reason: collision with root package name */
    public final s7.j1 f26272c;

    public s(s7.j1 j1Var) {
        this.f26272c = j1Var;
    }

    @Override // s7.x2
    public final int b(Object obj) {
        return obj == r.f26257g ? 0 : -1;
    }

    @Override // s7.x2
    public final v2 f(int i10, v2 v2Var, boolean z10) {
        Integer num;
        Object obj = null;
        if (z10) {
            num = 0;
        } else {
            num = null;
        }
        if (z10) {
            obj = r.f26257g;
        }
        v2Var.i(num, obj, 0, C.TIME_UNSET, 0L, w8.b.f26918i, true);
        return v2Var;
    }

    @Override // s7.x2
    public final int h() {
        return 1;
    }

    @Override // s7.x2
    public final Object l(int i10) {
        return r.f26257g;
    }

    @Override // s7.x2
    public final w2 n(int i10, w2 w2Var, long j3) {
        w2Var.b(w2.f24833t, this.f26272c, null, C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET, false, true, null, 0L, C.TIME_UNSET, 0, 0, 0L);
        w2Var.f24850n = true;
        return w2Var;
    }

    @Override // s7.x2
    public final int o() {
        return 1;
    }
}
