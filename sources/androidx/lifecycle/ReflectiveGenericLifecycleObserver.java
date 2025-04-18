package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements t {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1777b;

    /* renamed from: c, reason: collision with root package name */
    public final b f1778c;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f1777b = obj;
        this.f1778c = d.f1790c.b(obj.getClass());
    }

    @Override // androidx.lifecycle.t
    public final void a(v vVar, n nVar) {
        HashMap hashMap = this.f1778c.a;
        List list = (List) hashMap.get(nVar);
        Object obj = this.f1777b;
        b.a(list, vVar, nVar, obj);
        b.a((List) hashMap.get(n.ON_ANY), vVar, nVar, obj);
    }
}
