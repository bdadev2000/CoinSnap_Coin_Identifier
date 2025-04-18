package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;

/* loaded from: classes3.dex */
public final class BasicTooltipKt {
    public static final TooltipState a(MutatorMutex mutatorMutex, Composer composer) {
        boolean a2 = composer.a(true) | composer.I(mutatorMutex);
        Object u2 = composer.u();
        if (a2 || u2 == Composer.Companion.f13690a) {
            u2 = new BasicTooltipStateImpl(false, true, mutatorMutex);
            composer.o(u2);
        }
        return (BasicTooltipStateImpl) u2;
    }
}
