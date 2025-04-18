package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.Stable;
import h0.g;

@Stable
/* loaded from: classes4.dex */
final class TooltipStateImpl implements TooltipState {
    @Override // androidx.compose.material3.TooltipState
    public final void a() {
    }

    @Override // androidx.compose.material3.TooltipState
    public final Object b(MutatePriority mutatePriority, g gVar) {
        new TooltipStateImpl$show$2(this, new TooltipStateImpl$show$cancellableShow$1(this, null), mutatePriority, null);
        throw null;
    }

    @Override // androidx.compose.material3.TooltipState
    public final MutableTransitionState c() {
        return null;
    }

    @Override // androidx.compose.material3.TooltipState
    public final void dismiss() {
        throw null;
    }

    @Override // androidx.compose.material3.TooltipState
    public final boolean isVisible() {
        throw null;
    }
}
