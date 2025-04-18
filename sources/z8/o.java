package z8;

import java.util.List;

/* loaded from: classes3.dex */
public final class o extends n {

    /* renamed from: j, reason: collision with root package name */
    public final List f28648j;

    public o(j jVar, long j3, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
        super(jVar, j3, j10, j11, j12, list, j13, j14, j15);
        this.f28648j = list2;
    }

    @Override // z8.n
    public final long d(long j3) {
        return this.f28648j.size();
    }

    @Override // z8.n
    public final j h(long j3, m mVar) {
        return (j) this.f28648j.get((int) (j3 - this.f28642d));
    }

    @Override // z8.n
    public final boolean i() {
        return true;
    }
}
