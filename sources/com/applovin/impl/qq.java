package com.applovin.impl;

import com.applovin.impl.ej;
import com.applovin.impl.of;
import y.AbstractC2933a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class qq implements hj {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f10423a;
    private final long[] b;

    /* renamed from: c, reason: collision with root package name */
    private final long f10424c;

    /* renamed from: d, reason: collision with root package name */
    private final long f10425d;

    private qq(long[] jArr, long[] jArr2, long j7, long j9) {
        this.f10423a = jArr;
        this.b = jArr2;
        this.f10424c = j7;
        this.f10425d = j9;
    }

    public static qq a(long j7, long j9, of.a aVar, yg ygVar) {
        int w2;
        ygVar.g(10);
        int j10 = ygVar.j();
        if (j10 <= 0) {
            return null;
        }
        int i9 = aVar.f9524d;
        long c9 = yp.c(j10, (i9 >= 32000 ? 1152 : 576) * 1000000, i9);
        int C8 = ygVar.C();
        int C9 = ygVar.C();
        int C10 = ygVar.C();
        ygVar.g(2);
        long j11 = j9 + aVar.f9523c;
        long[] jArr = new long[C8];
        long[] jArr2 = new long[C8];
        int i10 = 0;
        long j12 = j9;
        while (i10 < C8) {
            int i11 = C9;
            long j13 = j11;
            jArr[i10] = (i10 * c9) / C8;
            jArr2[i10] = Math.max(j12, j13);
            if (C10 == 1) {
                w2 = ygVar.w();
            } else if (C10 == 2) {
                w2 = ygVar.C();
            } else if (C10 == 3) {
                w2 = ygVar.z();
            } else {
                if (C10 != 4) {
                    return null;
                }
                w2 = ygVar.A();
            }
            j12 += w2 * i11;
            i10++;
            j11 = j13;
            C9 = i11;
        }
        if (j7 != -1 && j7 != j12) {
            StringBuilder a6 = AbstractC2933a.a("VBRI data size mismatch: ", j7, ", ");
            a6.append(j12);
            kc.d("VbriSeeker", a6.toString());
        }
        return new qq(jArr, jArr2, c9, j12);
    }

    @Override // com.applovin.impl.ej
    public boolean b() {
        return true;
    }

    @Override // com.applovin.impl.hj
    public long c() {
        return this.f10425d;
    }

    @Override // com.applovin.impl.ej
    public long d() {
        return this.f10424c;
    }

    @Override // com.applovin.impl.ej
    public ej.a b(long j7) {
        int b = yp.b(this.f10423a, j7, true, true);
        gj gjVar = new gj(this.f10423a[b], this.b[b]);
        if (gjVar.f7918a < j7 && b != this.f10423a.length - 1) {
            int i9 = b + 1;
            return new ej.a(gjVar, new gj(this.f10423a[i9], this.b[i9]));
        }
        return new ej.a(gjVar);
    }

    @Override // com.applovin.impl.hj
    public long a(long j7) {
        return this.f10423a[yp.b(this.b, j7, true, true)];
    }
}
