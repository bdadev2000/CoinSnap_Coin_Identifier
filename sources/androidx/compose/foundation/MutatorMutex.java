package androidx.compose.foundation;

import androidx.compose.runtime.Stable;
import b1.h1;
import h0.g;
import i1.d;
import i1.e;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p0.a;
import q0.l;
import q0.p;

@Stable
/* loaded from: classes.dex */
public final class MutatorMutex {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f2814a = new AtomicReference(null);

    /* renamed from: b, reason: collision with root package name */
    public final d f2815b = e.a();

    /* loaded from: classes.dex */
    public static final class Mutator {

        /* renamed from: a, reason: collision with root package name */
        public final MutatePriority f2816a;

        /* renamed from: b, reason: collision with root package name */
        public final h1 f2817b;

        public Mutator(MutatePriority mutatePriority, h1 h1Var) {
            this.f2816a = mutatePriority;
            this.f2817b = h1Var;
        }
    }

    public static final void a(MutatorMutex mutatorMutex, Mutator mutator) {
        while (true) {
            AtomicReference atomicReference = mutatorMutex.f2814a;
            Mutator mutator2 = (Mutator) atomicReference.get();
            if (mutator2 != null && mutator.f2816a.compareTo(mutator2.f2816a) < 0) {
                throw new CancellationException("Current mutation had a higher priority");
            }
            while (!atomicReference.compareAndSet(mutator2, mutator)) {
                if (atomicReference.get() != mutator2) {
                    break;
                }
            }
            if (mutator2 != null) {
                mutator2.f2817b.a(new CancellationException("Mutation interrupted"));
                return;
            }
            return;
        }
    }

    public final Object b(MutatePriority mutatePriority, l lVar, g gVar) {
        return a.J(new MutatorMutex$mutate$2(mutatePriority, this, lVar, null), gVar);
    }

    public final Object c(Object obj, MutatePriority mutatePriority, p pVar, g gVar) {
        return a.J(new MutatorMutex$mutateWith$2(mutatePriority, this, pVar, obj, null), gVar);
    }
}
