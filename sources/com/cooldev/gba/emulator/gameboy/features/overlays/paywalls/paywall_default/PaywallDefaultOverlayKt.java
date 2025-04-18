package com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_default;

import android.content.Context;
import androidx.activity.compose.BackHandlerKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyColors;
import com.cooldev.gba.emulator.gameboy.effects.HideNavigationEffectKt;
import com.cooldev.gba.emulator.gameboy.features.app.components.ManageAppOpenAdLifecycleKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.PurchasePageViewModel;
import d0.b0;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* loaded from: classes.dex */
public final class PaywallDefaultOverlayKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void HideOverlayIfPurchaseComplete(Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-999654917);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(IAPViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            boolean isPremium = ((IAPState) t.f((IAPViewModel) u2, g2, 8)).isPremium();
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(PurchaseOverlayViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            EffectsKt.f(Boolean.valueOf(isPremium), new PaywallDefaultOverlayKt$HideOverlayIfPurchaseComplete$1(isPremium, (PurchaseOverlayViewModel) u3, null), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new PaywallDefaultOverlayKt$HideOverlayIfPurchaseComplete$2(i2);
        }
    }

    @ComposableTarget
    @Composable
    public static final void PaywallDefaultOverlay(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1616010743);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(IAPViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            HideOverlayIfPurchaseComplete(g2, 0);
            HideNavigationEffectKt.HideNavigationEffect(g2, 0);
            ManageAppOpenAdLifecycleKt.ManageAppOpenAdLifecycle(context, g2, 8);
            EffectsKt.f(b0.f30125a, new PaywallDefaultOverlayKt$PaywallDefaultOverlay$1((IAPViewModel) u2, null), g2);
            BackHandlerKt.a(false, PaywallDefaultOverlayKt$PaywallDefaultOverlay$2.INSTANCE, g2, 48, 1);
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(PurchaseOverlayViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            PurchaseOverlayViewModel purchaseOverlayViewModel = (PurchaseOverlayViewModel) u3;
            Scope q4 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y4 = t.y(g2, false, 511388516, null) | g2.I(q4);
            Object u4 = g2.u();
            if (y4 || u4 == composer$Companion$Empty$1) {
                u4 = t.g(PurchasePageViewModel.class, q4, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            ScaffoldKt.a(null, null, null, null, null, 0, MyColors.INSTANCE.m25getText200d7_KjU(), 0L, null, ComposableLambdaKt.c(-771509498, new PaywallDefaultOverlayKt$PaywallDefaultOverlay$3((PurchasePageViewModel) u4, purchaseOverlayViewModel), g2), g2, 806879232, 447);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new PaywallDefaultOverlayKt$PaywallDefaultOverlay$4(i2);
        }
    }
}
