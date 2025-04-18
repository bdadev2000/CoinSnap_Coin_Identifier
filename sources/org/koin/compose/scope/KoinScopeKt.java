package org.koin.compose.scope;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinExperimentalAPI;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import p0.a;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
public final class KoinScopeKt {
    @KoinExperimentalAPI
    @Composable
    @ComposableInferredTarget
    public static final void KoinScope(@NotNull l lVar, @NotNull p pVar, @Nullable Composer composer, int i2) {
        int i3;
        a.s(lVar, "scopeDefinition");
        a.s(pVar, "content");
        ComposerImpl g2 = composer.g(1329043944);
        if ((i2 & 14) == 0) {
            i3 = (g2.w(lVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(pVar) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            OnKoinScope((Scope) lVar.invoke(KoinApplicationKt.getKoin(g2, 0)), pVar, g2, (i3 & 112) | 8);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new KoinScopeKt$KoinScope$1(lVar, pVar, i2);
        }
    }

    @KoinExperimentalAPI
    @Composable
    @ComposableInferredTarget
    public static final void OnKoinScope(@NotNull Scope scope, @NotNull p pVar, @Nullable Composer composer, int i2) {
        a.s(scope, "scope");
        a.s(pVar, "content");
        ComposerImpl g2 = composer.g(-1645165308);
        g2.t(-424940701);
        Koin koin = KoinApplicationKt.getKoin(g2, 0);
        g2.t(1157296644);
        boolean I = g2.I(scope);
        Object u2 = g2.u();
        if (I || u2 == Composer.Companion.f13690a) {
            u2 = new CompositionKoinScopeLoader(scope, koin);
            g2.o(u2);
        }
        g2.V(false);
        ((CompositionKoinScopeLoader) u2).getScope();
        g2.V(false);
        CompositionLocalKt.b(new ProvidedValue[]{KoinApplicationKt.getLocalKoinScope().c(scope)}, ComposableLambdaKt.b(g2, 147159492, new KoinScopeKt$OnKoinScope$1(pVar)), g2, 56);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new KoinScopeKt$OnKoinScope$2(scope, pVar, i2);
        }
    }

    @KoinExperimentalAPI
    @Composable
    @ComposableInferredTarget
    public static final <T> void KoinScope(String str, p pVar, Composer composer, int i2) {
        a.s(str, "scopeID");
        a.s(pVar, "content");
        composer.t(-242492906);
        KoinApplicationKt.getKoin(composer, 0);
        a.A0();
        throw null;
    }

    @KoinExperimentalAPI
    @Composable
    @ComposableInferredTarget
    public static final void KoinScope(@NotNull String str, @NotNull Qualifier qualifier, @NotNull p pVar, @Nullable Composer composer, int i2) {
        a.s(str, "scopeID");
        a.s(qualifier, "scopeQualifier");
        a.s(pVar, "content");
        composer.t(-1303721996);
        OnKoinScope(Koin.getOrCreateScope$default(KoinApplicationKt.getKoin(composer, 0), str, qualifier, null, 4, null), pVar, composer, ((i2 >> 3) & 112) | 8);
        composer.H();
    }
}
