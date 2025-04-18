package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

@StabilityInferred
/* loaded from: classes.dex */
public final class LayoutWeightNode extends Modifier.Node implements ParentDataModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public float f4042o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4043p;

    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object J(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData();
        }
        rowColumnParentData.f4084a = this.f4042o;
        rowColumnParentData.f4085b = this.f4043p;
        return rowColumnParentData;
    }
}
