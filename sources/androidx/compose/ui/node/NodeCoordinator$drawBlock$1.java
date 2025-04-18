package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NodeCoordinator$drawBlock$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f16114a;

    /* renamed from: androidx.compose.ui.node.NodeCoordinator$drawBlock$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass1 extends r implements q0.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ NodeCoordinator f16115a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Canvas f16116b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ GraphicsLayer f16117c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NodeCoordinator nodeCoordinator, Canvas canvas, GraphicsLayer graphicsLayer) {
            super(0);
            this.f16115a = nodeCoordinator;
            this.f16116b = canvas;
            this.f16117c = graphicsLayer;
        }

        @Override // q0.a
        public final Object invoke() {
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.I;
            this.f16115a.W0(this.f16116b, this.f16117c);
            return b0.f30125a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$1(NodeCoordinator nodeCoordinator) {
        super(2);
        this.f16114a = nodeCoordinator;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        Canvas canvas = (Canvas) obj;
        GraphicsLayer graphicsLayer = (GraphicsLayer) obj2;
        NodeCoordinator nodeCoordinator = this.f16114a;
        if (nodeCoordinator.f16100m.N()) {
            OwnerSnapshotObserver snapshotObserver = LayoutNodeKt.a(nodeCoordinator.f16100m).getSnapshotObserver();
            ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.I;
            snapshotObserver.b(nodeCoordinator, NodeCoordinator$Companion$onCommitAffectingLayer$1.f16112a, new AnonymousClass1(nodeCoordinator, canvas, graphicsLayer));
            nodeCoordinator.F = false;
        } else {
            nodeCoordinator.F = true;
        }
        return b0.f30125a;
    }
}
