package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.Role;
import q0.a;

/* loaded from: classes4.dex */
public final class ClickableKt {
    public static final Modifier a(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, String str, Role role, a aVar) {
        Modifier T0;
        if (indication instanceof IndicationNodeFactory) {
            T0 = new ClickableElement(mutableInteractionSource, (IndicationNodeFactory) indication, z2, str, role, aVar);
        } else if (indication == null) {
            T0 = new ClickableElement(mutableInteractionSource, null, z2, str, role, aVar);
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            T0 = mutableInteractionSource != null ? IndicationKt.a(companion, mutableInteractionSource, indication).T0(new ClickableElement(mutableInteractionSource, null, z2, str, role, aVar)) : ComposedModifierKt.a(companion, new ClickableKt$clickableO2vRcR0$$inlined$clickableWithIndicationIfNeeded$1(indication, z2, str, role, aVar));
        }
        return modifier.T0(T0);
    }

    public static /* synthetic */ Modifier b(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, Role role, a aVar, int i2) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 16) != 0) {
            role = null;
        }
        return a(modifier, mutableInteractionSource, indication, z3, null, role, aVar);
    }

    public static Modifier c(Modifier modifier, boolean z2, String str, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return ComposedModifierKt.a(modifier, new ClickableKt$clickable$2(z2, str, null, aVar));
    }

    public static final Modifier d(Modifier modifier, MutableInteractionSource mutableInteractionSource, Indication indication, boolean z2, String str, Role role, String str2, a aVar, a aVar2, a aVar3) {
        Modifier T0;
        if (indication instanceof IndicationNodeFactory) {
            T0 = new CombinedClickableElement((IndicationNodeFactory) indication, mutableInteractionSource, role, str, str2, aVar3, aVar, aVar2, z2);
        } else if (indication == null) {
            T0 = new CombinedClickableElement(null, mutableInteractionSource, role, str, str2, aVar3, aVar, aVar2, z2);
        } else {
            Modifier.Companion companion = Modifier.Companion.f14687a;
            T0 = mutableInteractionSource != null ? IndicationKt.a(companion, mutableInteractionSource, indication).T0(new CombinedClickableElement(null, mutableInteractionSource, role, str, str2, aVar3, aVar, aVar2, z2)) : ComposedModifierKt.a(companion, new ClickableKt$combinedClickableXVZzFYc$$inlined$clickableWithIndicationIfNeeded$1(indication, z2, str, role, aVar3, str2, aVar, aVar2));
        }
        return modifier.T0(T0);
    }
}
