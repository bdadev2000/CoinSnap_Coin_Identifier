package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import q0.a;

/* loaded from: classes2.dex */
public final class SelectableKt {
    public static final Modifier a(Modifier modifier, boolean z2, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z3, Role role, a aVar) {
        Modifier T0;
        if (indication instanceof IndicationNodeFactory) {
            T0 = new SelectableElement(z2, mutableInteractionSource, (IndicationNodeFactory) indication, z3, role, aVar);
        } else if (indication == null) {
            T0 = new SelectableElement(z2, mutableInteractionSource, null, z3, role, aVar);
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            T0 = mutableInteractionSource != null ? IndicationKt.a(companion, mutableInteractionSource, indication).T0(new SelectableElement(z2, mutableInteractionSource, null, z3, role, aVar)) : ComposedModifierKt.a(companion, new SelectableKt$selectableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(indication, z2, z3, role, aVar));
        }
        return modifier.T0(T0);
    }
}
