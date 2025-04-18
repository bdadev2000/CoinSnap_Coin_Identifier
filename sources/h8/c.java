package h8;

import n9.h0;
import v8.u0;
import y7.m;
import y7.r;
import y7.s;
import y7.x;

/* loaded from: classes3.dex */
public final class c implements h {

    /* renamed from: b, reason: collision with root package name */
    public final s f18880b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.c f18881c;

    /* renamed from: d, reason: collision with root package name */
    public long f18882d = -1;

    /* renamed from: f, reason: collision with root package name */
    public long f18883f = -1;

    public c(s sVar, r4.c cVar) {
        this.f18880b = sVar;
        this.f18881c = cVar;
    }

    @Override // h8.h
    public final long a(m mVar) {
        long j3 = this.f18883f;
        if (j3 < 0) {
            return -1L;
        }
        long j10 = -(j3 + 2);
        this.f18883f = -1L;
        return j10;
    }

    @Override // h8.h
    public final x createSeekMap() {
        boolean z10;
        int i10 = 0;
        if (this.f18882d != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        u0.m(z10);
        return new r(this.f18880b, this.f18882d, i10);
    }

    @Override // h8.h
    public final void startSeek(long j3) {
        long[] jArr = (long[]) this.f18881c.f23999c;
        this.f18883f = jArr[h0.f(jArr, j3, true)];
    }
}
