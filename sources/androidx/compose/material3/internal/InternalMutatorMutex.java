package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import b1.h1;
import i1.d;
import i1.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;

@Stable
/* loaded from: classes3.dex */
public final class InternalMutatorMutex {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f12991a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final d f12992b = e.a();

    /* loaded from: classes3.dex */
    public static final class Mutator {

        /* renamed from: a, reason: collision with root package name */
        public final MutatePriority f12993a;

        /* renamed from: b, reason: collision with root package name */
        public final h1 f12994b;

        public Mutator(MutatePriority mutatePriority, h1 h1Var) {
            this.f12993a = mutatePriority;
            this.f12994b = h1Var;
        }
    }

    public static final void a(InternalMutatorMutex internalMutatorMutex, Mutator mutator) {
        while (true) {
            AtomicReference atomicReference = internalMutatorMutex.f12991a;
            Mutator mutator2 = (Mutator) atomicReference.get();
            if (mutator2 != null && mutator.f12993a.compareTo(mutator2.f12993a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(mutator2, mutator)) {
                if (atomicReference.get() != mutator2) {
                    break;
                }
            }
            if (mutator2 != null) {
                mutator2.f12994b.a(null);
                return;
            }
            return;
        }
    }
}
