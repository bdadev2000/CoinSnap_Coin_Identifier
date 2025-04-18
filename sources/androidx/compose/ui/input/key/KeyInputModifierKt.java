package androidx.compose.ui.input.key;

import androidx.compose.ui.Modifier;
import q0.l;

/* loaded from: classes4.dex */
public final class KeyInputModifierKt {
    public static final Modifier a(Modifier modifier, l lVar) {
        return modifier.T0(new KeyInputElement(lVar, null));
    }

    public static final Modifier b(Modifier modifier, l lVar) {
        return modifier.T0(new KeyInputElement(null, lVar));
    }
}
