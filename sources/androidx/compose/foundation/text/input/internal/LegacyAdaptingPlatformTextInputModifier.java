package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;

/* loaded from: classes3.dex */
final class LegacyAdaptingPlatformTextInputModifier extends ModifierNodeElement<LegacyAdaptingPlatformTextInputModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final LegacyPlatformTextInputServiceAdapter f6421a;

    /* renamed from: b, reason: collision with root package name */
    public final LegacyTextFieldState f6422b;

    /* renamed from: c, reason: collision with root package name */
    public final TextFieldSelectionManager f6423c;

    public LegacyAdaptingPlatformTextInputModifier(LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter, LegacyTextFieldState legacyTextFieldState, TextFieldSelectionManager textFieldSelectionManager) {
        this.f6421a = legacyPlatformTextInputServiceAdapter;
        this.f6422b = legacyTextFieldState;
        this.f6423c = textFieldSelectionManager;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new LegacyAdaptingPlatformTextInputModifierNode(this.f6421a, this.f6422b, this.f6423c);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        LegacyAdaptingPlatformTextInputModifierNode legacyAdaptingPlatformTextInputModifierNode = (LegacyAdaptingPlatformTextInputModifierNode) node;
        if (legacyAdaptingPlatformTextInputModifierNode.f14699n) {
            ((AndroidLegacyPlatformTextInputServiceAdapter) legacyAdaptingPlatformTextInputModifierNode.f6424o).b();
            legacyAdaptingPlatformTextInputModifierNode.f6424o.j(legacyAdaptingPlatformTextInputModifierNode);
        }
        LegacyPlatformTextInputServiceAdapter legacyPlatformTextInputServiceAdapter = this.f6421a;
        legacyAdaptingPlatformTextInputModifierNode.f6424o = legacyPlatformTextInputServiceAdapter;
        if (legacyAdaptingPlatformTextInputModifierNode.f14699n) {
            if (legacyPlatformTextInputServiceAdapter.f6446a != null) {
                throw new IllegalStateException("Expected textInputModifierNode to be null".toString());
            }
            legacyPlatformTextInputServiceAdapter.f6446a = legacyAdaptingPlatformTextInputModifierNode;
        }
        legacyAdaptingPlatformTextInputModifierNode.f6425p = this.f6422b;
        legacyAdaptingPlatformTextInputModifierNode.f6426q = this.f6423c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return p0.a.g(this.f6421a, legacyAdaptingPlatformTextInputModifier.f6421a) && p0.a.g(this.f6422b, legacyAdaptingPlatformTextInputModifier.f6422b) && p0.a.g(this.f6423c, legacyAdaptingPlatformTextInputModifier.f6423c);
    }

    public final int hashCode() {
        return this.f6423c.hashCode() + ((this.f6422b.hashCode() + (this.f6421a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f6421a + ", legacyTextFieldState=" + this.f6422b + ", textFieldSelectionManager=" + this.f6423c + ')';
    }
}
