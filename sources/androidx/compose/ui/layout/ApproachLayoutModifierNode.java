package androidx.compose.ui.layout;

import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeMeasuringIntrinsics;
import e0.x;

/* loaded from: classes4.dex */
public interface ApproachLayoutModifierNode extends LayoutModifierNode {
    default int K0(ApproachMeasureScopeImpl approachMeasureScopeImpl, NodeCoordinator nodeCoordinator, int i2) {
        return NodeMeasuringIntrinsics.d(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            public final MeasureResult a(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, Measurable measurable, long j2) {
                return ApproachLayoutModifierNode.this.L0(approachIntrinsicsMeasureScope, measurable, j2);
            }
        }, approachMeasureScopeImpl, nodeCoordinator, i2);
    }

    MeasureResult L0(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2);

    boolean Q0(long j2);

    default boolean V(Placeable.PlacementScope placementScope, LookaheadLayoutCoordinates lookaheadLayoutCoordinates) {
        return false;
    }

    default int j0(ApproachMeasureScopeImpl approachMeasureScopeImpl, NodeCoordinator nodeCoordinator, int i2) {
        return NodeMeasuringIntrinsics.a(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            public final MeasureResult a(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, Measurable measurable, long j2) {
                return ApproachLayoutModifierNode.this.L0(approachIntrinsicsMeasureScope, measurable, j2);
            }
        }, approachMeasureScopeImpl, nodeCoordinator, i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    default MeasureResult m(MeasureScope measureScope, Measurable measurable, long j2) {
        Placeable V = measurable.V(j2);
        return measureScope.T(V.f15825a, V.f15826b, x.f30219a, new ApproachLayoutModifierNode$measure$1$1(V));
    }

    default int q0(ApproachMeasureScopeImpl approachMeasureScopeImpl, NodeCoordinator nodeCoordinator, int i2) {
        return NodeMeasuringIntrinsics.c(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$minApproachIntrinsicHeight$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            public final MeasureResult a(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, Measurable measurable, long j2) {
                return ApproachLayoutModifierNode.this.L0(approachIntrinsicsMeasureScope, measurable, j2);
            }
        }, approachMeasureScopeImpl, nodeCoordinator, i2);
    }

    default int s0(ApproachMeasureScopeImpl approachMeasureScopeImpl, NodeCoordinator nodeCoordinator, int i2) {
        return NodeMeasuringIntrinsics.b(new NodeMeasuringIntrinsics.ApproachMeasureBlock() { // from class: androidx.compose.ui.layout.ApproachLayoutModifierNode$maxApproachIntrinsicWidth$1
            @Override // androidx.compose.ui.node.NodeMeasuringIntrinsics.ApproachMeasureBlock
            public final MeasureResult a(ApproachIntrinsicsMeasureScope approachIntrinsicsMeasureScope, Measurable measurable, long j2) {
                return ApproachLayoutModifierNode.this.L0(approachIntrinsicsMeasureScope, measurable, j2);
            }
        }, approachMeasureScopeImpl, nodeCoordinator, i2);
    }
}
