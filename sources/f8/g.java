package f8;

import n9.h0;
import y7.w;
import y7.y;

/* loaded from: classes3.dex */
public final class g implements f {
    public final long[] a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f17715b;

    /* renamed from: c, reason: collision with root package name */
    public final long f17716c;

    /* renamed from: d, reason: collision with root package name */
    public final long f17717d;

    public g(long[] jArr, long[] jArr2, long j3, long j10) {
        this.a = jArr;
        this.f17715b = jArr2;
        this.f17716c = j3;
        this.f17717d = j10;
    }

    @Override // f8.f
    public final long c() {
        return this.f17717d;
    }

    @Override // y7.x
    public final long getDurationUs() {
        return this.f17716c;
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        long[] jArr = this.a;
        int f10 = h0.f(jArr, j3, true);
        long j10 = jArr[f10];
        long[] jArr2 = this.f17715b;
        y yVar = new y(j10, jArr2[f10]);
        if (j10 < j3 && f10 != jArr.length - 1) {
            int i10 = f10 + 1;
            return new w(yVar, new y(jArr[i10], jArr2[i10]));
        }
        return new w(yVar, yVar);
    }

    @Override // f8.f
    public final long getTimeUs(long j3) {
        return this.a[h0.f(this.f17715b, j3, true)];
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return true;
    }
}
