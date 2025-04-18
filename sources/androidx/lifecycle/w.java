package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class w {
    public o a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1828b;

    public w(u object, o initialState) {
        t reflectiveGenericLifecycleObserver;
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNull(object);
        HashMap hashMap = z.a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z10 = object instanceof t;
        boolean z11 = object instanceof f;
        if (z10 && z11) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((f) object, (t) object);
        } else if (z11) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((f) object, null);
        } else if (z10) {
            reflectiveGenericLifecycleObserver = (t) object;
        } else {
            Class<?> cls = object.getClass();
            if (z.c(cls) == 2) {
                Object obj = z.f1847b.get(cls);
                Intrinsics.checkNotNull(obj);
                List list = (List) obj;
                if (list.size() != 1) {
                    int size = list.size();
                    i[] iVarArr = new i[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        z.a((Constructor) list.get(i10), object);
                        iVarArr[i10] = null;
                    }
                    reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(iVarArr);
                } else {
                    z.a((Constructor) list.get(0), object);
                    new SingleGeneratedAdapterObserver();
                    throw null;
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(object);
            }
        }
        this.f1828b = reflectiveGenericLifecycleObserver;
        this.a = initialState;
    }

    public final void a(v vVar, n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        o a = event.a();
        o state1 = this.a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (a.compareTo(state1) < 0) {
            state1 = a;
        }
        this.a = state1;
        Intrinsics.checkNotNull(vVar);
        this.f1828b.a(vVar, event);
        this.a = a;
    }
}
