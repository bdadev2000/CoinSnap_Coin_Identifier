package androidx.compose.foundation.selection;

import android.support.v4.media.d;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import p0.a;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ToggleableElement extends ModifierNodeElement<ToggleableNode> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5365a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableInteractionSource f5366b;

    /* renamed from: c, reason: collision with root package name */
    public final IndicationNodeFactory f5367c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final Role f5368f;

    /* renamed from: g, reason: collision with root package name */
    public final l f5369g;

    public ToggleableElement(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, l lVar) {
        this.f5365a = z2;
        this.f5366b = mutableInteractionSource;
        this.f5367c = indicationNodeFactory;
        this.d = z3;
        this.f5368f = role;
        this.f5369g = lVar;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new ToggleableNode(this.f5365a, this.f5366b, this.f5367c, this.d, this.f5368f, this.f5369g);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        ToggleableNode toggleableNode = (ToggleableNode) node;
        MutableInteractionSource mutableInteractionSource = this.f5366b;
        IndicationNodeFactory indicationNodeFactory = this.f5367c;
        boolean z2 = this.d;
        Role role = this.f5368f;
        boolean z3 = toggleableNode.I;
        boolean z4 = this.f5365a;
        if (z3 != z4) {
            toggleableNode.I = z4;
            DelegatableNodeKt.f(toggleableNode).K();
        }
        toggleableNode.J = this.f5369g;
        toggleableNode.l2(mutableInteractionSource, indicationNodeFactory, z2, null, role, toggleableNode.K);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ToggleableElement.class != obj.getClass()) {
            return false;
        }
        ToggleableElement toggleableElement = (ToggleableElement) obj;
        return this.f5365a == toggleableElement.f5365a && a.g(this.f5366b, toggleableElement.f5366b) && a.g(this.f5367c, toggleableElement.f5367c) && this.d == toggleableElement.d && a.g(this.f5368f, toggleableElement.f5368f) && this.f5369g == toggleableElement.f5369g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f5365a) * 31;
        MutableInteractionSource mutableInteractionSource = this.f5366b;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f5367c;
        int g2 = d.g(this.d, (hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31);
        Role role = this.f5368f;
        return this.f5369g.hashCode() + ((g2 + (role != null ? Integer.hashCode(role.f16789a) : 0)) * 31);
    }
}
