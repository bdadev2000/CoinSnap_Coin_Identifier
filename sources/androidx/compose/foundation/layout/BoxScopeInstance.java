package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;

@StabilityInferred
/* loaded from: classes3.dex */
public final class BoxScopeInstance implements BoxScope {

    /* renamed from: a, reason: collision with root package name */
    public static final BoxScopeInstance f3816a = new Object();

    @Override // androidx.compose.foundation.layout.BoxScope
    public final Modifier a(Modifier modifier, BiasAlignment biasAlignment) {
        return modifier.T0(new BoxChildDataElement(biasAlignment, false));
    }

    public final Modifier b() {
        return new BoxChildDataElement(Alignment.Companion.e, true);
    }
}
