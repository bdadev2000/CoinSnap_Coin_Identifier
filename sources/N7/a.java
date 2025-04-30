package N7;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2122a;

    public a(f fVar) {
        this.f2122a = new AtomicReference(fVar);
    }

    @Override // N7.f
    public final Iterator iterator() {
        f fVar = (f) this.f2122a.getAndSet(null);
        if (fVar != null) {
            return fVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
