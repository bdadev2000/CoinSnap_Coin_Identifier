package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import org.objectweb.asm.Opcodes;
import p0.a;

@StabilityInferred
/* loaded from: classes3.dex */
public final class Draggable2DElement extends ModifierNodeElement<Draggable2DNode> {

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new Draggable2DNode(Draggable2DElement$Companion$CanDrag$1.f3338a, 320);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        Draggable2DNode.q2((Draggable2DNode) node, Draggable2DElement$Companion$CanDrag$1.f3338a, Opcodes.CHECKCAST);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Draggable2DElement.class != obj.getClass()) {
            return false;
        }
        return a.g(null, null) && a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }
}
