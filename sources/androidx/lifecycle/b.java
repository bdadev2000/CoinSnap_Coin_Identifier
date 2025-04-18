package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import d1.p;
import d1.q;
import e1.i1;
import e1.m0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements LifecycleEventObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20136b;

    public /* synthetic */ b(Object obj, int i2) {
        this.f20135a = i2;
        this.f20136b = obj;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void c(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        int i2 = this.f20135a;
        Object obj = this.f20136b;
        switch (i2) {
            case 0:
                ((p) ((q) obj)).b(event);
                return;
            default:
                m0 m0Var = (m0) obj;
                p0.a.s(m0Var, "$mutableStateFlow");
                ((i1) m0Var).h(event.a());
                return;
        }
    }
}
