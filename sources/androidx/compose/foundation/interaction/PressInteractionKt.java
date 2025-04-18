package androidx.compose.foundation.interaction;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import q0.p;

/* loaded from: classes4.dex */
public final class PressInteractionKt {
    public static final MutableState a(MutableInteractionSource mutableInteractionSource, Composer composer) {
        Object u2 = composer.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
            composer.o(u2);
        }
        MutableState mutableState = (MutableState) u2;
        Object u3 = composer.u();
        if (u3 == composer$Companion$Empty$1) {
            u3 = new PressInteractionKt$collectIsPressedAsState$1$1(mutableInteractionSource, mutableState, null);
            composer.o(u3);
        }
        EffectsKt.f(mutableInteractionSource, (p) u3, composer);
        return mutableState;
    }
}
