package com.cooldev.gba.emulator.gameboy.features.dashboard.widgets;

import android.support.v4.media.d;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.IntrinsicKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdState;
import com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.logic.BannerAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.component.BlackOverlayKt;
import com.cooldev.gba.emulator.gameboy.features.dashboard.utils.DashboardUtils;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class NavigationBarPortraitKt {
    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void BannerAd(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1754568661);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(BannerAdViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            BannerAdViewModel bannerAdViewModel = (BannerAdViewModel) u2;
            BannerAdState bannerAdState = (BannerAdState) SnapshotStateKt.b(bannerAdViewModel.getState(), g2, 8).getValue();
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(IAPViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            IAPState iAPState = (IAPState) t.f((IAPViewModel) u3, g2, 8);
            EffectsKt.c(b0.f30125a, new NavigationBarPortraitKt$BannerAd$1(bannerAdViewModel), g2);
            AnimatedVisibilityKt.d(bannerAdState.getShouldShowBannerAd(), null, EnterExitTransitionKt.n(NavigationBarPortraitKt$BannerAd$2.INSTANCE), EnterExitTransitionKt.o(NavigationBarPortraitKt$BannerAd$3.INSTANCE), null, ComposableLambdaKt.c(715102291, new NavigationBarPortraitKt$BannerAd$4(bannerAdState, iAPState), g2), g2, 200064, 18);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavigationBarPortraitKt$BannerAd$5(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ComposableTarget
    @Composable
    public static final void BottomBar(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-297909368);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            AnimatedVisibilityKt.d(DashboardUtils.INSTANCE.shouldShowBottomBar(g2, 6), null, EnterExitTransitionKt.n(NavigationBarPortraitKt$BottomBar$1.INSTANCE), EnterExitTransitionKt.o(NavigationBarPortraitKt$BottomBar$2.INSTANCE), null, ComposableSingletons$NavigationBarPortraitKt.INSTANCE.m139getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 200064, 18);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavigationBarPortraitKt$BottomBar$3(i2);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.jvm.internal.r, q0.q] */
    @ComposableTarget
    @Composable
    public static final void NavigationBarPortrait(boolean z2, @Nullable Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-130663382);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                z2 = false;
            }
            Modifier a2 = IntrinsicKt.a();
            MeasurePolicy e = BoxKt.e(Alignment.Companion.f14659a, false);
            int i6 = g2.P;
            PersistentCompositionLocalMap Q = g2.Q();
            Modifier c2 = ComposedModifierKt.c(g2, a2);
            ComposeUiNode.h8.getClass();
            a aVar = ComposeUiNode.Companion.f15895b;
            Applier applier = g2.f13691a;
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            p pVar = ComposeUiNode.Companion.f15898g;
            Updater.b(g2, e, pVar);
            p pVar2 = ComposeUiNode.Companion.f15897f;
            Updater.b(g2, Q, pVar2);
            p pVar3 = ComposeUiNode.Companion.f15900i;
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i6))) {
                d.x(i6, g2, i6, pVar3);
            }
            p pVar4 = ComposeUiNode.Companion.d;
            Updater.b(g2, c2, pVar4);
            Modifier a3 = ComposedModifierKt.a(SizeKt.f4107c, new r(3));
            ColumnMeasurePolicy a4 = ColumnKt.a(Arrangement.f3774c, Alignment.Companion.f14669m, g2, 0);
            int i7 = g2.P;
            PersistentCompositionLocalMap Q2 = g2.Q();
            Modifier c3 = ComposedModifierKt.c(g2, a3);
            if (!(applier instanceof Applier)) {
                ComposablesKt.a();
                throw null;
            }
            g2.z();
            if (g2.O) {
                g2.B(aVar);
            } else {
                g2.n();
            }
            Updater.b(g2, a4, pVar);
            Updater.b(g2, Q2, pVar2);
            if (g2.O || !p0.a.g(g2.u(), Integer.valueOf(i7))) {
                d.x(i7, g2, i7, pVar3);
            }
            Updater.b(g2, c3, pVar4);
            BottomBar(g2, 0);
            BannerAd(g2, 0);
            g2.V(true);
            g2.J(279317091);
            if (z2) {
                BlackOverlayKt.BlackOverlay(null, g2, 0, 1);
            }
            g2.V(false);
            g2.V(true);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new NavigationBarPortraitKt$NavigationBarPortrait$2(z2, i2, i3);
        }
    }
}
