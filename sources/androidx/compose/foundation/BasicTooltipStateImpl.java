package androidx.compose.foundation;

import androidx.compose.runtime.Stable;

@Stable
/* loaded from: classes2.dex */
final class BasicTooltipStateImpl implements BasicTooltipState {
    @Override // androidx.compose.foundation.BasicTooltipState
    public final void a() {
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public final void dismiss() {
        throw null;
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public final boolean isVisible() {
        throw null;
    }

    @Override // androidx.compose.foundation.BasicTooltipState
    public final Object show() {
        new BasicTooltipStateImpl$show$2(this, new BasicTooltipStateImpl$show$cancellableShow$1(this, null), null);
        throw null;
    }
}
