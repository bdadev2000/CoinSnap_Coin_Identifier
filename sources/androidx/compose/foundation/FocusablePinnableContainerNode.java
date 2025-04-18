package androidx.compose.foundation;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.ObserverModifierNode;
import androidx.compose.ui.node.ObserverModifierNodeKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class FocusablePinnableContainerNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, ObserverModifierNode {

    /* renamed from: o, reason: collision with root package name */
    public PinnableContainer.PinnedHandle f2716o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2717p;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.jvm.internal.f0] */
    @Override // androidx.compose.ui.node.ObserverModifierNode
    public final void C0() {
        ?? obj = new Object();
        ObserverModifierNodeKt.a(this, new FocusablePinnableContainerNode$retrievePinnableContainer$1(obj, this));
        PinnableContainer pinnableContainer = (PinnableContainer) obj.f30930a;
        if (this.f2717p) {
            PinnableContainer.PinnedHandle pinnedHandle = this.f2716o;
            if (pinnedHandle != null) {
                pinnedHandle.release();
            }
            this.f2716o = pinnableContainer != null ? pinnableContainer.a() : null;
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean T1() {
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final void Y1() {
        PinnableContainer.PinnedHandle pinnedHandle = this.f2716o;
        if (pinnedHandle != null) {
            pinnedHandle.release();
        }
        this.f2716o = null;
    }
}
