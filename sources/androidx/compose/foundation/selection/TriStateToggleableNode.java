package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import x0.n;

/* loaded from: classes4.dex */
final class TriStateToggleableNode extends ClickableNode {
    public ToggleableState I;

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void h2(SemanticsConfiguration semanticsConfiguration) {
        ToggleableState toggleableState = this.I;
        n[] nVarArr = SemanticsPropertiesKt.f16865a;
        SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.C;
        n nVar = SemanticsPropertiesKt.f16865a[22];
        semanticsPropertyKey.getClass();
        semanticsConfiguration.b(semanticsPropertyKey, toggleableState);
    }
}
