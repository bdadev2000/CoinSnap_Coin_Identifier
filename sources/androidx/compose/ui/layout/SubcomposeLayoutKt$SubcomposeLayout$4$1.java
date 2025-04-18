package androidx.compose.ui.layout;

import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.node.LayoutNode;
import d0.b0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.r;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$4$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SubcomposeLayoutState f15845a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$4$1(SubcomposeLayoutState subcomposeLayoutState) {
        super(0);
        this.f15845a = subcomposeLayoutState;
    }

    @Override // q0.a
    public final Object invoke() {
        LayoutNodeSubcompositionsState a2 = this.f15845a.a();
        LayoutNode layoutNode = a2.f15751a;
        if (a2.f15763o != layoutNode.x().size()) {
            Iterator it = a2.f15755g.entrySet().iterator();
            while (it.hasNext()) {
                ((LayoutNodeSubcompositionsState.NodeState) ((Map.Entry) it.next()).getValue()).d = true;
            }
            if (!layoutNode.C.d) {
                LayoutNode.b0(layoutNode, false, 7);
            }
        }
        return b0.f30125a;
    }
}
