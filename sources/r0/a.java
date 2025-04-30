package R0;

import G7.j;
import android.os.Handler;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.AbstractC0496f;
import androidx.lifecycle.AbstractC0505o;
import androidx.lifecycle.C0492b;
import androidx.lifecycle.C0494d;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0495e;
import androidx.lifecycle.InterfaceC0509t;
import androidx.lifecycle.InterfaceC0511v;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class a implements InterfaceC0509t {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2615c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2616d;

    public /* synthetic */ a(int i9, Object obj, Object obj2) {
        this.b = i9;
        this.f2615c = obj;
        this.f2616d = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0509t
    public final void b(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        switch (this.b) {
            case 0:
                F6.a aVar = (F6.a) this.f2616d;
                if (!aVar.f1211j.isStateSaved()) {
                    interfaceC0511v.getLifecycle().b(this);
                    e eVar = (e) this.f2615c;
                    if (ViewCompat.isAttachedToWindow((FrameLayout) eVar.itemView)) {
                        aVar.e(eVar);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (enumC0503m == EnumC0503m.ON_DESTROY) {
                    ((Handler) this.f2615c).removeCallbacks((Runnable) this.f2616d);
                    interfaceC0511v.getLifecycle().b(this);
                    return;
                }
                return;
            case 2:
                int i9 = AbstractC0496f.f4889a[enumC0503m.ordinal()];
                InterfaceC0495e interfaceC0495e = (InterfaceC0495e) this.f2615c;
                switch (i9) {
                    case 1:
                        interfaceC0495e.getClass();
                        break;
                    case 2:
                        interfaceC0495e.getClass();
                        break;
                    case 3:
                        interfaceC0495e.a(interfaceC0511v);
                        break;
                    case 4:
                        interfaceC0495e.c(interfaceC0511v);
                        break;
                    case 5:
                        interfaceC0495e.getClass();
                        break;
                    case 6:
                        interfaceC0495e.onDestroy(interfaceC0511v);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                InterfaceC0509t interfaceC0509t = (InterfaceC0509t) this.f2616d;
                if (interfaceC0509t != null) {
                    interfaceC0509t.b(interfaceC0511v, enumC0503m);
                    return;
                }
                return;
            case 3:
                if (enumC0503m == EnumC0503m.ON_START) {
                    ((AbstractC0505o) this.f2615c).b(this);
                    ((G0.e) this.f2616d).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0492b) this.f2616d).f4881a;
                List list = (List) hashMap.get(enumC0503m);
                Object obj = this.f2615c;
                C0492b.a(list, interfaceC0511v, enumC0503m, obj);
                C0492b.a((List) hashMap.get(EnumC0503m.ON_ANY), interfaceC0511v, enumC0503m, obj);
                return;
        }
    }

    public a(InterfaceC0495e interfaceC0495e, InterfaceC0509t interfaceC0509t) {
        this.b = 2;
        j.e(interfaceC0495e, "defaultLifecycleObserver");
        this.f2615c = interfaceC0495e;
        this.f2616d = interfaceC0509t;
    }

    public a(Object obj) {
        this.b = 4;
        this.f2615c = obj;
        C0494d c0494d = C0494d.f4886c;
        Class<?> cls = obj.getClass();
        C0492b c0492b = (C0492b) c0494d.f4887a.get(cls);
        this.f2616d = c0492b == null ? c0494d.a(cls, null) : c0492b;
    }

    public a(F6.a aVar, e eVar) {
        this.b = 0;
        this.f2616d = aVar;
        this.f2615c = eVar;
    }
}
