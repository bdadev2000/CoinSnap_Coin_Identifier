package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;

@StabilityInferred
/* loaded from: classes2.dex */
public final class FlowColumnOverflowScopeImpl implements FlowColumnScope, FlowColumnOverflowScope {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FlowColumnScopeInstance f3898a = FlowColumnScopeInstance.f3899a;

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier a(Modifier modifier, BiasAlignment.Horizontal horizontal) {
        this.f3898a.getClass();
        return ColumnScopeInstance.f3837a.a(modifier, horizontal);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier c(float f2, boolean z2) {
        this.f3898a.getClass();
        return ColumnScopeInstance.f3837a.c(f2, z2);
    }
}
