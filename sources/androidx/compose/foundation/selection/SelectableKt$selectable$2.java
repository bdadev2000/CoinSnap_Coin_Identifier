package androidx.compose.foundation.selection;

import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
final class SelectableKt$selectable$2 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MutableInteractionSource mutableInteractionSource;
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-2124609672);
        Indication indication = (Indication) composer.K(IndicationKt.f2752a);
        if (indication instanceof IndicationNodeFactory) {
            composer.J(-1412264498);
            composer.D();
            mutableInteractionSource = null;
        } else {
            composer.J(-1412156525);
            Object u2 = composer.u();
            if (u2 == Composer.Companion.f13690a) {
                u2 = InteractionSourceKt.a();
                composer.o(u2);
            }
            mutableInteractionSource = (MutableInteractionSource) u2;
            composer.D();
        }
        Modifier a2 = SelectableKt.a(Modifier.Companion.f14687a, false, mutableInteractionSource, indication, false, null, null);
        composer.D();
        return a2;
    }
}
