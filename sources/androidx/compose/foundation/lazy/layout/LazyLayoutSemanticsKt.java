package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import x0.j;

/* loaded from: classes4.dex */
public final class LazyLayoutSemanticsKt {
    public static final Modifier a(Modifier modifier, j jVar, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z2, boolean z3) {
        return modifier.T0(new LazyLayoutSemanticsModifier(jVar, lazyLayoutSemanticState, orientation, z2, z3));
    }
}
