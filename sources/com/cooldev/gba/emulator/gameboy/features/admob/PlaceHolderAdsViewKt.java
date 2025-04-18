package com.cooldev.gba.emulator.gameboy.features.admob;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.RectangleShapeKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdState;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdState;
import com.cooldev.gba.emulator.gameboy.features.admob.interstitial_ad.logic.InterstitialAdViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;
import q0.p;

/* loaded from: classes3.dex */
public final class PlaceHolderAdsViewKt {
    @ComposableTarget
    @Composable
    public static final void AdPlaceholderView(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(2001695445);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(AppOpenAdViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            MutableState b2 = SnapshotStateKt.b(((AppOpenAdViewModel) u2).getState(), g2, 8);
            g2.t(414512006);
            Scope currentKoinScope = KoinApplicationKt.currentKoinScope(g2, 0);
            g2.t(1274527078);
            g2.V(false);
            g2.t(511388516);
            boolean I = g2.I(null) | g2.I(currentKoinScope);
            Object u3 = g2.u();
            if (I || u3 == composer$Companion$Empty$1) {
                u3 = t.g(InterstitialAdViewModel.class, currentKoinScope, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            MutableState b3 = SnapshotStateKt.b(((InterstitialAdViewModel) u3).getState(), g2, 8);
            g2.J(1399015243);
            Object u4 = g2.u();
            if (u4 == composer$Companion$Empty$1) {
                u4 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
                g2.o(u4);
            }
            MutableState mutableState = (MutableState) u4;
            g2.V(false);
            Boolean valueOf = Boolean.valueOf(AdPlaceholderView$lambda$0(b2).isAppOpenAdShowing() || AdPlaceholderView$lambda$1(b3).isInterstitialAdShowing());
            g2.J(1399019715);
            boolean I2 = g2.I(b2) | g2.I(b3);
            Object u5 = g2.u();
            if (I2 || u5 == composer$Companion$Empty$1) {
                u5 = new PlaceHolderAdsViewKt$AdPlaceholderView$1$1(b2, b3, mutableState, null);
                g2.o(u5);
            }
            g2.V(false);
            EffectsKt.f(valueOf, (p) u5, g2);
            if (!AdPlaceholderView$lambda$3(mutableState)) {
                RecomposeScopeImpl Z = g2.Z();
                if (Z != null) {
                    Z.d = new PlaceHolderAdsViewKt$AdPlaceholderView$2(i2);
                    return;
                }
                return;
            }
            BoxKt.a(BackgroundKt.a(SizeKt.f4107c, Color.f14958c, RectangleShapeKt.f15014a), g2, 6);
        }
        RecomposeScopeImpl Z2 = g2.Z();
        if (Z2 != null) {
            Z2.d = new PlaceHolderAdsViewKt$AdPlaceholderView$3(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppOpenAdState AdPlaceholderView$lambda$0(State<AppOpenAdState> state) {
        return (AppOpenAdState) state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterstitialAdState AdPlaceholderView$lambda$1(State<InterstitialAdState> state) {
        return (InterstitialAdState) state.getValue();
    }

    private static final boolean AdPlaceholderView$lambda$3(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdPlaceholderView$lambda$4(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }
}
