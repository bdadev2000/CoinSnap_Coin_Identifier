package androidx.compose.ui.node;

import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.internal.InlineClassHelperKt;

/* loaded from: classes3.dex */
public final class CompositionLocalConsumerModifierNodeKt {
    public static final Object a(CompositionLocalConsumerModifierNode compositionLocalConsumerModifierNode, ProvidableCompositionLocal providableCompositionLocal) {
        if (compositionLocalConsumerModifierNode.z0().f14699n) {
            return DelegatableNodeKt.f(compositionLocalConsumerModifierNode).x.b(providableCompositionLocal);
        }
        InlineClassHelperKt.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        throw null;
    }
}
