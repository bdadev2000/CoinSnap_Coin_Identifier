package v8;

/* loaded from: classes3.dex */
public final class g0 implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final z0 f26123b;

    /* renamed from: c, reason: collision with root package name */
    public final long f26124c;

    public g0(z0 z0Var, long j3) {
        this.f26123b = z0Var;
        this.f26124c = j3;
    }

    @Override // v8.z0
    public final int d(r4.c cVar, w7.i iVar, int i10) {
        int d10 = this.f26123b.d(cVar, iVar, i10);
        if (d10 == -4) {
            iVar.f26892h = Math.max(0L, iVar.f26892h + this.f26124c);
        }
        return d10;
    }

    @Override // v8.z0
    public final boolean isReady() {
        return this.f26123b.isReady();
    }

    @Override // v8.z0
    public final void maybeThrowError() {
        this.f26123b.maybeThrowError();
    }

    @Override // v8.z0
    public final int skipData(long j3) {
        return this.f26123b.skipData(j3 - this.f26124c);
    }
}
