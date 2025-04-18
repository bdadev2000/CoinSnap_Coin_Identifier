package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

/* loaded from: classes4.dex */
final class BoxChildDataNode extends Modifier.Node implements ParentDataModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public Alignment f3794o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3795p;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object J(Density density, Object obj) {
        return this;
    }
}
