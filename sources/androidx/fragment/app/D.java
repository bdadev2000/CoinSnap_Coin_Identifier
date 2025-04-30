package androidx.fragment.app;

import i.AbstractC2330a;
import java.util.concurrent.atomic.AtomicReference;
import t.InterfaceC2702a;

/* loaded from: classes.dex */
public final class D extends F {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2702a f4625a;
    public final /* synthetic */ AtomicReference b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC2330a f4626c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h.b f4627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f4628e;

    public D(Fragment fragment, InterfaceC2702a interfaceC2702a, AtomicReference atomicReference, AbstractC2330a abstractC2330a, h.b bVar) {
        this.f4628e = fragment;
        this.f4625a = interfaceC2702a;
        this.b = atomicReference;
        this.f4626c = abstractC2330a;
        this.f4627d = bVar;
    }

    @Override // androidx.fragment.app.F
    public final void a() {
        Fragment fragment = this.f4628e;
        this.b.set(((h.i) this.f4625a.apply(null)).c(fragment.generateActivityResultKey(), fragment, this.f4626c, this.f4627d));
    }
}
