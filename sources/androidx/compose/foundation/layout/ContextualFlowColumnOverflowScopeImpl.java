package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;

@StabilityInferred
@ExperimentalLayoutApi
/* loaded from: classes.dex */
public final class ContextualFlowColumnOverflowScopeImpl implements FlowColumnOverflowScope, ContextualFlowColumnOverflowScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowColumnOverflowScopeImpl f3844a = new FlowColumnOverflowScopeImpl();

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier a(Modifier modifier, BiasAlignment.Horizontal horizontal) {
        return this.f3844a.a(modifier, horizontal);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier c(float f2, boolean z2) {
        return this.f3844a.c(f2, z2);
    }
}
