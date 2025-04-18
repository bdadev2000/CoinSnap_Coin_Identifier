package j;

import androidx.appcompat.widget.z3;
import n0.s1;

/* loaded from: classes.dex */
public final class l extends p6.a {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f19700f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19701g;

    /* renamed from: h, reason: collision with root package name */
    public int f19702h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f19703i;

    public l(m mVar) {
        this.f19700f = 0;
        this.f19703i = mVar;
        this.f19701g = false;
        this.f19702h = 0;
    }

    @Override // p6.a, n0.s1
    public final void a() {
        switch (this.f19700f) {
            case 1:
                this.f19701g = true;
                return;
            default:
                return;
        }
    }

    @Override // p6.a, n0.s1
    public final void b() {
        int i10 = this.f19700f;
        Object obj = this.f19703i;
        switch (i10) {
            case 0:
                if (!this.f19701g) {
                    this.f19701g = true;
                    s1 s1Var = ((m) obj).f19706d;
                    if (s1Var != null) {
                        s1Var.b();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((z3) obj).a.setVisibility(0);
                return;
        }
    }

    @Override // n0.s1
    public final void c() {
        int i10 = this.f19700f;
        Object obj = this.f19703i;
        switch (i10) {
            case 0:
                int i11 = this.f19702h + 1;
                this.f19702h = i11;
                m mVar = (m) obj;
                if (i11 == mVar.a.size()) {
                    s1 s1Var = mVar.f19706d;
                    if (s1Var != null) {
                        s1Var.c();
                    }
                    this.f19702h = 0;
                    this.f19701g = false;
                    mVar.f19707e = false;
                    return;
                }
                return;
            default:
                if (!this.f19701g) {
                    ((z3) obj).a.setVisibility(this.f19702h);
                    return;
                }
                return;
        }
    }

    public l(z3 z3Var, int i10) {
        this.f19700f = 1;
        this.f19703i = z3Var;
        this.f19702h = i10;
        this.f19701g = false;
    }
}
