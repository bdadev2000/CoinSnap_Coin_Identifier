package y7;

import n9.h0;
import v8.u0;

/* loaded from: classes3.dex */
public final class v implements x {
    public final long[] a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f28008b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28009c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f28010d;

    public v(long[] jArr, long[] jArr2, long j3) {
        boolean z10;
        boolean z11;
        if (jArr.length == jArr2.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.d(z10);
        int length = jArr2.length;
        if (length > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f28010d = z11;
        if (z11 && jArr2[0] > 0) {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.a = jArr3;
            long[] jArr4 = new long[i10];
            this.f28008b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        } else {
            this.a = jArr;
            this.f28008b = jArr2;
        }
        this.f28009c = j3;
    }

    @Override // y7.x
    public final long getDurationUs() {
        return this.f28009c;
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        if (!this.f28010d) {
            y yVar = y.f28012c;
            return new w(yVar, yVar);
        }
        long[] jArr = this.f28008b;
        int f10 = h0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.a;
        y yVar2 = new y(j10, jArr2[f10]);
        if (j10 != j3 && f10 != jArr.length - 1) {
            int i10 = f10 + 1;
            return new w(yVar2, new y(jArr[i10], jArr2[i10]));
        }
        return new w(yVar2, yVar2);
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return this.f28010d;
    }
}
