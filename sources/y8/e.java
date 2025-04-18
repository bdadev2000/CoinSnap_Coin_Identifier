package y8;

import n9.h0;
import s7.d1;
import s7.j1;
import s7.v2;
import s7.x2;
import v8.u0;

/* loaded from: classes3.dex */
public final class e extends x2 {

    /* renamed from: c, reason: collision with root package name */
    public final long f28048c;

    /* renamed from: d, reason: collision with root package name */
    public final long f28049d;

    /* renamed from: f, reason: collision with root package name */
    public final long f28050f;

    /* renamed from: g, reason: collision with root package name */
    public final int f28051g;

    /* renamed from: h, reason: collision with root package name */
    public final long f28052h;

    /* renamed from: i, reason: collision with root package name */
    public final long f28053i;

    /* renamed from: j, reason: collision with root package name */
    public final long f28054j;

    /* renamed from: k, reason: collision with root package name */
    public final z8.c f28055k;

    /* renamed from: l, reason: collision with root package name */
    public final j1 f28056l;

    /* renamed from: m, reason: collision with root package name */
    public final d1 f28057m;

    public e(long j3, long j10, long j11, int i10, long j12, long j13, long j14, z8.c cVar, j1 j1Var, d1 d1Var) {
        boolean z10;
        boolean z11 = cVar.f28593d;
        if (d1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z11 == z10);
        this.f28048c = j3;
        this.f28049d = j10;
        this.f28050f = j11;
        this.f28051g = i10;
        this.f28052h = j12;
        this.f28053i = j13;
        this.f28054j = j14;
        this.f28055k = cVar;
        this.f28056l = j1Var;
        this.f28057m = d1Var;
    }

    @Override // s7.x2
    public final int b(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) || (intValue = ((Integer) obj).intValue() - this.f28051g) < 0 || intValue >= h()) {
            return -1;
        }
        return intValue;
    }

    @Override // s7.x2
    public final v2 f(int i10, v2 v2Var, boolean z10) {
        String str;
        u0.i(i10, h());
        Integer num = null;
        z8.c cVar = this.f28055k;
        if (z10) {
            str = cVar.a(i10).a;
        } else {
            str = null;
        }
        if (z10) {
            num = Integer.valueOf(this.f28051g + i10);
        }
        long d10 = cVar.d(i10);
        long H = h0.H(cVar.a(i10).f28621b - cVar.a(0).f28621b) - this.f28052h;
        v2Var.getClass();
        v2Var.i(str, num, 0, d10, H, w8.b.f26918i, false);
        return v2Var;
    }

    @Override // s7.x2
    public final int h() {
        return this.f28055k.b();
    }

    @Override // s7.x2
    public final Object l(int i10) {
        u0.i(i10, h());
        return Integer.valueOf(this.f28051g + i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b7  */
    @Override // s7.x2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final s7.w2 n(int r24, s7.w2 r25, long r26) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.e.n(int, s7.w2, long):s7.w2");
    }

    @Override // s7.x2
    public final int o() {
        return 1;
    }
}
