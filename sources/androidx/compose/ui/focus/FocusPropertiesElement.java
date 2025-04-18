package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes3.dex */
final class FocusPropertiesElement extends ModifierNodeElement<FocusPropertiesNode> {

    /* renamed from: a, reason: collision with root package name */
    public final FocusPropertiesScope f14858a;

    public FocusPropertiesElement(FocusPropertiesScope focusPropertiesScope) {
        this.f14858a = focusPropertiesScope;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.focus.FocusPropertiesNode] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f14871o = this.f14858a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((FocusPropertiesNode) node).f14871o = this.f14858a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && a.g(this.f14858a, ((FocusPropertiesElement) obj).f14858a);
    }

    public final int hashCode() {
        return this.f14858a.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f14858a + ')';
    }
}
