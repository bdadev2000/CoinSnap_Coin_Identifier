package androidx.compose.material3.internal;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.StructuralEqualityPolicy;
import b1.k;
import d0.b0;
import h0.g;

/* JADX INFO: Access modifiers changed from: package-private */
@Stable
/* loaded from: classes4.dex */
public final class BasicTooltipStateImpl implements TooltipState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12865a;

    /* renamed from: b, reason: collision with root package name */
    public final MutatorMutex f12866b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f12867c;
    public final MutableTransitionState d;
    public k e;

    public BasicTooltipStateImpl(boolean z2, boolean z3, MutatorMutex mutatorMutex) {
        ParcelableSnapshotMutableState f2;
        this.f12865a = z3;
        this.f12866b = mutatorMutex;
        f2 = SnapshotStateKt.f(Boolean.valueOf(z2), StructuralEqualityPolicy.f14078a);
        this.f12867c = f2;
        this.d = new MutableTransitionState(Boolean.FALSE);
    }

    @Override // androidx.compose.material3.TooltipState
    public final void a() {
        k kVar = this.e;
        if (kVar != null) {
            kVar.A(null);
        }
    }

    @Override // androidx.compose.material3.TooltipState
    public final Object b(MutatePriority mutatePriority, g gVar) {
        Object b2 = this.f12866b.b(mutatePriority, new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null), gVar);
        return b2 == i0.a.f30806a ? b2 : b0.f30125a;
    }

    @Override // androidx.compose.material3.TooltipState
    public final MutableTransitionState c() {
        return this.d;
    }

    @Override // androidx.compose.material3.TooltipState
    public final void dismiss() {
        this.f12867c.setValue(Boolean.FALSE);
    }

    @Override // androidx.compose.material3.TooltipState
    public final boolean isVisible() {
        return ((Boolean) this.f12867c.getValue()).booleanValue();
    }
}
