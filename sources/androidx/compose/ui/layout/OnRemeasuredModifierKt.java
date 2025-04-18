package androidx.compose.ui.layout;

import androidx.compose.ui.Modifier;
import q0.l;

/* loaded from: classes.dex */
public final class OnRemeasuredModifierKt {
    public static final Modifier a(Modifier modifier, l lVar) {
        return modifier.T0(new OnSizeChangedModifier(lVar));
    }
}
