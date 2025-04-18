package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.SemanticsConfiguration;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class TextFieldMagnifierNode extends DelegatingNode implements OnGloballyPositionedModifier, DrawModifierNode, SemanticsModifierNode {
    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void B(SemanticsConfiguration semanticsConfiguration) {
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void M(NodeCoordinator nodeCoordinator) {
    }

    public abstract void h2(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, boolean z2);

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void z(ContentDrawScope contentDrawScope) {
    }
}
