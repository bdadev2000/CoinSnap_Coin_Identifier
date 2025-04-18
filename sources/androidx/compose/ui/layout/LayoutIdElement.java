package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LayoutIdElement extends ModifierNodeElement<LayoutIdModifier> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15741a;

    public LayoutIdElement(Object obj) {
        this.f15741a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.layout.LayoutIdModifier, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f15742o = this.f15741a;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((LayoutIdModifier) node).f15742o = this.f15741a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && a.g(this.f15741a, ((LayoutIdElement) obj).f15741a);
    }

    public final int hashCode() {
        return this.f15741a.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f15741a + ')';
    }
}
