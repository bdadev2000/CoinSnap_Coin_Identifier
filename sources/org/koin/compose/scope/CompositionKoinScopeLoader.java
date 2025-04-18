package org.koin.compose.scope;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.annotation.KoinInternalApi;
import org.koin.core.scope.Scope;
import p0.a;

@StabilityInferred
@KoinExperimentalAPI
@KoinInternalApi
/* loaded from: classes4.dex */
public final class CompositionKoinScopeLoader implements RememberObserver {
    public static final int $stable = 8;

    @NotNull
    private final Koin koin;

    @NotNull
    private final Scope scope;

    public CompositionKoinScopeLoader(@NotNull Scope scope, @NotNull Koin koin) {
        a.s(scope, "scope");
        a.s(koin, "koin");
        this.scope = scope;
        this.koin = koin;
    }

    private final void close() {
        this.koin.getLogger().debug(this + " -> close scope id: '" + this.scope.getId() + '\'');
        this.scope.close();
    }

    @NotNull
    public final Koin getKoin() {
        return this.koin;
    }

    @NotNull
    public final Scope getScope() {
        return this.scope;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        close();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        close();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
    }
}
