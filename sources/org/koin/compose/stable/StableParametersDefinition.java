package org.koin.compose.stable;

import androidx.compose.runtime.Stable;
import org.jetbrains.annotations.Nullable;
import q0.a;

@Stable
/* loaded from: classes4.dex */
public final class StableParametersDefinition {
    public static final int $stable = 0;

    @Nullable
    private final a parametersDefinition;

    public StableParametersDefinition(@Nullable a aVar) {
        this.parametersDefinition = aVar;
    }

    @Nullable
    public final a getParametersDefinition() {
        return this.parametersDefinition;
    }
}
