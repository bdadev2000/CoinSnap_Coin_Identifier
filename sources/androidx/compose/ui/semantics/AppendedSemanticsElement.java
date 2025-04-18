package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class AppendedSemanticsElement extends ModifierNodeElement<CoreSemanticsModifierNode> implements SemanticsModifier {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16774a;

    /* renamed from: b, reason: collision with root package name */
    public final l f16775b;

    public AppendedSemanticsElement(boolean z2, l lVar) {
        this.f16774a = z2;
        this.f16775b = lVar;
    }

    @Override // androidx.compose.ui.semantics.SemanticsModifier
    public final SemanticsConfiguration O1() {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.f16816b = this.f16774a;
        this.f16775b.invoke(semanticsConfiguration);
        return semanticsConfiguration;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new CoreSemanticsModifierNode(this.f16774a, false, this.f16775b);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        CoreSemanticsModifierNode coreSemanticsModifierNode = (CoreSemanticsModifierNode) node;
        coreSemanticsModifierNode.f16779o = this.f16774a;
        coreSemanticsModifierNode.f16781q = this.f16775b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f16774a == appendedSemanticsElement.f16774a && a.g(this.f16775b, appendedSemanticsElement.f16775b);
    }

    public final int hashCode() {
        return this.f16775b.hashCode() + (Boolean.hashCode(this.f16774a) * 31);
    }

    public final String toString() {
        return "AppendedSemanticsElement(mergeDescendants=" + this.f16774a + ", properties=" + this.f16775b + ')';
    }
}
