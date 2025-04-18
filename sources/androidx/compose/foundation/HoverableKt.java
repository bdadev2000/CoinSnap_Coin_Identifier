package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.Modifier;

/* loaded from: classes4.dex */
public final class HoverableKt {
    public static Modifier a(MutableInteractionSource mutableInteractionSource, Modifier modifier) {
        return modifier.T0(new HoverableElement(mutableInteractionSource));
    }
}
