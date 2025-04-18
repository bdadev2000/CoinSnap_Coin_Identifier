package com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.view;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayState;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.logic.PurchaseOverlayViewModel;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_default.PaywallDefaultOverlayKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_lifetime.PaywallLifetimeOverlayKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_weekly_non_trial.PaywallWeeklyNonTrialOverlayKt;
import com.cooldev.gba.emulator.gameboy.features.overlays.paywalls.paywall_yearly_non_trial.PaywallYearlyNonTrialOverlayKt;
import com.cooldev.gba.emulator.gameboy.features.paywalls.enums.PaywallType;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* loaded from: classes3.dex */
public final class PaywallsOverlayKt {

    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PaywallType.values().length];
            try {
                iArr[PaywallType.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PaywallType.YEARLY_NON_TRIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PaywallType.LIFETIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PaywallType.WEEKLY_NON_TRIAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @ComposableTarget
    @Composable
    public static final void PaywallsOverlay(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(1925509526);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            if (y2 || u2 == Composer.Companion.f13690a) {
                u2 = t.g(PurchaseOverlayViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            int i3 = WhenMappings.$EnumSwitchMapping$0[((PurchaseOverlayState) SnapshotStateKt.b(((PurchaseOverlayViewModel) u2).getState(), g2, 8).getValue()).getPaywallType().ordinal()];
            if (i3 == 1) {
                g2.J(-754387248);
                PaywallDefaultOverlayKt.PaywallDefaultOverlay(g2, 0);
                g2.V(false);
            } else if (i3 == 2) {
                g2.J(-754298743);
                PaywallYearlyNonTrialOverlayKt.PaywallYearlyNonTrialOverlay(g2, 0);
                g2.V(false);
            } else if (i3 == 3) {
                g2.J(-754211633);
                PaywallLifetimeOverlayKt.PaywallLifetimeOverlay(g2, 0);
                g2.V(false);
            } else if (i3 != 4) {
                g2.J(-754064321);
                g2.V(false);
            } else {
                g2.J(-754122167);
                PaywallWeeklyNonTrialOverlayKt.PaywallWeeklyNonTrialOverlay(g2, 0);
                g2.V(false);
            }
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new PaywallsOverlayKt$PaywallsOverlay$1(i2);
        }
    }
}
