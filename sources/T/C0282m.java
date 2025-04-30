package T;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0509t;
import androidx.lifecycle.InterfaceC0511v;

/* renamed from: T.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0282m implements InterfaceC0509t {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2904c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2905d;

    public /* synthetic */ C0282m(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f2904c = obj;
        this.f2905d = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0509t
    public final void b(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        switch (this.b) {
            case 0:
                EnumC0503m enumC0503m2 = EnumC0503m.ON_DESTROY;
                C0284o c0284o = (C0284o) this.f2904c;
                if (enumC0503m == enumC0503m2) {
                    c0284o.b((InterfaceC0286q) this.f2905d);
                    return;
                } else {
                    c0284o.getClass();
                    return;
                }
            default:
                f.x xVar = (f.x) this.f2904c;
                G7.j.e(xVar, "$dispatcher");
                f.l lVar = (f.l) this.f2905d;
                G7.j.e(lVar, "this$0");
                if (enumC0503m == EnumC0503m.ON_CREATE) {
                    OnBackInvokedDispatcher a6 = f.f.f20215a.a(lVar);
                    G7.j.e(a6, "invoker");
                    xVar.f20243e = a6;
                    xVar.e(xVar.f20245g);
                    return;
                }
                return;
        }
    }
}
