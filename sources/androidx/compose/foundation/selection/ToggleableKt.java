package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.state.ToggleableState;
import q0.a;
import q0.l;

/* loaded from: classes.dex */
public final class ToggleableKt {
    public static final Modifier a(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z3, Role role, l lVar) {
        Modifier T0;
        if (indication instanceof IndicationNodeFactory) {
            T0 = new ToggleableElement(z2, mutableInteractionSource, (IndicationNodeFactory) indication, z3, role, lVar);
        } else if (indication == null) {
            T0 = new ToggleableElement(z2, mutableInteractionSource, null, z3, role, lVar);
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            T0 = mutableInteractionSource != null ? IndicationKt.a(companion, mutableInteractionSource, indication).T0(new ToggleableElement(z2, mutableInteractionSource, null, z3, role, lVar)) : ComposedModifierKt.a(companion, new ToggleableKt$toggleableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(indication, z2, z3, role, lVar));
        }
        return modifier.T0(T0);
    }

    public static final Modifier b(ToggleableState toggleableState, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, a aVar) {
        if (indication instanceof IndicationNodeFactory) {
            return new TriStateToggleableElement(toggleableState, mutableInteractionSource, (IndicationNodeFactory) indication, z2, role, aVar);
        }
        if (indication == null) {
            return new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, z2, role, aVar);
        }
        Modifier.Companion companion = Modifier.Companion.f14687a;
        return mutableInteractionSource != null ? IndicationKt.a(companion, mutableInteractionSource, indication).T0(new TriStateToggleableElement(toggleableState, mutableInteractionSource, null, z2, role, aVar)) : ComposedModifierKt.a(companion, new ToggleableKt$triStateToggleableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(indication, toggleableState, z2, role, aVar));
    }
}
