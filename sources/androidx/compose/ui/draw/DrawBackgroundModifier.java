package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.node.DrawModifierNode;
import q0.l;

@StabilityInferred
/* loaded from: classes3.dex */
public final class DrawBackgroundModifier extends Modifier.Node implements DrawModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public l f14800o;

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void z(ContentDrawScope contentDrawScope) {
        this.f14800o.invoke(contentDrawScope);
        contentDrawScope.P1();
    }
}
