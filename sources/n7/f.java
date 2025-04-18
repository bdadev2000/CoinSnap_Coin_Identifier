package n7;

import s7.f2;
import s7.g2;
import s7.i0;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements p7.b, n9.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22474b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f22475c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f22476d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f22477f;

    public /* synthetic */ f(int i10, g2 g2Var, g2 g2Var2) {
        this.f22475c = i10;
        this.f22476d = g2Var;
        this.f22477f = g2Var2;
    }

    @Override // p7.b
    public final Object execute() {
        i iVar = (i) this.f22476d;
        ((c) iVar.f22488d).a((i7.i) this.f22477f, this.f22475c + 1, false);
        return null;
    }

    @Override // n9.l
    public final void invoke(Object obj) {
        switch (this.f22474b) {
            case 1:
                g2 g2Var = (g2) this.f22476d;
                g2 g2Var2 = (g2) this.f22477f;
                f2 f2Var = (f2) obj;
                int i10 = i0.f24392i0;
                f2Var.I();
                f2Var.F(this.f22475c, g2Var, g2Var2);
                return;
            default:
                ((t7.c) obj).getClass();
                return;
        }
    }

    public /* synthetic */ f(t7.b bVar, Object obj, int i10) {
        this.f22476d = bVar;
        this.f22477f = obj;
        this.f22475c = i10;
    }
}
