package org.koin.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.context.DefaultContextExtKt;
import org.koin.core.error.KoinAppAlreadyStartedException;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatform;
import org.koin.mp.KoinPlatformTools;
import p0.a;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class KoinApplicationKt {

    @NotNull
    private static final ProvidableCompositionLocal<Koin> LocalKoinApplication = CompositionLocalKt.c(KoinApplicationKt$LocalKoinApplication$1.INSTANCE);

    @NotNull
    private static final ProvidableCompositionLocal<Scope> LocalKoinScope = CompositionLocalKt.c(KoinApplicationKt$LocalKoinScope$1.INSTANCE);

    @Composable
    @ComposableInferredTarget
    public static final void KoinApplication(@NotNull l lVar, @NotNull p pVar, @Nullable Composer composer, int i2) throws KoinAppAlreadyStartedException {
        int i3;
        a.s(lVar, "application");
        a.s(pVar, "content");
        ComposerImpl g2 = composer.g(-1360431358);
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
            g2.t(1157296644);
            boolean I = g2.I(lVar);
            Object u2 = g2.u();
            if (I || u2 == Composer.Companion.f13690a) {
                if (KoinPlatformTools.INSTANCE.defaultContext().getOrNull() != null) {
                    throw new KoinAppAlreadyStartedException("Trying to run new Koin Application whereas Koin is already started. Use 'KoinContext()' instead of check for any 'startKoin' usage. ");
                }
                u2 = DefaultContextExtKt.startKoin(lVar);
                g2.o(u2);
            }
            g2.V(false);
            KoinApplication koinApplication = (KoinApplication) u2;
            CompositionLocalKt.b(new ProvidedValue[]{LocalKoinApplication.c(koinApplication.getKoin()), LocalKoinScope.c(koinApplication.getKoin().getScopeRegistry().getRootScope())}, ComposableLambdaKt.b(g2, 1461545922, new KoinApplicationKt$KoinApplication$1(pVar)), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new KoinApplicationKt$KoinApplication$2(lVar, pVar, i2);
        }
    }

    @Composable
    @ComposableInferredTarget
    public static final void KoinContext(@Nullable Koin koin, @NotNull p pVar, @Nullable Composer composer, int i2, int i3) {
        a.s(pVar, "content");
        ComposerImpl g2 = composer.g(274849393);
        int i4 = i3 & 1;
        int i5 = i4 != 0 ? i2 | 2 : i2;
        if ((i3 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= g2.w(pVar) ? 32 : 16;
        }
        if (i4 == 1 && (i5 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            g2.u0();
            if ((i2 & 1) != 0 && !g2.e0()) {
                g2.A();
            } else if (i4 != 0) {
                koin = KoinPlatform.INSTANCE.getKoin();
            }
            g2.W();
            CompositionLocalKt.b(new ProvidedValue[]{LocalKoinApplication.c(koin), LocalKoinScope.c(koin.getScopeRegistry().getRootScope())}, ComposableLambdaKt.b(g2, -775712335, new KoinApplicationKt$KoinContext$1(pVar)), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new KoinApplicationKt$KoinContext$2(koin, pVar, i2, i3);
        }
    }

    @Composable
    @ComposableInferredTarget
    public static final void KoinIsolatedContext(@NotNull KoinApplication koinApplication, @NotNull p pVar, @Nullable Composer composer, int i2) {
        a.s(koinApplication, "context");
        a.s(pVar, "content");
        ComposerImpl g2 = composer.g(-1842654858);
        CompositionLocalKt.b(new ProvidedValue[]{LocalKoinApplication.c(koinApplication.getKoin()), LocalKoinScope.c(koinApplication.getKoin().getScopeRegistry().getRootScope())}, ComposableLambdaKt.b(g2, 2089047606, new KoinApplicationKt$KoinIsolatedContext$1(pVar)), g2, 56);
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new KoinApplicationKt$KoinIsolatedContext$2(koinApplication, pVar, i2);
        }
    }

    @Composable
    @NotNull
    public static final Scope currentKoinScope(@Nullable Composer composer, int i2) {
        composer.t(1668867238);
        Scope scope = (Scope) composer.K(LocalKoinScope);
        composer.H();
        return scope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Koin getDefaultKoinContext() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }

    @Composable
    @NotNull
    public static final Koin getKoin(@Nullable Composer composer, int i2) {
        composer.t(523578110);
        Koin koin = (Koin) composer.K(LocalKoinApplication);
        composer.H();
        return koin;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Koin> getLocalKoinApplication() {
        return LocalKoinApplication;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Scope> getLocalKoinScope() {
        return LocalKoinScope;
    }

    @Composable
    @NotNull
    public static final Scope rememberCurrentKoinScope(@Nullable Composer composer, int i2) {
        composer.t(-939861293);
        composer.t(-492369756);
        Object u2 = composer.u();
        if (u2 == Composer.Companion.f13690a) {
            u2 = (Scope) composer.K(getLocalKoinScope());
            composer.o(u2);
        }
        composer.H();
        Scope scope = (Scope) u2;
        composer.H();
        return scope;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void warnNoContext(Koin koin) {
        koin.getLogger().info("[Warning] - No Koin context defined in Compose, fallback to default Koin context.\nUse KoinContext(), KoinAndroidContext() or KoinApplication() to setup or create Koin context with Compose and avoid such message.");
    }
}
