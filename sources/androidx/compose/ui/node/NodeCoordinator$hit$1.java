package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.node.NodeCoordinator;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NodeCoordinator$hit$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f16118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier.Node f16119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator.HitTestSource f16120c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ HitTestResult f16121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f16122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f16123h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$hit$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, boolean z2, boolean z3) {
        super(0);
        this.f16118a = nodeCoordinator;
        this.f16119b = node;
        this.f16120c = hitTestSource;
        this.d = j2;
        this.f16121f = hitTestResult;
        this.f16122g = z2;
        this.f16123h = z3;
    }

    @Override // q0.a
    public final Object invoke() {
        NodeCoordinator nodeCoordinator = this.f16118a;
        Modifier.Node a2 = NodeCoordinatorKt.a(this.f16119b, this.f16120c.a());
        NodeCoordinator.HitTestSource hitTestSource = this.f16120c;
        long j2 = this.d;
        HitTestResult hitTestResult = this.f16121f;
        boolean z2 = this.f16122g;
        boolean z3 = this.f16123h;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.I;
        nodeCoordinator.n1(a2, hitTestSource, j2, hitTestResult, z2, z3);
        return b0.f30125a;
    }
}
