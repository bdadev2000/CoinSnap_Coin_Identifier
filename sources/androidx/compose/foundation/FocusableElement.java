package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import p0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FocusableElement extends ModifierNodeElement<FocusableNode> {

    /* renamed from: a, reason: collision with root package name */
    public final MutableInteractionSource f2701a;

    public FocusableElement(MutableInteractionSource mutableInteractionSource) {
        this.f2701a = mutableInteractionSource;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new FocusableNode(this.f2701a);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ((FocusableNode) node).h2(this.f2701a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusableElement) {
            return a.g(this.f2701a, ((FocusableElement) obj).f2701a);
        }
        return false;
    }

    public final int hashCode() {
        MutableInteractionSource mutableInteractionSource = this.f2701a;
        if (mutableInteractionSource != null) {
            return mutableInteractionSource.hashCode();
        }
        return 0;
    }
}
