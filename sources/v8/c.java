package v8;

/* loaded from: classes3.dex */
public final class c implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public final z0 f26079b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f26081d;

    public c(d dVar, z0 z0Var) {
        this.f26081d = dVar;
        this.f26079b = z0Var;
    }

    @Override // v8.z0
    public final int d(r4.c cVar, w7.i iVar, int i10) {
        d dVar = this.f26081d;
        if (dVar.c()) {
            return -3;
        }
        if (this.f26080c) {
            iVar.f26867c = 4;
            return -4;
        }
        int d10 = this.f26079b.d(cVar, iVar, i10);
        if (d10 == -5) {
            s7.r0 r0Var = (s7.r0) cVar.f24000d;
            r0Var.getClass();
            int i11 = r0Var.D;
            int i12 = r0Var.E;
            if (i11 != 0 || i12 != 0) {
                if (dVar.f26089g != 0) {
                    i11 = 0;
                }
                if (dVar.f26090h != Long.MIN_VALUE) {
                    i12 = 0;
                }
                s7.q0 a = r0Var.a();
                a.A = i11;
                a.B = i12;
                cVar.f24000d = a.a();
            }
            return -5;
        }
        long j3 = dVar.f26090h;
        if (j3 != Long.MIN_VALUE && ((d10 == -4 && iVar.f26892h >= j3) || (d10 == -3 && dVar.getBufferedPositionUs() == Long.MIN_VALUE && !iVar.f26891g))) {
            iVar.e();
            iVar.f26867c = 4;
            this.f26080c = true;
            return -4;
        }
        return d10;
    }

    @Override // v8.z0
    public final boolean isReady() {
        return !this.f26081d.c() && this.f26079b.isReady();
    }

    @Override // v8.z0
    public final void maybeThrowError() {
        this.f26079b.maybeThrowError();
    }

    @Override // v8.z0
    public final int skipData(long j3) {
        if (this.f26081d.c()) {
            return -3;
        }
        return this.f26079b.skipData(j3);
    }
}
