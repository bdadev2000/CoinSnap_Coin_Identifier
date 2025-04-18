package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.node.NodeCoordinator;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NodeCoordinator$hitNear$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f16124a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier.Node f16125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator.HitTestSource f16126c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ HitTestResult f16127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f16128g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f16129h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f16130i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$hitNear$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, boolean z2, boolean z3, float f2) {
        super(0);
        this.f16124a = nodeCoordinator;
        this.f16125b = node;
        this.f16126c = hitTestSource;
        this.d = j2;
        this.f16127f = hitTestResult;
        this.f16128g = z2;
        this.f16129h = z3;
        this.f16130i = f2;
    }

    @Override // q0.a
    public final Object invoke() {
        NodeCoordinator nodeCoordinator = this.f16124a;
        Modifier.Node a2 = NodeCoordinatorKt.a(this.f16125b, this.f16126c.a());
        NodeCoordinator.HitTestSource hitTestSource = this.f16126c;
        long j2 = this.d;
        HitTestResult hitTestResult = this.f16127f;
        boolean z2 = this.f16128g;
        boolean z3 = this.f16129h;
        float f2 = this.f16130i;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.I;
        if (a2 == null) {
            nodeCoordinator.p1(hitTestSource, j2, hitTestResult, z2, z3);
        } else {
            nodeCoordinator.getClass();
            hitTestResult.c(a2, f2, z3, new NodeCoordinator$hitNear$1(nodeCoordinator, a2, hitTestSource, j2, hitTestResult, z2, z3, f2));
        }
        return b0.f30125a;
    }
}
