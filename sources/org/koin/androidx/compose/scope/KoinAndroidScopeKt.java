package org.koin.androidx.compose.scope;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.scope.AndroidScopeComponent;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import p0.a;
import q0.p;

/* loaded from: classes.dex */
public final class KoinAndroidScopeKt {
    @Composable
    @ComposableInferredTarget
    public static final void KoinActivityScope(@NotNull p pVar, @Nullable Composer composer, int i2) {
        int i3;
        a.s(pVar, "content");
        ComposerImpl g2 = composer.g(-268638886);
        if ((i2 & 14) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.f16325b;
            Object K = g2.K(staticProvidableCompositionLocal);
            AndroidScopeComponent androidScopeComponent = K instanceof AndroidScopeComponent ? (AndroidScopeComponent) K : null;
            Scope scope = androidScopeComponent != null ? androidScopeComponent.getScope() : null;
            g2.t(949912650);
            if (scope == null) {
                throw new IllegalStateException(("Current context " + g2.K(staticProvidableCompositionLocal) + " must implement AndroidScopeComponent interface.").toString());
            }
            g2.V(false);
            CompositionLocalKt.b(new ProvidedValue[]{KoinApplicationKt.getLocalKoinScope().c(scope)}, ComposableLambdaKt.b(g2, 575674906, new KoinAndroidScopeKt$KoinActivityScope$1(pVar)), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new KoinAndroidScopeKt$KoinActivityScope$2(pVar, i2);
        }
    }

    @Composable
    @ComposableInferredTarget
    public static final void KoinFragmentScope(@NotNull p pVar, @Nullable Composer composer, int i2) {
        int i3;
        a.s(pVar, "content");
        ComposerImpl g2 = composer.g(327534649);
        if ((i2 & 14) == 0) {
            i3 = (g2.w(pVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.f16325b;
            Object K = g2.K(staticProvidableCompositionLocal);
            AndroidScopeComponent androidScopeComponent = K instanceof AndroidScopeComponent ? (AndroidScopeComponent) K : null;
            Scope scope = androidScopeComponent != null ? androidScopeComponent.getScope() : null;
            g2.t(-2143600590);
            if (scope == null) {
                throw new IllegalStateException(("Current context " + g2.K(staticProvidableCompositionLocal) + " must implement AndroidScopeComponent interface.").toString());
            }
            g2.V(false);
            CompositionLocalKt.b(new ProvidedValue[]{KoinApplicationKt.getLocalKoinScope().c(scope)}, ComposableLambdaKt.b(g2, 1171848441, new KoinAndroidScopeKt$KoinFragmentScope$1(pVar)), g2, 56);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new KoinAndroidScopeKt$KoinFragmentScope$2(pVar, i2);
        }
    }
}
