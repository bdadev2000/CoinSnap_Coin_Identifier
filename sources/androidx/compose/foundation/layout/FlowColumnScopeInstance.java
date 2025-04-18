package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;

@StabilityInferred
/* loaded from: classes3.dex */
public final class FlowColumnScopeInstance implements ColumnScope, FlowColumnScope {

    /* renamed from: a, reason: collision with root package name */
    public static final FlowColumnScopeInstance f3899a = new Object();

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier a(Modifier modifier, BiasAlignment.Horizontal horizontal) {
        return ColumnScopeInstance.f3837a.a(modifier, horizontal);
    }

    @Override // androidx.compose.foundation.layout.ColumnScope
    public final Modifier c(float f2, boolean z2) {
        return ColumnScopeInstance.f3837a.c(f2, z2);
    }
}
