package i1;

import b1.l;
import b1.m2;
import b1.z;
import d0.b0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes3.dex */
public final class c implements b1.k, m2 {

    /* renamed from: a, reason: collision with root package name */
    public final l f30818a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f30819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f30820c;

    public c(d dVar, l lVar, Object obj) {
        this.f30820c = dVar;
        this.f30818a = lVar;
        this.f30819b = obj;
    }

    @Override // b1.k
    public final boolean A(Throwable th) {
        return this.f30818a.A(th);
    }

    @Override // b1.k
    public final android.support.v4.media.session.i B(Object obj, q0.l lVar) {
        d dVar = this.f30820c;
        b bVar = new b(dVar, this, 1);
        android.support.v4.media.session.i D = this.f30818a.D((b0) obj, bVar);
        if (D != null) {
            d.f30821h.set(dVar, this.f30819b);
        }
        return D;
    }

    @Override // b1.k
    public final void E(z zVar) {
        this.f30818a.E(zVar);
    }

    @Override // b1.k
    public final void G(Object obj) {
        this.f30818a.G(obj);
    }

    @Override // b1.m2
    public final void a(g1.z zVar, int i2) {
        this.f30818a.a(zVar, i2);
    }

    @Override // h0.g
    public final h0.l getContext() {
        return this.f30818a.f22340f;
    }

    @Override // b1.k
    public final boolean isActive() {
        return this.f30818a.isActive();
    }

    @Override // b1.k
    public final void m(Object obj, q0.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f30821h;
        Object obj2 = this.f30819b;
        d dVar = this.f30820c;
        atomicReferenceFieldUpdater.set(dVar, obj2);
        b bVar = new b(dVar, this, 0);
        this.f30818a.m((b0) obj, bVar);
    }

    @Override // b1.k
    public final android.support.v4.media.session.i q(Throwable th) {
        return this.f30818a.q(th);
    }

    @Override // h0.g
    public final void resumeWith(Object obj) {
        this.f30818a.resumeWith(obj);
    }

    @Override // b1.k
    public final void z(q0.l lVar) {
        this.f30818a.z(lVar);
    }
}
