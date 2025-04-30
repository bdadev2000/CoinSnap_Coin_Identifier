package G0;

import G7.j;
import android.os.Bundle;
import androidx.lifecycle.EnumC0503m;
import androidx.lifecycle.InterfaceC0498h;
import androidx.lifecycle.InterfaceC0509t;
import androidx.lifecycle.InterfaceC0511v;
import androidx.lifecycle.V;
import androidx.lifecycle.W;
import androidx.lifecycle.b0;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import f.l;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class b implements InterfaceC0509t {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f1242c;

    public /* synthetic */ b(Object obj, int i9) {
        this.b = i9;
        this.f1242c = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0509t
    public final void b(InterfaceC0511v interfaceC0511v, EnumC0503m enumC0503m) {
        switch (this.b) {
            case 0:
                if (enumC0503m == EnumC0503m.ON_CREATE) {
                    interfaceC0511v.getLifecycle().b(this);
                    g gVar = (g) this.f1242c;
                    Bundle a6 = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                    if (a6 != null) {
                        ArrayList<String> stringArrayList = a6.getStringArrayList("classes_to_restore");
                        if (stringArrayList != null) {
                            for (String str : stringArrayList) {
                                try {
                                    Class<? extends U> asSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                                    j.d(asSubclass, "{\n                Class.…class.java)\n            }");
                                    try {
                                        Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                        declaredConstructor.setAccessible(true);
                                        try {
                                            Object newInstance = declaredConstructor.newInstance(null);
                                            j.d(newInstance, "{\n                constr…wInstance()\n            }");
                                            if (gVar instanceof g0) {
                                                f0 viewModelStore = ((g0) gVar).getViewModelStore();
                                                e savedStateRegistry = gVar.getSavedStateRegistry();
                                                viewModelStore.getClass();
                                                LinkedHashMap linkedHashMap = viewModelStore.f4890a;
                                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                                while (it.hasNext()) {
                                                    String str2 = (String) it.next();
                                                    j.e(str2, "key");
                                                    b0 b0Var = (b0) linkedHashMap.get(str2);
                                                    j.b(b0Var);
                                                    V.a(b0Var, savedStateRegistry, gVar.getLifecycle());
                                                }
                                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                                    savedStateRegistry.d();
                                                }
                                            } else {
                                                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                            }
                                        } catch (Exception e4) {
                                            throw new RuntimeException(AbstractC2914a.d("Failed to instantiate ", str), e4);
                                        }
                                    } catch (NoSuchMethodException e9) {
                                        throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
                                    }
                                } catch (ClassNotFoundException e10) {
                                    throw new RuntimeException(AbstractC2914a.e("Class ", str, " wasn't found"), e10);
                                }
                            }
                            return;
                        }
                        throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    }
                    return;
                }
                throw new AssertionError("Next event must be ON_CREATE");
            case 1:
                ((R0.d) this.f1242c).c(false);
                return;
            case 2:
                new HashMap();
                InterfaceC0498h[] interfaceC0498hArr = (InterfaceC0498h[]) this.f1242c;
                if (interfaceC0498hArr.length <= 0) {
                    if (interfaceC0498hArr.length <= 0) {
                        return;
                    }
                    InterfaceC0498h interfaceC0498h = interfaceC0498hArr[0];
                    throw null;
                }
                InterfaceC0498h interfaceC0498h2 = interfaceC0498hArr[0];
                throw null;
            case 3:
                if (enumC0503m == EnumC0503m.ON_CREATE) {
                    interfaceC0511v.getLifecycle().b(this);
                    ((W) this.f1242c).b();
                    return;
                }
                throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0503m).toString());
            default:
                l lVar = (l) this.f1242c;
                l.access$ensureViewModelStore(lVar);
                lVar.getLifecycle().b(this);
                return;
        }
    }

    public b(g gVar) {
        this.b = 0;
        j.e(gVar, "owner");
        this.f1242c = gVar;
    }
}
