package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ClearAndSetSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {

    /* renamed from: a, reason: collision with root package name */
    public final l f16776a;

    public ClearAndSetSemanticsElement(l lVar) {
        this.f16776a = lVar;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public final SemanticsConfiguration O1() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f16816b = false;
        semanticsConfiguration.f16817c = true;
        this.f16776a.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new CoreSemanticsModifierNode(false, true, this.f16776a);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((CoreSemanticsModifierNode) node).f16781q = this.f16776a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClearAndSetSemanticsElement) && a.g(this.f16776a, ((ClearAndSetSemanticsElement) obj).f16776a);
    }

    public final int hashCode() {
        return this.f16776a.hashCode();
    }

    public final String toString() {
        return "ClearAndSetSemanticsElement(properties=" + this.f16776a + ')';
    }
}
