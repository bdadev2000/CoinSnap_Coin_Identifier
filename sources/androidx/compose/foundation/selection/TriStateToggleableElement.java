package androidx.compose.foundation.selection;

import android.support.v4.media.d;
import androidx.compose.foundation.AbstractClickableNode;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import q0.a;

/* loaded from: classes2.dex */
final class TriStateToggleableElement extends ModifierNodeElement<TriStateToggleableNode> {

    /* renamed from: a, reason: collision with root package name */
    public final ToggleableState f5381a;

    /* renamed from: b, reason: collision with root package name */
    public final MutableInteractionSource f5382b;

    /* renamed from: c, reason: collision with root package name */
    public final IndicationNodeFactory f5383c;
    public final boolean d;

    /* renamed from: f, reason: collision with root package name */
    public final Role f5384f;

    /* renamed from: g, reason: collision with root package name */
    public final a f5385g;

    public TriStateToggleableElement(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, IndicationNodeFactory indicationNodeFactory, boolean z2, Role role, a aVar) {
        this.f5381a = toggleableState;
        this.f5382b = mutableInteractionSource;
        this.f5383c = indicationNodeFactory;
        this.d = z2;
        this.f5384f = role;
        this.f5385g = aVar;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [androidx.compose.foundation.AbstractClickableNode, androidx.compose.foundation.selection.TriStateToggleableNode, androidx.compose.ui.Modifier$Node] */
    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        ?? abstractClickableNode = new AbstractClickableNode(this.f5382b, this.f5383c, this.d, null, this.f5384f, this.f5385g);
        abstractClickableNode.I = this.f5381a;
        return abstractClickableNode;
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        TriStateToggleableNode triStateToggleableNode = (TriStateToggleableNode) node;
        MutableInteractionSource mutableInteractionSource = this.f5382b;
        IndicationNodeFactory indicationNodeFactory = this.f5383c;
        boolean z2 = this.d;
        Role role = this.f5384f;
        a aVar = this.f5385g;
        ToggleableState toggleableState = triStateToggleableNode.I;
        ToggleableState toggleableState2 = this.f5381a;
        if (toggleableState != toggleableState2) {
            triStateToggleableNode.I = toggleableState2;
            DelegatableNodeKt.f(triStateToggleableNode).K();
        }
        triStateToggleableNode.l2(mutableInteractionSource, indicationNodeFactory, z2, null, role, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TriStateToggleableElement.class != obj.getClass()) {
            return false;
        }
        TriStateToggleableElement triStateToggleableElement = (TriStateToggleableElement) obj;
        return this.f5381a == triStateToggleableElement.f5381a && p0.a.g(this.f5382b, triStateToggleableElement.f5382b) && p0.a.g(this.f5383c, triStateToggleableElement.f5383c) && this.d == triStateToggleableElement.d && p0.a.g(this.f5384f, triStateToggleableElement.f5384f) && this.f5385g == triStateToggleableElement.f5385g;
    }

    public final int hashCode() {
        int hashCode = this.f5381a.hashCode() * 31;
        MutableInteractionSource mutableInteractionSource = this.f5382b;
        int hashCode2 = (hashCode + (mutableInteractionSource != null ? mutableInteractionSource.hashCode() : 0)) * 31;
        IndicationNodeFactory indicationNodeFactory = this.f5383c;
        int g2 = d.g(this.d, (hashCode2 + (indicationNodeFactory != null ? indicationNodeFactory.hashCode() : 0)) * 31, 31);
        Role role = this.f5384f;
        return this.f5385g.hashCode() + ((g2 + (role != null ? Integer.hashCode(role.f16789a) : 0)) * 31);
    }
}
