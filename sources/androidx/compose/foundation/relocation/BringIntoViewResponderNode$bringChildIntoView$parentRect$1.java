package androidx.compose.foundation.relocation;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class BringIntoViewResponderNode$bringChildIntoView$parentRect$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BringIntoViewResponderNode f5349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutCoordinates f5350b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f5351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BringIntoViewResponderNode$bringChildIntoView$parentRect$1(BringIntoViewResponderNode bringIntoViewResponderNode, NodeCoordinator nodeCoordinator, a aVar) {
        super(0);
        this.f5349a = bringIntoViewResponderNode;
        this.f5350b = nodeCoordinator;
        this.f5351c = aVar;
    }

    @Override // q0.a
    public final Object invoke() {
        BringIntoViewResponderNode bringIntoViewResponderNode = this.f5349a;
        Rect e2 = BringIntoViewResponderNode.e2(bringIntoViewResponderNode, this.f5350b, this.f5351c);
        if (e2 != null) {
            return bringIntoViewResponderNode.f5334o.n1(e2);
        }
        return null;
    }
}
