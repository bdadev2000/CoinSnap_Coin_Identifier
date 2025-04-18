package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

@StabilityInferred
/* loaded from: classes3.dex */
public final class VerticalAlignNode extends Modifier.Node implements ParentDataModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public Alignment.Vertical f4131o;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object J(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData();
        }
        rowColumnParentData.f4086c = new CrossAxisAlignment.VerticalCrossAxisAlignment(this.f4131o);
        return rowColumnParentData;
    }
}
