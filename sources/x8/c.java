package x8;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import n9.h0;
import n9.x;
import s7.r0;
import y7.a0;
import y7.z;

/* loaded from: classes3.dex */
public final class c implements a0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f27506b;

    /* renamed from: c, reason: collision with root package name */
    public final y7.k f27507c = new y7.k();

    /* renamed from: d, reason: collision with root package name */
    public r0 f27508d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f27509e;

    /* renamed from: f, reason: collision with root package name */
    public long f27510f;

    public c(int i10, int i11, r0 r0Var) {
        this.a = i11;
        this.f27506b = r0Var;
    }

    @Override // y7.a0
    public final void a(int i10, x xVar) {
        a0 a0Var = this.f27509e;
        int i11 = h0.a;
        a0Var.a(i10, xVar);
    }

    @Override // y7.a0
    public final int b(m9.i iVar, int i10, boolean z10) {
        a0 a0Var = this.f27509e;
        int i11 = h0.a;
        return a0Var.c(iVar, i10, z10);
    }

    @Override // y7.a0
    public final void d(long j3, int i10, int i11, int i12, z zVar) {
        long j10 = this.f27510f;
        if (j10 != C.TIME_UNSET && j3 >= j10) {
            this.f27509e = this.f27507c;
        }
        a0 a0Var = this.f27509e;
        int i13 = h0.a;
        a0Var.d(j3, i10, i11, i12, zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007d  */
    @Override // y7.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(s7.r0 r23) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.c.f(s7.r0):void");
    }

    public final void g(f fVar, long j3) {
        if (fVar == null) {
            this.f27509e = this.f27507c;
            return;
        }
        this.f27510f = j3;
        a0 a = ((b) fVar).a(this.a);
        this.f27509e = a;
        r0 r0Var = this.f27508d;
        if (r0Var != null) {
            a.f(r0Var);
        }
    }
}
