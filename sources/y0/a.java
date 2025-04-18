package y0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a implements j {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f31422a;

    public a(e0.p pVar) {
        this.f31422a = new AtomicReference(pVar);
    }

    @Override // y0.j
    public final Iterator iterator() {
        j jVar = (j) this.f31422a.getAndSet(null);
        if (jVar != null) {
            return jVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
