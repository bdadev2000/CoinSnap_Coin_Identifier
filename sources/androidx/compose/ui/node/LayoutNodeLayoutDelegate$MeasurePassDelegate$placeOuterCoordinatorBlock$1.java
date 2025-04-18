package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.unit.IntOffset;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate f16047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutNodeLayoutDelegate.MeasurePassDelegate f16048b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutNodeLayoutDelegate$MeasurePassDelegate$placeOuterCoordinatorBlock$1(LayoutNodeLayoutDelegate layoutNodeLayoutDelegate, LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate) {
        super(0);
        this.f16047a = layoutNodeLayoutDelegate;
        this.f16048b = measurePassDelegate;
    }

    @Override // q0.a
    public final Object invoke() {
        Placeable.PlacementScope placementScope;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.f16047a;
        NodeCoordinator nodeCoordinator = layoutNodeLayoutDelegate.a().f16104q;
        if (nodeCoordinator == null || (placementScope = nodeCoordinator.f16056j) == null) {
            placementScope = LayoutNodeKt.a(layoutNodeLayoutDelegate.f15980a).getPlacementScope();
        }
        LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegate = this.f16048b;
        l lVar = measurePassDelegate.C;
        GraphicsLayer graphicsLayer = measurePassDelegate.D;
        if (graphicsLayer != null) {
            NodeCoordinator a2 = layoutNodeLayoutDelegate.a();
            long j2 = measurePassDelegate.E;
            float f2 = measurePassDelegate.F;
            placementScope.getClass();
            Placeable.PlacementScope.a(placementScope, a2);
            a2.j0(IntOffset.d(j2, a2.f15828f), f2, graphicsLayer);
        } else if (lVar == null) {
            NodeCoordinator a3 = layoutNodeLayoutDelegate.a();
            long j3 = measurePassDelegate.E;
            float f3 = measurePassDelegate.F;
            placementScope.getClass();
            Placeable.PlacementScope.a(placementScope, a3);
            a3.n0(IntOffset.d(j3, a3.f15828f), f3, null);
        } else {
            NodeCoordinator a4 = layoutNodeLayoutDelegate.a();
            long j4 = measurePassDelegate.E;
            float f4 = measurePassDelegate.F;
            placementScope.getClass();
            Placeable.PlacementScope.a(placementScope, a4);
            a4.n0(IntOffset.d(j4, a4.f15828f), f4, lVar);
        }
        return b0.f30125a;
    }
}
