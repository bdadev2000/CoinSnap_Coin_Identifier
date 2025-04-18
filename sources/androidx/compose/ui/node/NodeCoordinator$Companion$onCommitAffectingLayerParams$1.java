package androidx.compose.ui.node;

import androidx.compose.ui.graphics.TransformOrigin;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
public final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 f16113a = new r(1);

    @Override // q0.l
    public final Object invoke(Object obj) {
        NodeCoordinator nodeCoordinator = (NodeCoordinator) obj;
        if (nodeCoordinator.Y0()) {
            LayerPositionalProperties layerPositionalProperties = nodeCoordinator.C;
            if (layerPositionalProperties == null) {
                nodeCoordinator.X1(true);
            } else {
                LayerPositionalProperties layerPositionalProperties2 = NodeCoordinator.J;
                layerPositionalProperties2.getClass();
                layerPositionalProperties2.f15930a = layerPositionalProperties.f15930a;
                layerPositionalProperties2.f15931b = layerPositionalProperties.f15931b;
                layerPositionalProperties2.f15932c = layerPositionalProperties.f15932c;
                layerPositionalProperties2.d = layerPositionalProperties.d;
                layerPositionalProperties2.e = layerPositionalProperties.e;
                layerPositionalProperties2.f15933f = layerPositionalProperties.f15933f;
                layerPositionalProperties2.f15934g = layerPositionalProperties.f15934g;
                layerPositionalProperties2.f15935h = layerPositionalProperties.f15935h;
                layerPositionalProperties2.f15936i = layerPositionalProperties.f15936i;
                nodeCoordinator.X1(true);
                if (layerPositionalProperties2.f15930a != layerPositionalProperties.f15930a || layerPositionalProperties2.f15931b != layerPositionalProperties.f15931b || layerPositionalProperties2.f15932c != layerPositionalProperties.f15932c || layerPositionalProperties2.d != layerPositionalProperties.d || layerPositionalProperties2.e != layerPositionalProperties.e || layerPositionalProperties2.f15933f != layerPositionalProperties.f15933f || layerPositionalProperties2.f15934g != layerPositionalProperties.f15934g || layerPositionalProperties2.f15935h != layerPositionalProperties.f15935h || !TransformOrigin.a(layerPositionalProperties2.f15936i, layerPositionalProperties.f15936i)) {
                    LayoutNode layoutNode = nodeCoordinator.f16100m;
                    LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
                    if (layoutNodeLayoutDelegate.f15991n > 0) {
                        if (layoutNodeLayoutDelegate.f15990m || layoutNodeLayoutDelegate.f15989l) {
                            layoutNode.a0(false);
                        }
                        layoutNodeLayoutDelegate.f15995r.x0();
                    }
                    Owner owner = layoutNode.f15950l;
                    if (owner != null) {
                        owner.e(layoutNode);
                    }
                }
            }
        }
        return b0.f30125a;
    }
}
