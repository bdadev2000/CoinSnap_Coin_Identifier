package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import q0.a;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class FocusRestorerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, FocusPropertiesModifierNode, FocusRequesterModifierNode {

    /* renamed from: p, reason: collision with root package name */
    public PinnableContainer.PinnedHandle f14881p;

    /* renamed from: o, reason: collision with root package name */
    public a f14880o = null;

    /* renamed from: q, reason: collision with root package name */
    public final l f14882q = new FocusRestorerNode$onExit$1(this);

    /* renamed from: r, reason: collision with root package name */
    public final l f14883r = new FocusRestorerNode$onEnter$1(this);

    @Override // androidx.compose.ui.Modifier.Node
    public final void X1() {
        PinnableContainer.PinnedHandle pinnedHandle = this.f14881p;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.f14881p = null;
    }

    @Override // androidx.compose.ui.focus.FocusPropertiesModifierNode
    public final void e1(FocusProperties focusProperties) {
        focusProperties.a(this.f14883r);
        focusProperties.d(this.f14882q);
    }
}
