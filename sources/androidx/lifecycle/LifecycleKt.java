package androidx.lifecycle;

import b1.b2;
import b1.o0;
import c1.e;
import g1.u;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScopeImpl a(Lifecycle lifecycle) {
        p0.a.s(lifecycle, "<this>");
        while (true) {
            AtomicReference atomicReference = lifecycle.f19985a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl != null) {
                return lifecycleCoroutineScopeImpl;
            }
            b2 d = p0.a.d();
            h1.d dVar = o0.f22355a;
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = new LifecycleCoroutineScopeImpl(lifecycle, d.u(((e) u.f30639a).f22411g));
            while (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            h1.d dVar2 = o0.f22355a;
            kotlin.jvm.internal.e.v(lifecycleCoroutineScopeImpl2, ((e) u.f30639a).f22411g, 0, new LifecycleCoroutineScopeImpl$register$1(lifecycleCoroutineScopeImpl2, null), 2);
            return lifecycleCoroutineScopeImpl2;
        }
    }
}
