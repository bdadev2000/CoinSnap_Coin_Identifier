package androidx.compose.ui.node;

import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class NodeCoordinator$updateLayerParameters$1 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f16139a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$updateLayerParameters$1(l lVar) {
        super(0);
        this.f16139a = lVar;
    }

    @Override // q0.a
    public final Object invoke() {
        ReusableGraphicsLayerScope reusableGraphicsLayerScope = NodeCoordinator.I;
        this.f16139a.invoke(reusableGraphicsLayerScope);
        reusableGraphicsLayerScope.w = reusableGraphicsLayerScope.f15030p.a(reusableGraphicsLayerScope.f15033s, reusableGraphicsLayerScope.f15035u, reusableGraphicsLayerScope.f15034t);
        return b0.f30125a;
    }
}
