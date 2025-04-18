package androidx.compose.ui.node;

import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NodeCoordinator$invalidateParentLayer$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f16131a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$invalidateParentLayer$1(NodeCoordinator nodeCoordinator) {
        super(0);
        this.f16131a = nodeCoordinator;
    }

    @Override // q0.a
    public final Object invoke() {
        NodeCoordinator nodeCoordinator = this.f16131a.f16104q;
        if (nodeCoordinator != null) {
            nodeCoordinator.q1();
        }
        return b0.f30125a;
    }
}
