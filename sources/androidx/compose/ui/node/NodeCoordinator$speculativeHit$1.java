package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.node.NodeCoordinator;
import d0.b0;
import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class NodeCoordinator$speculativeHit$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator f16132a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Modifier.Node f16133b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NodeCoordinator.HitTestSource f16134c;
    public final /* synthetic */ long d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ HitTestResult f16135f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f16136g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f16137h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f16138i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$speculativeHit$1(NodeCoordinator nodeCoordinator, Modifier.Node node, NodeCoordinator.HitTestSource hitTestSource, long j2, HitTestResult hitTestResult, boolean z2, boolean z3, float f2) {
        super(0);
        this.f16132a = nodeCoordinator;
        this.f16133b = node;
        this.f16134c = hitTestSource;
        this.d = j2;
        this.f16135f = hitTestResult;
        this.f16136g = z2;
        this.f16137h = z3;
        this.f16138i = f2;
    }

    @Override // q0.a
    public final Object invoke() {
        NodeCoordinator nodeCoordinator = this.f16132a;
        Modifier.Node a2 = NodeCoordinatorKt.a(this.f16133b, this.f16134c.a());
        NodeCoordinator.HitTestSource hitTestSource = this.f16134c;
        long j2 = this.d;
        HitTestResult hitTestResult = this.f16135f;
        boolean z2 = this.f16136g;
        boolean z3 = this.f16137h;
        float f2 = this.f16138i;
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.I;
        nodeCoordinator.R1(a2, hitTestSource, j2, hitTestResult, z2, z3, f2);
        return b0.f30125a;
    }
}
