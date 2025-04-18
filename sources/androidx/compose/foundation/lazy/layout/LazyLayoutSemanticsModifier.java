package androidx.compose.foundation.lazy.layout;

import android.support.v4.media.d;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import q0.a;
import x0.j;

/* loaded from: classes3.dex */
final class LazyLayoutSemanticsModifier extends ModifierNodeElement<LazyLayoutSemanticsModifierNode> {

    /* renamed from: a, reason: collision with root package name */
    public final a f4841a;

    /* renamed from: b, reason: collision with root package name */
    public final LazyLayoutSemanticState f4842b;

    /* renamed from: c, reason: collision with root package name */
    public final Orientation f4843c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4844f;

    public LazyLayoutSemanticsModifier(j jVar, LazyLayoutSemanticState lazyLayoutSemanticState, Orientation orientation, boolean z2, boolean z3) {
        this.f4841a = jVar;
        this.f4842b = lazyLayoutSemanticState;
        this.f4843c = orientation;
        this.d = z2;
        this.f4844f = z3;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new LazyLayoutSemanticsModifierNode(this.f4841a, this.f4842b, this.f4843c, this.d, this.f4844f);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        LazyLayoutSemanticsModifierNode lazyLayoutSemanticsModifierNode = (LazyLayoutSemanticsModifierNode) node;
        lazyLayoutSemanticsModifierNode.f4845o = this.f4841a;
        lazyLayoutSemanticsModifierNode.f4846p = this.f4842b;
        Orientation orientation = lazyLayoutSemanticsModifierNode.f4847q;
        Orientation orientation2 = this.f4843c;
        if (orientation != orientation2) {
            lazyLayoutSemanticsModifierNode.f4847q = orientation2;
            DelegatableNodeKt.f(lazyLayoutSemanticsModifierNode).K();
        }
        boolean z2 = lazyLayoutSemanticsModifierNode.f4848r;
        boolean z3 = this.d;
        boolean z4 = this.f4844f;
        if (z2 == z3 && lazyLayoutSemanticsModifierNode.f4849s == z4) {
            return;
        }
        lazyLayoutSemanticsModifierNode.f4848r = z3;
        lazyLayoutSemanticsModifierNode.f4849s = z4;
        lazyLayoutSemanticsModifierNode.e2();
        DelegatableNodeKt.f(lazyLayoutSemanticsModifierNode).K();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f4841a == lazyLayoutSemanticsModifier.f4841a && p0.a.g(this.f4842b, lazyLayoutSemanticsModifier.f4842b) && this.f4843c == lazyLayoutSemanticsModifier.f4843c && this.d == lazyLayoutSemanticsModifier.d && this.f4844f == lazyLayoutSemanticsModifier.f4844f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4844f) + d.g(this.d, (this.f4843c.hashCode() + ((this.f4842b.hashCode() + (this.f4841a.hashCode() * 31)) * 31)) * 31, 31);
    }
}
