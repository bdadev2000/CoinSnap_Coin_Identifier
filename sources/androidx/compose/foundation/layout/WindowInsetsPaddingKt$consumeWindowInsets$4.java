package androidx.compose.foundation.layout;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes4.dex */
final class WindowInsetsPaddingKt$consumeWindowInsets$4 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(114694318);
        boolean I = composer.I(null);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new PaddingValuesConsumingModifier();
            composer.o(u2);
        }
        PaddingValuesConsumingModifier paddingValuesConsumingModifier = (PaddingValuesConsumingModifier) u2;
        composer.D();
        return paddingValuesConsumingModifier;
    }
}
