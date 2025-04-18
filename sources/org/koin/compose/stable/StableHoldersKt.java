package org.koin.compose.stable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;

/* loaded from: classes4.dex */
public final class StableHoldersKt {
    @Composable
    @NotNull
    public static final StableParametersDefinition rememberStableParametersDefinition(@Nullable a aVar, @Nullable Composer composer, int i2) {
        composer.t(-1231974547);
        composer.t(-492369756);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = new StableParametersDefinition(aVar);
            composer.o(u2);
        }
        composer.H();
        StableParametersDefinition stableParametersDefinition = (StableParametersDefinition) u2;
        composer.H();
        return stableParametersDefinition;
    }
}
