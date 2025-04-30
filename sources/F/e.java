package f;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0509t;
import androidx.lifecycle.InterfaceC0511v;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC0509t {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f20214c;

    public /* synthetic */ e(Object obj, int i9) {
        this.b = i9;
        this.f20214c = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0509t
    public final void b(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        Window window;
        View peekDecorView;
        switch (this.b) {
            case 0:
                l lVar = (l) this.f20214c;
                G7.j.e(lVar, "this$0");
                if (enumC0503m == EnumC0503m.ON_STOP && (window = lVar.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                    peekDecorView.cancelPendingInputEvents();
                    return;
                }
                return;
            case 1:
                l.c((l) this.f20214c, interfaceC0511v, enumC0503m);
                return;
            default:
                G0.e eVar = (G0.e) this.f20214c;
                G7.j.e(eVar, "this$0");
                if (enumC0503m == EnumC0503m.ON_START) {
                    eVar.f1247f = true;
                    return;
                } else {
                    if (enumC0503m == EnumC0503m.ON_STOP) {
                        eVar.f1247f = false;
                        return;
                    }
                    return;
                }
        }
    }
}
