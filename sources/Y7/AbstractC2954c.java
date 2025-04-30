package y7;

import G7.j;
import Q7.C0238f;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w7.k;

/* renamed from: y7.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2954c extends AbstractC2952a {

    /* renamed from: c, reason: collision with root package name */
    public final k f24446c;

    /* renamed from: d, reason: collision with root package name */
    public transient w7.f f24447d;

    public AbstractC2954c(w7.f fVar, k kVar) {
        super(fVar);
        this.f24446c = kVar;
    }

    @Override // w7.f
    public k getContext() {
        k kVar = this.f24446c;
        j.b(kVar);
        return kVar;
    }

    @Override // y7.AbstractC2952a
    public void j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0238f c0238f;
        w7.f fVar = this.f24447d;
        if (fVar != null && fVar != this) {
            w7.i h6 = getContext().h(w7.g.b);
            j.b(h6);
            V7.h hVar = (V7.h) fVar;
            do {
                atomicReferenceFieldUpdater = V7.h.f3513j;
            } while (atomicReferenceFieldUpdater.get(hVar) == V7.a.f3506d);
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            if (obj instanceof C0238f) {
                c0238f = (C0238f) obj;
            } else {
                c0238f = null;
            }
            if (c0238f != null) {
                c0238f.p();
            }
        }
        this.f24447d = C2953b.b;
    }

    public AbstractC2954c(w7.f fVar) {
        this(fVar, fVar != null ? fVar.getContext() : null);
    }
}
