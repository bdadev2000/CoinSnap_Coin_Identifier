package j8;

import n9.h0;
import y7.w;
import y7.x;
import y7.y;

/* loaded from: classes3.dex */
public final class f implements x {
    public final u7.b a;

    /* renamed from: b, reason: collision with root package name */
    public final int f19812b;

    /* renamed from: c, reason: collision with root package name */
    public final long f19813c;

    /* renamed from: d, reason: collision with root package name */
    public final long f19814d;

    /* renamed from: e, reason: collision with root package name */
    public final long f19815e;

    public f(u7.b bVar, int i10, long j3, long j10) {
        this.a = bVar;
        this.f19812b = i10;
        this.f19813c = j3;
        long j11 = (j10 - j3) / bVar.f25540f;
        this.f19814d = j11;
        this.f19815e = a(j11);
    }

    public final long a(long j3) {
        return h0.M(j3 * this.f19812b, 1000000L, this.a.f25538d);
    }

    @Override // y7.x
    public final long getDurationUs() {
        return this.f19815e;
    }

    @Override // y7.x
    public final w getSeekPoints(long j3) {
        u7.b bVar = this.a;
        long j10 = this.f19814d;
        long i10 = h0.i((bVar.f25538d * j3) / (this.f19812b * 1000000), 0L, j10 - 1);
        long j11 = this.f19813c;
        long a = a(i10);
        y yVar = new y(a, (bVar.f25540f * i10) + j11);
        if (a < j3 && i10 != j10 - 1) {
            long j12 = i10 + 1;
            return new w(yVar, new y(a(j12), (bVar.f25540f * j12) + j11));
        }
        return new w(yVar, yVar);
    }

    @Override // y7.x
    public final boolean isSeekable() {
        return true;
    }
}
