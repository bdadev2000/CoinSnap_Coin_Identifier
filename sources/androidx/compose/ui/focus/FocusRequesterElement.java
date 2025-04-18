package androidx.compose.ui.focus;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes2.dex */
final class FocusRequesterElement extends ModifierNodeElement<FocusRequesterNode> {

    /* renamed from: a, reason: collision with root package name */
    public final FocusRequester f14876a;

    public FocusRequesterElement(FocusRequester focusRequester) {
        this.f14876a = focusRequester;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.focus.FocusRequesterNode] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f14878o = this.f14876a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        FocusRequesterNode focusRequesterNode = (FocusRequesterNode) node;
        focusRequesterNode.f14878o.f14874a.n(focusRequesterNode);
        FocusRequester focusRequester = this.f14876a;
        focusRequesterNode.f14878o = focusRequester;
        focusRequester.f14874a.b(focusRequesterNode);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && a.g(this.f14876a, ((FocusRequesterElement) obj).f14876a);
    }

    public final int hashCode() {
        return this.f14876a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f14876a + ')';
    }
}
