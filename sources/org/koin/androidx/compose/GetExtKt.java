package org.koin.androidx.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import d0.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.context.GlobalContext;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* loaded from: classes4.dex */
public final class GetExtKt {
    @Composable
    @a
    public static final <T> T get(Qualifier qualifier, Scope scope, q0.a aVar, Composer composer, int i2, int i3) {
        composer.t(-2042115543);
        if ((i3 & 1) != 0) {
            qualifier = null;
        }
        if ((i3 & 2) != 0) {
            scope = KoinApplicationKt.currentKoinScope(composer, 0);
        }
        if ((i3 & 4) != 0) {
            aVar = null;
        }
        composer.t(-909570880);
        boolean I = composer.I(qualifier) | ((((i2 & 896) ^ 384) > 256 && composer.w(aVar)) || (i2 & 384) == 256) | composer.I(scope);
        T t2 = (T) composer.u();
        if (I || t2 == Composer.Companion.f13690a) {
            p0.a.A0();
            throw null;
        }
        composer.H();
        composer.H();
        return t2;
    }

    @Composable
    @a
    @NotNull
    public static final Koin getKoin(@Nullable Composer composer, int i2) {
        composer.t(-1728138857);
        composer.t(564008160);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = GlobalContext.INSTANCE.get();
            composer.o(u2);
        }
        Koin koin = (Koin) u2;
        composer.H();
        composer.H();
        return koin;
    }
}
