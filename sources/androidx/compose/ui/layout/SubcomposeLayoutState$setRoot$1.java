package androidx.compose.ui.layout;

import androidx.compose.ui.node.LayoutNode;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* loaded from: classes4.dex */
final class SubcomposeLayoutState$setRoot$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubcomposeLayoutState f15855a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutState$setRoot$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(2);
        this.f15855a = subcomposeLayoutState;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        LayoutNode layoutNode = (LayoutNode) obj;
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = layoutNode.D;
        SubcomposeLayoutState subcomposeLayoutState = this.f15855a;
        if (layoutNodeSubcompositionsState == null) {
            layoutNodeSubcompositionsState = new LayoutNodeSubcompositionsState(layoutNode, subcomposeLayoutState.f15850a);
            layoutNode.D = layoutNodeSubcompositionsState;
        }
        subcomposeLayoutState.f15851b = layoutNodeSubcompositionsState;
        subcomposeLayoutState.a().d();
        LayoutNodeSubcompositionsState a2 = subcomposeLayoutState.a();
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy = a2.f15753c;
        SubcomposeSlotReusePolicy subcomposeSlotReusePolicy2 = subcomposeLayoutState.f15850a;
        if (subcomposeSlotReusePolicy != subcomposeSlotReusePolicy2) {
            a2.f15753c = subcomposeSlotReusePolicy2;
            a2.e(false);
            LayoutNode.b0(a2.f15751a, false, 7);
        }
        return b0.f30125a;
    }
}
