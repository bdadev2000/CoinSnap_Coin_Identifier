package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class x extends a0 {
    public final /* synthetic */ n.a a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f1735b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f.b f1736c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.b f1737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Fragment f1738e;

    public x(Fragment fragment, n.a aVar, AtomicReference atomicReference, f.b bVar, androidx.activity.result.b bVar2) {
        this.f1738e = fragment;
        this.a = aVar;
        this.f1735b = atomicReference;
        this.f1736c = bVar;
        this.f1737d = bVar2;
    }

    @Override // androidx.fragment.app.a0
    public final void a() {
        Fragment fragment = this.f1738e;
        this.f1735b.set(((androidx.activity.result.g) this.a.apply(null)).c(fragment.generateActivityResultKey(), fragment, this.f1736c, this.f1737d));
    }
}
