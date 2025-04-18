package androidx.compose.foundation;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import kotlin.jvm.internal.r;
import q0.q;

/* loaded from: classes3.dex */
public final class ClickableKt$clickableWithIndicationIfNeeded$1 extends r implements q {
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Composer composer = (Composer) obj2;
        ((Number) obj3).intValue();
        composer.J(-1525724089);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = InteractionSourceKt.a();
            composer.o(u2);
        }
        StaticProvidableCompositionLocal staticProvidableCompositionLocal = IndicationKt.f2752a;
        throw null;
    }
}
