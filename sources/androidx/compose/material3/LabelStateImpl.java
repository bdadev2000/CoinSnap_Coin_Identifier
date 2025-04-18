package androidx.compose.material3;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.MutatePriority;
import d0.b0;
import h0.g;

/* loaded from: classes2.dex */
final class LabelStateImpl implements TooltipState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9651a = true;

    /* renamed from: b, reason: collision with root package name */
    public final MutableTransitionState f9652b = new MutableTransitionState(Boolean.FALSE);

    @Override // androidx.compose.material3.TooltipState
    public final void a() {
    }

    @Override // androidx.compose.material3.TooltipState
    public final Object b(MutatePriority mutatePriority, g gVar) {
        return b0.f30125a;
    }

    @Override // androidx.compose.material3.TooltipState
    public final MutableTransitionState c() {
        return this.f9652b;
    }

    @Override // androidx.compose.material3.TooltipState
    public final void dismiss() {
    }

    @Override // androidx.compose.material3.TooltipState
    public final boolean isVisible() {
        return this.f9651a;
    }
}
