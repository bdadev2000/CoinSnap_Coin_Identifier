package androidx.lifecycle;

import b1.o0;
import c1.e;
import d0.b0;
import g1.u;
import h0.g;
import h0.l;

/* loaded from: classes4.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineLiveData f20039a;

    /* renamed from: b, reason: collision with root package name */
    public final l f20040b;

    public LiveDataScopeImpl(l lVar) {
        p0.a.s(null, "target");
        p0.a.s(lVar, "context");
        this.f20039a = null;
        h1.d dVar = o0.f22355a;
        this.f20040b = lVar.u(((e) u.f30639a).f22411g);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public final Object emit(Object obj, g gVar) {
        Object G = kotlin.jvm.internal.e.G(gVar, this.f20040b, new LiveDataScopeImpl$emit$2(this, obj, null));
        return G == i0.a.f30806a ? G : b0.f30125a;
    }
}
