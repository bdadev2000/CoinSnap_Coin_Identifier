package androidx.compose.animation.core;

import androidx.compose.runtime.Stable;
import b1.h1;
import h0.g;
import i1.d;
import i1.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import q0.l;

@Stable
/* loaded from: classes2.dex */
public final class MutatorMutex {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2138a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final d f2139b = e.a();

    /* loaded from: classes2.dex */
    public static final class Mutator {

        /* renamed from: a, reason: collision with root package name */
        public final MutatePriority f2140a;

        /* renamed from: b, reason: collision with root package name */
        public final h1 f2141b;

        public Mutator(MutatePriority mutatePriority, h1 h1Var) {
            this.f2140a = mutatePriority;
            this.f2141b = h1Var;
        }
    }

    public static final void a(MutatorMutex mutatorMutex, Mutator mutator) {
        while (true) {
            AtomicReference atomicReference = mutatorMutex.f2138a;
            Mutator mutator2 = (Mutator) atomicReference.get();
            if (mutator2 != null && mutator.f2140a.compareTo(mutator2.f2140a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(mutator2, mutator)) {
                if (atomicReference.get() != mutator2) {
                    break;
                }
            }
            if (mutator2 != null) {
                mutator2.f2141b.a(new CancellationException("Mutation interrupted"));
                return;
            }
            return;
        }
    }

    public static Object b(MutatorMutex mutatorMutex, l lVar, g gVar) {
        MutatePriority mutatePriority = MutatePriority.f2136a;
        mutatorMutex.getClass();
        return p0.a.J(new MutatorMutex$mutate$2(mutatePriority, mutatorMutex, lVar, null), gVar);
    }
}
