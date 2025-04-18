package androidx.compose.foundation.relocation;

import android.view.View;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNode_androidKt;
import androidx.compose.ui.node.NodeCoordinator;
import d0.b0;
import h0.g;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class BringIntoViewResponder_androidKt$defaultBringIntoViewParent$1 implements BringIntoViewParent {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DelegatableNode f5352a;

    public BringIntoViewResponder_androidKt$defaultBringIntoViewParent$1(Modifier.Node node) {
        this.f5352a = node;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewParent
    public final Object z1(NodeCoordinator nodeCoordinator, a aVar, g gVar) {
        View a2 = DelegatableNode_androidKt.a(this.f5352a);
        long e02 = nodeCoordinator.e0(0L);
        Rect rect = (Rect) aVar.invoke();
        Rect m2 = rect != null ? rect.m(e02) : null;
        if (m2 != null) {
            a2.requestRectangleOnScreen(new android.graphics.Rect((int) m2.f14914a, (int) m2.f14915b, (int) m2.f14916c, (int) m2.d), false);
        }
        return b0.f30125a;
    }
}
