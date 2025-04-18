package androidx.compose.foundation.selection;

import androidx.compose.foundation.ClickableNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;

/* loaded from: classes4.dex */
final class SelectableNode extends ClickableNode {
    public boolean I;

    @Override // androidx.compose.foundation.AbstractClickableNode
    public final void h2(SemanticsConfiguration semanticsConfiguration) {
        SemanticsPropertiesKt.s(semanticsConfiguration, this.I);
    }
}
