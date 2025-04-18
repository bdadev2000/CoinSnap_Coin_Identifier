package org.koin.compose.scope;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes4.dex */
public final class RememberScopesKt {
    @KoinExperimentalAPI
    @Composable
    @NotNull
    public static final Scope rememberKoinScope(@NotNull Scope scope, @Nullable Composer composer, int i2) {
        a.s(scope, "scope");
        composer.t(-424940701);
        Koin koin = KoinApplicationKt.getKoin(composer, 0);
        composer.t(1157296644);
        boolean I = composer.I(scope);
        Object u2 = composer.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new CompositionKoinScopeLoader(scope, koin);
            composer.o(u2);
        }
        composer.H();
        Scope scope2 = ((CompositionKoinScopeLoader) u2).getScope();
        composer.H();
        return scope2;
    }
}
