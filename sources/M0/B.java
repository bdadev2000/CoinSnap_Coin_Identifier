package M0;

/* loaded from: classes.dex */
public final class B extends x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1838a;
    public w b;

    public /* synthetic */ B() {
        this.f1838a = 1;
    }

    @Override // M0.x, M0.u
    public void c(w wVar) {
        switch (this.f1838a) {
            case 1:
                C c9 = (C) this.b;
                int i9 = c9.f1841I - 1;
                c9.f1841I = i9;
                if (i9 == 0) {
                    c9.f1842J = false;
                    c9.m();
                }
                wVar.A(this);
                return;
            case 2:
                this.b.D();
                wVar.A(this);
                return;
            default:
                return;
        }
    }

    @Override // M0.x, M0.u
    public void d(w wVar) {
        switch (this.f1838a) {
            case 1:
                C c9 = (C) this.b;
                if (!c9.f1842J) {
                    c9.L();
                    c9.f1842J = true;
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // M0.x, M0.u
    public void f(w wVar) {
        switch (this.f1838a) {
            case 0:
                C c9 = (C) this.b;
                c9.f1839G.remove(wVar);
                if (!c9.s()) {
                    c9.x(c9, v.f1910T7, false);
                    c9.f1933t = true;
                    c9.x(c9, v.f1909S7, false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public /* synthetic */ B(w wVar, int i9) {
        this.f1838a = i9;
        this.b = wVar;
    }
}
