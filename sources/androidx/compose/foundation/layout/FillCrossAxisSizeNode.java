package androidx.compose.foundation.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;

@StabilityInferred
/* loaded from: classes2.dex */
public final class FillCrossAxisSizeNode extends Modifier.Node implements ParentDataModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public float f3885o;

    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.foundation.layout.FlowLayoutData, java.lang.Object] */
    @Override // androidx.compose.ui.node.ParentDataModifierNode
    public final Object J(Density density, Object obj) {
        RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
        if (rowColumnParentData == null) {
            rowColumnParentData = new RowColumnParentData();
        }
        FlowLayoutData flowLayoutData = rowColumnParentData.d;
        FlowLayoutData flowLayoutData2 = flowLayoutData;
        if (flowLayoutData == null) {
            float f2 = this.f3885o;
            ?? obj2 = new Object();
            obj2.f3909a = f2;
            flowLayoutData2 = obj2;
        }
        rowColumnParentData.d = flowLayoutData2;
        flowLayoutData2.f3909a = this.f3885o;
        return rowColumnParentData;
    }
}
