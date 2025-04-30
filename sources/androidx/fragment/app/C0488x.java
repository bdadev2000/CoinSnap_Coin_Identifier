package androidx.fragment.app;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.fragment.app.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0488x extends h.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f4800a;

    public C0488x(AtomicReference atomicReference) {
        this.f4800a = atomicReference;
    }

    @Override // h.c
    public final void a(Object obj) {
        h.c cVar = (h.c) this.f4800a.get();
        if (cVar != null) {
            cVar.a(obj);
            return;
        }
        throw new IllegalStateException("Operation cannot be started before fragment is in created state");
    }

    @Override // h.c
    public final void b() {
        h.c cVar = (h.c) this.f4800a.getAndSet(null);
        if (cVar != null) {
            cVar.b();
        }
    }
}
