package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class k extends b2 {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f887l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f888m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ View f889n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(View view, View view2, Object obj, int i10) {
        super(view2);
        this.f887l = i10;
        this.f889n = view;
        this.f888m = obj;
    }

    @Override // androidx.appcompat.widget.b2
    public final k.g0 b() {
        switch (this.f887l) {
            case 0:
                h hVar = ((l) this.f889n).f914b.u;
                if (hVar == null) {
                    return null;
                }
                return hVar.a();
            default:
                return (q0) this.f888m;
        }
    }

    @Override // androidx.appcompat.widget.b2
    public final boolean c() {
        int i10 = this.f887l;
        View view = this.f889n;
        switch (i10) {
            case 0:
                ((l) view).f914b.l();
                return true;
            default:
                t0 t0Var = (t0) view;
                if (!t0Var.getInternalPopup().a()) {
                    t0Var.f1036h.j(l0.b(t0Var), l0.a(t0Var));
                }
                return true;
        }
    }

    @Override // androidx.appcompat.widget.b2
    public final boolean d() {
        switch (this.f887l) {
            case 0:
                m mVar = ((l) this.f889n).f914b;
                if (mVar.f935w != null) {
                    return false;
                }
                mVar.j();
                return true;
            default:
                super.d();
                return true;
        }
    }
}
