package androidx.compose.foundation;

import android.support.v4.media.d;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class ScrollingLayoutElement extends ModifierNodeElement<ScrollingLayoutNode> {

    /* renamed from: a, reason: collision with root package name */
    public final ScrollState f2876a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2877b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2878c;

    public ScrollingLayoutElement(ScrollState scrollState, boolean z2, boolean z3) {
        this.f2876a = scrollState;
        this.f2877b = z2;
        this.f2878c = z3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.foundation.ScrollingLayoutNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? node = new Modifier.Node();
        node.f2879o = this.f2876a;
        node.f2880p = this.f2877b;
        node.f2881q = this.f2878c;
        return node;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ScrollingLayoutNode scrollingLayoutNode = (ScrollingLayoutNode) node;
        scrollingLayoutNode.f2879o = this.f2876a;
        scrollingLayoutNode.f2880p = this.f2877b;
        scrollingLayoutNode.f2881q = this.f2878c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return a.g(this.f2876a, scrollingLayoutElement.f2876a) && this.f2877b == scrollingLayoutElement.f2877b && this.f2878c == scrollingLayoutElement.f2878c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2878c) + d.g(this.f2877b, this.f2876a.hashCode() * 31, 31);
    }
}
