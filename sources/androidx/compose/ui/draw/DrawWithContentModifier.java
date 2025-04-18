package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import q0.l;

/* loaded from: classes4.dex */
final class DrawWithContentModifier extends Modifier.Node implements DrawModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f14805o;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        this.f14805o.invoke(contentDrawScope);
    }
}
