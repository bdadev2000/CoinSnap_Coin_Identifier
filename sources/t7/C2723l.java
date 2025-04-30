package t7;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: t7.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2723l implements InterfaceC2717f, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f23022d = AtomicReferenceFieldUpdater.newUpdater(C2723l.class, Object.class, com.mbridge.msdk.foundation.controller.a.f15376a);
    public volatile F7.a b;

    /* renamed from: c, reason: collision with root package name */
    public volatile Object f23023c;

    private final Object writeReplace() {
        return new C2715d(getValue());
    }

    @Override // t7.InterfaceC2717f
    public final Object getValue() {
        Object obj = this.f23023c;
        u uVar = u.f23028a;
        if (obj != uVar) {
            return obj;
        }
        F7.a aVar = this.b;
        if (aVar != null) {
            Object invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f23022d;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, uVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != uVar) {
                }
            }
            this.b = null;
            return invoke;
        }
        return this.f23023c;
    }

    public final String toString() {
        if (this.f23023c != u.f23028a) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
