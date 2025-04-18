package androidx.compose.runtime;

import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import q0.p;

@StabilityInferred
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {

    /* renamed from: a, reason: collision with root package name */
    public int f13868a;

    /* renamed from: b, reason: collision with root package name */
    public RecomposeScopeOwner f13869b;

    /* renamed from: c, reason: collision with root package name */
    public Anchor f13870c;
    public p d;
    public int e;

    /* renamed from: f, reason: collision with root package name */
    public MutableObjectIntMap f13871f;

    /* renamed from: g, reason: collision with root package name */
    public MutableScatterMap f13872g;

    /* loaded from: classes.dex */
    public static final class Companion {
        public static void a(SlotWriter slotWriter, List list, RecomposeScopeOwner recomposeScopeOwner) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int c2 = slotWriter.c((Anchor) list.get(i2));
                    int I = slotWriter.I(slotWriter.p(c2), slotWriter.f14002b);
                    Object obj = I < slotWriter.f(slotWriter.p(c2 + 1), slotWriter.f14002b) ? slotWriter.f14003c[slotWriter.g(I)] : Composer.Companion.f13690a;
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.f13869b = recomposeScopeOwner;
                    }
                }
            }
        }
    }

    public RecomposeScopeImpl(CompositionImpl compositionImpl) {
        this.f13869b = compositionImpl;
    }

    public static boolean a(DerivedState derivedState, MutableScatterMap mutableScatterMap) {
        p0.a.q(derivedState, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        SnapshotMutationPolicy f2 = derivedState.f();
        if (f2 == null) {
            f2 = StructuralEqualityPolicy.f14078a;
        }
        return !f2.a(derivedState.s().f13788f, mutableScatterMap.c(derivedState));
    }

    public final boolean b() {
        Anchor anchor;
        return (this.f13869b == null || (anchor = this.f13870c) == null || !anchor.a()) ? false : true;
    }

    public final InvalidationResult c(Object obj) {
        InvalidationResult l2;
        RecomposeScopeOwner recomposeScopeOwner = this.f13869b;
        return (recomposeScopeOwner == null || (l2 = recomposeScopeOwner.l(this, obj)) == null) ? InvalidationResult.f13812a : l2;
    }

    public final void d() {
        RecomposeScopeOwner recomposeScopeOwner = this.f13869b;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.c();
        }
        this.f13869b = null;
        this.f13871f = null;
        this.f13872g = null;
    }

    public final void e(boolean z2) {
        if (z2) {
            this.f13868a |= 32;
        } else {
            this.f13868a &= -33;
        }
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public final void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.f13869b;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.l(this, null);
        }
    }
}
