package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LayoutIdModifier extends Modifier.Node implements ParentDataModifierNode, LayoutIdParentData {

    /* renamed from: o, reason: collision with root package name */
    public Object f15742o;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object J(Density density, Object obj) {
        return this;
    }

    @Override // androidx.compose.ui.layout.LayoutIdParentData
    public final Object X0() {
        return this.f15742o;
    }
}
