package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import q0.p;

/* loaded from: classes2.dex */
public final class FocusInteractionKt {
    public static final MutableState a(InteractionSource interactionSource, Composer composer, int i2) {
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
            composer.o(u2);
        }
        MutableState mutableState = (MutableState) u2;
        boolean z2 = (((i2 & 14) ^ 6) > 4 && composer.I(interactionSource)) || (i2 & 6) == 4;
        Object u3 = composer.u();
        if (z2 || u3 == composer$Companion$Empty$1) {
            u3 = new FocusInteractionKt$collectIsFocusedAsState$1$1(interactionSource, mutableState, null);
            composer.o(u3);
        }
        EffectsKt.f(interactionSource, (p) u3, composer);
        return mutableState;
    }
}
