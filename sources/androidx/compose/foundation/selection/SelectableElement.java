package androidx.compose.foundation.selection;

import android.support.v4.media.d;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SelectableElement extends ModifierNodeElement<SelectableNode> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5355a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableInteractionSource f5356b;

    /* renamed from: c, reason: collision with root package name */
    public final IndicationNodeFactory f5357c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final Role f5358f;

    /* renamed from: g, reason: collision with root package name */
    public final a f5359g;

    public SelectableElement(boolean z2, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z3, Role role, a aVar) {
        this.f5355a = z2;
        this.f5356b = mutableInteractionSource;
        this.f5357c = indicationNodeFactory;
        this.d = z3;
        this.f5358f = role;
        this.f5359g = aVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.foundation.AbstractClickableNode, androidx.compose.foundation.selection.SelectableNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? abstractClickableNode = new AbstractClickableNode(this.f5356b, this.f5357c, this.d, null, this.f5358f, this.f5359g);
        abstractClickableNode.I = this.f5355a;
        return abstractClickableNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        SelectableNode selectableNode = (SelectableNode) node;
        MutableInteractionSource mutableInteractionSource = this.f5356b;
        IndicationNodeFactory indicationNodeFactory = this.f5357c;
        boolean z2 = this.d;
        Role role = this.f5358f;
        a aVar = this.f5359g;
        boolean z3 = selectableNode.I;
        boolean z4 = this.f5355a;
        if (z3 != z4) {
            selectableNode.I = z4;
            DelegatableNodeKt.f(selectableNode).K();
        }
        selectableNode.l2(mutableInteractionSource, indicationNodeFactory, z2, null, role, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SelectableElement.class != obj.getClass()) {
            return false;
        }
        SelectableElement selectableElement = (SelectableElement) obj;
        return this.f5355a == selectableElement.f5355a && p0.a.g(this.f5356b, selectableElement.f5356b) && p0.a.g(this.f5357c, selectableElement.f5357c) && this.d == selectableElement.d && p0.a.g(this.f5358f, selectableElement.f5358f) && this.f5359g == selectableElement.f5359g;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f5355a) * 31;
        MutableInteractionSource mutableInteractionSource = this.f5356b;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f5357c;
        int g2 = d.g(this.d, (hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31);
        Role role = this.f5358f;
        return this.f5359g.hashCode() + ((g2 + (role != null ? Integer.hashCode(role.f16789a) : 0)) * 31);
    }
}
