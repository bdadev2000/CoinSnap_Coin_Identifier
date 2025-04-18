package v8;

/* loaded from: classes3.dex */
public final class e1 implements z0 {

    /* renamed from: b, reason: collision with root package name */
    public int f26103b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f26104c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f26105d;

    public e1(g1 g1Var) {
        this.f26105d = g1Var;
    }

    public final void a() {
        if (!this.f26104c) {
            g1 g1Var = this.f26105d;
            g1Var.f26129g.d(n9.q.h(g1Var.f26134l.f24723n), g1Var.f26134l, 0, null, 0L);
            this.f26104c = true;
        }
    }

    @Override // v8.z0
    public final int d(r4.c cVar, w7.i iVar, int i10) {
        a();
        g1 g1Var = this.f26105d;
        boolean z10 = g1Var.f26136n;
        if (z10 && g1Var.f26137o == null) {
            this.f26103b = 2;
        }
        int i11 = this.f26103b;
        if (i11 == 2) {
            iVar.a(4);
            return -4;
        }
        if ((i10 & 2) == 0 && i11 != 0) {
            if (!z10) {
                return -3;
            }
            g1Var.f26137o.getClass();
            iVar.a(1);
            iVar.f26892h = 0L;
            if ((i10 & 4) == 0) {
                iVar.g(g1Var.f26138p);
                iVar.f26890f.put(g1Var.f26137o, 0, g1Var.f26138p);
            }
            if ((i10 & 1) == 0) {
                this.f26103b = 2;
            }
            return -4;
        }
        cVar.f24000d = g1Var.f26134l;
        this.f26103b = 1;
        return -5;
    }

    @Override // v8.z0
    public final boolean isReady() {
        return this.f26105d.f26136n;
    }

    @Override // v8.z0
    public final void maybeThrowError() {
        g1 g1Var = this.f26105d;
        if (!g1Var.f26135m) {
            g1Var.f26133k.maybeThrowError();
        }
    }

    @Override // v8.z0
    public final int skipData(long j3) {
        a();
        if (j3 > 0 && this.f26103b != 2) {
            this.f26103b = 2;
            return 1;
        }
        return 0;
    }
}
