package e1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class j1 extends f1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f30293a = AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "_state");

    @Nullable
    private volatile Object _state;

    @Override // f1.d
    public final boolean a(f1.b bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f30293a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, t0.f30346b);
        return true;
    }

    @Override // f1.d
    public final h0.g[] b(f1.b bVar) {
        f30293a.set(this, null);
        return f1.c.f30457a;
    }
}
