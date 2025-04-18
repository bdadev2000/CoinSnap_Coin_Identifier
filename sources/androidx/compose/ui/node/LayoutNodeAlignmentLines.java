package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LayoutNodeAlignmentLines extends AlignmentLines {
    @Override // androidx.compose.ui.node.AlignmentLines
    public final long b(NodeCoordinator nodeCoordinator, long j2) {
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.I;
        return nodeCoordinator.T1(j2, true);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final Map c(NodeCoordinator nodeCoordinator) {
        return nodeCoordinator.C0().q();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final int d(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        return nodeCoordinator.Z(alignmentLine);
    }
}
