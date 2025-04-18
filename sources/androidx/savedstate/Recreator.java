package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.k;
import androidx.lifecycle.n;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import androidx.lifecycle.x0;
import d6.g;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vd.e;
import y1.b;
import y1.d;
import y1.f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/t;", "ka/e", "h/k", "savedstate_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class Recreator implements t {

    /* renamed from: b, reason: collision with root package name */
    public final f f2103b;

    public Recreator(f owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f2103b = owner;
    }

    @Override // androidx.lifecycle.t
    public final void a(v source, n event) {
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == n.ON_CREATE) {
            source.getLifecycle().b(this);
            f owner = this.f2103b;
            Bundle a = owner.getSavedStateRegistry().a("androidx.savedstate.Restarter");
            if (a == null) {
                return;
            }
            ArrayList<String> stringArrayList = a.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(b.class);
                        Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(new Object[0]);
                                Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                                ((k) ((b) newInstance)).getClass();
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (owner instanceof e1) {
                                    d1 viewModelStore = ((e1) owner).getViewModelStore();
                                    d savedStateRegistry = owner.getSavedStateRegistry();
                                    viewModelStore.getClass();
                                    Iterator it = new HashSet(viewModelStore.a.keySet()).iterator();
                                    while (true) {
                                        boolean hasNext = it.hasNext();
                                        linkedHashMap = viewModelStore.a;
                                        if (!hasNext) {
                                            break;
                                        }
                                        String key = (String) it.next();
                                        Intrinsics.checkNotNullParameter(key, "key");
                                        x0 x0Var = (x0) linkedHashMap.get(key);
                                        Intrinsics.checkNotNull(x0Var);
                                        g.d(x0Var, savedStateRegistry, owner.getLifecycle());
                                    }
                                    if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                        savedStateRegistry.d();
                                    }
                                } else {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException(e.e("Failed to instantiate ", str), e2);
                            }
                        } catch (NoSuchMethodException e10) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                        }
                    } catch (ClassNotFoundException e11) {
                        throw new RuntimeException(com.applovin.impl.mediation.ads.e.f("Class ", str, " wasn't found"), e11);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
