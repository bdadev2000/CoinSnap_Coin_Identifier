package f;

import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0509t;
import androidx.lifecycle.InterfaceC0511v;

/* loaded from: classes.dex */
public final class u implements InterfaceC0509t, c {
    public final AbstractC0505o b;

    /* renamed from: c, reason: collision with root package name */
    public final o f20235c;

    /* renamed from: d, reason: collision with root package name */
    public v f20236d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f20237f;

    public u(x xVar, AbstractC0505o abstractC0505o, o oVar) {
        G7.j.e(oVar, "onBackPressedCallback");
        this.f20237f = xVar;
        this.b = abstractC0505o;
        this.f20235c = oVar;
        abstractC0505o.a(this);
    }

    @Override // androidx.lifecycle.InterfaceC0509t
    public final void b(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        if (enumC0503m == EnumC0503m.ON_START) {
            this.f20236d = this.f20237f.b(this.f20235c);
            return;
        }
        if (enumC0503m == EnumC0503m.ON_STOP) {
            v vVar = this.f20236d;
            if (vVar != null) {
                vVar.cancel();
                return;
            }
            return;
        }
        if (enumC0503m == EnumC0503m.ON_DESTROY) {
            cancel();
        }
    }

    @Override // f.c
    public final void cancel() {
        this.b.b(this);
        o oVar = this.f20235c;
        oVar.getClass();
        oVar.b.remove(this);
        v vVar = this.f20236d;
        if (vVar != null) {
            vVar.cancel();
        }
        this.f20236d = null;
    }
}
