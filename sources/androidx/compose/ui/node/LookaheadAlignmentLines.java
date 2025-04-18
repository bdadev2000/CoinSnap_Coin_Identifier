package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.AlignmentLine;
import java.util.Map;

@StabilityInferred
/* loaded from: classes2.dex */
public final class LookaheadAlignmentLines extends AlignmentLines {
    @Override // androidx.compose.ui.node.AlignmentLines
    public final long b(NodeCoordinator nodeCoordinator, long j2) {
        LookaheadDelegate h12 = nodeCoordinator.h1();
        p0.a.p(h12);
        long j3 = h12.f16068n;
        return Offset.k(OffsetKt.a((int) (j3 >> 32), (int) (j3 & 4294967295L)), j2);
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final Map c(NodeCoordinator nodeCoordinator) {
        LookaheadDelegate h12 = nodeCoordinator.h1();
        p0.a.p(h12);
        return h12.C0().q();
    }

    @Override // androidx.compose.ui.node.AlignmentLines
    public final int d(NodeCoordinator nodeCoordinator, AlignmentLine alignmentLine) {
        LookaheadDelegate h12 = nodeCoordinator.h1();
        p0.a.p(h12);
        return h12.Z(alignmentLine);
    }
}
