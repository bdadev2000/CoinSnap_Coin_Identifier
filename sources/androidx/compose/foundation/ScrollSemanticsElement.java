package androidx.compose.foundation;

import android.support.v4.media.d;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* loaded from: classes4.dex */
final class ScrollSemanticsElement extends ModifierNodeElement<ScrollSemanticsModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollState f2854a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2855b;

    /* renamed from: c, reason: collision with root package name */
    public final FlingBehavior f2856c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2857f;

    public ScrollSemanticsElement(ScrollState scrollState, boolean z2, FlingBehavior flingBehavior, boolean z3, boolean z4) {
        this.f2854a = scrollState;
        this.f2855b = z2;
        this.f2856c = flingBehavior;
        this.d = z3;
        this.f2857f = z4;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.ScrollSemanticsModifierNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f2858o = this.f2854a;
        node.f2859p = this.f2855b;
        node.f2860q = this.f2856c;
        node.f2861r = this.f2857f;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ScrollSemanticsModifierNode scrollSemanticsModifierNode = (ScrollSemanticsModifierNode) node;
        scrollSemanticsModifierNode.f2858o = this.f2854a;
        scrollSemanticsModifierNode.f2859p = this.f2855b;
        scrollSemanticsModifierNode.f2860q = this.f2856c;
        scrollSemanticsModifierNode.f2861r = this.f2857f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScrollSemanticsElement)) {
            return false;
        }
        ScrollSemanticsElement scrollSemanticsElement = (ScrollSemanticsElement) obj;
        return a.g(this.f2854a, scrollSemanticsElement.f2854a) && this.f2855b == scrollSemanticsElement.f2855b && a.g(this.f2856c, scrollSemanticsElement.f2856c) && this.d == scrollSemanticsElement.d && this.f2857f == scrollSemanticsElement.f2857f;
    }

    public final int hashCode() {
        int g2 = d.g(this.f2855b, this.f2854a.hashCode() * 31, 31);
        FlingBehavior flingBehavior = this.f2856c;
        return Boolean.hashCode(this.f2857f) + d.g(this.d, (g2 + (flingBehavior == null ? 0 : flingBehavior.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollSemanticsElement(state=");
        sb.append(this.f2854a);
        sb.append(", reverseScrolling=");
        sb.append(this.f2855b);
        sb.append(", flingBehavior=");
        sb.append(this.f2856c);
        sb.append(", isScrollable=");
        sb.append(this.d);
        sb.append(", isVertical=");
        return d.s(sb, this.f2857f, ')');
    }
}
