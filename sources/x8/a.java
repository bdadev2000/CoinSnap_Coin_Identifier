package x8;

import m9.p;
import s7.r0;
import v8.u0;

/* loaded from: classes3.dex */
public abstract class a extends e {

    /* renamed from: l, reason: collision with root package name */
    public final long f27500l;

    /* renamed from: m, reason: collision with root package name */
    public final long f27501m;

    /* renamed from: n, reason: collision with root package name */
    public final long f27502n;

    /* renamed from: o, reason: collision with root package name */
    public b f27503o;

    /* renamed from: p, reason: collision with root package name */
    public int[] f27504p;

    public a(m9.l lVar, p pVar, r0 r0Var, int i10, Object obj, long j3, long j10, long j11, long j12, long j13) {
        super(lVar, pVar, 1, r0Var, i10, obj, j3, j10);
        r0Var.getClass();
        this.f27500l = j13;
        this.f27501m = j11;
        this.f27502n = j12;
    }

    public final int a(int i10) {
        int[] iArr = this.f27504p;
        u0.p(iArr);
        return iArr[i10];
    }

    public long b() {
        long j3 = this.f27500l;
        if (j3 != -1) {
            return 1 + j3;
        }
        return -1L;
    }

    public abstract boolean c();
}
