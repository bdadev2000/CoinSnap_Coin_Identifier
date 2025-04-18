package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.internal.InlineClassHelperKt;

/* loaded from: classes3.dex */
public final class DelegatableNode_androidKt {
    public static final View a(DelegatableNode delegatableNode) {
        if (delegatableNode.z0().f14699n) {
            return (View) LayoutNodeKt.a(DelegatableNodeKt.f(delegatableNode));
        }
        InlineClassHelperKt.b("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }
}
