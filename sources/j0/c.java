package j0;

import b1.z;
import h0.j;
import h0.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class c extends a {

    @Nullable
    private final l _context;

    @Nullable
    private transient h0.g intercepted;

    public c(h0.g gVar, l lVar) {
        super(gVar);
        this._context = lVar;
    }

    @Override // h0.g
    @NotNull
    public l getContext() {
        l lVar = this._context;
        p0.a.p(lVar);
        return lVar;
    }

    @NotNull
    public final h0.g intercepted() {
        h0.g gVar = this.intercepted;
        if (gVar == null) {
            h0.i iVar = (h0.i) getContext().i(h0.h.f30725a);
            gVar = iVar != null ? new g1.i((z) iVar, this) : this;
            this.intercepted = gVar;
        }
        return gVar;
    }

    @Override // j0.a
    public void releaseIntercepted() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h0.g gVar = this.intercepted;
        if (gVar != null && gVar != this) {
            j i2 = getContext().i(h0.h.f30725a);
            p0.a.p(i2);
            g1.i iVar = (g1.i) gVar;
            do {
                atomicReferenceFieldUpdater = g1.i.f30615i;
            } while (atomicReferenceFieldUpdater.get(iVar) == g1.a.d);
            Object obj = atomicReferenceFieldUpdater.get(iVar);
            b1.l lVar = obj instanceof b1.l ? (b1.l) obj : null;
            if (lVar != null) {
                lVar.k();
            }
        }
        this.intercepted = b.f30858a;
    }

    public c(h0.g gVar) {
        this(gVar, gVar != null ? gVar.getContext() : null);
    }
}
