package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.AlignmentLineProvider;
import androidx.compose.foundation.layout.CrossAxisAlignment;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.node.ParentDataModifierNode;
import androidx.compose.ui.unit.Density;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public abstract class SiblingsAlignedNode extends Modifier.Node implements ParentDataModifierNode {

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class WithAlignmentLineBlockNode extends SiblingsAlignedNode {

        /* renamed from: o, reason: collision with root package name */
        public l f4095o;

        @Override // androidx.compose.ui.node.ParentDataModifierNode
        public final Object J(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData();
            }
            rowColumnParentData.f4086c = new CrossAxisAlignment.AlignmentLineCrossAxisAlignment(new AlignmentLineProvider.Block(this.f4095o));
            return rowColumnParentData;
        }
    }

    @StabilityInferred
    /* loaded from: classes3.dex */
    public static final class WithAlignmentLineNode extends SiblingsAlignedNode {

        /* renamed from: o, reason: collision with root package name */
        public AlignmentLine f4096o;

        @Override // androidx.compose.ui.node.ParentDataModifierNode
        public final Object J(Density density, Object obj) {
            RowColumnParentData rowColumnParentData = obj instanceof RowColumnParentData ? (RowColumnParentData) obj : null;
            if (rowColumnParentData == null) {
                rowColumnParentData = new RowColumnParentData();
            }
            rowColumnParentData.f4086c = new CrossAxisAlignment.AlignmentLineCrossAxisAlignment(new AlignmentLineProvider.Value(this.f4096o));
            return rowColumnParentData;
        }
    }
}
