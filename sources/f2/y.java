package f2;

/* loaded from: classes.dex */
public final class y extends u {
    public final /* synthetic */ int a;

    /* renamed from: b, reason: collision with root package name */
    public final z f17666b;

    public y(z zVar, int i10) {
        this.a = i10;
        if (i10 != 1) {
            this.f17666b = zVar;
        } else {
            this.f17666b = zVar;
        }
    }

    @Override // f2.u, f2.r
    public final void c(t tVar) {
        switch (this.a) {
            case 0:
                z zVar = this.f17666b;
                zVar.D.remove(tVar);
                if (!zVar.s()) {
                    zVar.x(s.f17634c8);
                    zVar.f17655t = true;
                    zVar.x(s.f17633b8);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // f2.u, f2.r
    public final void e(t tVar) {
        switch (this.a) {
            case 1:
                z zVar = this.f17666b;
                if (!zVar.G) {
                    zVar.J();
                    zVar.G = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // f2.r
    public final void f(t tVar) {
        switch (this.a) {
            case 1:
                z zVar = this.f17666b;
                int i10 = zVar.F - 1;
                zVar.F = i10;
                if (i10 == 0) {
                    zVar.G = false;
                    zVar.m();
                }
                tVar.z(this);
                return;
            default:
                return;
        }
    }
}
