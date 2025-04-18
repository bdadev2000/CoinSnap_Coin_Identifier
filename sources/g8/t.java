package g8;

import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public final class t {
    public final q a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18363b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f18364c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f18365d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18366e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f18367f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f18368g;

    /* renamed from: h, reason: collision with root package name */
    public final long f18369h;

    public t(q qVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j3) {
        boolean z10;
        boolean z11;
        if (iArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        if (jArr.length == jArr2.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        u0.d(z11);
        u0.d(iArr2.length == jArr2.length);
        this.a = qVar;
        this.f18364c = jArr;
        this.f18365d = iArr;
        this.f18366e = i10;
        this.f18367f = jArr2;
        this.f18368g = iArr2;
        this.f18369h = j3;
        this.f18363b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j3) {
        long[] jArr = this.f18367f;
        for (int b3 = h0.b(jArr, j3, true); b3 < jArr.length; b3++) {
            if ((this.f18368g[b3] & 1) != 0) {
                return b3;
            }
        }
        return -1;
    }
}
