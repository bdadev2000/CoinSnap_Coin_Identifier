package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_scan;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonColors;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeState;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import q0.a;

/* loaded from: classes2.dex */
public final class ButtonScanGamesKt {
    @ComposableTarget
    @Composable
    public static final void ButtonScanGames(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(405275541);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Context context = (Context) g2.K(AndroidCompositionLocals_androidKt.f16325b);
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(HomeViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            HomeState homeState = (HomeState) SnapshotStateKt.b(((HomeViewModel) u2).getState(), g2, 8).getValue();
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(IAPViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            IAPState iAPState = (IAPState) t.f((IAPViewModel) u3, g2, 8);
            Scope q4 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y4 = t.y(g2, false, 511388516, null) | g2.I(q4);
            Object u4 = g2.u();
            if (y4 || u4 == composer$Companion$Empty$1) {
                u4 = t.g(PaywallNavigationViewModel.class, q4, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            PaywallNavigationViewModel paywallNavigationViewModel = (PaywallNavigationViewModel) u4;
            Object e = t.e(g2, 1598786116, 757210042);
            if (e == composer$Companion$Empty$1) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            ButtonScanGamesKt$ButtonScanGames$$inlined$debounced$1 buttonScanGamesKt$ButtonScanGames$$inlined$debounced$1 = new ButtonScanGamesKt$ButtonScanGames$$inlined$debounced$1(500L, (MutableLongState) e, iAPState, context, homeState, paywallNavigationViewModel);
            g2.V(false);
            PaddingValuesImpl a2 = PaddingKt.a(3, 0.0f);
            Modifier e2 = SizeKt.e(SizeKt.r(Modifier.Companion.f14687a, 209), 56);
            RoundedCornerShape a3 = RoundedCornerShapeKt.a(0);
            PaddingValuesImpl paddingValuesImpl = ButtonDefaults.f8037a;
            ButtonColors a4 = ButtonDefaults.a(Color.f14961h, g2);
            g2.J(-1701086059);
            boolean I = g2.I(buttonScanGamesKt$ButtonScanGames$$inlined$debounced$1);
            Object u5 = g2.u();
            if (I || u5 == composer$Companion$Empty$1) {
                u5 = new ButtonScanGamesKt$ButtonScanGames$1$1(buttonScanGamesKt$ButtonScanGames$$inlined$debounced$1);
                g2.o(u5);
            }
            g2.V(false);
            ButtonKt.a((a) u5, e2, false, a3, a4, null, null, a2, null, ComposableSingletons$ButtonScanGamesKt.INSTANCE.m246getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 817889328, 356);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ButtonScanGamesKt$ButtonScanGames$2(i2);
        }
    }
}
