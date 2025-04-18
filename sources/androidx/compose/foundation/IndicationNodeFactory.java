package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.node.DelegatableNode;

@Stable
/* loaded from: classes.dex */
public interface IndicationNodeFactory extends Indication {
    DelegatableNode b(InteractionSource interactionSource);
}
