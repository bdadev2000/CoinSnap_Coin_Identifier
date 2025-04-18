package androidx.compose.ui.input.pointer;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class PointerIconKt {
    public static Modifier a(Modifier modifier, AndroidPointerIconType androidPointerIconType) {
        return modifier.T0(new PointerHoverIconModifierElement(androidPointerIconType, false));
    }
}
