package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ModifierNodeElement;
import com.google.android.material.internal.ViewUtils;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class Draggable2DCompatElement extends ModifierNodeElement<Draggable2DNode> {

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final Modifier.Node a() {
        return new Draggable2DNode(Draggable2DCompatElement$Companion$CanDrag$1.f3337a, 640);
    }

    @Override // androidx.compose.ui.node.ModifierNodeElement
    public final void b(Modifier.Node node) {
        Draggable2DNode.q2((Draggable2DNode) node, Draggable2DCompatElement$Companion$CanDrag$1.f3337a, ViewUtils.EDGE_TO_EDGE_FLAGS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Draggable2DCompatElement.class != obj.getClass()) {
            return false;
        }
        return a.g(null, null) && a.g(null, null);
    }

    public final int hashCode() {
        throw null;
    }
}
